package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.CategoriaDomain;
import co.edu.uco.publiuco.dto.CategoriaDTO;
import co.edu.uco.publiuco.entities.CategoriaEntity;

public class CategoriaAssembler implements Assembler<CategoriaDomain, CategoriaDTO, CategoriaEntity> {

	private static final Assembler<CategoriaDomain, CategoriaDTO, CategoriaEntity> INSTANCE = new CategoriaAssembler();

	private CategoriaAssembler() {
		super();
	}

	public static Assembler<CategoriaDomain, CategoriaDTO, CategoriaEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public CategoriaDTO toDTOFromDomain(final CategoriaDomain domain) {
		return CategoriaDTO.create().setIdentificador(domain.getIdentificador())
				.setCategoriaPadre(CategoriaAssembler.getInstance().toDTOFromDomain(domain.getCategoriaPadre())
						.setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion())
						.setEstado(EstadoCategoriaAssembler.getInstance().toDTOFromDomain(domain.getEstado())));
	}

	@Override
	public CategoriaDomain toDomainFromDto(final CategoriaDTO dto) {
		return new CategoriaDomain(dto.getIdentificador(),
				CategoriaAssembler.getInstance().toDomainFromDto(dto.getCategoriaPadre()), dto.getNombre(),
				dto.getDescripcion(), EstadoCategoriaAssembler.getInstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public CategoriaEntity toEntityFromDomain(final CategoriaDomain domain) {
		return new CategoriaEntity(domain.getIdentificador(),
				CategoriaAssembler.getInstance().toEntityFromDomain(domain.getCategoriaPadre()), domain.getNombre(),
				domain.getDescripcion(), EstadoCategoriaAssembler.getInstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public CategoriaDomain toDomainFromEntity(CategoriaEntity entity) {
		return new CategoriaDomain(entity.getIdentificador(),
				CategoriaAssembler.getInstance().toDomainFromEntity(entity.getCategoriaPadre()), entity.getNombre(),
				entity.getDescripcion(), EstadoCategoriaAssembler.getInstance().toDomainFromEntity(entity.getEstado()));
	}

	@Override
	public List<CategoriaDomain> toDomainListFromEntityList(List<CategoriaEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<CategoriaDTO> toDTOListFromDomainList(List<CategoriaDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
