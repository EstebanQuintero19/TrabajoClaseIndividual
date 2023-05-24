package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EstadoTipoEscritorDomain;
import co.edu.uco.publiuco.dto.EstadoTipoEscritorDTO;
import co.edu.uco.publiuco.entities.EstadoTipoEscritorEntity;

public class EstadoTipoEscritorAssembler
		implements Assembler<EstadoTipoEscritorDomain, EstadoTipoEscritorDTO, EstadoTipoEscritorEntity> {
	
	private static final Assembler<EstadoTipoEscritorDomain, EstadoTipoEscritorDTO, EstadoTipoEscritorEntity> INSTANCE = new EstadoTipoEscritorAssembler();

	private EstadoTipoEscritorAssembler() {
		super();
	}

	public static Assembler<EstadoTipoEscritorDomain, EstadoTipoEscritorDTO, EstadoTipoEscritorEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public EstadoTipoEscritorDTO toDTOFromDomain(final EstadoTipoEscritorDomain domain) {
		return EstadoTipoEscritorDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre())
				.setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoTipoEscritorDomain toDomainFromDto(final EstadoTipoEscritorDTO dto) {
		return new EstadoTipoEscritorDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoTipoEscritorEntity toEntityFromDomain(final EstadoTipoEscritorDomain domain) {
		return new EstadoTipoEscritorEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoTipoEscritorDomain toDomainFromEntity(final EstadoTipoEscritorEntity entity) {
		return new EstadoTipoEscritorDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}

	@Override
	public List<EstadoTipoEscritorDomain> toDomainListFromEntityList(List<EstadoTipoEscritorEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<EstadoTipoEscritorDTO> toDTOListFromDomainList(List<EstadoTipoEscritorDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
