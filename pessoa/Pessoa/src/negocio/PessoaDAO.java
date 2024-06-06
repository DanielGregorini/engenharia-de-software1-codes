package negocio;

import java.util.List;
import modelo.Pessoa;

public interface PessoaDAO {
    void adicionar(Pessoa pessoa);
    void remover(Pessoa pessoa);
    List<Pessoa> listarTudo();
}
