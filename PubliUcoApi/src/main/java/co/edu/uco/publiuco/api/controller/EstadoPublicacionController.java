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
import co.edu.uco.publiuco.api.validator.estadopublicacion.RegistrarEstadoPublicacionValidation;
import co.edu.uco.publiuco.business.facade.EstadoPublicacionFacade;
import co.edu.uco.publiuco.business.facade.impl.EstadoPublicacionFacadeImpl;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.CommonControllerMessages;
import co.edu.uco.publiuco.crosscutting.utils.Messages.EstadoPublicacionControllerMessages;
import co.edu.uco.publiuco.dto.EstadoPublicacionDTO;

@RestController
@RequestMapping("publiuco/api/v1/estadopublicacion")
public final class EstadoPublicacionController {

	private EstadoPublicacionFacade facade;

	public EstadoPublicacionController() {
		facade = new EstadoPublicacionFacadeImpl();
	}

	@GetMapping("/dummy")
	public EstadoPublicacionDTO dummy() {
		return EstadoPublicacionDTO.create();
	}

	@GetMapping
	public ResponseEntity<Response<EstadoPublicacionDTO>> list(@RequestBody EstadoPublicacionDTO dto) {

		List<EstadoPublicacionDTO> list = new ArrayList<>();
		List<String> messages = new ArrayList<>();

		Response<EstadoPublicacionDTO> response = new Response<>(list, messages);

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public EstadoPublicacionDTO listById(@PathVariable UUID id) {

		return EstadoPublicacionDTO.create().setIdentificador(id);

	}

	@PostMapping
	public ResponseEntity<Response<EstadoPublicacionDTO>> create(@RequestBody EstadoPublicacionDTO dto) {

		var statusCode = HttpStatus.OK;
		var response = new Response<EstadoPublicacionDTO>();

		try {
			var result = RegistrarEstadoPublicacionValidation.validate(dto);

			if (result.getMessages().isEmpty()) {
				facade.register(dto);
				response.getMessages().add(EstadoPublicacionControllerMessages.REGISTER_NEW_SUCESS);
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
