package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EstadoCategoriaDomain;
import co.edu.uco.publiuco.dto.EstadoCategoriaDTO;
import co.edu.uco.publiuco.entities.EstadoCategoriaEntity;

public class EstadoCategoriaAssembler
		implements Assembler<EstadoCategoriaDomain, EstadoCategoriaDTO, EstadoCategoriaEntity> {

	private static final Assembler<EstadoCategoriaDomain, EstadoCategoriaDTO, EstadoCategoriaEntity> INSTANCE = new EstadoCategoriaAssembler();

	private EstadoCategoriaAssembler() {
		super();
	}

	public static final Assembler<EstadoCategoriaDomain, EstadoCategoriaDTO, EstadoCategoriaEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public EstadoCategoriaDTO toDTOFromDomain(final EstadoCategoriaDomain domian) {
		return EstadoCategoriaDTO.create().setIdentificador(domian.getIdentificador()).setNombre(domian.getNombre())
				.setDescripcion(domian.getNombre());
	}

	@Override
	public EstadoCategoriaDomain toDomainFromDto(final EstadoCategoriaDTO dto) {
		return new EstadoCategoriaDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoCategoriaEntity toEntityFromDomain(final EstadoCategoriaDomain domain) {
		return new EstadoCategoriaEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoCategoriaDomain toDomainFromEntity(final EstadoCategoriaEntity entity) {
		return new EstadoCategoriaDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}

	@Override
	public List<EstadoCategoriaDomain> toDomainListFromEntityList(List<EstadoCategoriaEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<EstadoCategoriaDTO> toDTOListFromDomainList(List<EstadoCategoriaDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
