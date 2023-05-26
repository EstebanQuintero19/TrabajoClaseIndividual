package co.edu.uco.publiuco.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.publiuco.api.controller.response.Response;
import co.edu.uco.publiuco.api.validator.estadotiporelacioninstitucion.RegistrarEstadoTipoRelacionInstitucionValidation;
import co.edu.uco.publiuco.business.facade.EstadoTipoRelacionInstitucionFacade;
import co.edu.uco.publiuco.business.facade.impl.EstadoTipoRelacionInstitucionFacadeImpl;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.CommonControllerMessages;
import co.edu.uco.publiuco.crosscutting.utils.Messages.EstadoTipoRelacionInstitucionControllerMessages;
import co.edu.uco.publiuco.dto.EstadoTipoRelacionInstitucionDTO;

@RestController
@RequestMapping("publiuco/api/v1/estadotiporelacioninstitucion")
public final class EstadoTipoRelacionInstitucionController {

	Logger logger = LoggerFactory.getLogger(getClass());

	private EstadoTipoRelacionInstitucionFacade facade;

	@GetMapping("/dummy")
	public EstadoTipoRelacionInstitucionDTO dummy() {
		return EstadoTipoRelacionInstitucionDTO.create();
	}

	@GetMapping
	public ResponseEntity<Response<EstadoTipoRelacionInstitucionDTO>> list(
			@RequestParam EstadoTipoRelacionInstitucionDTO dto) {

		List<EstadoTipoRelacionInstitucionDTO> list = new ArrayList<>();
		list.add(EstadoTipoRelacionInstitucionDTO.create());
		list.add(EstadoTipoRelacionInstitucionDTO.create());
		list.add(EstadoTipoRelacionInstitucionDTO.create());
		List<String> messages = new ArrayList<>();
		messages.add("Estados de tipos de relacion institucion consultados existosamente");

		Response<EstadoTipoRelacionInstitucionDTO> response = new Response<>(list, messages);

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public EstadoTipoRelacionInstitucionDTO listById(@PathVariable UUID id) {

		return EstadoTipoRelacionInstitucionDTO.create().setIdentificador(id);

	}

	@PostMapping
	public ResponseEntity<Response<EstadoTipoRelacionInstitucionDTO>> create(
			@RequestParam EstadoTipoRelacionInstitucionDTO dto) {

		var statusCode = HttpStatus.OK;
		var response = new Response<EstadoTipoRelacionInstitucionDTO>();

		try {
			var result = RegistrarEstadoTipoRelacionInstitucionValidation.validate(dto);

			if (result.getMessages().isEmpty()) {
				facade = new EstadoTipoRelacionInstitucionFacadeImpl();
				facade.register(dto);
				response.getMessages().add(EstadoTipoRelacionInstitucionControllerMessages.REGISTER_NEW_SUCESS);
			} else {
				statusCode = HttpStatus.INTERNAL_SERVER_ERROR;
				response.setMessages(result.getMessages());
			}

		} catch (final PubliucoException exception) {
			statusCode = HttpStatus.BAD_REQUEST;
			response.getMessages().add(exception.getUserMessage());
			logger.error(exception.getType().toString().concat("_").concat(exception.getTechnicalMessage()), exception);
		} catch (final Exception exception) {
			statusCode = HttpStatus.INTERNAL_SERVER_ERROR;
			response.getMessages().add(CommonControllerMessages.REGISTER_FAILED);
			logger.error("Se ha presentado un problema inesperadp, Por favor valida la consola de errores", exception);

		}

		return new ResponseEntity<>(response, statusCode);

	}

}
