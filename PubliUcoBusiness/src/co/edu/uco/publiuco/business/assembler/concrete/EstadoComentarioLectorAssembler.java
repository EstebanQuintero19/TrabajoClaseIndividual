package co.edu.uco.publiuco.business.assembler.concrete;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.bussiness.domain.EstadoComentarioLectorDomain;
import co.edu.uco.publiuco.dto.EstadoComentarioLectorDTO;
import co.edu.uco.publiuco.entities.EstadoComentarioLectorEntity;

public class EstadoComentarioLectorAssembler
		implements Assembler<EstadoComentarioLectorDomain, EstadoComentarioLectorDTO, EstadoComentarioLectorEntity> {

	private static final Assembler<EstadoComentarioLectorDomain, EstadoComentarioLectorDTO, EstadoComentarioLectorEntity> INSTANCE = new EstadoComentarioLectorAssembler();

	private EstadoComentarioLectorAssembler() {
		super();
	}

	public static final Assembler<EstadoComentarioLectorDomain, EstadoComentarioLectorDTO, EstadoComentarioLectorEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public EstadoComentarioLectorDTO toDTOFromDomain(EstadoComentarioLectorDomain domian) {
		return EstadoComentarioLectorDTO.create().setIdentificador(domian.getIdentificador())
				.setNombre(domian.getNombre()).setDescripcion(domian.getDescripcion());
	}

	@Override
	public EstadoComentarioLectorDomain toDomainFromDto(EstadoComentarioLectorDTO dto) {
		return new EstadoComentarioLectorDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoComentarioLectorEntity toEntityFromDomain(EstadoComentarioLectorDomain domain) {
		return new EstadoComentarioLectorEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoComentarioLectorDomain toDomainFromEntity(EstadoComentarioLectorEntity entity) {
		return new EstadoComentarioLectorDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}

}