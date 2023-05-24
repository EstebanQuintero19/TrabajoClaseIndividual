package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EstadoTipoIdentificacionDomain;
import co.edu.uco.publiuco.dto.EstadoTipoIdentificacionDTO;
import co.edu.uco.publiuco.entities.EstadoTipoIdentificacionEntity;

public class EstadoTipoIdentificacionAssembler implements
		Assembler<EstadoTipoIdentificacionDomain, EstadoTipoIdentificacionDTO, EstadoTipoIdentificacionEntity> {
	
	private static final Assembler<EstadoTipoIdentificacionDomain, EstadoTipoIdentificacionDTO, EstadoTipoIdentificacionEntity> INSTANCE = new EstadoTipoIdentificacionAssembler();

	private EstadoTipoIdentificacionAssembler() {
		super();
	}

	public static Assembler<EstadoTipoIdentificacionDomain, EstadoTipoIdentificacionDTO, EstadoTipoIdentificacionEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public EstadoTipoIdentificacionDTO toDTOFromDomain(final EstadoTipoIdentificacionDomain domian) {
		return EstadoTipoIdentificacionDTO.create().setIdentificador(domian.getIdentificador())
				.setNombre(domian.getNombre()).setDescripcion(domian.getDescripcion());
	}

	@Override
	public EstadoTipoIdentificacionDomain toDomainFromDto(final EstadoTipoIdentificacionDTO dto) {
		return new EstadoTipoIdentificacionDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoTipoIdentificacionEntity toEntityFromDomain(final EstadoTipoIdentificacionDomain domain) {
		return new EstadoTipoIdentificacionEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoTipoIdentificacionDomain toDomainFromEntity(final EstadoTipoIdentificacionEntity entity) {
		return new EstadoTipoIdentificacionDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}

	@Override
	public List<EstadoTipoIdentificacionDomain> toDomainListFromEntityList(
			List<EstadoTipoIdentificacionEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<EstadoTipoIdentificacionDTO> toDTOListFromDomainList(List<EstadoTipoIdentificacionDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
