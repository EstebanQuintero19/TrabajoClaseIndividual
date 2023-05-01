package co.edu.uco.publiuco.business.bussiness.impl;

import co.edu.uco.publiuco.bussiness.assembler.concrete.EstadoTipoRelacionInstitucionAssembler;
import co.edu.uco.publiuco.bussiness.domain.EstadoTipoRelacionInstitucionDomain;
import co.edu.uco.publiuco.data.dao.factory.DAOFactory;
import co.edu.uco.publiuco.entities.EstadoTipoRelacionInstitucionEntity;

public class EstadoTipoRelacionIntitucionBusinessImpl  implements EstadoTipoRelacionInstitucionBusiness{

private DAOFactory daoFactory;

public EstadoTipoRelacionIntitucionBusinessImpl (final DAOFactory daoFactory) {
	this.daoFactory = daoFactory;
}


public final void register(final EstadoTipoRelacionInstitucionDomain domain) {
	EstadoTipoRelacionInstitucionEntity entity = EstadoTipoRelacionInstitucionAssembler
			.getInstance().toEntityFromDomain(domain);
	daoFactory.getEstadoTipoRelacionInstitucionDAO()EstadoTipoRelacionIntitucionBusinessImpl.create(entity);


    }

}