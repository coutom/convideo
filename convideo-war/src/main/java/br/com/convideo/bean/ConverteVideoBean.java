/**
 * 
 */
package br.com.convideo.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.convideo.action.ConverterAction;

/**
 * @author michael
 * 
 */


@SessionScoped
@ManagedBean(name="converteVideoBean")
public class ConverteVideoBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4131683423929225719L;

	private String arquivoEntrada;
	
	private boolean mostraArquivo;
	
	private String arquivoSaida = "http://www.youtube.com/v/KZnUr8lcqjo";
	
	public ConverteVideoBean() {
		System.out.println("init");
	}
	
	/**
	 * Obter aquivo de entrada de acordo com URL informada.
	 * @return
	 */
	public void obterArquivoEntrada(){
		ConverterAction ca = new ConverterAction();
		mostraArquivo = ca.obterArquivoEntrada();				
	}

	public String getArquivoSaida() {
		return arquivoSaida;
	}

	public void setArquivoSaida(String arquivoSaida) {
		this.arquivoSaida = arquivoSaida;
	}

	public String getArquivoEntrada() {
		return arquivoEntrada;
	}

	public void setArquivoEntrada(String arquivoEntrada) {
		this.arquivoEntrada = arquivoEntrada;
	}

	public boolean isMostraArquivo() {
		return mostraArquivo;
	}

	public void setMostraArquivo(boolean mostraArquivo) {
		this.mostraArquivo = mostraArquivo;
	}

	

	

}
