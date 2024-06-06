import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



import apresentacao.PessoaTextView;
import apresentacao.PessoaView;
import modelo.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        PessoaView view = new PessoaTextView();
        
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("amora");
        pessoa1.setSobrenome("amora");
        pessoa1.setIdade(20);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Joao");
        pessoa2.setSobrenome("Paulo");
        pessoa2.setIdade(23);
        
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        
        view.listarPessoa(pessoas);
    }
}
