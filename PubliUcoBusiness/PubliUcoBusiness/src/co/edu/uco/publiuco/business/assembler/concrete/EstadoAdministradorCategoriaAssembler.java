package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EstadoAdministradorCategoriaDomain;
import co.edu.uco.publiuco.dto.EstadoAdministradorCategoriaDTO;
import co.edu.uco.publiuco.entities.EstadoAdministradorCategoriaEntity;

public class EstadoAdministradorCategoriaAssembler implements
		Assembler<EstadoAdministradorCategoriaDomain, EstadoAdministradorCategoriaDTO, EstadoAdministradorCategoriaEntity> {

	private static final Assembler<EstadoAdministradorCategoriaDomain, EstadoAdministradorCategoriaDTO, EstadoAdministradorCategoriaEntity> INSTANCE = new EstadoAdministradorCategoriaAssembler();

	private EstadoAdministradorCategoriaAssembler() {
		super();
	}

	public static final Assembler<EstadoAdministradorCategoriaDomain, EstadoAdministradorCategoriaDTO, EstadoAdministradorCategoriaEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public EstadoAdministradorCategoriaDTO toDTOFromDomain(final EstadoAdministradorCategoriaDomain domian) {
		return EstadoAdministradorCategoriaDTO.create().setIdentificador(domian.getIdentificador())
				.setNombre(domian.getNombre()).setDescripcion(domian.getDescripcion());
	}

	@Override
	public EstadoAdministradorCategoriaDomain toDomainFromDto(final EstadoAdministradorCategoriaDTO dto) {
		return new EstadoAdministradorCategoriaDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoAdministradorCategoriaEntity toEntityFromDomain(final EstadoAdministradorCategoriaDomain domain) {
		return new EstadoAdministradorCategoriaEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoAdministradorCategoriaDomain toDomainFromEntity(final EstadoAdministradorCategoriaEntity entity) {
		return new EstadoAdministradorCategoriaDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}

	@Override
	public List<EstadoAdministradorCategoriaDomain> toDomainListFromEntityList(
			List<EstadoAdministradorCategoriaEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<EstadoAdministradorCategoriaDTO> toDTOListFromDomainList(
			List<EstadoAdministradorCategoriaDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
