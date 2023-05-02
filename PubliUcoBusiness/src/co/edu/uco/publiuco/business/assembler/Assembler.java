package co.edu.uco.publiuco.business.assembler;

public interface Assembler <D, T, E> {
	
	T toDTOFromDomain(D domian);
	D toDomainFromDto(T dto);
	E toEntityFromDomain(D domain);
	D toDomainFromEntity(E entity);
	
	}