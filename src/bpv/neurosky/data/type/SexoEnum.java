package bpv.neurosky.data.type;

public enum SexoEnum {
	MASCULINO("Masculino"),
	FEMININO("Feminino");
	
	/**
	 * @uml.property  name="descricao"
	 */
	private String descricao;

	private SexoEnum(String desc) {
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
