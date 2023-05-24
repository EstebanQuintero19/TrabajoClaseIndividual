package co.edu.uco.publiuco.business.business;

import java.util.List;

import co.edu.uco.publiuco.business.domain.ComentarioRevisorDomain;

public interface ComentarioRevisorBusiness {

	void register(ComentarioRevisorDomain domain);

	List<ComentarioRevisorDomain> list(ComentarioRevisorDomain domain);

	void modify(ComentarioRevisorDomain domain);

	void drop(ComentarioRevisorDomain domain);

}
