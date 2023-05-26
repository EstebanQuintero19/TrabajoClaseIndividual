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
import co.edu.uco.publiuco.api.validator.estadolector.RegistrarEstadoLectorValidation;
import co.edu.uco.publiuco.business.facade.EstadoLectorFacade;
import co.edu.uco.publiuco.business.facade.impl.EstadoLectorFacadeImpl;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.CommonControllerMessages;
import co.edu.uco.publiuco.crosscutting.utils.Messages.EstadoLectorControllerMessages;
import co.edu.uco.publiuco.dto.EstadoLectorDTO;

@RestController
@RequestMapping("publiuco/api/v1/estadolector")
public final class EstadoLectorController {

	private EstadoLectorFacade facade;

	public EstadoLectorController() {
		facade = new EstadoLectorFacadeImpl();
	}

	@GetMapping("/dummy")
	public EstadoLectorDTO dummy() {
		return EstadoLectorDTO.create();
	}

	@GetMapping
	public ResponseEntity<Response<EstadoLectorDTO>> list(@RequestBody EstadoLectorDTO dto) {

		List<EstadoLectorDTO> list = new ArrayList<>();
		List<String> messages = new ArrayList<>();

		Response<EstadoLectorDTO> response = new Response<>(list, messages);

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public EstadoLectorDTO listById(@PathVariable UUID id) {

		return EstadoLectorDTO.create().setIdentificador(id);

	}

	@PostMapping
	public ResponseEntity<Response<EstadoLectorDTO>> create(@RequestBody EstadoLectorDTO dto) {

		var statusCode = HttpStatus.OK;
		var response = new Response<EstadoLectorDTO>();

		try {
			var result = RegistrarEstadoLectorValidation.validate(dto);

			if (result.getMessages().isEmpty()) {
				facade.register(dto);
				response.getMessages().add(EstadoLectorControllerMessages.REGISTER_NEW_SUCESS);
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
