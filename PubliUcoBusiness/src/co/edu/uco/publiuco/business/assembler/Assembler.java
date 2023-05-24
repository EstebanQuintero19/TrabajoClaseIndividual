package co.edu.uco.publiuco.business.assembler;

import java.util.List;

public interface Assembler<D, T, E> {

	T toDTOFromDomain(D domain);

	D toDomainFromDto(T dto);

	E toEntityFromDomain(D domain);

	D toDomainFromEntity(E entity);

	List<D> toDomainListFromEntityList(List<E> entityList);

	List<T> toDTOListFromDomainList(List<D> domainList);
}
