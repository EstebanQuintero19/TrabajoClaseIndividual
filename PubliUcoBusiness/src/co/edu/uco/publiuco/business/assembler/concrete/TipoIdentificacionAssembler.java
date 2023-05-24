package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.TipoIdentificacionDomain;
import co.edu.uco.publiuco.dto.TipoIdentificacionDTO;
import co.edu.uco.publiuco.entities.TipoIdentificacionEntity;

public class TipoIdentificacionAssembler
		implements Assembler<TipoIdentificacionDomain, TipoIdentificacionDTO, TipoIdentificacionEntity> {

	private static final Assembler<TipoIdentificacionDomain, TipoIdentificacionDTO, TipoIdentificacionEntity> INSTANCE = new TipoIdentificacionAssembler();

	private TipoIdentificacionAssembler() {
		super();
	}

	public static Assembler<TipoIdentificacionDomain, TipoIdentificacionDTO, TipoIdentificacionEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public TipoIdentificacionDTO toDTOFromDomain(final TipoIdentificacionDomain domian) {
		return TipoIdentificacionDTO.create().setIdentificador(domian.getIdentificador()).setNombre(domian.getNombre())
				.setDescripcion(domian.getDescripcion())
				.setEstado(EstadoTipoIdentificacionAssembler.getInstance().toDTOFromDomain(domian.getEstado()));
	}

	@Override
	public TipoIdentificacionDomain toDomainFromDto(final TipoIdentificacionDTO dto) {
		return new TipoIdentificacionDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion(),
				EstadoTipoIdentificacionAssembler.getInstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public TipoIdentificacionEntity toEntityFromDomain(final TipoIdentificacionDomain domain) {
		return new TipoIdentificacionEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion(),
				EstadoTipoIdentificacionAssembler.getInstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public TipoIdentificacionDomain toDomainFromEntity(final TipoIdentificacionEntity entity) {
		return new TipoIdentificacionDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion(),
				EstadoTipoIdentificacionAssembler.getInstance().toDomainFromEntity(entity.getEstado()));
	}

	@Override
	public List<TipoIdentificacionDomain> toDomainListFromEntityList(List<TipoIdentificacionEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<TipoIdentificacionDTO> toDTOListFromDomainList(List<TipoIdentificacionDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
