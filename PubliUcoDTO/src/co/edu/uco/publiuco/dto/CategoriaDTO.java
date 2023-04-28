package co.edu.uco.publiuco.dto;

import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public class CategoriaDTO {

	private UUID identificador;
	private CategoriaDTO categoriaPadre;
	private String nombre;
	private String descripcion;
	private EstadoCategoriaDTO estado;
	
	public CategoriaDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCategoriaPadre(CategoriaDTO.create());
		setNombre(UtilText.EMPTY);
		setDescripcion(UtilText.EMPTY);
		setEstado(EstadoCategoriaDTO.create());
	}

	public CategoriaDTO(UUID identificador, CategoriaDTO categoriaPadre, String nombre, String descripcion,
			EstadoCategoriaDTO estado) {
		super();
		setIdentificador(identificador);
		setCategoriaPadre(categoriaPadre);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);
	}
	
	public static CategoriaDTO create() {
		return new CategoriaDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final CategoriaDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public final CategoriaDTO getCategoriaPadre() {
		return categoriaPadre;
	}

	public final CategoriaDTO setCategoriaPadre(final CategoriaDTO categoriaPadre) {
		this.categoriaPadre = UtilObject.getDefault(categoriaPadre, CategoriaDTO.create());
		return this;
	}

	public final String getNombre() {
		return nombre;
	}

	public final CategoriaDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}

	public final String getDescripcion() {
		return descripcion;
	}

	public final CategoriaDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}

	public final EstadoCategoriaDTO getEstado() {
		return estado;
	}

	public final CategoriaDTO setEstado(final EstadoCategoriaDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoCategoriaDTO.create());
		return this;
	}

}