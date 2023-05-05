package co.edu.uco.publiuco.business.assembler.concrete;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.HistorialAccesoPublicacionDomain;
import co.edu.uco.publiuco.dto.HistorialAccesoPublicacionDTO;
import co.edu.uco.publiuco.entities.HistorialAccesoPublicacionEntity;

public class HistorialAccesoPublicacionAssembler implements
		Assembler<HistorialAccesoPublicacionDomain, HistorialAccesoPublicacionDTO, HistorialAccesoPublicacionEntity> {

	private static final Assembler<HistorialAccesoPublicacionDomain, HistorialAccesoPublicacionDTO, HistorialAccesoPublicacionEntity> INSTANCE = new HistorialAccesoPublicacionAssembler();

	private HistorialAccesoPublicacionAssembler() {
		super();
	}

	public static Assembler<HistorialAccesoPublicacionDomain, HistorialAccesoPublicacionDTO, HistorialAccesoPublicacionEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public HistorialAccesoPublicacionDTO toDTOFromDomain(final HistorialAccesoPublicacionDomain domain) {
		return HistorialAccesoPublicacionDTO.create().setIdentificador(domain.getIdentificador())
				.setLector(LectorAssembler.getInstance().toDTOFromDomain(domain.getLector()))
				.setPublicacion(PublicacionAssembler.getInstance().toDTOFromDomain(domain.getPublicacion()))
				.setFechaAcceso(domain.getFechaAcceso());
	}

	@Override
	public HistorialAccesoPublicacionDomain toDomainFromDto(final HistorialAccesoPublicacionDTO dto) {
		return new HistorialAccesoPublicacionDomain(dto.getIdentificador(),
				LectorAssembler.getInstance().toDomainFromDto(dto.getLector()),
				PublicacionAssembler.getInstance().toDomainFromDto(dto.getPublicacion()), dto.getFechaAcceso());
	}

	@Override
	public HistorialAccesoPublicacionEntity toEntityFromDomain(final HistorialAccesoPublicacionDomain domain) {
		return new HistorialAccesoPublicacionEntity(domain.getIdentificador(),
				LectorAssembler.getInstance().toEntityFromDomain(domain.getLector()),
				PublicacionAssembler.getInstance().toEntityFromDomain(domain.getPublicacion()), domain.getFechaAcceso());
	}

	@Override
	public HistorialAccesoPublicacionDomain toDomainFromEntity(final HistorialAccesoPublicacionEntity entity) {
		return new HistorialAccesoPublicacionDomain(entity.getIdentificador(),
				LectorAssembler.getInstance().toDomainFromEntity(entity.getLector()),
				PublicacionAssembler.getInstance().toDomainFromEntity(entity.getPublicacion()), entity.getFechaAcceso());
	}

}
