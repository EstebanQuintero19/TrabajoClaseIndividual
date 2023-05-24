package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EscritorDomain;
import co.edu.uco.publiuco.dto.EscritorDTO;
import co.edu.uco.publiuco.entities.EscritorEntity;

public class EscritorAssembler implements Assembler<EscritorDomain, EscritorDTO, EscritorEntity>{
	
	private static final Assembler<EscritorDomain, EscritorDTO, EscritorEntity> INSTANCE = new EscritorAssembler();

	private EscritorAssembler() {
		super();
	}

	public static Assembler<EscritorDomain, EscritorDTO, EscritorEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public EscritorDTO toDTOFromDomain(final EscritorDomain domain) {
		return EscritorDTO.create().setIdentificador(domain.getIdentificador())
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
				.setEstado(EstadoEscritorAssembler.getInstance().toDTOFromDomain(domain.getEstado()));
	}

	@Override
	public EscritorDomain toDomainFromDto(final EscritorDTO dto) {
		return new EscritorDomain(dto.getIdentificador(),
				TipoIdentificacionAssembler.getInstance().toDomainFromDto(dto.getTipoIdentificacion()),
				dto.getNumeroIdentificacion(), dto.getPrimerNombre(), dto.getSegundoNombre(), dto.getPrimerApellido(),
				dto.getSegundoApellido(), dto.getCorreo(), dto.getIndicadorPais(), dto.getNumeroTelefono(),
				TipoRelacionInstitucionAssembler.getInstance().toDomainFromDto(dto.getTipoRelacion()),
				RespuestaAssembler.getInstance().toDomainFromDto(dto.getConfirmacionCorreo()),
				RespuestaAssembler.getInstance().toDomainFromDto(dto.getConfirmacionTelefono()),
				EstadoEscritorAssembler.getInstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public EscritorEntity toEntityFromDomain(final EscritorDomain domain) {
		return new EscritorEntity(domain.getIdentificador(),
				TipoIdentificacionAssembler.getInstance().toEntityFromDomain(domain.getTipoIdentificacion()),
				domain.getNumeroIdentificacion(), domain.getPrimerNombre(), domain.getSegundoNombre(),
				domain.getPrimerApellido(), domain.getSegundoApellido(), domain.getCorreo(), domain.getIndicadorPais(),
				domain.getNumeroTelefono(),
				TipoRelacionInstitucionAssembler.getInstance().toEntityFromDomain(domain.getTipoRelacion()),
				RespuestaAssembler.getInstance().toEntityFromDomain(domain.getConfirmacionCorreo()),
				RespuestaAssembler.getInstance().toEntityFromDomain(domain.getConfirmacionTelefono()),
				EstadoEscritorAssembler.getInstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public EscritorDomain toDomainFromEntity(final EscritorEntity entity) {
		return new EscritorDomain(entity.getIdentificador(),
				TipoIdentificacionAssembler.getInstance().toDomainFromEntity(entity.getTipoIdentificacion()),
				entity.getNumeroIdentificacion(), entity.getPrimerNombre(), entity.getSegundoNombre(),
				entity.getPrimerApellido(), entity.getSegundoApellido(), entity.getCorreo(), entity.getIndicadorPais(),
				entity.getNumeroTelefono(),
				TipoRelacionInstitucionAssembler.getInstance().toDomainFromEntity(entity.getTipoRelacion()),
				RespuestaAssembler.getInstance().toDomainFromEntity(entity.getConfirmacionCorreo()),
				RespuestaAssembler.getInstance().toDomainFromEntity(entity.getConfirmacionTelefono()),
				EstadoEscritorAssembler.getInstance().toDomainFromEntity(entity.getEstado()));
	}

	@Override
	public List<EscritorDomain> toDomainListFromEntityList(List<EscritorEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<EscritorDTO> toDTOListFromDomainList(List<EscritorDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}


