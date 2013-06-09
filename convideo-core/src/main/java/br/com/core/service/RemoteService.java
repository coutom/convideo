/**
 * 
 */
package br.com.core.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;

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
	 * @param arquivoEntrada 
	 * @return
	 */
	public static boolean obterArquivoEntrada(String arquivoEntrada){
		try {
			URL url = new URL(arquivoEntrada);
			String nomeArquivoLocal = url.getPath();
			InputStream is = url.openStream(); 	
			return true;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
		
	}


}
