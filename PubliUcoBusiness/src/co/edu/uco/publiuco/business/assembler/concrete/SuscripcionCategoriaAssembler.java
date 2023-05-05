package co.edu.uco.publiuco.business.assembler.concrete;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.SuscripcionCategoriaDomain;
import co.edu.uco.publiuco.dto.SuscripcionCategoriaDTO;
import co.edu.uco.publiuco.entities.SuscripcionCategoriaEntity;

public class SuscripcionCategoriaAssembler
		implements Assembler<SuscripcionCategoriaDomain, SuscripcionCategoriaDTO, SuscripcionCategoriaEntity> {

	private static final Assembler<SuscripcionCategoriaDomain, SuscripcionCategoriaDTO, SuscripcionCategoriaEntity> INSTANCE = new SuscripcionCategoriaAssembler();

	private SuscripcionCategoriaAssembler() {
		super();
	}

	public static Assembler<SuscripcionCategoriaDomain, SuscripcionCategoriaDTO, SuscripcionCategoriaEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public SuscripcionCategoriaDTO toDTOFromDomain(final SuscripcionCategoriaDomain domain) {
		return SuscripcionCategoriaDTO.create().setIdentificador(domain.getIdentificador())
				.setPerfil(PerfilAssembler.getInstance().toDTOFromDomain(domain.getPerfil()))
				.setPlanCategoria(PlanCategoriaAssembler.getInstance().toDTOFromDomain(domain.getPlanCategoria()));
	}

	@Override
	public SuscripcionCategoriaDomain toDomainFromDto(final SuscripcionCategoriaDTO dto) {
		return new SuscripcionCategoriaDomain(dto.getIdentificador(),
				PerfilAssembler.getInstance().toDomainFromDto(dto.getPerfil()),
				PlanCategoriaAssembler.getInstance().toDomainFromDto(dto.getPlanCategoria()));
	}

	@Override
	public SuscripcionCategoriaEntity toEntityFromDomain(final SuscripcionCategoriaDomain domain) {
		return new SuscripcionCategoriaEntity(domain.getIdentificador(),
				PerfilAssembler.getInstance().toEntityFromDomain(domain.getPerfil()),
				PlanCategoriaAssembler.getInstance().toEntityFromDomain(domain.getPlanCategoria()));
	}

	@Override
	public SuscripcionCategoriaDomain toDomainFromEntity(final SuscripcionCategoriaEntity entity) {
		return new SuscripcionCategoriaDomain(entity.getIdentificador(),
				PerfilAssembler.getInstance().toDomainFromEntity(entity.getPerfil()),
				PlanCategoriaAssembler.getInstance().toDomainFromEntity(entity.getPlanCategoria()));
	}

}