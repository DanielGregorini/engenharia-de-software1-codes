import classes.Livro;
import classes.Midia;
import classes.Exemplar;
import classes.Jornal;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!\n");    
        
        Midia domQuixote = new Livro("232323", "Amora");
        domQuixote.mostrar();

        Exemplar exemplar1 = new Exemplar(1);
        Exemplar exemplar2 = new Exemplar(2);
        
        domQuixote.addExemplar(exemplar1);
        domQuixote.addExemplar(exemplar2);
       
        domQuixote.mostrarExemplares();

        Jornal jornal1 = new Jornal("EDI CITY", "JORNAL DA AMORA");
        Exemplar exemplar3 = new Exemplar(3);

        jornal1.mostrar();

        jornal1.addExemplar(exemplar3);

        jornal1.mostrarExemplares();
    }
}