package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EstadoPublicacionDomain;
import co.edu.uco.publiuco.dto.EstadoPublicacionDTO;
import co.edu.uco.publiuco.entities.EstadoPublicacionEntity;

public class EstadoPublicacionAssembler
		implements Assembler<EstadoPublicacionDomain, EstadoPublicacionDTO, EstadoPublicacionEntity> {
	
	private static final Assembler<EstadoPublicacionDomain, EstadoPublicacionDTO, EstadoPublicacionEntity> INSTANCE = new EstadoPublicacionAssembler();

	private EstadoPublicacionAssembler() {
		super();
	}

	public static Assembler<EstadoPublicacionDomain, EstadoPublicacionDTO, EstadoPublicacionEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public EstadoPublicacionDTO toDTOFromDomain(final EstadoPublicacionDomain domian) {
		return EstadoPublicacionDTO.create().setIdentificador(domian.getIdentificador()).setNombre(domian.getNombre())
				.setDescripcion(domian.getDescripcion());
	}

	@Override
	public EstadoPublicacionDomain toDomainFromDto(final EstadoPublicacionDTO dto) {
		return new EstadoPublicacionDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoPublicacionEntity toEntityFromDomain(final EstadoPublicacionDomain domain) {
		return new EstadoPublicacionEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoPublicacionDomain toDomainFromEntity(final EstadoPublicacionEntity entity) {
		return new EstadoPublicacionDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}

	@Override
	public List<EstadoPublicacionDomain> toDomainListFromEntityList(List<EstadoPublicacionEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<EstadoPublicacionDTO> toDTOListFromDomainList(List<EstadoPublicacionDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
