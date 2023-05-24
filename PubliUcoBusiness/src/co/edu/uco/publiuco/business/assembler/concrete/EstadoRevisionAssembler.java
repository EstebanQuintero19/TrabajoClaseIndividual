package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EstadoRevisionDomain;
import co.edu.uco.publiuco.dto.EstadoRevisionDTO;
import co.edu.uco.publiuco.entities.EstadoRevisionEntity;

public class EstadoRevisionAssembler
		implements Assembler<EstadoRevisionDomain, EstadoRevisionDTO, EstadoRevisionEntity> {
	
	private static final Assembler<EstadoRevisionDomain, EstadoRevisionDTO, EstadoRevisionEntity> INSTANCE = new EstadoRevisionAssembler();

	private EstadoRevisionAssembler() {
		super();
	}

	public static Assembler<EstadoRevisionDomain, EstadoRevisionDTO, EstadoRevisionEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public EstadoRevisionDTO toDTOFromDomain(final EstadoRevisionDomain domian) {
		return EstadoRevisionDTO.create().setIdentificador(domian.getIdentificador()).setNombre(domian.getNombre())
				.setDescripcion(domian.getDescripcion());
	}

	@Override
	public EstadoRevisionDomain toDomainFromDto(final EstadoRevisionDTO dto) {
		return new EstadoRevisionDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoRevisionEntity toEntityFromDomain(final EstadoRevisionDomain domain) {
		return new EstadoRevisionEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoRevisionDomain toDomainFromEntity(final EstadoRevisionEntity entity) {
		return new EstadoRevisionDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}

	@Override
	public List<EstadoRevisionDomain> toDomainListFromEntityList(List<EstadoRevisionEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<EstadoRevisionDTO> toDTOListFromDomainList(List<EstadoRevisionDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
