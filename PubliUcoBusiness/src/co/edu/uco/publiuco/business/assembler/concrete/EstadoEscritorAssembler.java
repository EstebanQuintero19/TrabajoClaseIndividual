package co.edu.uco.publiuco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.business.domain.EstadoEscritorDomain;
import co.edu.uco.publiuco.dto.EstadoEscritorDTO;
import co.edu.uco.publiuco.entities.EstadoEscritorEntity;

public class EstadoEscritorAssembler
		implements Assembler<EstadoEscritorDomain, EstadoEscritorDTO, EstadoEscritorEntity> {
		
	private static final Assembler<EstadoEscritorDomain, EstadoEscritorDTO, EstadoEscritorEntity> INSTANCE = new EstadoEscritorAssembler();
	
	private EstadoEscritorAssembler() {
		super();
	}
	
	public static Assembler<EstadoEscritorDomain, EstadoEscritorDTO, EstadoEscritorEntity> getInstance(){
		return INSTANCE;
	}

	@Override
	public EstadoEscritorDTO toDTOFromDomain(final EstadoEscritorDomain domian) {
		return EstadoEscritorDTO.create().setIdentificador(domian.getIdentificador()).setNombre(domian.getNombre())
				.setDescripcion(domian.getDescripcion());
	}

	@Override
	public EstadoEscritorDomain toDomainFromDto(final EstadoEscritorDTO dto) {
		return new EstadoEscritorDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoEscritorEntity toEntityFromDomain(final EstadoEscritorDomain domain) {
		return new EstadoEscritorEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoEscritorDomain toDomainFromEntity(final EstadoEscritorEntity entity) {
		return new EstadoEscritorDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}

	@Override
	public List<EstadoEscritorDomain> toDomainListFromEntityList(List<EstadoEscritorEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<EstadoEscritorDTO> toDTOListFromDomainList(List<EstadoEscritorDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
