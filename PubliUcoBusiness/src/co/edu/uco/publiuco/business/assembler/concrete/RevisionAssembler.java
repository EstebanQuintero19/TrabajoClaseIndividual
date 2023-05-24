package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.RevisionDomain;
import co.edu.uco.publiuco.dto.RevisionDTO;
import co.edu.uco.publiuco.entities.RevisionEntity;

public class RevisionAssembler implements Assembler<RevisionDomain, RevisionDTO, RevisionEntity> {

	private static final Assembler<RevisionDomain, RevisionDTO, RevisionEntity> INSTANCE = new RevisionAssembler();

	private RevisionAssembler() {
		super();
	}

	public static Assembler<RevisionDomain, RevisionDTO, RevisionEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public RevisionDTO toDTOFromDomain(final RevisionDomain domain) {
		return RevisionDTO.create().setIdentificador(domain.getIdentificador())
				.setVersion(VersionAssembler.getInstance().toDTOFromDomain(domain.getVersion()))
				.setTipoRevision(TipoRevisionAssembler.getInstance().toDTOFromDomain(domain.getTipoRevision()))
				.setFechaSolicitudRevision(domain.getFechaCompletitudRevision())
				.setFechaLimiteRevision(domain.getFechaLimiteRevision())
				.setFechaCompletitudRevision(domain.getFechaCompletitudRevision())
				.setEstado(EstadoRevisionAssembler.getInstance().toDTOFromDomain(domain.getEstado()));
	}

	@Override
	public RevisionDomain toDomainFromDto(final RevisionDTO dto) {
		return new RevisionDomain(dto.getIdentificador(),
				VersionAssembler.getInstance().toDomainFromDto(dto.getVersion()),
				TipoRevisionAssembler.getInstance().toDomainFromDto(dto.getTipoRevision()),
				dto.getFechaSolicitudRevision(), dto.getFechaLimiteRevision(), dto.getFechaCompletitudRevision(),
				EstadoRevisionAssembler.getInstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public RevisionEntity toEntityFromDomain(final RevisionDomain domain) {
		return new RevisionEntity(domain.getIdentificador(),
				VersionAssembler.getInstance().toEntityFromDomain(domain.getVersion()),
				TipoRevisionAssembler.getInstance().toEntityFromDomain(domain.getTipoRevision()),
				domain.getFechaSolicitudRevision(), domain.getFechaLimiteRevision(),
				domain.getFechaCompletitudRevision(),
				EstadoRevisionAssembler.getInstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public RevisionDomain toDomainFromEntity(final RevisionEntity entity) {
		return new RevisionDomain(entity.getIdentificador(),
				VersionAssembler.getInstance().toDomainFromEntity(entity.getVersion()),
				TipoRevisionAssembler.getInstance().toDomainFromEntity(entity.getTipoRevision()),
				entity.getFechaSolicitudRevision(), entity.getFechaLimiteRevision(),
				entity.getFechaCompletitudRevision(),
				EstadoRevisionAssembler.getInstance().toDomainFromEntity(entity.getEstado()));
	}

	@Override
	public List<RevisionDomain> toDomainListFromEntityList(List<RevisionEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<RevisionDTO> toDTOListFromDomainList(List<RevisionDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
