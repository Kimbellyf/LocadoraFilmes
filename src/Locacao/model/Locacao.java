package Locacao.model;

import java.util.Date;

public class Locacao {
	private int id;
	private int idFilmeLocado;
	private int idClienteLogou;
	private Date dataLocacao;
	private Date dataDevolucao;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdFilmeLocado() {
		return idFilmeLocado;
	}
	public void setIdFilmeLocado(int idFilmeLocado) {
		this.idFilmeLocado = idFilmeLocado;
	}
	public int getIdClienteLogou() {
		return idClienteLogou;
	}
	public void setIdClienteLogou(int idClienteLogou) {
		this.idClienteLogou = idClienteLogou;
	}
	public Date getDataLocacao() {
		return dataLocacao;
	}
	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	

}
