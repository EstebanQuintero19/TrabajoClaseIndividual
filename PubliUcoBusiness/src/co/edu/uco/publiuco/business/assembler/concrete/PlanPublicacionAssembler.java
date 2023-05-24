package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.PlanPublicacionDomain;
import co.edu.uco.publiuco.dto.PlanPublicacionDTO;
import co.edu.uco.publiuco.entities.PlanPublicacionEntity;

public class PlanPublicacionAssembler
		implements Assembler<PlanPublicacionDomain, PlanPublicacionDTO, PlanPublicacionEntity> {

	private static final Assembler<PlanPublicacionDomain, PlanPublicacionDTO, PlanPublicacionEntity> INSTANCE = new PlanPublicacionAssembler();

	private PlanPublicacionAssembler() {
		super();
	}

	public static Assembler<PlanPublicacionDomain, PlanPublicacionDTO, PlanPublicacionEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public PlanPublicacionDTO toDTOFromDomain(final PlanPublicacionDomain domain) {
		return PlanPublicacionDTO.create().setIdentificador(domain.getIdentificador())
				.setPublicacion(PublicacionAssembler.getInstance().toDTOFromDomain(domain.getPublicacion()))
				.setPrecio(domain.getPrecio()).setFechaDesde(domain.getFechaDesde())
				.setFechaHasta(domain.getFechaHasta());
	}

	@Override
	public PlanPublicacionDomain toDomainFromDto(final PlanPublicacionDTO dto) {
		return new PlanPublicacionDomain(dto.getIdentificador(),
				PublicacionAssembler.getInstance().toDomainFromDto(dto.getPublicacion()), dto.getPrecio(),
				dto.getFechaDesde(), dto.getFechaHasta());
	}

	@Override
	public PlanPublicacionEntity toEntityFromDomain(final PlanPublicacionDomain domain) {
		return new PlanPublicacionEntity(domain.getIdentificador(),
				PublicacionAssembler.getInstance().toEntityFromDomain(domain.getPublicacion()), domain.getPrecio(),
				domain.getFechaDesde(), domain.getFechaHasta());
	}

	@Override
	public PlanPublicacionDomain toDomainFromEntity(final PlanPublicacionEntity entity) {
		return new PlanPublicacionDomain(entity.getIdentificador(),
				PublicacionAssembler.getInstance().toDomainFromEntity(entity.getPublicacion()), entity.getPrecio(),
				entity.getFechaDesde(), entity.getFechaHasta());
	}

	@Override
	public List<PlanPublicacionDomain> toDomainListFromEntityList(List<PlanPublicacionEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<PlanPublicacionDTO> toDTOListFromDomainList(List<PlanPublicacionDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
