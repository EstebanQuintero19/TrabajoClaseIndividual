package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.CalificacionDomain;
import co.edu.uco.publiuco.dto.CalificacionDTO;
import co.edu.uco.publiuco.entities.CalificacionEntity;

public class CalificacionAssembler implements Assembler<CalificacionDomain, CalificacionDTO, CalificacionEntity> {

	private static final Assembler<CalificacionDomain, CalificacionDTO, CalificacionEntity> INSTANCE = new CalificacionAssembler();

	private CalificacionAssembler() {
		super();
	}

	public static Assembler<CalificacionDomain, CalificacionDTO, CalificacionEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public CalificacionDTO toDTOFromDomain(final CalificacionDomain domain) {
		return CalificacionDTO.create().setIdentificador(domain.getIdentificador())
				.setLector(LectorAssembler.getInstance().toDTOFromDomain(domain.getLector()))
				.setPublicacion(PublicacionAssembler.getInstance().toDTOFromDomain(domain.getPublicacion()))
				.setFechaCalificacion(domain.getFechaCalificacion()).setCalificacion(domain.getCalificacion());
	}

	@Override
	public CalificacionDomain toDomainFromDto(final CalificacionDTO dto) {
		return new CalificacionDomain(dto.getIdentificador(),
				LectorAssembler.getInstance().toDomainFromDto(dto.getLector()),
				PublicacionAssembler.getInstance().toDomainFromDto(dto.getPublicacion()), dto.getFechaCalificacion(),
				dto.getCalificacion());
	}

	@Override
	public CalificacionEntity toEntityFromDomain(final CalificacionDomain domain) {
		return new CalificacionEntity(domain.getIdentificador(),
				LectorAssembler.getInstance().toEntityFromDomain(domain.getLector()),
				PublicacionAssembler.getInstance().toEntityFromDomain(domain.getPublicacion()),
				domain.getFechaCalificacion(), domain.getCalificacion());
	}

	@Override
	public CalificacionDomain toDomainFromEntity(final CalificacionEntity entity) {
		return new CalificacionDomain(entity.getIdentificador(),
				LectorAssembler.getInstance().toDomainFromEntity(entity.getLector()),
				PublicacionAssembler.getInstance().toDomainFromEntity(entity.getPublicacion()),
				entity.getFechaCalificacion(), entity.getCalificacion());
	}

	@Override
	public List<CalificacionDomain> toDomainListFromEntityList(List<CalificacionEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<CalificacionDTO> toDTOListFromDomainList(List<CalificacionDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
