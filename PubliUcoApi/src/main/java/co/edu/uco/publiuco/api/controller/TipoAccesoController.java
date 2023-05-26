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
import co.edu.uco.publiuco.api.validator.tipoacceso.RegistrarTipoAccesoValidation;
import co.edu.uco.publiuco.business.facade.TipoAccesoFacade;
import co.edu.uco.publiuco.business.facade.impl.TipoAccesoFacadeImpl;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.CommonControllerMessages;
import co.edu.uco.publiuco.crosscutting.utils.Messages.TipoAccesoControllerMessages;
import co.edu.uco.publiuco.dto.TipoAccesoDTO;

@RestController
@RequestMapping("publiuco/api/v1/tipoacceso")
public final class TipoAccesoController {

	private TipoAccesoFacade facade;

	public TipoAccesoController() {
		facade = new TipoAccesoFacadeImpl();
	}

	@GetMapping("/dummy")
	public TipoAccesoDTO dummy() {
		return TipoAccesoDTO.create();
	}

	@GetMapping
	public ResponseEntity<Response<TipoAccesoDTO>> list(@RequestBody TipoAccesoDTO dto) {

		List<TipoAccesoDTO> list = new ArrayList<>();
		List<String> messages = new ArrayList<>();

		Response<TipoAccesoDTO> response = new Response<>(list, messages);

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public TipoAccesoDTO listById(@PathVariable UUID id) {

		return TipoAccesoDTO.create().setIdentificador(id);

	}

	@PostMapping
	public ResponseEntity<Response<TipoAccesoDTO>> create(@RequestBody TipoAccesoDTO dto) {

		var statusCode = HttpStatus.OK;
		var response = new Response<TipoAccesoDTO>();

		try {
			var result = RegistrarTipoAccesoValidation.validate(dto);

			if (result.getMessages().isEmpty()) {
				facade.register(dto);
				response.getMessages().add(TipoAccesoControllerMessages.REGISTER_NEW_SUCESS);
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
	public TipoAccesoDTO update(@PathVariable UUID id, @RequestBody TipoAccesoDTO dto) {
		return dto.setIdentificador(id);

	}

	@DeleteMapping("/{id}")
	public TipoAccesoDTO delete(@PathVariable UUID id) {
		return TipoAccesoDTO.create().setIdentificador(id);

	}

}
