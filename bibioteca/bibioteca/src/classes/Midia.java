package classes;
import java.util.ArrayList;
import java.util.List;

public abstract class Midia {
    private String nome;
    private List<Exemplar> exemplares;

    public String getNome() {
        return nome;
    }

    public Midia(String nome) {
        this.nome = nome;
        this.exemplares = new ArrayList<>(); // Inicializa a variável de instância corretamente
    }

    public void addExemplar(Exemplar e) {
        exemplares.add(e);
    }

    public void mostrarExemplares() {
        for (Exemplar exemplar : exemplares) {
            System.out.println("Exemplar ID: " + exemplar.codigo);
        }
        System.out.println();
    }

    public abstract void mostrar();
}
