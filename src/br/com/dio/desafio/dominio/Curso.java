package br.com.dio.desafio.dominio;

/** 
 * Criação dos Métodos Geters e Seters automáticamente
 * Vá no menu Source > Generate Getters and Setters...
  (ou use o atalho Alt + Shift + S e depois R).
  Marque os campos que você deseja gerar e clique em OK.
*/



public class Curso {
	
	private String titulo;
	private String descricao;
	private int cargaHoraria;
	
	public Curso() {
		
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "Curso [titulo = " + titulo + ", descricao = " + descricao + ", cargaHoraria =" + cargaHoraria + "]";
	}
	
	

}
