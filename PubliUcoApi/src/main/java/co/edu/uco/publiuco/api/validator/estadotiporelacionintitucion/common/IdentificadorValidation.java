package co.edu.uco.publiuco.api.validator.estadotiporelacionintitucion.common;

import java.util.UUID;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.api.validator.estadotiporelacioninstitucion.RegistrarEstadoTipoRelacionInstitucionValidation;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;
import co.edu.uco.publiuco.dto.EstadoTipoRelacionInstitucionDTO;

public class IdentificadorValidation implements Validation<UUID> {

	private IdentificadorValidation() {
		super();
	}
	
	public static final Result validate(final EstadoTipoRelacionInstitucionDTO data) {
		return new IdentificadorValidation().execute(data);
	}
	
	public final Result execute(UUID data) {
		var result = Result.create();
		
		if(UtilObject.isNull(data));
		result.addMessages("No es posible continuar con el idecador del estado del tipo relación institucion vacío");
		if(UtilUUID.isDefault(data)) {
			result.addMessages("no es posible tener el identificador por defecto del estado del tipo relacion institucion");
		}
		
		return result;
	}

	@Override
	public Result execute(Throwable data) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
