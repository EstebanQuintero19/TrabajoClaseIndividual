package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EstadoPlanDomain;
import co.edu.uco.publiuco.dto.EstadoPlanDTO;
import co.edu.uco.publiuco.entities.EstadoPlanEntity;

public class EstadoPlanAssembler implements Assembler<EstadoPlanDomain, EstadoPlanDTO, EstadoPlanEntity> {

	private static final Assembler<EstadoPlanDomain, EstadoPlanDTO, EstadoPlanEntity> INSTANCE = new EstadoPlanAssembler();

	private EstadoPlanAssembler() {
		super();
	}

	public static Assembler<EstadoPlanDomain, EstadoPlanDTO, EstadoPlanEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public EstadoPlanDTO toDTOFromDomain(final EstadoPlanDomain domian) {
		return EstadoPlanDTO.create().setIdentificador(domian.getIdentificador()).setNombre(domian.getNombre())
				.setDescripcion(domian.getDescripcion());
	}

	@Override
	public EstadoPlanDomain toDomainFromDto(final EstadoPlanDTO dto) {
		return new EstadoPlanDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoPlanEntity toEntityFromDomain(final EstadoPlanDomain domain) {
		return new EstadoPlanEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoPlanDomain toDomainFromEntity(final EstadoPlanEntity entity) {
		return new EstadoPlanDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}

	@Override
	public List<EstadoPlanDomain> toDomainListFromEntityList(List<EstadoPlanEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<EstadoPlanDTO> toDTOListFromDomainList(List<EstadoPlanDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
