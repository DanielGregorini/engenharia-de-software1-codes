package modelo;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;

    public String getNome(){
        return nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome (String s){
        this.nome = s;
    }

    public void setSobrenome (String s){
        this.sobrenome = s;
    }

    public void setIdade(int i){
        this.idade = i;
    }
}
