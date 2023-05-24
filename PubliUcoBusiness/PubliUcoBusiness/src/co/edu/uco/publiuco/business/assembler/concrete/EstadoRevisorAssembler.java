package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EstadoRevisorDomain;
import co.edu.uco.publiuco.dto.EstadoRevisorDTO;
import co.edu.uco.publiuco.entities.EstadoRevisorEntity;

public class EstadoRevisorAssembler implements Assembler<EstadoRevisorDomain, EstadoRevisorDTO, EstadoRevisorEntity> {
	
	private static final Assembler<EstadoRevisorDomain, EstadoRevisorDTO, EstadoRevisorEntity> INSTANCE = new EstadoRevisorAssembler();

	private EstadoRevisorAssembler() {
		super();
	}

	public static Assembler<EstadoRevisorDomain, EstadoRevisorDTO, EstadoRevisorEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public EstadoRevisorDTO toDTOFromDomain(final EstadoRevisorDomain domian) {
		return EstadoRevisorDTO.create().setIdentificador(domian.getIdentificador()).setNombre(domian.getNombre())
				.setDescripcion(domian.getDescripcion());
	}

	@Override
	public EstadoRevisorDomain toDomainFromDto(final EstadoRevisorDTO dto) {
		return new EstadoRevisorDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoRevisorEntity toEntityFromDomain(final EstadoRevisorDomain domain) {
		return new EstadoRevisorEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoRevisorDomain toDomainFromEntity(final EstadoRevisorEntity entity) {
		return new EstadoRevisorDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}

	@Override
	public List<EstadoRevisorDomain> toDomainListFromEntityList(List<EstadoRevisorEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<EstadoRevisorDTO> toDTOListFromDomainList(List<EstadoRevisorDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
