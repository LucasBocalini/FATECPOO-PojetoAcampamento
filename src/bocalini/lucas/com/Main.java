package bocalini.lucas.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Acampamento acampamento = new Acampamento();

        Scanner s = new Scanner(System.in);
        System.out.println("Digite o nome: ");
    String nome = s.nextLine();
        System.out.println("Digite a Idade: ");
    int idade = s.nextInt();
	acampamento.setNome(nome);
	acampamento.setIdade(idade);
	acampamento.separarGrupo();
	acampamento.imprimir();
    }

}
