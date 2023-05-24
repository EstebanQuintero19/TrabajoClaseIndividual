package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.TipoReporteDomain;
import co.edu.uco.publiuco.dto.TipoReporteDTO;
import co.edu.uco.publiuco.entities.TipoReporteEntity;

public class TipoReporteAssembler implements Assembler<TipoReporteDomain, TipoReporteDTO, TipoReporteEntity> {
	
	private static final Assembler<TipoReporteDomain, TipoReporteDTO, TipoReporteEntity> INSTANCE = new TipoReporteAssembler();

	private TipoReporteAssembler() {
		super();
	}

	public static Assembler<TipoReporteDomain, TipoReporteDTO, TipoReporteEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public TipoReporteDTO toDTOFromDomain(final TipoReporteDomain domian) {
		return TipoReporteDTO.create().setIdentificador(domian.getIdentificador()).setNombre(domian.getNombre())
				.setDescripcion(domian.getDescripcion());
	}

	@Override
	public TipoReporteDomain toDomainFromDto(final TipoReporteDTO dto) {
		return new TipoReporteDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public TipoReporteEntity toEntityFromDomain(final TipoReporteDomain domain) {
		return new TipoReporteEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public TipoReporteDomain toDomainFromEntity(final TipoReporteEntity entity) {
		return new TipoReporteDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}

	@Override
	public List<TipoReporteDomain> toDomainListFromEntityList(List<TipoReporteEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<TipoReporteDTO> toDTOListFromDomainList(List<TipoReporteDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
