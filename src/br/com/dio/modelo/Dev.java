package br.com.dio.modelo;

import java.util.Set;
import java.util.LinkedHashSet;

public class Dev {
	private String nome;
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
}