package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.SuscripcionPublicacionDomain;
import co.edu.uco.publiuco.dto.SuscripcionPublicacionDTO;
import co.edu.uco.publiuco.entities.SuscripcionPublicacionEntity;

public class SuscripcionPublicacionAssembler
		implements Assembler<SuscripcionPublicacionDomain, SuscripcionPublicacionDTO, SuscripcionPublicacionEntity> {

	private static final Assembler<SuscripcionPublicacionDomain, SuscripcionPublicacionDTO, SuscripcionPublicacionEntity> INSTANCE = new SuscripcionPublicacionAssembler();

	private SuscripcionPublicacionAssembler() {
		super();
	}

	public static Assembler<SuscripcionPublicacionDomain, SuscripcionPublicacionDTO, SuscripcionPublicacionEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public SuscripcionPublicacionDTO toDTOFromDomain(final SuscripcionPublicacionDomain domain) {
		return SuscripcionPublicacionDTO.create().setIdentificador(domain.getIdentificador())
				.setPerfil(PerfilAssembler.getInstance().toDTOFromDomain(domain.getPerfil())).setPlanPublicacion(
						PlanPublicacionAssembler.getInstance().toDTOFromDomain(domain.getPlanPublicacion()));
	}

	@Override
	public SuscripcionPublicacionDomain toDomainFromDto(final SuscripcionPublicacionDTO dto) {
		return new SuscripcionPublicacionDomain(dto.getIdentificador(),
				PerfilAssembler.getInstance().toDomainFromDto(dto.getPerfil()),
				PlanPublicacionAssembler.getInstance().toDomainFromDto(dto.getPlanPublicacion()));
	}

	@Override
	public SuscripcionPublicacionEntity toEntityFromDomain(final SuscripcionPublicacionDomain domain) {
		return new SuscripcionPublicacionEntity(domain.getIdentificador(),
				PerfilAssembler.getInstance().toEntityFromDomain(domain.getPerfil()),
				PlanPublicacionAssembler.getInstance().toEntityFromDomain(domain.getPlanPublicacion()));
	}

	@Override
	public SuscripcionPublicacionDomain toDomainFromEntity(final SuscripcionPublicacionEntity entity) {
		return new SuscripcionPublicacionDomain(entity.getIdentificador(),
				PerfilAssembler.getInstance().toDomainFromEntity(entity.getPerfil()),
				PlanPublicacionAssembler.getInstance().toDomainFromEntity(entity.getPlanPublicacion()));
	}

	@Override
	public List<SuscripcionPublicacionDomain> toDomainListFromEntityList(
			List<SuscripcionPublicacionEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<SuscripcionPublicacionDTO> toDTOListFromDomainList(List<SuscripcionPublicacionDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
