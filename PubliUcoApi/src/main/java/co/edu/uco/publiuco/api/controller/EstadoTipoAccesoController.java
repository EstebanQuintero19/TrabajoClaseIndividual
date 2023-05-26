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
import co.edu.uco.publiuco.api.validator.estadotipoacceso.RegistrarEstadoTipoAccesoValidation;
import co.edu.uco.publiuco.business.facade.EstadoTipoAccesoFacade;
import co.edu.uco.publiuco.business.facade.impl.EstadoTipoAccesoFacadeImpl;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.CommonControllerMessages;
import co.edu.uco.publiuco.crosscutting.utils.Messages.EstadoTipoAccesoControllerMessages;
import co.edu.uco.publiuco.dto.EstadoTipoAccesoDTO;

@RestController
@RequestMapping("publiuco/api/v1/estadotipoacceso")
public final class EstadoTipoAccesoController {

	private EstadoTipoAccesoFacade facade;

	public EstadoTipoAccesoController() {
		facade = new EstadoTipoAccesoFacadeImpl();
	}

	@GetMapping("/dummy")
	public EstadoTipoAccesoDTO dummy() {
		return EstadoTipoAccesoDTO.create();
	}

	@GetMapping
	public ResponseEntity<Response<EstadoTipoAccesoDTO>> list(@RequestBody EstadoTipoAccesoDTO dto) {

		List<EstadoTipoAccesoDTO> list = new ArrayList<>();
		List<String> messages = new ArrayList<>();

		Response<EstadoTipoAccesoDTO> response = new Response<>(list, messages);

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public EstadoTipoAccesoDTO listById(@PathVariable UUID id) {

		return EstadoTipoAccesoDTO.create().setIdentificador(id);

	}

	@PostMapping
	public ResponseEntity<Response<EstadoTipoAccesoDTO>> create(@RequestBody EstadoTipoAccesoDTO dto) {

		var statusCode = HttpStatus.OK;
		var response = new Response<EstadoTipoAccesoDTO>();

		try {
			var result = RegistrarEstadoTipoAccesoValidation.validate(dto);

			if (result.getMessages().isEmpty()) {
				facade.register(dto);
				response.getMessages().add(EstadoTipoAccesoControllerMessages.REGISTER_NEW_SUCESS);
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
