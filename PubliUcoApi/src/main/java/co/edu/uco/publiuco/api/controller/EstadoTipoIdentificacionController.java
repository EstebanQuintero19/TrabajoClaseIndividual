package co.edu.uco.publiuco.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.publiuco.api.controller.response.Response;
import co.edu.uco.publiuco.api.validator.estadotipoidentificacion.RegistrarEstadoTipoIdentificacionValidation;
import co.edu.uco.publiuco.business.facade.EstadoTipoIdentificacionFacade;
import co.edu.uco.publiuco.business.facade.impl.EstadoTipoIdentificacionFacadeImpl;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.CommonControllerMessages;
import co.edu.uco.publiuco.crosscutting.utils.Messages.EstadoTipoIdentificacionControllerMessages;
import co.edu.uco.publiuco.dto.EstadoTipoIdentificacionDTO;

@RestController
@RequestMapping("publiuco/api/v1/categoria")
public final class EstadoTipoIdentificacionController {

	private EstadoTipoIdentificacionFacade facade;

	public EstadoTipoIdentificacionController() {
		facade = new EstadoTipoIdentificacionFacadeImpl();
	}

	@GetMapping("/dummy")
	public EstadoTipoIdentificacionDTO dummy() {
		return EstadoTipoIdentificacionDTO.create();
	}

	@GetMapping
	public ResponseEntity<Response<EstadoTipoIdentificacionDTO>> list(@RequestBody EstadoTipoIdentificacionDTO dto) {

		List<EstadoTipoIdentificacionDTO> list = new ArrayList<>();
		List<String> messages = new ArrayList<>();

		Response<EstadoTipoIdentificacionDTO> response = new Response<>(list, messages);

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public EstadoTipoIdentificacionDTO listById(@PathVariable UUID id) {

		return EstadoTipoIdentificacionDTO.create().setIdentificador(id);

	}

	@PostMapping
	public ResponseEntity<Response<EstadoTipoIdentificacionDTO>> create(@RequestBody EstadoTipoIdentificacionDTO dto) {

		var statusCode = HttpStatus.OK;
		var response = new Response<EstadoTipoIdentificacionDTO>();

		try {
			var result = RegistrarEstadoTipoIdentificacionValidation.validate(dto);

			if (result.getMessages().isEmpty()) {
				facade.register(dto);
				response.getMessages()
						.add(EstadoTipoIdentificacionControllerMessages.REGISTER_NEW_SUCESS);
			} else {
				statusCode = HttpStatus.INTERNAL_SERVER_ERROR;
				response.setMessages(result.getMessages());
			}

		} catch (final PubliucoException exception) {
			statusCode = HttpStatus.BAD_REQUEST;
			response.getMessages().add(exception.getUserMessage());
			System.err.println(exception.getTechnicalMessage());
			System.err.println(exception.getType());
			exception.printStackTrace();
		} catch (final Exception exception) {
			statusCode = HttpStatus.INTERNAL_SERVER_ERROR;
			response.getMessages().add(CommonControllerMessages.REGISTER_FAILED);
			System.err.println(exception.getMessage());
			exception.printStackTrace();
		}

		return new ResponseEntity<>(response, statusCode);

	}


}
