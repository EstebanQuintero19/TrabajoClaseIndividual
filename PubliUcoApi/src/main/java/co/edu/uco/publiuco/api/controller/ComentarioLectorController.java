package co.edu.uco.publiuco.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uco.publiuco.api.controller.response.Response;
import co.edu.uco.publiuco.api.validator.comentariolector.RegistrarComentarioLectorValidation;
import co.edu.uco.publiuco.business.facade.ComentarioLectorFacade;
import co.edu.uco.publiuco.business.facade.impl.ComentarioLectorFacadeImpl;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.ComentarioLectorControllerMessages;
import co.edu.uco.publiuco.crosscutting.utils.Messages.CommonControllerMessages;
import co.edu.uco.publiuco.dto.ComentarioLectorDTO;

@RestController
@RequestMapping("publiuco/api/v1/comentariolector")
public final class ComentarioLectorController {

	private ComentarioLectorFacade facade;

	public ComentarioLectorController() {
		facade = new ComentarioLectorFacadeImpl();
	}

	@GetMapping("/dummy")
	public ComentarioLectorDTO dummy() {
		return ComentarioLectorDTO.create();
	}

	@GetMapping
	public ResponseEntity<Response<ComentarioLectorDTO>> list(@RequestBody ComentarioLectorDTO dto) {

		List<ComentarioLectorDTO> list = new ArrayList<>();
		List<String> messages = new ArrayList<>();

		Response<ComentarioLectorDTO> response = new Response<>(list, messages);

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public ComentarioLectorDTO listById(@PathVariable UUID id) {

		return ComentarioLectorDTO.create().setIdentificador(id);

	}

	@PostMapping
	public ResponseEntity<Response<ComentarioLectorDTO>> create(@RequestBody ComentarioLectorDTO dto) {

		var statusCode = HttpStatus.OK;
		var response = new Response<ComentarioLectorDTO>();

		try {
			var result = RegistrarComentarioLectorValidation.validate(dto);

			if (result.getMessages().isEmpty()) {
				facade.register(dto);
				response.getMessages().add(ComentarioLectorControllerMessages.REGISTER_NEW_SUCESS);
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

	@PutMapping("/{id}")
	public ComentarioLectorDTO update(@PathVariable UUID id, @RequestBody ComentarioLectorDTO dto) {
		return dto.setIdentificador(id);

	}

	@DeleteMapping("/{id}")
	public ComentarioLectorDTO delete(@PathVariable UUID id) {
		return ComentarioLectorDTO.create().setIdentificador(id);

	}

}
