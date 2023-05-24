package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.PerfilDomain;
import co.edu.uco.publiuco.dto.PerfilDTO;
import co.edu.uco.publiuco.entities.PerfilEntity;

public class PerfilAssembler implements Assembler<PerfilDomain, PerfilDTO, PerfilEntity> {

	private static final Assembler<PerfilDomain, PerfilDTO, PerfilEntity> INSTANCE = new PerfilAssembler();

	private PerfilAssembler() {
		super();
	}

	public static Assembler<PerfilDomain, PerfilDTO, PerfilEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public PerfilDTO toDTOFromDomain(final PerfilDomain domain) {
		return PerfilDTO.create().setIdentificador(domain.getIdentificador())
				.setLector(LectorAssembler.getInstance().toDTOFromDomain(domain.getLector()))
				.setRecomendacionCategoria(
						RespuestaAssembler.getInstance().toDTOFromDomain(domain.getRecomendacionCategoria()))
				.setRecomendacionAutor(
						RespuestaAssembler.getInstance().toDTOFromDomain(domain.getRecomendacionAutor()));
	}

	@Override
	public PerfilDomain toDomainFromDto(final PerfilDTO dto) {
		return new PerfilDomain(dto.getIdentificador(), LectorAssembler.getInstance().toDomainFromDto(dto.getLector()),
				RespuestaAssembler.getInstance().toDomainFromDto(dto.getRecomendacionCategoria()),
				RespuestaAssembler.getInstance().toDomainFromDto(dto.getRecomendacionAutor()));
	}

	@Override
	public PerfilEntity toEntityFromDomain(final PerfilDomain domain) {
		return new PerfilEntity(domain.getIdentificador(),
				LectorAssembler.getInstance().toEntityFromDomain(domain.getLector()),
				RespuestaAssembler.getInstance().toEntityFromDomain(domain.getRecomendacionCategoria()),
				RespuestaAssembler.getInstance().toEntityFromDomain(domain.getRecomendacionAutor()));
	}

	@Override
	public PerfilDomain toDomainFromEntity(final PerfilEntity entity) {
		return new PerfilDomain(entity.getIdentificador(),
				LectorAssembler.getInstance().toDomainFromEntity(entity.getLector()),
				RespuestaAssembler.getInstance().toDomainFromEntity(entity.getRecomendacionCategoria()),
				RespuestaAssembler.getInstance().toDomainFromEntity(entity.getRecomendacionAutor()));
	}

	@Override
	public List<PerfilDomain> toDomainListFromEntityList(List<PerfilEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<PerfilDTO> toDTOListFromDomainList(List<PerfilDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
