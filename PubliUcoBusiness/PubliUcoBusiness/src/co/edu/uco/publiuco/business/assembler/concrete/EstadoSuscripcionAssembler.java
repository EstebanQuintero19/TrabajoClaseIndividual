package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EstadoSuscripcionDomain;
import co.edu.uco.publiuco.dto.EstadoSuscripcionDTO;
import co.edu.uco.publiuco.entities.EstadoSuscripcionEntity;

public class EstadoSuscripcionAssembler
		implements Assembler<EstadoSuscripcionDomain, EstadoSuscripcionDTO, EstadoSuscripcionEntity> {
	
	private static final Assembler<EstadoSuscripcionDomain, EstadoSuscripcionDTO, EstadoSuscripcionEntity> INSTANCE = new EstadoSuscripcionAssembler();

	private EstadoSuscripcionAssembler() {
		super();
	}

	public static Assembler<EstadoSuscripcionDomain, EstadoSuscripcionDTO, EstadoSuscripcionEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public EstadoSuscripcionDTO toDTOFromDomain(final EstadoSuscripcionDomain domian) {
		return EstadoSuscripcionDTO.create().setIdentificador(domian.getIdentificador()).setNombre(domian.getNombre())
				.setDescripcion(domian.getDescripcion());
	}

	@Override
	public EstadoSuscripcionDomain toDomainFromDto(final EstadoSuscripcionDTO dto) {
		return new EstadoSuscripcionDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoSuscripcionEntity toEntityFromDomain(final EstadoSuscripcionDomain domain) {
		return new EstadoSuscripcionEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoSuscripcionDomain toDomainFromEntity(final EstadoSuscripcionEntity entity) {
		return new EstadoSuscripcionDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}

	@Override
	public List<EstadoSuscripcionDomain> toDomainListFromEntityList(List<EstadoSuscripcionEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<EstadoSuscripcionDTO> toDTOListFromDomainList(List<EstadoSuscripcionDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
