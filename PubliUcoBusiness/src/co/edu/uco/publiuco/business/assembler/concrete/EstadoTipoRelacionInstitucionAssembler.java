package co.edu.uco.publiuco.business.assembler.concrete;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.bussiness.domain.EstadoTipoRelacionInstitucionDomain;
import co.edu.uco.publiuco.dto.EstadoTipoRelacionInstitucionDTO;
import co.edu.uco.publiuco.entities.EstadoTipoRelacionInstitucionEntity;

public final class EstadoTipoRelacionInstitucionAssembler implements
		Assembler<EstadoTipoRelacionInstitucionDomain, EstadoTipoRelacionInstitucionDTO, EstadoTipoRelacionInstitucionEntity> {

	private static final Assembler<EstadoTipoRelacionInstitucionDomain, EstadoTipoRelacionInstitucionDTO, EstadoTipoRelacionInstitucionEntity> INSTANCE = new EstadoTipoRelacionInstitucionAssembler();
	
	private EstadoTipoRelacionInstitucionAssembler() {
		super();
	}
	
	public static final Assembler<EstadoTipoRelacionInstitucionDomain, EstadoTipoRelacionInstitucionDTO, EstadoTipoRelacionInstitucionEntity> getInstance(){
		return INSTANCE;
	}
	
	@Override
	public EstadoTipoRelacionInstitucionDTO toDTOFromDomain(EstadoTipoRelacionInstitucionDomain domain) {
		return EstadoTipoRelacionInstitucionDTO.create().setIdentificador(domain.getIdentificador())
				.setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoTipoRelacionInstitucionDomain toDomainFromDto(EstadoTipoRelacionInstitucionDTO dto) {
		return new EstadoTipoRelacionInstitucionDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoTipoRelacionInstitucionEntity toEntityFromDomain(EstadoTipoRelacionInstitucionDomain domain) {
		return new EstadoTipoRelacionInstitucionEntity(domain.getIdentificador(), domain.getNombre(),
				domain.getDescripcion());
	}

	@Override
	public EstadoTipoRelacionInstitucionDomain toDomainFromEntity(EstadoTipoRelacionInstitucionEntity entity) {
		return new EstadoTipoRelacionInstitucionDomain(entity.getIdentificador(), entity.getNombre(),
				entity.getDescripcion());
	}
}