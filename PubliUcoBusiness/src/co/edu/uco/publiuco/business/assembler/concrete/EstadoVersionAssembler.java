package co.edu.uco.publiuco.business.assembler.concrete;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EstadoVersionDomain;
import co.edu.uco.publiuco.dto.EstadoVersionDTO;
import co.edu.uco.publiuco.entities.EstadoVersionEntity;

public class EstadoVersionAssembler implements Assembler<EstadoVersionDomain, EstadoVersionDTO, EstadoVersionEntity> {
	
	private static final Assembler<EstadoVersionDomain, EstadoVersionDTO, EstadoVersionEntity> INSTANCE = new EstadoVersionAssembler();

	private EstadoVersionAssembler() {
		super();
	}

	public static Assembler<EstadoVersionDomain, EstadoVersionDTO, EstadoVersionEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public EstadoVersionDTO toDTOFromDomain(final EstadoVersionDomain domian) {
		return EstadoVersionDTO.create().setIdentificador(domian.getIdentificador()).setNombre(domian.getNombre())
				.setDescripcion(domian.getDescripcion());
	}

	@Override
	public EstadoVersionDomain toDomainFromDto(final EstadoVersionDTO dto) {
		return new EstadoVersionDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoVersionEntity toEntityFromDomain(final EstadoVersionDomain domain) {
		return new EstadoVersionEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoVersionDomain toDomainFromEntity(final EstadoVersionEntity entity) {
		return new EstadoVersionDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}

}