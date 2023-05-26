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
import co.edu.uco.publiuco.api.validator.tiporelacioninstitucion.RegistrarTipoRelacionInstitucionValidation;
import co.edu.uco.publiuco.business.facade.TipoRelacionInstitucionFacade;
import co.edu.uco.publiuco.business.facade.impl.TipoRelacionInstitucionFacadeImpl;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.CommonControllerMessages;
import co.edu.uco.publiuco.crosscutting.utils.Messages.TipoRelacionInstitucionControllerMessages;
import co.edu.uco.publiuco.dto.TipoRelacionInstitucionDTO;

@RestController
@RequestMapping("publiuco/api/v1/tiporelacioninstitucion")
public final class TipoRelacionInstitucionController {

	private TipoRelacionInstitucionFacade facade;

	public TipoRelacionInstitucionController() {
		facade = new TipoRelacionInstitucionFacadeImpl();
	}

	@GetMapping("/dummy")
	public TipoRelacionInstitucionDTO dummy() {
		return TipoRelacionInstitucionDTO.create();
	}

	@GetMapping
	public ResponseEntity<Response<TipoRelacionInstitucionDTO>> list(@RequestBody TipoRelacionInstitucionDTO dto) {

		List<TipoRelacionInstitucionDTO> list = new ArrayList<>();
		List<String> messages = new ArrayList<>();

		Response<TipoRelacionInstitucionDTO> response = new Response<>(list, messages);

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public TipoRelacionInstitucionDTO listById(@PathVariable UUID id) {

		return TipoRelacionInstitucionDTO.create().setIdentificador(id);

	}

	@PostMapping
	public ResponseEntity<Response<TipoRelacionInstitucionDTO>> create(@RequestBody TipoRelacionInstitucionDTO dto) {

		var statusCode = HttpStatus.OK;
		var response = new Response<TipoRelacionInstitucionDTO>();

		try {
			var result = RegistrarTipoRelacionInstitucionValidation.validate(dto);

			if (result.getMessages().isEmpty()) {
				facade.register(dto);
				response.getMessages().add(TipoRelacionInstitucionControllerMessages.REGISTER_NEW_SUCESS);
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
	public TipoRelacionInstitucionDTO update(@PathVariable UUID id, @RequestBody TipoRelacionInstitucionDTO dto) {
		return dto.setIdentificador(id);

	}

	@DeleteMapping("/{id}")
	public TipoRelacionInstitucionDTO delete(@PathVariable UUID id) {
		return TipoRelacionInstitucionDTO.create().setIdentificador(id);

	}

}
