/*
 * Creado el 25-may-2005
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generaci�n de c�digo&gt;C�digo y comentarios
 */
package edu.compilador.lineas;

import edu.recurso.lista.Lista;

public class Condicion extends Linea{
	
	private boolean retorno;
	//variable � constante comparador variable � constante
	//funcionlogica bool
	//bool
	//condicion funcionlogica condicion
	//condicion comparador condicion
	//solo se ejecuta, si el resultado de la operacionlogica es verdadero
	public Condicion(Lista sentencias) {
		super(sentencias);
	}
	
	public void ejecutar(){
		setEjecutada(true);
	}
}
