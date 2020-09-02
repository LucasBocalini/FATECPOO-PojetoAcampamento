package bocalini.lucas.com;

public class Acampamento {

    private String nome;
    private Character equipe;
    private int idade;


    void imprimir() {
        System.out.println("Acampamento{" +
                "nome='" + nome + '\'' +
                ", equipe=" + equipe +
                ", idade=" + idade +
                '}');
    }

    void separarGrupo(){
        if (idade >= 6 && idade <= 10){
            this.equipe = 'A';
        }
        else if (idade >= 11 && idade <= 20){
            this.equipe = 'B';
        }
        else if(idade >=21){
            this.equipe = 'C';
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Character getEquipe() {
        return equipe;
    }

    public void setEquipe(Character equipe) {
        this.equipe = equipe;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
