package pkg.models;

public class Estudante {
    private int codigo;
    private String nome;

    public int getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
