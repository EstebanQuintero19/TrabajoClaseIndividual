package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.RevisorDomain;
import co.edu.uco.publiuco.dto.RevisorDTO;
import co.edu.uco.publiuco.entities.RevisorEntity;

public class RevisorAssembler implements Assembler<RevisorDomain, RevisorDTO, RevisorEntity> {
	
	private static final Assembler<RevisorDomain, RevisorDTO, RevisorEntity> INSTANCE = new RevisorAssembler();

	private RevisorAssembler() {
		super();
	}

	public static Assembler<RevisorDomain, RevisorDTO, RevisorEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public RevisorDTO toDTOFromDomain(final RevisorDomain domain) {
		return RevisorDTO.create().setIdentificador(domain.getIdentificador())
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
				.setEstado(EstadoRevisorAssembler.getInstance().toDTOFromDomain(domain.getEstado()));
	}

	@Override
	public RevisorDomain toDomainFromDto(final RevisorDTO dto) {
		return new RevisorDomain(dto.getIdentificador(),
				TipoIdentificacionAssembler.getInstance().toDomainFromDto(dto.getTipoIdentificacion()),
				dto.getNumeroIdentificacion(), dto.getPrimerNombre(), dto.getSegundoNombre(), dto.getPrimerApellido(),
				dto.getSegundoApellido(), dto.getCorreo(), dto.getIndicadorPais(), dto.getNumeroTelefono(),
				TipoRelacionInstitucionAssembler.getInstance().toDomainFromDto(dto.getTipoRelacion()),
				RespuestaAssembler.getInstance().toDomainFromDto(dto.getConfirmacionCorreo()),
				RespuestaAssembler.getInstance().toDomainFromDto(dto.getConfirmacionTelefono()),
				EstadoRevisorAssembler.getInstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public RevisorEntity toEntityFromDomain(final RevisorDomain domain) {
		return new RevisorEntity(domain.getIdentificador(),
				TipoIdentificacionAssembler.getInstance().toEntityFromDomain(domain.getTipoIdentificacion()),
				domain.getNumeroIdentificacion(), domain.getPrimerNombre(), domain.getSegundoNombre(),
				domain.getPrimerApellido(), domain.getSegundoApellido(), domain.getCorreo(), domain.getIndicadorPais(),
				domain.getNumeroTelefono(),
				TipoRelacionInstitucionAssembler.getInstance().toEntityFromDomain(domain.getTipoRelacion()),
				RespuestaAssembler.getInstance().toEntityFromDomain(domain.getConfirmacionCorreo()),
				RespuestaAssembler.getInstance().toEntityFromDomain(domain.getConfirmacionTelefono()),
				EstadoRevisorAssembler.getInstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public RevisorDomain toDomainFromEntity(final RevisorEntity entity) {
		return new RevisorDomain(entity.getIdentificador(),
				TipoIdentificacionAssembler.getInstance().toDomainFromEntity(entity.getTipoIdentificacion()),
				entity.getNumeroIdentificacion(), entity.getPrimerNombre(), entity.getSegundoNombre(),
				entity.getPrimerApellido(), entity.getSegundoApellido(), entity.getCorreo(), entity.getIndicadorPais(),
				entity.getNumeroTelefono(),
				TipoRelacionInstitucionAssembler.getInstance().toDomainFromEntity(entity.getTipoRelacion()),
				RespuestaAssembler.getInstance().toDomainFromEntity(entity.getConfirmacionCorreo()),
				RespuestaAssembler.getInstance().toDomainFromEntity(entity.getConfirmacionTelefono()),
				EstadoRevisorAssembler.getInstance().toDomainFromEntity(entity.getEstado()));
	}

	@Override
	public List<RevisorDomain> toDomainListFromEntityList(List<RevisorEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<RevisorDTO> toDTOListFromDomainList(List<RevisorDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
