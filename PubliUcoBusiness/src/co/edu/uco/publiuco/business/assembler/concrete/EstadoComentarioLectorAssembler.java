package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EstadoComentarioLectorDomain;
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
	public EstadoComentarioLectorDTO toDTOFromDomain(final EstadoComentarioLectorDomain domian) {
		return EstadoComentarioLectorDTO.create().setIdentificador(domian.getIdentificador())
				.setNombre(domian.getNombre()).setDescripcion(domian.getDescripcion());
	}

	@Override
	public EstadoComentarioLectorDomain toDomainFromDto(final EstadoComentarioLectorDTO dto) {
		return new EstadoComentarioLectorDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoComentarioLectorEntity toEntityFromDomain(final EstadoComentarioLectorDomain domain) {
		return new EstadoComentarioLectorEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoComentarioLectorDomain toDomainFromEntity(final EstadoComentarioLectorEntity entity) {
		return new EstadoComentarioLectorDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}

	@Override
	public List<EstadoComentarioLectorDomain> toDomainListFromEntityList(
			List<EstadoComentarioLectorEntity> entityList) {
		
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<EstadoComentarioLectorDTO> toDTOListFromDomainList(List<EstadoComentarioLectorDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
