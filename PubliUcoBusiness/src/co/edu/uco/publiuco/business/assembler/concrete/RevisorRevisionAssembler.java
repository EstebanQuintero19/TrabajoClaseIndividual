package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.RevisorRevisionDomain;
import co.edu.uco.publiuco.dto.RevisorRevisionDTO;
import co.edu.uco.publiuco.entities.RevisorRevisionEntity;

public class RevisorRevisionAssembler
		implements Assembler<RevisorRevisionDomain, RevisorRevisionDTO, RevisorRevisionEntity> {

	private static final Assembler<RevisorRevisionDomain, RevisorRevisionDTO, RevisorRevisionEntity> INSTANCE = new RevisorRevisionAssembler();

	private RevisorRevisionAssembler() {
		super();
	}

	public static Assembler<RevisorRevisionDomain, RevisorRevisionDTO, RevisorRevisionEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public RevisorRevisionDTO toDTOFromDomain(final RevisorRevisionDomain domain) {
		return RevisorRevisionDTO.create().setIdentificador(domain.getIdentificador())
				.setRevision(RevisionAssembler.getInstance().toDTOFromDomain(domain.getRevision()))
				.setRevisor(RevisorAssembler.getInstance().toDTOFromDomain(domain.getRevisor()))
				.setFechaAsignacionRevision(domain.getFechaAsignacionRevision())
				.setFechaCompletitudRevision(domain.getFechaCompletitudRevision())
				.setEstadoRevision(EstadoRevisionAssembler.getInstance().toDTOFromDomain(domain.getEstadoRevision()));
	}

	@Override
	public RevisorRevisionDomain toDomainFromDto(final RevisorRevisionDTO dto) {
		return new RevisorRevisionDomain(dto.getIdentificador(),
				RevisionAssembler.getInstance().toDomainFromDto(dto.getRevision()),
				RevisorAssembler.getInstance().toDomainFromDto(dto.getRevisor()), dto.getFechaAsignacionRevision(),
				dto.getFechaCompletitudRevision(),
				EstadoRevisionAssembler.getInstance().toDomainFromDto(dto.getEstadoRevision()));
	}

	@Override
	public RevisorRevisionEntity toEntityFromDomain(final RevisorRevisionDomain domain) {
		return new RevisorRevisionEntity(domain.getIdentificador(),
				RevisionAssembler.getInstance().toEntityFromDomain(domain.getRevision()),
				RevisorAssembler.getInstance().toEntityFromDomain(domain.getRevisor()), domain.getFechaAsignacionRevision(),
				domain.getFechaCompletitudRevision(),
				EstadoRevisionAssembler.getInstance().toEntityFromDomain(domain.getEstadoRevision()));
	}

	@Override
	public RevisorRevisionDomain toDomainFromEntity(final RevisorRevisionEntity entity) {
		return new RevisorRevisionDomain(entity.getIdentificador(),
				RevisionAssembler.getInstance().toDomainFromEntity(entity.getRevision()),
				RevisorAssembler.getInstance().toDomainFromEntity(entity.getRevisor()), entity.getFechaAsignacionRevision(),
				entity.getFechaCompletitudRevision(),
				EstadoRevisionAssembler.getInstance().toDomainFromEntity(entity.getEstadoRevision()));
	}

	@Override
	public List<RevisorRevisionDomain> toDomainListFromEntityList(List<RevisorRevisionEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<RevisorRevisionDTO> toDTOListFromDomainList(List<RevisorRevisionDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
