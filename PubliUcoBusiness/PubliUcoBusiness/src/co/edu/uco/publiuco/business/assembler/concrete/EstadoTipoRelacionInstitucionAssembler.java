package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EstadoTipoRelacionInstitucionDomain;
import co.edu.uco.publiuco.dto.EstadoTipoRelacionInstitucionDTO;
import co.edu.uco.publiuco.entities.EstadoTipoRelacionInstitucionEntity;

public final class EstadoTipoRelacionInstitucionAssembler implements
		Assembler<EstadoTipoRelacionInstitucionDomain, EstadoTipoRelacionInstitucionDTO, EstadoTipoRelacionInstitucionEntity> {

	private static final Assembler<EstadoTipoRelacionInstitucionDomain, EstadoTipoRelacionInstitucionDTO, EstadoTipoRelacionInstitucionEntity> INSTANCE = new EstadoTipoRelacionInstitucionAssembler();

	private EstadoTipoRelacionInstitucionAssembler() {
		super();
	}

	public static final Assembler<EstadoTipoRelacionInstitucionDomain, EstadoTipoRelacionInstitucionDTO, EstadoTipoRelacionInstitucionEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public EstadoTipoRelacionInstitucionDTO toDTOFromDomain(final EstadoTipoRelacionInstitucionDomain domain) {
		return EstadoTipoRelacionInstitucionDTO.create().setIdentificador(domain.getIdentificador())
				.setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoTipoRelacionInstitucionDomain toDomainFromDto(final EstadoTipoRelacionInstitucionDTO dto) {
		return new EstadoTipoRelacionInstitucionDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoTipoRelacionInstitucionEntity toEntityFromDomain(final EstadoTipoRelacionInstitucionDomain domain) {
		return new EstadoTipoRelacionInstitucionEntity(domain.getIdentificador(), domain.getNombre(),
				domain.getDescripcion());
	}

	@Override
	public EstadoTipoRelacionInstitucionDomain toDomainFromEntity(final EstadoTipoRelacionInstitucionEntity entity) {
		return new EstadoTipoRelacionInstitucionDomain(entity.getIdentificador(), entity.getNombre(),
				entity.getDescripcion());
	}

	@Override
	public List<EstadoTipoRelacionInstitucionDomain> toDomainListFromEntityList(
			List<EstadoTipoRelacionInstitucionEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<EstadoTipoRelacionInstitucionDTO> toDTOListFromDomainList(
			List<EstadoTipoRelacionInstitucionDomain> domainList) {
		// TODO Auto-generated method stub
		return null;
	}
}
