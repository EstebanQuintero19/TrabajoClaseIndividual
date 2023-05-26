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
import co.edu.uco.publiuco.api.validator.estadocomentariolector.RegistrarEstadoComentarioLectorValidation;
import co.edu.uco.publiuco.business.facade.EstadoComentarioLectorFacade;
import co.edu.uco.publiuco.business.facade.impl.EstadoComentarioLectorFacadeImpl;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.CommonControllerMessages;
import co.edu.uco.publiuco.crosscutting.utils.Messages.EstadoComentarioLectorControllerMessages;
import co.edu.uco.publiuco.dto.EstadoComentarioLectorDTO;

@RestController
@RequestMapping("publiuco/api/v1/estadocomentario")
public final class EstadoComentarioLectorController {

	private EstadoComentarioLectorFacade facade;

	public EstadoComentarioLectorController() {
		facade = new EstadoComentarioLectorFacadeImpl();
	}

	@GetMapping("/dummy")
	public EstadoComentarioLectorDTO dummy() {
		return EstadoComentarioLectorDTO.create();
	}

	@GetMapping
	public ResponseEntity<Response<EstadoComentarioLectorDTO>> list(@RequestBody EstadoComentarioLectorDTO dto) {

		List<EstadoComentarioLectorDTO> list = new ArrayList<>();
		List<String> messages = new ArrayList<>();

		Response<EstadoComentarioLectorDTO> response = new Response<>(list, messages);

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public EstadoComentarioLectorDTO listById(@PathVariable UUID id) {

		return EstadoComentarioLectorDTO.create().setIdentificador(id);

	}

	@PostMapping
	public ResponseEntity<Response<EstadoComentarioLectorDTO>> create(@RequestBody EstadoComentarioLectorDTO dto) {

		var statusCode = HttpStatus.OK;
		var response = new Response<EstadoComentarioLectorDTO>();

		try {
			var result = RegistrarEstadoComentarioLectorValidation.validate(dto);

			if (result.getMessages().isEmpty()) {
				facade.register(dto);
				response.getMessages().add(EstadoComentarioLectorControllerMessages.REGISTER_NEW_SUCESS);
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
