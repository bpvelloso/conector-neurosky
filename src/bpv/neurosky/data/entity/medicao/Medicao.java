package bpv.neurosky.data.entity.medicao;

import java.util.Date;

import bpv.neurosky.data.type.TipoDadoEnum;

public abstract class Medicao<E> {
	
	/**
	 * @uml.property  name="valor"
	 */
	private E valor;
	/**
	 * @uml.property  name="hora"
	 */
	private Date hora;
	/**
	 * @uml.property  name="tipo"
	 * @uml.associationEnd  
	 */
	private TipoDadoEnum tipo;
	
	public Medicao() {
		this.hora = new Date();
	}

	public E getValor() {
		return valor;
	}
	public void setValor(E valor) {
		this.valor = valor;
	}
	/**
	 * @return
	 * @uml.property  name="hora"
	 */
	public Date getHora() {
		return hora;
	}
	/**
	 * @param hora
	 * @uml.property  name="hora"
	 */
	public void setHora(Date hora) {
		this.hora = hora;
	}
	/**
	 * @return
	 * @uml.property  name="tipo"
	 */
	public TipoDadoEnum getTipo() {
		return tipo;
	}
	//Instancias de subclasses nao alteram o tipo
	/**
	 * @param tipo
	 * @uml.property  name="tipo"
	 */
	protected void setTipo(TipoDadoEnum tipo) {
		this.tipo = tipo;
	}
}
