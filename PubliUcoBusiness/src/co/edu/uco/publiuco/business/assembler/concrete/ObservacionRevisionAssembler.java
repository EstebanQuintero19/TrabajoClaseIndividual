package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.ObservacionRevisionDomain;
import co.edu.uco.publiuco.dto.ObservacionRevisionDTO;
import co.edu.uco.publiuco.entities.ObservacionRevisionEntity;

public class ObservacionRevisionAssembler
		implements Assembler<ObservacionRevisionDomain, ObservacionRevisionDTO, ObservacionRevisionEntity> {

	private static final Assembler<ObservacionRevisionDomain, ObservacionRevisionDTO, ObservacionRevisionEntity> INSTANCE = new ObservacionRevisionAssembler();

	private ObservacionRevisionAssembler() {
		super();
	}

	public static Assembler<ObservacionRevisionDomain, ObservacionRevisionDTO, ObservacionRevisionEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public ObservacionRevisionDTO toDTOFromDomain(final ObservacionRevisionDomain domain) {
		return ObservacionRevisionDTO.create().setIdentificador(domain.getIdentificador())
				.setEscritorPublicacion(
						EscritorPublicacionAssembler.getInstance().toDTOFromDomain(domain.getEscritorPublicacion()))
				.setComentarioRevisor(
						ComentarioRevisorAssembler.getInstance().toDTOFromDomain(domain.getComentarioRevisor()))
				.setFechaReporteObservacion(domain.getFechaReporteObservacion())
				.setFechaRevisionObservacion(domain.getFechaRevisionObservacion())
				.setEstado(EstadoObservacionRevisorAssembler.getInstance().toDTOFromDomain(domain.getEstado()))
				.setObservacion(domain.getObservacion());
	}

	@Override
	public ObservacionRevisionDomain toDomainFromDto(final ObservacionRevisionDTO dto) {
		return new ObservacionRevisionDomain(dto.getIdentificador(),
				EscritorPublicacionAssembler.getInstance().toDomainFromDto(dto.getEscritorPublicacion()),
				ComentarioRevisorAssembler.getInstance().toDomainFromDto(dto.getComentarioRevisor()),
				dto.getFechaReporteObservacion(), dto.getFechaRevisionObservacion(),
				EstadoObservacionRevisorAssembler.getInstance().toDomainFromDto(dto.getEstado()), dto.getObservacion());
	}

	@Override
	public ObservacionRevisionEntity toEntityFromDomain(final ObservacionRevisionDomain domain) {
		return new ObservacionRevisionEntity(domain.getIdentificador(),
				EscritorPublicacionAssembler.getInstance().toEntityFromDomain(domain.getEscritorPublicacion()),
				ComentarioRevisorAssembler.getInstance().toEntityFromDomain(domain.getComentarioRevisor()),
				domain.getFechaReporteObservacion(), domain.getFechaRevisionObservacion(),
				EstadoObservacionRevisorAssembler.getInstance().toEntityFromDomain(domain.getEstado()),
				domain.getObservacion());
	}

	@Override
	public ObservacionRevisionDomain toDomainFromEntity(ObservacionRevisionEntity entity) {
		return new ObservacionRevisionDomain(entity.getIdentificador(),
				EscritorPublicacionAssembler.getInstance().toDomainFromEntity(entity.getEscritorPublicacion()),
				ComentarioRevisorAssembler.getInstance().toDomainFromEntity(entity.getComentarioRevisor()),
				entity.getFechaReporteObservacion(), entity.getFechaRevisionObservacion(),
				EstadoObservacionRevisorAssembler.getInstance().toDomainFromEntity(entity.getEstado()),
				entity.getObservacion());
	}

	@Override
	public List<ObservacionRevisionDomain> toDomainListFromEntityList(List<ObservacionRevisionEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<ObservacionRevisionDTO> toDTOListFromDomainList(List<ObservacionRevisionDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
