package pkg;
import pkg.models.Estudante;

public class EstudanteFactory extends Estudante{
    public static Estudante criarEstudante(){
        Estudante estudante = new Estudante();
        estudante.setCodigo(1);

        estudante.setNome("ddsdsd");

        return estudante;
    }
}
