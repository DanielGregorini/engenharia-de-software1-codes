package apresentacao;

import java.util.List;
import modelo.Pessoa;

public class PessoaTextView implements PessoaView {

    @Override
    public void listarPessoa(List<Pessoa> pessoas) {
        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
            System.out.println(pessoa.getSobrenome()); 
            System.out.println(pessoa.getIdade());  
            System.out.println("\n");  
        }
    }
}
