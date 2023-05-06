package co.edu.uco.publiuco.business.assembler;

import java.util.List;

public interface Assembler <D, T, E> {
	
	T toDTOFromDomain(D domian);
	D toDomainFromDto(T dto);
	E toEntityFromDomain(D domain);
	D toDomainFromEntity(E entity);
	List<D> toDomainListFromEntity(List<E> entityList);
	}