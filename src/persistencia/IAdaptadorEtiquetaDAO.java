package persistencia;

import java.util.List;

import modelo.Etiqueta;


public interface IAdaptadorEtiquetaDAO {
	public int registrarEtiqueta(Etiqueta etiquet);

	public void borrarEtiqueta(Etiqueta etiquet);

	public void modificarEtiqueta(Etiqueta etiqueta);
	
	public Etiqueta recuperarEtiqueta(int codigo);

	public List<Etiqueta> recuperarTodasLasEtiquetas();
}
