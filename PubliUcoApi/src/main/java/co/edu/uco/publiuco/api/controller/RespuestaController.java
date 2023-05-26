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
import co.edu.uco.publiuco.api.validator.respuesta.RegistrarRespuestaValidation;
import co.edu.uco.publiuco.business.facade.RespuestaFacade;
import co.edu.uco.publiuco.business.facade.impl.RespuestaFacadeImpl;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.CommonControllerMessages;
import co.edu.uco.publiuco.crosscutting.utils.Messages.RespuestaControllerMessages;
import co.edu.uco.publiuco.dto.RespuestaDTO;

@RestController
@RequestMapping("publiuco/api/v1/respuesta")
public final class RespuestaController {

	private RespuestaFacade facade;

	public RespuestaController() {
		facade = new RespuestaFacadeImpl();
	}

	@GetMapping("/dummy")
	public RespuestaDTO dummy() {
		return RespuestaDTO.create();
	}

	@GetMapping
	public ResponseEntity<Response<RespuestaDTO>> list(@RequestBody RespuestaDTO dto) {

		List<RespuestaDTO> list = new ArrayList<>();
		List<String> messages = new ArrayList<>();

		Response<RespuestaDTO> response = new Response<>(list, messages);

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public RespuestaDTO listById(@PathVariable UUID id) {

		return RespuestaDTO.create().setIdentificador(id);

	}

	@PostMapping
	public ResponseEntity<Response<RespuestaDTO>> create(@RequestBody RespuestaDTO dto) {

		var statusCode = HttpStatus.OK;
		var response = new Response<RespuestaDTO>();

		try {
			var result = RegistrarRespuestaValidation.validate(dto);

			if (result.getMessages().isEmpty()) {
				facade.register(dto);
				response.getMessages().add(RespuestaControllerMessages.REGISTER_NEW_SUCESS);
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
