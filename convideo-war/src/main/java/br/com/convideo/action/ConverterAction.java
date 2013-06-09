package br.com.convideo.action;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import br.com.convideo.util.ValidaURL;
import br.com.core.service.ConversorService;
import br.com.core.service.RemoteService;

public class ConverterAction implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3946012359561452184L;
	
		
	/**
	 * Obter aquivo de entrada de acordo com URL informada.
	 * @param arquivoEntrada 
	 * @return
	 */
	public boolean obterArquivoEntrada(String arquivoEntrada) {
		if(ValidaURL.validaEndereco(arquivoEntrada)){
			
			boolean obteveArquivo = RemoteService.obterArquivoEntrada(arquivoEntrada);
			
			if(obteveArquivo){
				converteVideoValido(arquivoEntrada);
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Arquivo obtido com sucesso!", "Ok"));
				return true;
			}else{
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Não foi possivel localizar o arquivo informado", "Erro"));
				return false;
			}
			
		}else{
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Formato invalido para o endereço informado.", "Erro"));
			return false;
		}
	}


	/**
	 * Methodo que realiza a conversão do video informado.
	 * @param arquivoEntrada 
	 */
	private void converteVideoValido(String arquivoEntrada) {
		ConversorService.DvToFlash();
	}
	


}
