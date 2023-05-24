package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.RespuestaDomain;
import co.edu.uco.publiuco.dto.RespuestaDTO;
import co.edu.uco.publiuco.entities.RespuestaEntity;

public class RespuestaAssembler implements Assembler<RespuestaDomain, RespuestaDTO, RespuestaEntity> {
	
	private static final Assembler<RespuestaDomain, RespuestaDTO, RespuestaEntity> INSTANCE = new RespuestaAssembler();

	private RespuestaAssembler() {
		super();
	}

	public static Assembler<RespuestaDomain, RespuestaDTO, RespuestaEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public RespuestaDTO toDTOFromDomain(final RespuestaDomain domian) {
		return RespuestaDTO.create().setIdentificador(domian.getIdentificador()).setNombre(domian.getNombre())
				.setDescripcion(domian.getDescripcion());
	}

	@Override
	public RespuestaDomain toDomainFromDto(final RespuestaDTO dto) {
		return new RespuestaDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public RespuestaEntity toEntityFromDomain(final RespuestaDomain domain) {
		return new RespuestaEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public RespuestaDomain toDomainFromEntity(final RespuestaEntity entity) {
		return new RespuestaDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}

	@Override
	public List<RespuestaDomain> toDomainListFromEntityList(List<RespuestaEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<RespuestaDTO> toDTOListFromDomainList(List<RespuestaDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
