package bpv.neurosky.data.type;

public enum TipoDadoEnum {
	ATENCAO("Atenção"),
	MEDITACAO("Meditação"),
	PISCADA("Piscada"),
	ONDA("Onda"),
	RAW("Dados Raw"), 
	SINAL("Sinal");
	
	/**
	 * @uml.property  name="descricao"
	 */
	private String descricao;

	private TipoDadoEnum(String desc) {
		this.setDescricao(desc);
	}

	/**
	 * @return
	 * @uml.property  name="descricao"
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao
	 * @uml.property  name="descricao"
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String toString(){
		return this.getDescricao();
	}
}
