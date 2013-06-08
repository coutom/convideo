/**
 * 
 */
package br.gov.convideo.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author michael
 *
 */

@ManagedBean
@SessionScoped
public class ConverteVideoBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4131683423929225719L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
