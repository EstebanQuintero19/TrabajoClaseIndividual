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
import co.edu.uco.publiuco.api.validator.categoria.RegistrarCategoriaValidation;
import co.edu.uco.publiuco.business.facade.CategoriaFacade;
import co.edu.uco.publiuco.business.facade.impl.CategoriaFacadeImpl;
import co.edu.uco.publiuco.crosscutting.exception.PubliucoException;
import co.edu.uco.publiuco.crosscutting.utils.Messages.CategoriaControllerMessages;
import co.edu.uco.publiuco.crosscutting.utils.Messages.CommonControllerMessages;
import co.edu.uco.publiuco.dto.CategoriaDTO;

@RestController
@RequestMapping("publiuco/api/v1/categoria")
public final class CategoriaController {

	private CategoriaFacade facade;

	public CategoriaController() {
		facade = new CategoriaFacadeImpl();
	}

	@GetMapping("/dummy")
	public CategoriaDTO dummy() {
		return CategoriaDTO.create();
	}

	@GetMapping
	public ResponseEntity<Response<CategoriaDTO>> list(@RequestBody CategoriaDTO dto) {

		List<CategoriaDTO> list = new ArrayList<>();
		List<String> messages = new ArrayList<>();

		Response<CategoriaDTO> response = new Response<>(list, messages);

		return new ResponseEntity<>(response, HttpStatus.OK);

	}

	@GetMapping("/{id}")
	public CategoriaDTO listById(@PathVariable UUID id) {

		return CategoriaDTO.create().setIdentificador(id);

	}

	@PostMapping
	public ResponseEntity<Response<CategoriaDTO>> create(@RequestBody CategoriaDTO dto) {

		var statusCode = HttpStatus.OK;
		var response = new Response<CategoriaDTO>();

		try {
			var result = RegistrarCategoriaValidation.validate(dto);

			if (result.getMessages().isEmpty()) {
				facade.register(dto);
				response.getMessages().add(CategoriaControllerMessages.REGISTER_NEW_SUCESS);
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
	public CategoriaDTO update(@PathVariable UUID id, @RequestBody CategoriaDTO dto) {
		return dto.setIdentificador(id);

	}

	@DeleteMapping("/{id}")
	public CategoriaDTO delete(@PathVariable UUID id) {
		return CategoriaDTO.create().setIdentificador(id);

	}

}
