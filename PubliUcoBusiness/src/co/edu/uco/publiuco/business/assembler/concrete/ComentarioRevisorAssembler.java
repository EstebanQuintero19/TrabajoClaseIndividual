package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.ComentarioRevisorDomain;
import co.edu.uco.publiuco.dto.ComentarioRevisorDTO;
import co.edu.uco.publiuco.entities.ComentarioRevisorEntity;

public class ComentarioRevisorAssembler
		implements Assembler<ComentarioRevisorDomain, ComentarioRevisorDTO, ComentarioRevisorEntity> {

	private static final Assembler<ComentarioRevisorDomain, ComentarioRevisorDTO, ComentarioRevisorEntity> INSTANCE = new ComentarioRevisorAssembler();

	private ComentarioRevisorAssembler() {
		super();
	}

	public static Assembler<ComentarioRevisorDomain, ComentarioRevisorDTO, ComentarioRevisorEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public ComentarioRevisorDTO toDTOFromDomain(final ComentarioRevisorDomain domain) {
		return ComentarioRevisorDTO.create().setIdentificador(domain.getIdentificador())
				.setRevisorRevision(RevisorRevisionAssembler.getInstance().toDTOFromDomain(domain.getRevisorRevision()))
				.setTipoComentarioRevisor(
						TipoComentarioRevisorAssembler.getInstance().toDTOFromDomain(domain.getTipoComentarioRevisor()))
				.setComentario(domain.getComentario());
	}

	@Override
	public ComentarioRevisorDomain toDomainFromDto(final ComentarioRevisorDTO dto) {
		return new ComentarioRevisorDomain(dto.getIdentificador(),
				RevisorRevisionAssembler.getInstance().toDomainFromDto(dto.getRevisorRevision()),
				TipoComentarioRevisorAssembler.getInstance().toDomainFromDto(dto.getTipoComentarioRevisor()),
				dto.getComentario());
	}

	@Override
	public ComentarioRevisorEntity toEntityFromDomain(final ComentarioRevisorDomain domain) {
		return new ComentarioRevisorEntity(domain.getIdentificador(),
				RevisorRevisionAssembler.getInstance().toEntityFromDomain(domain.getRevisorRevision()),
				TipoComentarioRevisorAssembler.getInstance().toEntityFromDomain(domain.getTipoComentarioRevisor()),
				domain.getComentario());
	}

	@Override
	public ComentarioRevisorDomain toDomainFromEntity(final ComentarioRevisorEntity entity) {
		return new ComentarioRevisorDomain(entity.getIdentificador(),
				RevisorRevisionAssembler.getInstance().toDomainFromEntity(entity.getRevisorRevision()),
				TipoComentarioRevisorAssembler.getInstance().toDomainFromEntity(entity.getTipoComentarioRevisor()),
				entity.getComentario());
	}

	@Override
	public co.edu.uco.publiuco.business.assembler.concrete.ComentarioRevisorDTO toDTOFromDomain(
			co.edu.uco.publiuco.business.assembler.concrete.ComentarioRevisorDomain domian) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public co.edu.uco.publiuco.business.assembler.concrete.ComentarioRevisorDomain toDomainFromDto(
			co.edu.uco.publiuco.business.assembler.concrete.ComentarioRevisorDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComentarioRevisorEntity toEntityFromDomain(
			co.edu.uco.publiuco.business.assembler.concrete.ComentarioRevisorDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<co.edu.uco.publiuco.business.assembler.concrete.ComentarioRevisorDomain> toDomainListFromEntity(
			List<ComentarioRevisorEntity> entityList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComentarioRevisorDTO toDTOFromDomain(
			co.edu.uco.publiuco.business.assembler.concrete.ComentarioRevisorDomain domian) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ComentarioRevisorEntity toEntityFromDomain(
			co.edu.uco.publiuco.business.assembler.concrete.ComentarioRevisorDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}

}