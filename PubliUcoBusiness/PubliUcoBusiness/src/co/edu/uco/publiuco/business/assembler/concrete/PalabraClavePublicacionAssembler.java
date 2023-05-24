package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.PalabraClavePublicacionDomain;
import co.edu.uco.publiuco.dto.PalabraClavePublicacionDTO;
import co.edu.uco.publiuco.entities.PalabraClavePublicacionEntity;

public class PalabraClavePublicacionAssembler
		implements Assembler<PalabraClavePublicacionDomain, PalabraClavePublicacionDTO, PalabraClavePublicacionEntity> {

	private static final Assembler<PalabraClavePublicacionDomain, PalabraClavePublicacionDTO, PalabraClavePublicacionEntity> INSTANCE = new PalabraClavePublicacionAssembler();

	private PalabraClavePublicacionAssembler() {
		super();
	}

	public static Assembler<PalabraClavePublicacionDomain, PalabraClavePublicacionDTO, PalabraClavePublicacionEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public PalabraClavePublicacionDTO toDTOFromDomain(final PalabraClavePublicacionDomain domain) {
		return PalabraClavePublicacionDTO.create().setIdentificador(domain.getIdentificador())
				.setPublicacion(PublicacionAssembler.getInstance().toDTOFromDomain(domain.getPublicacion()))
				.setPalabraClave(domain.getPalabraClave());
	}

	@Override
	public PalabraClavePublicacionDomain toDomainFromDto(final PalabraClavePublicacionDTO dto) {
		return new PalabraClavePublicacionDomain(dto.getIdentificador(),
				PublicacionAssembler.getInstance().toDomainFromDto(dto.getPublicacion()), dto.getPalabraClave());
	}

	@Override
	public PalabraClavePublicacionEntity toEntityFromDomain(final PalabraClavePublicacionDomain domain) {
		return new PalabraClavePublicacionEntity(domain.getIdentificador(),
				PublicacionAssembler.getInstance().toEntityFromDomain(domain.getPublicacion()),
				domain.getPalabraClave());
	}

	@Override
	public PalabraClavePublicacionDomain toDomainFromEntity(final PalabraClavePublicacionEntity entity) {
		return new PalabraClavePublicacionDomain(entity.getIdentificador(),
				PublicacionAssembler.getInstance().toDomainFromEntity(entity.getPublicacion()),
				entity.getPalabraClave());
	}

	@Override
	public List<PalabraClavePublicacionDomain> toDomainListFromEntityList(
			List<PalabraClavePublicacionEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<PalabraClavePublicacionDTO> toDTOListFromDomainList(List<PalabraClavePublicacionDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
