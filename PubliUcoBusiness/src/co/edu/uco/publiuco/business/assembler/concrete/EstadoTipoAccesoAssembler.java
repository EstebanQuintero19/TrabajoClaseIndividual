package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EstadoTipoAccesoDomain;
import co.edu.uco.publiuco.dto.EstadoTipoAccesoDTO;
import co.edu.uco.publiuco.entities.EstadoTipoAccesoEntity;

public class EstadoTipoAccesoAssembler
		implements Assembler<EstadoTipoAccesoDomain, EstadoTipoAccesoDTO, EstadoTipoAccesoEntity> {
	
	private static final Assembler<EstadoTipoAccesoDomain, EstadoTipoAccesoDTO, EstadoTipoAccesoEntity> INSTANCE = new EstadoTipoAccesoAssembler();

	private EstadoTipoAccesoAssembler() {
		super();
	}

	public static Assembler<EstadoTipoAccesoDomain, EstadoTipoAccesoDTO, EstadoTipoAccesoEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public EstadoTipoAccesoDTO toDTOFromDomain(final EstadoTipoAccesoDomain domian) {
		return EstadoTipoAccesoDTO.create().setIdentificador(domian.getIdentificador()).setNombre(domian.getNombre())
				.setDescripcion(domian.getDescripcion());
	}

	@Override
	public EstadoTipoAccesoDomain toDomainFromDto(final EstadoTipoAccesoDTO dto) {
		return new EstadoTipoAccesoDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoTipoAccesoEntity toEntityFromDomain(final EstadoTipoAccesoDomain domain) {
		return new EstadoTipoAccesoEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoTipoAccesoDomain toDomainFromEntity(final EstadoTipoAccesoEntity entity) {
		return new EstadoTipoAccesoDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}

	@Override
	public List<EstadoTipoAccesoDomain> toDomainListFromEntityList(List<EstadoTipoAccesoEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<EstadoTipoAccesoDTO> toDTOListFromDomainList(List<EstadoTipoAccesoDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
