/**
 * 
 */

/**
 * @author Mario de Leon
 *
 */
public interface RadioInterface {
	public String estacionActual();
	
	public boolean estado();
	
	public void onOff();
	
	public void cambiarFrecuencia();
	
	public void avanzar();
	
	public void guardar(int boton);
	
	public void seleccionarEmisora(int boton);

}
