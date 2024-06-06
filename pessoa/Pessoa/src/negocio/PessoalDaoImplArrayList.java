package negocio;

import java.util.ArrayList;
import java.util.List;

import modelo.*;

class PessoalDaoImplArrayList implements PessoaDAO{

    private List<Pessoa> pessoas = new ArrayList<>();

    @Override
    public void adicionar(Pessoa p){
        pessoas.add(p);
    }

    @Override
    public void remover(Pessoa p){
        pessoas.remove(p);
    }

    @Override
    public List<Pessoa> listarTudo(){
        return pessoas;
    }
}