package co.edu.uco.publiuco.business.assembler.concrete;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.TipoAccesoDomain;
import co.edu.uco.publiuco.dto.TipoAccesoDTO;
import co.edu.uco.publiuco.entities.TipoAccesoEntity;

public class TipoAccesoAssembler implements Assembler<TipoAccesoDomain, TipoAccesoDTO, TipoAccesoEntity> {

	private static final Assembler<TipoAccesoDomain, TipoAccesoDTO, TipoAccesoEntity> INSTANCE = new TipoAccesoAssembler();

	private TipoAccesoAssembler() {
		super();
	}

	public static final Assembler<TipoAccesoDomain, TipoAccesoDTO, TipoAccesoEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public TipoAccesoDTO toDTOFromDomain(final TipoAccesoDomain domian) {
		return TipoAccesoDTO.create().setIdentificador(domian.getIdentificador()).setNombre(domian.getNombre())
				.setDescripcion(domian.getDescripcion())
				.setEstado(EstadoTipoAccesoAssembler.getInstance().toDTOFromDomain(domian.getEstado()));
	}

	@Override
	public TipoAccesoDomain toDomainFromDto(TipoAccesoDTO dto) {
		return new TipoAccesoDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion(),
				EstadoTipoAccesoAssembler.getInstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public TipoAccesoEntity toEntityFromDomain(TipoAccesoDomain domain) {
		return new TipoAccesoEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion(),
				EstadoTipoAccesoAssembler.getInstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public TipoAccesoDomain toDomainFromEntity(TipoAccesoEntity entity) {
		return new TipoAccesoDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion(),
				EstadoTipoAccesoAssembler.getInstance().toDomainFromEntity(entity.getEstado()));
	}
}