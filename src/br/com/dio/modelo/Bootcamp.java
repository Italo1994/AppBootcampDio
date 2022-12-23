package br.com.dio.modelo;

import java.util.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;


public class Bootcamp {
	private String nome;
	private String descricao;
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate dataFinal = LocalDate.plusDays(45);
	private Set<Dev> devsInscritos;
	private Set<Conteudo> conteudos;

	public Bootcamp() {
		devsInscritos = new HashSet<>();
		conteudos = new LinkedHashSet<>();
	}

	public Bootcamp(String nome, String descricao, Date dataInicial, Date dataFinal) {
		this.nome = nome;
		this.descricao = descricao;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		this.descricao = descricao;
	}

	public void setDataInicial(Date dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Date getDataInicial() {
		return dataInicial;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}

	public void setDevsInscritos(Set<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}

	public Set<Conteudo> getConteudos() {
		return conteudos;
	}

	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}

	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null || getClass() != o.getClass()) {
			return false;
		}

		Bootcamp bootcamp = (Bootcamp) o;

		return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
	}
}