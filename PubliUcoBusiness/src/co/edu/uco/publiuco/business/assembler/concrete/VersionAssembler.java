package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.VersionDomain;
import co.edu.uco.publiuco.dto.VersionDTO;
import co.edu.uco.publiuco.entities.VersionEntity;

public class VersionAssembler implements Assembler<VersionDomain, VersionDTO, VersionEntity> {

	private static final Assembler<VersionDomain, VersionDTO, VersionEntity> INSTANCE = new VersionAssembler();

	private VersionAssembler() {
		super();
	}

	public static Assembler<VersionDomain, VersionDTO, VersionEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public VersionDTO toDTOFromDomain(final VersionDomain domain) {
		return VersionDTO.create().setIdentificador(domain.getIdentificador())
				.setPublicacion(PublicacionAssembler.getInstance().toDTOFromDomain(domain.getPublicacion()))
				.setVersionAnterior(VersionAssembler.getInstance().toDTOFromDomain(domain.getVersionAnterior()))
				.setNumeroVersion(domain.getNumeroVersion()).setFechaCreacion(domain.getFechaCreacion())
				.setFechaUltimaModificacion(domain.getFechaUltimaModificacion()).setTitulo(domain.getTitulo())
				.setResumen(domain.getResumen()).setCuerpo(domain.getCuerpo())
				.setEstado(EstadoPublicacionAssembler.getInstance().toDTOFromDomain(domain.getEstado()));
	}

	@Override
	public VersionDomain toDomainFromDto(final VersionDTO dto) {
		return new VersionDomain(dto.getIdentificador(),
				PublicacionAssembler.getInstance().toDomainFromDto(dto.getPublicacion()),
				VersionAssembler.getInstance().toDomainFromDto(dto.getVersionAnterior()), dto.getNumeroVersion(),
				dto.getFechaCreacion(), dto.getFechaUltimaModificacion(), dto.getTitulo(), dto.getResumen(),
				dto.getCuerpo(), EstadoPublicacionAssembler.getInstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public VersionEntity toEntityFromDomain(final VersionDomain domain) {
		return new VersionEntity(domain.getIdentificador(),
				PublicacionAssembler.getInstance().toEntityFromDomain(domain.getPublicacion()),
				VersionAssembler.getInstance().toEntityFromDomain(domain.getVersionAnterior()),
				domain.getNumeroVersion(), domain.getFechaCreacion(), domain.getFechaUltimaModificacion(),
				domain.getTitulo(), domain.getResumen(), domain.getCuerpo(),
				EstadoPublicacionAssembler.getInstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public VersionDomain toDomainFromEntity(final VersionEntity entity) {
		return new VersionDomain(entity.getIdentificador(),
				PublicacionAssembler.getInstance().toDomainFromEntity(entity.getPublicacion()),
				VersionAssembler.getInstance().toDomainFromEntity(entity.getVersionAnterior()),
				entity.getNumeroVersion(), entity.getFechaCreacion(), entity.getFechaUltimaModificacion(),
				entity.getTitulo(), entity.getResumen(), entity.getCuerpo(),
				EstadoPublicacionAssembler.getInstance().toDomainFromEntity(entity.getEstado()));
	}

	@Override
	public List<VersionDomain> toDomainListFromEntityList(List<VersionEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<VersionDTO> toDTOListFromDomainList(List<VersionDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
