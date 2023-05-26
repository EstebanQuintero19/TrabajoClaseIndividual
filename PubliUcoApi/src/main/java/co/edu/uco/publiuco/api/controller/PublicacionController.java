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
import co.edu.uco.publiuco.api.validator.publicacion.RegistrarPublicacionValidation;
import co.edu.uco.publiuco.business.facade.PublicacionFacade;
import co.edu.uco.publiuco.business.facade.impl.PublicacionFacadeImpl;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.CommonControllerMessages;
import co.edu.uco.publiuco.crosscutting.utils.Messages.PublicacionControllerMessages;
import co.edu.uco.publiuco.dto.PublicacionDTO;

@RestController
@RequestMapping("publiuco/api/v1/publicacion")
public final class PublicacionController {

	private PublicacionFacade facade;

	public PublicacionController() {
		facade = new PublicacionFacadeImpl();
	}

	@GetMapping("/dummy")
	public PublicacionDTO dummy() {
		return PublicacionDTO.create();
	}

	@GetMapping
	public ResponseEntity<Response<PublicacionDTO>> list(@RequestBody PublicacionDTO dto) {

		List<PublicacionDTO> list = new ArrayList<>();
		List<String> messages = new ArrayList<>();

		Response<PublicacionDTO> response = new Response<>(list, messages);

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public PublicacionDTO listById(@PathVariable UUID id) {

		return PublicacionDTO.create().setIdentificador(id);

	}

	@PostMapping
	public ResponseEntity<Response<PublicacionDTO>> create(@RequestBody PublicacionDTO dto) {

		var statusCode = HttpStatus.OK;
		var response = new Response<PublicacionDTO>();

		try {
			var result = RegistrarPublicacionValidation.validate(dto);

			if (result.getMessages().isEmpty()) {
				facade.register(dto);
				response.getMessages().add(PublicacionControllerMessages.REGISTER_NEW_SUCESS);
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
	public PublicacionDTO update(@PathVariable UUID id, @RequestBody PublicacionDTO dto) {
		return dto.setIdentificador(id);

	}

	@DeleteMapping("/{id}")
	public PublicacionDTO delete(@PathVariable UUID id) {
		return PublicacionDTO.create().setIdentificador(id);

	}

}
