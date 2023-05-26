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
import co.edu.uco.publiuco.api.validator.lector.RegistrarLectorValidation;
import co.edu.uco.publiuco.business.facade.LectorFacade;
import co.edu.uco.publiuco.business.facade.impl.LectorFacadeImpl;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.CommonControllerMessages;
import co.edu.uco.publiuco.crosscutting.utils.Messages.LectorControllerMessages;
import co.edu.uco.publiuco.dto.LectorDTO;

@RestController
@RequestMapping("publiuco/api/v1/lector")
public final class LectorController {

	private LectorFacade facade;

	public LectorController() {
		facade = new LectorFacadeImpl();
	}

	@GetMapping("/dummy")
	public LectorDTO dummy() {
		return LectorDTO.create();
	}

	@GetMapping
	public ResponseEntity<Response<LectorDTO>> list(@RequestBody LectorDTO dto) {

		List<LectorDTO> list = new ArrayList<>();
		List<String> messages = new ArrayList<>();

		Response<LectorDTO> response = new Response<>(list, messages);

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public LectorDTO listById(@PathVariable UUID id) {

		return LectorDTO.create().setIdentificador(id);

	}

	@PostMapping
	public ResponseEntity<Response<LectorDTO>> create(@RequestBody LectorDTO dto) {

		var statusCode = HttpStatus.OK;
		var response = new Response<LectorDTO>();

		try {
			var result = RegistrarLectorValidation.validate(dto);

			if (result.getMessages().isEmpty()) {
				facade.register(dto);
				response.getMessages().add(LectorControllerMessages.REGISTER_NEW_SUCESS);
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
	public LectorDTO update(@PathVariable UUID id, @RequestBody LectorDTO dto) {
		return dto.setIdentificador(id);

	}

	@DeleteMapping("/{id}")
	public LectorDTO delete(@PathVariable UUID id) {
		return LectorDTO.create().setIdentificador(id);

	}

}
