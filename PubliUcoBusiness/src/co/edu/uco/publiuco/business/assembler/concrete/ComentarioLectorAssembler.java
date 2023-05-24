package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.ComentarioLectorDomain;
import co.edu.uco.publiuco.dto.ComentarioLectorDTO;
import co.edu.uco.publiuco.entities.ComentarioLectorEntity;

public class ComentarioLectorAssembler
		implements Assembler<ComentarioLectorDomain, ComentarioLectorDTO, ComentarioLectorEntity> {

	private static final Assembler<ComentarioLectorDomain, ComentarioLectorDTO, ComentarioLectorEntity> INSTANCE = new ComentarioLectorAssembler();

	private ComentarioLectorAssembler() {
		super();
	}

	public static Assembler<ComentarioLectorDomain, ComentarioLectorDTO, ComentarioLectorEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public ComentarioLectorDTO toDTOFromDomain(final ComentarioLectorDomain domain) {
		return ComentarioLectorDTO.create().setIdentificador(domain.getIdentificador())
				.setLector(LectorAssembler.getInstance().toDTOFromDomain(domain.getLector()))
				.setPublicacion(PublicacionAssembler.getInstance().toDTOFromDomain(domain.getPublicacion()))
				.setComentarioPadre(
						ComentarioLectorAssembler.getInstance().toDTOFromDomain(domain.getComentarioPadre()))
				.setComentario(domain.getComentario()).setFechaCalificacion(domain.getFechaCalificacion())
				.setEstado(EstadoComentarioLectorAssembler.getInstance().toDTOFromDomain(domain.getEstado()));
	}

	@Override
	public ComentarioLectorDomain toDomainFromDto(final ComentarioLectorDTO dto) {
		return new ComentarioLectorDomain(dto.getIdentificador(),
				LectorAssembler.getInstance().toDomainFromDto(dto.getLector()),
				PublicacionAssembler.getInstance().toDomainFromDto(dto.getPublicacion()),
				ComentarioLectorAssembler.getInstance().toDomainFromDto(dto.getComentarioPadre()), dto.getComentario(),
				dto.getFechaCalificacion(),
				EstadoComentarioLectorAssembler.getInstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public ComentarioLectorEntity toEntityFromDomain(final ComentarioLectorDomain domain) {
		return new ComentarioLectorEntity(domain.getIdentificador(),
				LectorAssembler.getInstance().toEntityFromDomain(domain.getLector()),
				PublicacionAssembler.getInstance().toEntityFromDomain(domain.getPublicacion()),
				ComentarioLectorAssembler.getInstance().toEntityFromDomain(domain.getComentarioPadre()), domain.getComentario(),
				domain.getFechaCalificacion(),
				EstadoComentarioLectorAssembler.getInstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public ComentarioLectorDomain toDomainFromEntity(final ComentarioLectorEntity entity) {
		return new ComentarioLectorDomain(entity.getIdentificador(),
				LectorAssembler.getInstance().toDomainFromEntity(entity.getLector()),
				PublicacionAssembler.getInstance().toDomainFromEntity(entity.getPublicacion()),
				ComentarioLectorAssembler.getInstance().toDomainFromEntity(entity.getComentarioPadre()), entity.getComentario(),
				entity.getFechaCalificacion(),
				EstadoComentarioLectorAssembler.getInstance().toDomainFromEntity(entity.getEstado()));
	}

	@Override
	public List<ComentarioLectorDomain> toDomainListFromEntityList(List<ComentarioLectorEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<ComentarioLectorDTO> toDTOListFromDomainList(List<ComentarioLectorDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
