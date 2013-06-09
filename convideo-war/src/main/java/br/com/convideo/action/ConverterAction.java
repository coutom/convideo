package br.com.convideo.action;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.commons.lang3.StringUtils;

import br.com.core.service.RemoteService;

public class ConverterAction implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3946012359561452184L;
	
		
	/**
	 * Obter aquivo de entrada de acordo com URL informada.
	 * @return
	 */
	public boolean obterArquivoEntrada() {
		String arquivo = RemoteService.obterArquivoEntrada();
		if(StringUtils.isNotEmpty(arquivo)){
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Arquivo obtido com sucesso!", "Ok"));
			return true;
		}else{
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Não foi possivel localizar o arquivo informado", "Erro"));
			return false;
		}
	}
	


}
