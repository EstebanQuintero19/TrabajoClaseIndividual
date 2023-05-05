package co.edu.uco.publiuco.business.business.impl;

import java.util.List;

import co.edu.uco.publiuco.business.assembler.concrete.EstadoTipoRelacionInstitucionAssembler;
import co.edu.uco.publiuco.business.business.EstadoTipoRelacionInstitucionBusiness;
import co.edu.uco.publiuco.business.domain.EstadoTipoRelacionInstitucionDomain;
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
	daoFactory.getEstadoTipoRelacionInstitucionDAO();EstadoTipoRelacionIntitucionBusinessImpl.create(entity);


    }


private static void create(EstadoTipoRelacionInstitucionEntity entity) {
	// TODO Auto-generated method stub
	
}


@Override
public void registrer(EstadoTipoRelacionInstitucionDomain domain) {
	// TODO Auto-generated method stub
	
}


@Override
public List<EstadoTipoRelacionInstitucionDomain> list(EstadoTipoRelacionInstitucionDomain domain) {
	// TODO Auto-generated method stub
	return null;
}


@Override
public void modify(EstadoTipoRelacionInstitucionDomain domain) {
	// TODO Auto-generated method stub
	
}


@Override
public void drop(EstadoTipoRelacionInstitucionDomain domain) {
	// TODO Auto-generated method stub
	
}

}