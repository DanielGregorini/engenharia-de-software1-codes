package classes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jornal extends Midia {
    private String area;

    public Jornal(String area, String nome){
        super(nome);
        this.area = area;
    }

    public String getArea(){
        return area;
    }

    public void setArea(String area){
        this.area = area;
    }

    @Override
    public void mostrar() {
        // Print out the book's details
        System.out.println("Dados do jornal: \nNome: " + getNome() + "\nArea: " + area);
    }
}
