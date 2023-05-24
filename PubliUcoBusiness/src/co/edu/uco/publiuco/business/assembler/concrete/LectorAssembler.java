package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.LectorDomain;
import co.edu.uco.publiuco.dto.LectorDTO;
import co.edu.uco.publiuco.entities.LectorEntity;

public class LectorAssembler implements Assembler<LectorDomain, LectorDTO, LectorEntity> {

	private static final Assembler<LectorDomain, LectorDTO, LectorEntity> INSTANCE = new LectorAssembler();

	private LectorAssembler() {
		super();
	}

	public static Assembler<LectorDomain, LectorDTO, LectorEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public LectorDTO toDTOFromDomain(final LectorDomain domain) {
		return LectorDTO.create().setIdentificador(domain.getIdentificador())
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
				.setEstado(EstadoLectorAssembler.getInstance().toDTOFromDomain(domain.getEstado()));
	}

	@Override
	public LectorDomain toDomainFromDto(final LectorDTO dto) {
		return new LectorDomain(dto.getIdentificador(),
				TipoIdentificacionAssembler.getInstance().toDomainFromDto(dto.getTipoIdentificacion()),
				dto.getNumeroIdentificacion(), dto.getPrimerNombre(), dto.getSegundoNombre(), dto.getPrimerApellido(),
				dto.getSegundoApellido(), dto.getCorreo(), dto.getIndicadorPais(), dto.getNumeroTelefono(),
				TipoRelacionInstitucionAssembler.getInstance().toDomainFromDto(dto.getTipoRelacion()),
				RespuestaAssembler.getInstance().toDomainFromDto(dto.getConfirmacionCorreo()),
				RespuestaAssembler.getInstance().toDomainFromDto(dto.getConfirmacionTelefono()),
				EstadoLectorAssembler.getInstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public LectorEntity toEntityFromDomain(final LectorDomain domain) {
		return new LectorEntity(domain.getIdentificador(),
				TipoIdentificacionAssembler.getInstance().toEntityFromDomain(domain.getTipoIdentificacion()),
				domain.getNumeroIdentificacion(), domain.getPrimerNombre(), domain.getSegundoNombre(),
				domain.getPrimerApellido(), domain.getSegundoApellido(), domain.getCorreo(), domain.getIndicadorPais(),
				domain.getNumeroTelefono(),
				TipoRelacionInstitucionAssembler.getInstance().toEntityFromDomain(domain.getTipoRelacion()),
				RespuestaAssembler.getInstance().toEntityFromDomain(domain.getConfirmacionCorreo()),
				RespuestaAssembler.getInstance().toEntityFromDomain(domain.getConfirmacionTelefono()),
				EstadoLectorAssembler.getInstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public LectorDomain toDomainFromEntity(final LectorEntity entity) {
		return new LectorDomain(entity.getIdentificador(),
				TipoIdentificacionAssembler.getInstance().toDomainFromEntity(entity.getTipoIdentificacion()),
				entity.getNumeroIdentificacion(), entity.getPrimerNombre(), entity.getSegundoNombre(),
				entity.getPrimerApellido(), entity.getSegundoApellido(), entity.getCorreo(), entity.getIndicadorPais(),
				entity.getNumeroTelefono(),
				TipoRelacionInstitucionAssembler.getInstance().toDomainFromEntity(entity.getTipoRelacion()),
				RespuestaAssembler.getInstance().toDomainFromEntity(entity.getConfirmacionCorreo()),
				RespuestaAssembler.getInstance().toDomainFromEntity(entity.getConfirmacionTelefono()),
				EstadoLectorAssembler.getInstance().toDomainFromEntity(entity.getEstado()));
	}

	@Override
	public List<LectorDomain> toDomainListFromEntityList(List<LectorEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<LectorDTO> toDTOListFromDomainList(List<LectorDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
