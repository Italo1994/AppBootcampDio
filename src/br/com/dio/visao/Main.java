package br.com.dio.visao;

import br.com.dio.modelo.Curso;

public class Visao {
	public static void main(String args[]) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);
	}
}