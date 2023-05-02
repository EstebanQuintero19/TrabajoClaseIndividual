package co.edu.uco.publiuco.business.assembler.concrete;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.bussiness.domain.TipoRelacionInstitucionDomain;
import co.edu.uco.publiuco.dto.TipoRelacionInstitucionDTO;
import co.edu.uco.publiuco.entities.TipoRelacionInstitucionEntity;

public final class TipoRelacionInstitucionAssembler
		implements Assembler<TipoRelacionInstitucionDomain, TipoRelacionInstitucionDTO, TipoRelacionInstitucionEntity> {

	@Override
	public TipoRelacionInstitucionDTO toDTOFromDomain(TipoRelacionInstitucionDomain domian) {
		return TipoRelacionInstitucionDTO.create().setIdentificador(domian.getIdentificador())
				.setNombre(domian.getNombre()).setDescripcion(domian.getDescripcion())
				.setEstado(EstadoTipoRelacionInstitucionAssembler.getInstance().toDTOFromDomain(domian.getEstado()));
	}

	@Override
	public TipoRelacionInstitucionDomain toDomainFromDto(TipoRelacionInstitucionDTO dto) {
		return new TipoRelacionInstitucionDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion(),
				EstadoTipoRelacionInstitucionAssembler.getInstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public TipoRelacionInstitucionEntity toEntityFromDomain(TipoRelacionInstitucionDomain domain) {
		return new TipoRelacionInstitucionEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion(),
				EstadoTipoRelacionInstitucionAssembler.getInstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public TipoRelacionInstitucionDomain toDomainFromEntity(TipoRelacionInstitucionEntity entity) {
		return new TipoRelacionInstitucionDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion(),
				EstadoTipoRelacionInstitucionAssembler.getInstance().toDomainFromEntity(entity.getEstado()));
	}
}