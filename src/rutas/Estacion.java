/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rutas;

/**
 *
 * @author Aldair Cruz
 */
public class Estacion {
   
	private String StrLinea;
	private String StrEstacion;
	private String StrConexion;
	 

	public Estacion(String strLinea, String strEstacion, String strConexion) {
		StrLinea = strLinea;
		StrEstacion = strEstacion;
		StrConexion = strConexion;
	}

    

	public String getStrLinea() {
		return StrLinea;
	}

	public void setStrLinea(String strLinea) {
		StrLinea = strLinea;
	}

	public String getStrEstacion() {
		return StrEstacion;
	}

	public void setStrEstacion(String strEstacion) {
		StrEstacion = strEstacion;
	}

	public String getStrConexion() {
		return StrConexion;
	}

	public void setStrConexion(String strConexion) {
		StrConexion = strConexion;
	}

}
 


