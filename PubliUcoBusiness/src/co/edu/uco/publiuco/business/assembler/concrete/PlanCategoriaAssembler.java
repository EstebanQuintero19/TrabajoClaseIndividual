package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.PlanCategoriaDomain;
import co.edu.uco.publiuco.dto.PlanCategoriaDTO;
import co.edu.uco.publiuco.entities.PlanCategoriaEntity;

public class PlanCategoriaAssembler implements Assembler<PlanCategoriaDomain, PlanCategoriaDTO, PlanCategoriaEntity> {

	private static final Assembler<PlanCategoriaDomain, PlanCategoriaDTO, PlanCategoriaEntity> INSTANCE = new PlanCategoriaAssembler();

	private PlanCategoriaAssembler() {
		super();
	}

	public static Assembler<PlanCategoriaDomain, PlanCategoriaDTO, PlanCategoriaEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public PlanCategoriaDTO toDTOFromDomain(final PlanCategoriaDomain domain) {
		return PlanCategoriaDTO.create().setIdentificador(domain.getIdentificador())
				.setCategoria(CategoriaAssembler.getInstance().toDTOFromDomain(domain.getCategoria()))
				.setPrecio(domain.getPrecio()).setFechaDesde(domain.getFechaDesde())
				.setFechaHasta(domain.getFechaHasta());
	}

	@Override
	public PlanCategoriaDomain toDomainFromDto(final PlanCategoriaDTO dto) {
		return new PlanCategoriaDomain(dto.getIdentificador(),
				CategoriaAssembler.getInstance().toDomainFromDto(dto.getCategoria()), dto.getPrecio(),
				dto.getFechaDesde(), dto.getFechaHasta());
	}

	@Override
	public PlanCategoriaEntity toEntityFromDomain(final PlanCategoriaDomain domain) {
		return new PlanCategoriaEntity(domain.getIdentificador(),
				CategoriaAssembler.getInstance().toEntityFromDomain(domain.getCategoria()), domain.getPrecio(),
				domain.getFechaDesde(), domain.getFechaHasta());
	}

	@Override
	public PlanCategoriaDomain toDomainFromEntity(final PlanCategoriaEntity entity) {
		return new PlanCategoriaDomain(entity.getIdentificador(),
				CategoriaAssembler.getInstance().toDomainFromEntity(entity.getCategoria()), entity.getPrecio(),
				entity.getFechaDesde(), entity.getFechaHasta());
	}

	@Override
	public List<PlanCategoriaDomain> toDomainListFromEntityList(List<PlanCategoriaEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<PlanCategoriaDTO> toDTOListFromDomainList(List<PlanCategoriaDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
