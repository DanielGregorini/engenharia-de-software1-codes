package comunicao;

import java.util.List;
import negocio.*;
import modelo.*;

public class PessoaService {
    private PessoaDAO pessoaDAO;

    public void adicionar(Pessoa p){
        pessoaDAO.adicionar(p);
    }

    public void remove(Pessoa p){
        pessoaDAO.remover(p);
    }

    public List<Pessoa> listarTudo(){
        return pessoaDAO.listarTudo();
    }
}
