package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.PreferenciaCategoriaDomain;
import co.edu.uco.publiuco.dto.PreferenciaCategoriaDTO;
import co.edu.uco.publiuco.entities.PreferenciaCategoriaEntity;

public class PreferenciaCategoriaAssembler
		implements Assembler<PreferenciaCategoriaDomain, PreferenciaCategoriaDTO, PreferenciaCategoriaEntity> {

	private static final Assembler<PreferenciaCategoriaDomain, PreferenciaCategoriaDTO, PreferenciaCategoriaEntity> INSTANCE = new PreferenciaCategoriaAssembler();

	private PreferenciaCategoriaAssembler() {
		super();
	}

	public static Assembler<PreferenciaCategoriaDomain, PreferenciaCategoriaDTO, PreferenciaCategoriaEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public PreferenciaCategoriaDTO toDTOFromDomain(final PreferenciaCategoriaDomain domain) {
		return PreferenciaCategoriaDTO.create().setIdentificador(domain.getIdentificador())
				.setPerfil(PerfilAssembler.getInstance().toDTOFromDomain(domain.getPerfil()))
				.setCategoria(CategoriaAssembler.getInstance().toDTOFromDomain(domain.getCategoria()));
	}

	@Override
	public PreferenciaCategoriaDomain toDomainFromDto(final PreferenciaCategoriaDTO dto) {
		return new PreferenciaCategoriaDomain(dto.getIdentificador(),
				PerfilAssembler.getInstance().toDomainFromDto(dto.getPerfil()),
				CategoriaAssembler.getInstance().toDomainFromDto(dto.getCategoria()));
	}

	@Override
	public PreferenciaCategoriaEntity toEntityFromDomain(final PreferenciaCategoriaDomain domain) {
		return new PreferenciaCategoriaEntity(domain.getIdentificador(),
				PerfilAssembler.getInstance().toEntityFromDomain(domain.getPerfil()),
				CategoriaAssembler.getInstance().toEntityFromDomain(domain.getCategoria()));
	}

	@Override
	public PreferenciaCategoriaDomain toDomainFromEntity(final PreferenciaCategoriaEntity entity) {
		return new PreferenciaCategoriaDomain(entity.getIdentificador(),
				PerfilAssembler.getInstance().toDomainFromEntity(entity.getPerfil()),
				CategoriaAssembler.getInstance().toDomainFromEntity(entity.getCategoria()));
	}

	@Override
	public List<PreferenciaCategoriaDomain> toDomainListFromEntityList(List<PreferenciaCategoriaEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<PreferenciaCategoriaDTO> toDTOListFromDomainList(List<PreferenciaCategoriaDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
