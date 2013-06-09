/**
 * 
 */
package br.com.core.service;

import java.io.Serializable;

/**
 * @author michael
 *
 */
public class RemoteService implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2411034827445498627L;
	
	/**
	 * Obter aquivo de entrada de acordo com URL informada.
	 * @return
	 */
	public static String obterArquivoEntrada(){
		return "arquivo";
	}

}
