package bpv.neurosky.data.entity.config;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import bpv.neurosky.data.entity.HyperMedia;

@XmlRootElement
public class Configuracao {

	@XmlTransient
	private static final String VERSAO = "0.1";

	
	/**
	 * @uml.property  name="versao"
	 */
	private String versao = Configuracao.VERSAO;
	
	/**
	 * @uml.property  name="hipermidias"
	 */
	private List<HyperMedia> hipermidias;

	public List<HyperMedia> getHipermidias() {
		return hipermidias;
	}

	public void setHipermidias(List<HyperMedia> hipermidias) {
		this.hipermidias = hipermidias;
	}

	/**
	 * @return
	 * @uml.property  name="versao"
	 */
	@XmlTransient
	public String getVersao() {
		return versao;
	}

	/**
	 * @param versao
	 * @uml.property  name="versao"
	 */
	public void setVersao(String versao) {
		this.versao = versao;
	} 
}
