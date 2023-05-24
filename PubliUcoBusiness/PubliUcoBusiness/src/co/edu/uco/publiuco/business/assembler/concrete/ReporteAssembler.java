package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.ReporteDomain;
import co.edu.uco.publiuco.dto.ReporteDTO;
import co.edu.uco.publiuco.entities.ReporteEntity;

public class ReporteAssembler implements Assembler<ReporteDomain, ReporteDTO, ReporteEntity> {

	private static final Assembler<ReporteDomain, ReporteDTO, ReporteEntity> INSTANCE = new ReporteAssembler();

	private ReporteAssembler() {
		super();
	}

	public static Assembler<ReporteDomain, ReporteDTO, ReporteEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public ReporteDTO toDTOFromDomain(final ReporteDomain domain) {
		return ReporteDTO.create().setIdentificador(domain.getIdentificador())
				.setLector(LectorAssembler.getInstance().toDTOFromDomain(domain.getLector()))
				.setComentario(ComentarioLectorAssembler.getInstance().toDTOFromDomain(domain.getComentario()))
				.setTipoReporte(TipoReporteAssembler.getInstance().toDTOFromDomain(domain.getTipoReporte()))
				.setRazon(domain.getRazon()).setFechaReporte(domain.getFechaReporte());
	}

	@Override
	public ReporteDomain toDomainFromDto(final ReporteDTO dto) {
		return new ReporteDomain(dto.getIdentificador(), LectorAssembler.getInstance().toDomainFromDto(dto.getLector()),
				ComentarioLectorAssembler.getInstance().toDomainFromDto(dto.getComentario()),
				TipoReporteAssembler.getInstance().toDomainFromDto(dto.getTipoReporte()), dto.getRazon(),
				dto.getFechaReporte());
	}

	@Override
	public ReporteEntity toEntityFromDomain(final ReporteDomain domain) {
		return new ReporteEntity(domain.getIdentificador(), LectorAssembler.getInstance().toEntityFromDomain(domain.getLector()),
				ComentarioLectorAssembler.getInstance().toEntityFromDomain(domain.getComentario()),
				TipoReporteAssembler.getInstance().toEntityFromDomain(domain.getTipoReporte()), domain.getRazon(),
				domain.getFechaReporte());
	}

	@Override
	public ReporteDomain toDomainFromEntity(final ReporteEntity entity) {
		return new ReporteDomain(entity.getIdentificador(), LectorAssembler.getInstance().toDomainFromEntity(entity.getLector()),
				ComentarioLectorAssembler.getInstance().toDomainFromEntity(entity.getComentario()),
				TipoReporteAssembler.getInstance().toDomainFromEntity(entity.getTipoReporte()), entity.getRazon(),
				entity.getFechaReporte());
	}

	@Override
	public List<ReporteDomain> toDomainListFromEntityList(List<ReporteEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<ReporteDTO> toDTOListFromDomainList(List<ReporteDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
