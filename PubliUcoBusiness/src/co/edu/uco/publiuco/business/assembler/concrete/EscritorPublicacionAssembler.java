package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EscritorPublicacionDomain;
import co.edu.uco.publiuco.dto.EscritorPublicacionDTO;
import co.edu.uco.publiuco.entities.EscritorPublicacionEntity;

public class EscritorPublicacionAssembler
		implements Assembler<EscritorPublicacionDomain, EscritorPublicacionDTO, EscritorPublicacionEntity> {

	private static final Assembler<EscritorPublicacionDomain, EscritorPublicacionDTO, EscritorPublicacionEntity> INSTANCE = new EscritorPublicacionAssembler();

	private EscritorPublicacionAssembler() {
		super();
	}

	public static Assembler<EscritorPublicacionDomain, EscritorPublicacionDTO, EscritorPublicacionEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public EscritorPublicacionDTO toDTOFromDomain(final EscritorPublicacionDomain domain) {
		return EscritorPublicacionDTO.create().setIdentificador(domain.getIdentificador())
				.setPublicacion(PublicacionAssembler.getInstance().toDTOFromDomain(domain.getPublicacion()))
				.setEscritor(EscritorAssembler.getInstance().toDTOFromDomain(domain.getEscritor()))
				.setTipoEscritor(TipoEscritorAssembler.getInstance().toDTOFromDomain(domain.getTipoEscritor()));
	}

	@Override
	public EscritorPublicacionDomain toDomainFromDto(final EscritorPublicacionDTO dto) {
		return new EscritorPublicacionDomain(dto.getIdentificador(),
				EscritorAssembler.getInstance().toDomainFromDto(dto.getEscritor()),
				PublicacionAssembler.getInstance().toDomainFromDto(dto.getPublicacion()),
				TipoEscritorAssembler.getInstance().toDomainFromDto(dto.getTipoEscritor()));
	}

	@Override
	public EscritorPublicacionEntity toEntityFromDomain(final EscritorPublicacionDomain domain) {
		return new EscritorPublicacionEntity(domain.getIdentificador(),
				EscritorAssembler.getInstance().toEntityFromDomain(domain.getEscritor()),
				PublicacionAssembler.getInstance().toEntityFromDomain(domain.getPublicacion()),
				TipoEscritorAssembler.getInstance().toEntityFromDomain(domain.getTipoEscritor()));
	}

	@Override
	public EscritorPublicacionDomain toDomainFromEntity(EscritorPublicacionEntity entity) {
		return new EscritorPublicacionDomain(entity.getIdentificador(),
				EscritorAssembler.getInstance().toDomainFromEntity(entity.getEscritor()),
				PublicacionAssembler.getInstance().toDomainFromEntity(entity.getPublicacion()),
				TipoEscritorAssembler.getInstance().toDomainFromEntity(entity.getTipoEscritor()));
	}

	@Override
	public List<EscritorPublicacionDomain> toDomainListFromEntityList(List<EscritorPublicacionEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<EscritorPublicacionDTO> toDTOListFromDomainList(List<EscritorPublicacionDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
