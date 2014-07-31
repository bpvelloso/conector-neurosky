package bpv.neurosky.data.entity;
/**
 * Classe responsavel por armazenar dados de um teste.
 * 
 * @author velloso
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import bpv.neurosky.data.entity.medicao.MedicaoAtencao;
import bpv.neurosky.data.entity.medicao.MedicaoMeditacao;
import bpv.neurosky.data.entity.medicao.MedicaoOnda;
import bpv.neurosky.data.entity.medicao.MedicaoPiscada;
import bpv.neurosky.data.entity.medicao.MedicaoRaw;
import bpv.neurosky.data.entity.medicao.MedicaoSinal;
import bpv.neurosky.data.type.SerieEnum;
import bpv.neurosky.data.type.SexoEnum;

@XmlRootElement
public class SubjectTest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8016412692456610544L;
	
	//Dados do sujeito
	/**
	 * @uml.property  name="nome"
	 */
	private String nome;
	/**
	 * @uml.property  name="sexo"
	 * @uml.associationEnd  
	 */
	private SexoEnum sexo;
	/**
	 * @uml.property  name="serie"
	 * @uml.associationEnd  
	 */
	private SerieEnum serie;
	/**
	 * @uml.property  name="dataNascimento"
	 */
	private Date dataNascimento;
	/**
	 * @uml.property  name="conceitoEscolar"
	 */
	private Float conceitoEscolar;
	
	//Dados do teste
	/**
	 * @uml.property  name="inicio"
	 */
	private Date inicio;
	/**
	 * @uml.property  name="fim"
	 */
	private Date fim;
	/**
	 * @uml.property  name="tentativa"
	 */
	private Integer tentativa=1;
	/**
	 * @uml.property  name="hipermidia"
	 * @uml.associationEnd  
	 */
	private HyperMedia hipermidia;
	/**
	 * @uml.property  name="observacoes"
	 */
	private String observacoes;
	
	//Dados Obtidos
	/**
	 * @uml.property  name="dadosAtencao"
	 */
	private List<MedicaoAtencao> dadosAtencao;
	/**
	 * @uml.property  name="dadosMeditacao"
	 */
	private List<MedicaoMeditacao> dadosMeditacao;
	/**
	 * @uml.property  name="dadosPiscada"
	 */
	private List<MedicaoPiscada> dadosPiscada;
	/**
	 * @uml.property  name="dadosDelta"
	 */
	private List<MedicaoOnda> dadosDelta;
	/**
	 * @uml.property  name="dadosTheta"
	 */
	private List<MedicaoOnda> dadosTheta;
	/**
	 * @uml.property  name="dadosLowAlpha"
	 */
	private List<MedicaoOnda> dadosLowAlpha;
	/**
	 * @uml.property  name="dadosHighAlpha"
	 */
	private List<MedicaoOnda> dadosHighAlpha;
	/**
	 * @uml.property  name="dadosLowBeta"
	 */
	private List<MedicaoOnda> dadosLowBeta;
	/**
	 * @uml.property  name="dadosHighBeta"
	 */
	private List<MedicaoOnda> dadosHighBeta;
	/**
	 * @uml.property  name="dadosLowGama"
	 */
	private List<MedicaoOnda> dadosLowGama;
	/**
	 * @uml.property  name="dadosHighGama"
	 */
	private List<MedicaoOnda> dadosHighGama;
	/**
	 * @uml.property  name="dadosSinal"
	 */
	private List<MedicaoSinal> dadosSinal;
	/**
	 * @uml.property  name="dadosRaw"
	 */
	private List<MedicaoRaw> dadosRaw;
	
	/**
	 * Cria objeto e inicializa listas de dados.
	 */
	public SubjectTest() {
		this.dadosAtencao = new ArrayList<MedicaoAtencao>();
		this.dadosMeditacao = new ArrayList<MedicaoMeditacao>();
		this.dadosPiscada = new ArrayList<MedicaoPiscada>();
		this.dadosDelta = new ArrayList<MedicaoOnda>();
		this.dadosTheta = new ArrayList<MedicaoOnda>();
		this.dadosLowAlpha = new ArrayList<MedicaoOnda>();
		this.dadosHighAlpha = new ArrayList<MedicaoOnda>();
		this.dadosLowBeta = new ArrayList<MedicaoOnda>();
		this.dadosHighBeta = new ArrayList<MedicaoOnda>();
		this.dadosLowGama = new ArrayList<MedicaoOnda>();
		this.dadosHighGama = new ArrayList<MedicaoOnda>();
		this.dadosSinal = new ArrayList<MedicaoSinal>();
		this.dadosRaw = new ArrayList<MedicaoRaw>();
	}
	
	/**
	 * @return
	 * @uml.property  name="nome"
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome
	 * @uml.property  name="nome"
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return
	 * @uml.property  name="sexo"
	 */
	public SexoEnum getSexo() {
		return sexo;
	}
	/**
	 * @param sexo
	 * @uml.property  name="sexo"
	 */
	public void setSexo(SexoEnum sexo) {
		this.sexo = sexo;
	}
	/**
	 * @return
	 * @uml.property  name="serie"
	 */
	public SerieEnum getSerie() {
		return serie;
	}
	/**
	 * @param serie
	 * @uml.property  name="serie"
	 */
	public void setSerie(SerieEnum serie) {
		this.serie = serie;
	}
	/**
	 * @return
	 * @uml.property  name="dataNascimento"
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}
	/**
	 * @param dataNascimento
	 * @uml.property  name="dataNascimento"
	 */
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	/**
	 * @return
	 * @uml.property  name="conceitoEscolar"
	 */
	public Float getConceitoEscolar() {
		return conceitoEscolar;
	}
	/**
	 * @param conceitoEscolar
	 * @uml.property  name="conceitoEscolar"
	 */
	public void setConceitoEscolar(Float conceitoEscolar) {
		this.conceitoEscolar = conceitoEscolar;
	}
	/**
	 * @return
	 * @uml.property  name="inicio"
	 */
	public Date getInicio() {
		return inicio;
	}
	/**
	 * @param inicio
	 * @uml.property  name="inicio"
	 */
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	/**
	 * @return
	 * @uml.property  name="fim"
	 */
	public Date getFim() {
		return fim;
	}
	/**
	 * @param fim
	 * @uml.property  name="fim"
	 */
	public void setFim(Date fim) {
		this.fim = fim;
	}
	/**
	 * @return
	 * @uml.property  name="tentativa"
	 */
	public Integer getTentativa() {
		return tentativa;
	}
	/**
	 * @param tentativa
	 * @uml.property  name="tentativa"
	 */
	public void setTentativa(Integer tentativa) {
		this.tentativa = tentativa;
	}
	/**
	 * @return
	 * @uml.property  name="hipermidia"
	 */
	public HyperMedia getHipermidia() {
		return hipermidia;
	}
	/**
	 * @param hipermidia
	 * @uml.property  name="hipermidia"
	 */
	public void setHipermidia(HyperMedia hipermidia) {
		this.hipermidia = hipermidia;
	}
	public List<MedicaoAtencao> getDadosAtencao() {
		return dadosAtencao;
	}
	public void setDadosAtencao(List<MedicaoAtencao> dadosAtencao) {
		this.dadosAtencao = dadosAtencao;
	}
	public List<MedicaoMeditacao> getDadosMeditacao() {
		return dadosMeditacao;
	}
	public void setDadosMeditacao(List<MedicaoMeditacao> dadosMeditacao) {
		this.dadosMeditacao = dadosMeditacao;
	}

	public List<MedicaoPiscada> getDadosPiscada() {
		return dadosPiscada;
	}

	public void setDadosPiscada(List<MedicaoPiscada> dadosPiscada) {
		this.dadosPiscada = dadosPiscada;
	}

	public List<MedicaoOnda> getDadosDelta() {
		return dadosDelta;
	}

	public void setDadosDelta(List<MedicaoOnda> dadosDelta) {
		this.dadosDelta = dadosDelta;
	}

	public List<MedicaoOnda> getDadosTheta() {
		return dadosTheta;
	}

	public void setDadosTheta(List<MedicaoOnda> dadosTheta) {
		this.dadosTheta = dadosTheta;
	}

	public List<MedicaoOnda> getDadosLowAlpha() {
		return dadosLowAlpha;
	}

	public void setDadosLowAlpha(List<MedicaoOnda> dadosLowAlpha) {
		this.dadosLowAlpha = dadosLowAlpha;
	}

	public List<MedicaoOnda> getDadosHighAlpha() {
		return dadosHighAlpha;
	}

	public void setDadosHighAlpha(List<MedicaoOnda> dadosHighAlpha) {
		this.dadosHighAlpha = dadosHighAlpha;
	}

	public List<MedicaoOnda> getDadosLowBeta() {
		return dadosLowBeta;
	}

	public void setDadosLowBeta(List<MedicaoOnda> dadosLowBeta) {
		this.dadosLowBeta = dadosLowBeta;
	}

	public List<MedicaoOnda> getDadosHighBeta() {
		return dadosHighBeta;
	}

	public void setDadosHighBeta(List<MedicaoOnda> dadosHighBeta) {
		this.dadosHighBeta = dadosHighBeta;
	}

	public List<MedicaoOnda> getDadosLowGama() {
		return dadosLowGama;
	}

	public void setDadosLowGama(List<MedicaoOnda> dadosLowGama) {
		this.dadosLowGama = dadosLowGama;
	}

	public List<MedicaoOnda> getDadosHighGama() {
		return dadosHighGama;
	}

	public void setDadosHighGama(List<MedicaoOnda> dadosHighGama) {
		this.dadosHighGama = dadosHighGama;
	}

	public List<MedicaoSinal> getDadosSinal() {
		return dadosSinal;
	}

	public void setDadosSinal(List<MedicaoSinal> dadosSinal) {
		this.dadosSinal = dadosSinal;
	}

	public List<MedicaoRaw> getDadosRaw() {
		return dadosRaw;
	}

	public void setDadosRaw(List<MedicaoRaw> dadosRaw) {
		this.dadosRaw = dadosRaw;
	}

	/**
	 * @return
	 * @uml.property  name="observacoes"
	 */
	public String getObservacoes() {
		return observacoes;
	}

	/**
	 * @param observacoes
	 * @uml.property  name="observacoes"
	 */
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
}











