package persistencia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import beans.Entidad;
import beans.Propiedad;
import modelo.Etiqueta;

import tds.driver.FactoriaServicioPersistencia;
import tds.driver.ServicioPersistencia;

public class AdaptadorEtiquetaTDS implements IAdaptadorEtiquetaDAO {

	private static ServicioPersistencia servPersistencia;
	private static AdaptadorEtiquetaTDS unicaInstancia = null;

	public static AdaptadorEtiquetaTDS getUnicaInstancia() {
		if (unicaInstancia == null)
			return new AdaptadorEtiquetaTDS();
		return unicaInstancia;
	}

	private AdaptadorEtiquetaTDS() {
		servPersistencia = FactoriaServicioPersistencia.getInstance().getServicioPersistencia();
	}

	@Override
	public int registrarEtiqueta(Etiqueta etiqueta) {
		Entidad eEtiqueta;
		boolean existe = true;
		try {
			eEtiqueta = servPersistencia.recuperarEntidad(etiqueta.getCodigo());
		} catch (Exception e) {
			existe = false;
		}
		if (existe) {
			return -1;
		}
		// crear Entidad
		eEtiqueta = new Entidad();
		eEtiqueta.setNombre("etiqueta");
		eEtiqueta.setPropiedades(new ArrayList<Propiedad>(Arrays.asList(new Propiedad("nombre", etiqueta.getNombre()))

		));

		eEtiqueta = servPersistencia.registrarEntidad(eEtiqueta);
		etiqueta.setCodigo(eEtiqueta.getId());
		// PoolDAO.getUnicaInstancia().addObjeto(video.getCodigo(), video);
		// mirar
		return eEtiqueta.getId();

	}

	@Override
	public void borrarEtiqueta(Etiqueta etiqueta) {

		Entidad eEtiqueta = servPersistencia.recuperarEntidad(etiqueta.getCodigo());
		try {
			servPersistencia.borrarEntidad(eEtiqueta);
		} catch (NullPointerException e) {

		}
	}

	@Override
	public void modificarEtiqueta(Etiqueta etiqueta) {

		Entidad eEtiqueta = servPersistencia.recuperarEntidad(etiqueta.getCodigo());
		servPersistencia.eliminarPropiedadEntidad(eEtiqueta, "nombre");
		servPersistencia.anadirPropiedadEntidad(eEtiqueta, "nombre", etiqueta.getNombre());
	}

	@Override
	public Etiqueta recuperarEtiqueta(int codigo) {

		if (PoolDAO.getUnicaInstancia().contiene(codigo)) {

			return (Etiqueta) PoolDAO.getUnicaInstancia().getObjeto(codigo);
		}
		Entidad eEtiqueta = null;
		try {
			eEtiqueta = servPersistencia.recuperarEntidad(codigo);
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.err.println("Adaptador Etiqueta");
		}

		String nombre = servPersistencia.recuperarPropiedadEntidad(eEtiqueta, "nombre");
		Etiqueta etiqueta = new Etiqueta(nombre);
		etiqueta.setCodigo(codigo);

		PoolDAO.getUnicaInstancia().addObjeto(codigo, etiqueta);
		return etiqueta;

	}

	@Override
	public List<Etiqueta> recuperarTodasLasEtiquetas() {
		List<Etiqueta> etiqueta = new LinkedList<>();
		List<Entidad> entidades = servPersistencia.recuperarEntidades("etiqueta");

		for (Entidad eEtiqueta : entidades) {
			etiqueta.add(recuperarEtiqueta(eEtiqueta.getId()));
		}
		return etiqueta;

	}
	
	

}
