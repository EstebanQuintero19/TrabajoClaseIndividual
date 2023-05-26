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
import co.edu.uco.publiuco.api.validator.tipoidentificacion.RegistrarTipoIdentificacionValidation;
import co.edu.uco.publiuco.business.facade.TipoIdentificacionFacade;
import co.edu.uco.publiuco.business.facade.impl.TipoIdentificacionFacadeImpl;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.CommonControllerMessages;
import co.edu.uco.publiuco.crosscutting.utils.Messages.TipoIdentificacionControllerMessages;
import co.edu.uco.publiuco.dto.TipoIdentificacionDTO;

@RestController
@RequestMapping("publiuco/api/v1/tipoidentificacion")
public final class TipoIdentificacionController {

	private TipoIdentificacionFacade facade;

	public TipoIdentificacionController() {
		facade = new TipoIdentificacionFacadeImpl();
	}

	@GetMapping("/dummy")
	public TipoIdentificacionDTO dummy() {
		return TipoIdentificacionDTO.create();
	}

	@GetMapping
	public ResponseEntity<Response<TipoIdentificacionDTO>> list(@RequestBody TipoIdentificacionDTO dto) {

		List<TipoIdentificacionDTO> list = new ArrayList<>();
		List<String> messages = new ArrayList<>();

		Response<TipoIdentificacionDTO> response = new Response<>(list, messages);

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public TipoIdentificacionDTO listById(@PathVariable UUID id) {

		return TipoIdentificacionDTO.create().setIdentificador(id);

	}

	@PostMapping
	public ResponseEntity<Response<TipoIdentificacionDTO>> create(@RequestBody TipoIdentificacionDTO dto) {

		var statusCode = HttpStatus.OK;
		var response = new Response<TipoIdentificacionDTO>();

		try {
			var result = RegistrarTipoIdentificacionValidation.validate(dto);

			if (result.getMessages().isEmpty()) {
				facade.register(dto);
				response.getMessages().add(TipoIdentificacionControllerMessages.REGISTER_NEW_SUCESS);
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
	public TipoIdentificacionDTO update(@PathVariable UUID id, @RequestBody TipoIdentificacionDTO dto) {
		return dto.setIdentificador(id);

	}

	@DeleteMapping("/{id}")
	public TipoIdentificacionDTO delete(@PathVariable UUID id) {
		return TipoIdentificacionDTO.create().setIdentificador(id);

	}

}
