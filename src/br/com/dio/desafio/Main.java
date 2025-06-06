package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		
		curso1.setTitulo("Curso java");
		curso1.setDescricao("Descriçãocurso java");
		curso1.setCargaHoraria(8);
		
        Curso curso2 = new Curso();
		
		curso2.setTitulo("Curso js");
		curso2.setDescricao("Descriçãocurso js");
		curso2.setCargaHoraria(6);
		
		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("Mentoria java");
		mentoria.setDescricao("Descrição mentoria de java");
		mentoria.setData(LocalDate.now());

		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
	}

}
