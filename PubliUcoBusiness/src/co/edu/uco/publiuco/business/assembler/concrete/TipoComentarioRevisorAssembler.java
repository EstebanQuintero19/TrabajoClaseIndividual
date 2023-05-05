package co.edu.uco.publiuco.business.assembler.concrete;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.TipoComentarioRevisorDomain;
import co.edu.uco.publiuco.dto.TipoComentarioRevisorDTO;
import co.edu.uco.publiuco.entities.TipoComentarioRevisorEntity;

public class TipoComentarioRevisorAssembler implements Assembler<TipoComentarioRevisorDomain, TipoComentarioRevisorDTO, TipoComentarioRevisorEntity> {
	
	private static final Assembler<TipoComentarioRevisorDomain, TipoComentarioRevisorDTO, TipoComentarioRevisorEntity> INSTANCE = new TipoComentarioRevisorAssembler();

	private TipoComentarioRevisorAssembler() {
		super();
	}

	public static Assembler<TipoComentarioRevisorDomain, TipoComentarioRevisorDTO, TipoComentarioRevisorEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public TipoComentarioRevisorDTO toDTOFromDomain(final TipoComentarioRevisorDomain domian) {
		return TipoComentarioRevisorDTO.create().setIdentificador(domian.getIdentificador()).setNombre(domian.getNombre())
				.setDescripcion(domian.getDescripcion());
	}

	@Override
	public TipoComentarioRevisorDomain toDomainFromDto(final TipoComentarioRevisorDTO dto) {
		return new TipoComentarioRevisorDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public TipoComentarioRevisorEntity toEntityFromDomain(final TipoComentarioRevisorDomain domain) {
		return new TipoComentarioRevisorEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public TipoComentarioRevisorDomain toDomainFromEntity(final TipoComentarioRevisorEntity entity) {
		return new TipoComentarioRevisorDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}

}