package co.edu.uco.publiuco.business.assembler.concrete;

import co.edu.uco.publiuco.business.assembler.Assembler;
import co.edu.uco.publiuco.bussiness.domain.EstadoCategoriaDomain;
import co.edu.uco.publiuco.dto.EstadoCategoriaDTO;
import co.edu.uco.publiuco.entities.EstadoCategoriaEntity;

public class EstadoCategoriaAssembler
		implements Assembler<EstadoCategoriaDomain, EstadoCategoriaDTO, EstadoCategoriaEntity> {

	private static final Assembler<EstadoCategoriaDomain, EstadoCategoriaDTO, EstadoCategoriaEntity> INSTANCE = new EstadoCategoriaAssembler();

	private EstadoCategoriaAssembler() {
		super();
	}

	public static final Assembler<EstadoCategoriaDomain, EstadoCategoriaDTO, EstadoCategoriaEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public EstadoCategoriaDTO toDTOFromDomain(EstadoCategoriaDomain domian) {
		return EstadoCategoriaDTO.create().setIdentificador(domian.getIdentificador()).setNombre(domian.getNombre())
				.setDescripcion(domian.getNombre());
	}

	@Override
	public EstadoCategoriaDomain toDomainFromDto(EstadoCategoriaDTO dto) {
		return new EstadoCategoriaDomain(dto.getIdentificador(), dto.getNombre(), dto.getDescripcion());
	}

	@Override
	public EstadoCategoriaEntity toEntityFromDomain(EstadoCategoriaDomain domain) {
		return new EstadoCategoriaEntity(domain.getIdentificador(), domain.getNombre(), domain.getDescripcion());
	}

	@Override
	public EstadoCategoriaDomain toDomainFromEntity(EstadoCategoriaEntity entity) {
		return new EstadoCategoriaDomain(entity.getIdentificador(), entity.getNombre(), entity.getDescripcion());
	}

}