package co.edu.uco.publiuco.dto;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

public final class EstadoTipoRelacionInstitucionDTO{

	private UUID identificador;
	private String nombre;
	private String descripcion;

	public EstadoTipoRelacionInstitucionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
	}

	public EstadoTipoRelacionInstitucionDTO(final UUID identificador, final String nombre, final String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}

	public static EstadoTipoRelacionInstitucionDTO create() {
		return new EstadoTipoRelacionInstitucionDTO();
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final EstadoTipoRelacionInstitucionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;

	}

	public final String getNombre() {
		return nombre;
	}

	public final EstadoTipoRelacionInstitucionDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}

	public final String getDescripcion() {
		return descripcion;
	}

	public final EstadoTipoRelacionInstitucionDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<EstadoTipoRelacionInstitucionDTO> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(EstadoTipoRelacionInstitucionDTO e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends EstadoTipoRelacionInstitucionDTO> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends EstadoTipoRelacionInstitucionDTO> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EstadoTipoRelacionInstitucionDTO get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoTipoRelacionInstitucionDTO set(int index, EstadoTipoRelacionInstitucionDTO element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, EstadoTipoRelacionInstitucionDTO element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EstadoTipoRelacionInstitucionDTO remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<EstadoTipoRelacionInstitucionDTO> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<EstadoTipoRelacionInstitucionDTO> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EstadoTipoRelacionInstitucionDTO> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}