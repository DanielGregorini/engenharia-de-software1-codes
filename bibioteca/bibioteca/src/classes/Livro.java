package classes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Livro extends Midia {
    private String isbn;

    // Corrected the parameter name from 'isnb' to 'isbn'
    public Livro(String isbn, String nome) {
        super(nome);  // Call to the superclass constructor to set 'nome'
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }


    @Override
    public void mostrar() {
        // Print out the book's details
        System.out.println("Dados do livro: \nNome: " + getNome() + "\nISBN: " + isbn);
    }
}
