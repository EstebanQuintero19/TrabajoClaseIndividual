package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.AdministradorCategoriaDomain;
import co.edu.uco.publiuco.dto.AdministradorCategoriaDTO;
import co.edu.uco.publiuco.entities.AdministradorCategoriaEntity;

public class AdministradorCategoriaAssembler
		implements Assembler<AdministradorCategoriaDomain, AdministradorCategoriaDTO, AdministradorCategoriaEntity> {

	private static final Assembler<AdministradorCategoriaDomain, AdministradorCategoriaDTO, AdministradorCategoriaEntity> INSTANCE = new AdministradorCategoriaAssembler();

	private AdministradorCategoriaAssembler() {
		super();
	}

	public static Assembler<AdministradorCategoriaDomain, AdministradorCategoriaDTO, AdministradorCategoriaEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public AdministradorCategoriaDTO toDTOFromDomain(final AdministradorCategoriaDomain domain) {
		return AdministradorCategoriaDTO.create().setIdentificador(domain.getIdentificador())
				.setTipoIdentificacion(
						TipoIdentificacionAssembler.getInstance().toDTOFromDomain(domain.getTipoIdentificacion()))
				.setNumeroIdentificacion(domain.getNumeroIdentificacion()).setPrimerNombre(domain.getPrimerNombre())
				.setSegundoNombre(domain.getSegundoNombre()).setPrimerApellido(domain.getPrimerApellido())
				.setSegundoApellido(domain.getSegundoApellido()).setCorreo(domain.getCorreo())
				.setIndicadorPais(domain.getIndicadorPais()).setNumeroTelefono(domain.getNumeroTelefono())
				.setTipoRelacion(
						TipoRelacionInstitucionAssembler.getInstance().toDTOFromDomain(domain.getTipoRelacion()))
				.setConfirmacionCorreo(RespuestaAssembler.getInstance().toDTOFromDomain(domain.getConfirmacionCorreo()))
				.setConfirmacionTelefono(
						RespuestaAssembler.getInstance().toDTOFromDomain(domain.getConfirmacionTelefono()))
				.setEstado(EstadoAdministradorCategoriaAssembler.getInstance().toDTOFromDomain(domain.getEstado()));
	}

	@Override
	public AdministradorCategoriaDomain toDomainFromDto(final AdministradorCategoriaDTO dto) {
		return new AdministradorCategoriaDomain(dto.getIdentificador(),
				TipoIdentificacionAssembler.getInstance().toDomainFromDto(dto.getTipoIdentificacion()),
				dto.getNumeroIdentificacion(), dto.getPrimerNombre(), dto.getSegundoNombre(), dto.getPrimerApellido(),
				dto.getSegundoApellido(), dto.getCorreo(), dto.getIndicadorPais(), dto.getNumeroTelefono(),
				TipoRelacionInstitucionAssembler.getInstance().toDomainFromDto(dto.getTipoRelacion()),
				RespuestaAssembler.getInstance().toDomainFromDto(dto.getConfirmacionCorreo()),
				RespuestaAssembler.getInstance().toDomainFromDto(dto.getConfirmacionTelefono()),
				EstadoAdministradorCategoriaAssembler.getInstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public AdministradorCategoriaEntity toEntityFromDomain(final AdministradorCategoriaDomain domain) {
		return new AdministradorCategoriaEntity(domain.getIdentificador(),
				TipoIdentificacionAssembler.getInstance().toEntityFromDomain(domain.getTipoIdentificacion()),
				domain.getNumeroIdentificacion(), domain.getPrimerNombre(), domain.getSegundoNombre(),
				domain.getPrimerApellido(), domain.getSegundoApellido(), domain.getCorreo(), domain.getIndicadorPais(),
				domain.getNumeroTelefono(),
				TipoRelacionInstitucionAssembler.getInstance().toEntityFromDomain(domain.getTipoRelacion()),
				RespuestaAssembler.getInstance().toEntityFromDomain(domain.getConfirmacionCorreo()),
				RespuestaAssembler.getInstance().toEntityFromDomain(domain.getConfirmacionTelefono()),
				EstadoAdministradorCategoriaAssembler.getInstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public AdministradorCategoriaDomain toDomainFromEntity(final AdministradorCategoriaEntity entity) {
		return new AdministradorCategoriaDomain(entity.getIdentificador(),
				TipoIdentificacionAssembler.getInstance().toDomainFromEntity(entity.getTipoIdentificacion()),
				entity.getNumeroIdentificacion(), entity.getPrimerNombre(), entity.getSegundoNombre(),
				entity.getPrimerApellido(), entity.getSegundoApellido(), entity.getCorreo(), entity.getIndicadorPais(),
				entity.getNumeroTelefono(),
				TipoRelacionInstitucionAssembler.getInstance().toDomainFromEntity(entity.getTipoRelacion()),
				RespuestaAssembler.getInstance().toDomainFromEntity(entity.getConfirmacionCorreo()),
				RespuestaAssembler.getInstance().toDomainFromEntity(entity.getConfirmacionTelefono()),
				EstadoAdministradorCategoriaAssembler.getInstance().toDomainFromEntity(entity.getEstado()));
	}

	@Override
	public List<AdministradorCategoriaDomain> toDomainListFromEntityList(
			List<AdministradorCategoriaEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();

	}

	@Override
	public List<AdministradorCategoriaDTO> toDTOListFromDomainList(List<AdministradorCategoriaDomain> domainList) {
		
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
