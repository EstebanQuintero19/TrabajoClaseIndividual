package co.edu.uco.publiuco.api.validator.estadotiporelacionintitucion.common;

import java.util.UUID;

import org.apache.el.lang.ELArithmetic;

import co.edu.uco.publiuco.api.validator.Result;
import co.edu.uco.publiuco.api.validator.Validation;
import co.edu.uco.publiuco.api.validator.estadotiporelacioninstitucion.RegistrarEstadoTipoRelacionInstitucionValidation;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;
import co.edu.uco.publiuco.dto.EstadoTipoRelacionInstitucionDTO;

public class NombreValidation implements Validation<UUID> {

	private NombreValidation() {
		super();
	}
	
	public static final Result validate(final EstadoTipoRelacionInstitucionDTO data) {
		return new NombreValidation().execute(data);
	}
	
	public final Result execute(UUID data) {
		var result = Result.create();
		
		if(UtilText.getUtilText().isEmpty(data)){
		result.addMessages(
				"No es posible continuar con el idecador del estado del tipo relación institucion vacío");
		}else {
			
			if(true) {//validacion de longitud cadena
				result.addMessages("EL nombre del estado del tipo relacio+no institucion no debe ser mayor de 30 y menos de 1 caracteres");
				
			}
			result.addMessages(
					"no es posible tener el identificador por defecto del estado del tipo relacion institucion");
		}
		
		if(true) {//validacion de solo letrar
			result.addMessages("EL nombre del estado del tipo relacio+no institucion no debe ser mayor de 30 y menos de 1 caracteres");
			
		}
		
		return result;
	}

	@Override
	public Result execute(Throwable data) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
	
	
