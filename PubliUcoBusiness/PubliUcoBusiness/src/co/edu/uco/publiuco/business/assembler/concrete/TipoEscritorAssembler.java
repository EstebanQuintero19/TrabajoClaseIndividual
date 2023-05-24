package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.TipoEscritorDomain;
import co.edu.uco.publiuco.dto.TipoEscritorDTO;
import co.edu.uco.publiuco.entities.TipoEscritorEntity;

public class TipoEscritorAssembler implements Assembler<TipoEscritorDomain, TipoEscritorDTO, TipoEscritorEntity> {

	private static final Assembler<TipoEscritorDomain, TipoEscritorDTO, TipoEscritorEntity> INSTANCE = new TipoEscritorAssembler();

	private TipoEscritorAssembler() {
		super();
	}

	public static Assembler<TipoEscritorDomain, TipoEscritorDTO, TipoEscritorEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public TipoEscritorDTO toDTOFromDomain(final TipoEscritorDomain domain) {
		return TipoEscritorDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre())
				.setDescripcion(domain.getDescripcion())
				.setEstado(EstadoTipoEscritorAssembler.getInstance().toDTOFromDomain(domain.getEstado()));
	}

	@Override
	public TipoEscritorDomain toDomainFromDto(final TipoEscritorDTO dto) {
		return new TipoEscritorDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion(),
				EstadoTipoEscritorAssembler.getInstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public TipoEscritorEntity toEntityFromDomain(final TipoEscritorDomain domain) {
		return new TipoEscritorEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion(),
				EstadoTipoEscritorAssembler.getInstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public TipoEscritorDomain toDomainFromEntity(final TipoEscritorEntity entity) {
		return new TipoEscritorDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion(),
				EstadoTipoEscritorAssembler.getInstance().toDomainFromEntity(entity.getEstado()));
	}

	@Override
	public List<TipoEscritorDomain> toDomainListFromEntityList(List<TipoEscritorEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<TipoEscritorDTO> toDTOListFromDomainList(List<TipoEscritorDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
