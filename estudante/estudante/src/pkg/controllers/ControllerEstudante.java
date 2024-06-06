package pkg.controllers;

import pkg.EstudanteFactory;
import pkg.models.Estudante;
import pkg.views.iView;
import pkg.views.ViewConsole;

public class ControllerEstudante {
    private Estudante modeloEstudante = EstudanteFactory.criarEstudante(); 
    private iView view = new ViewConsole();

    public int getCodigo(){
        return modeloEstudante.getCodigo();
    }

    public String getNome(){
        return modeloEstudante.getNome();
    }

    public void setCodigo(int codigo){
        modeloEstudante.setCodigo(codigo);
    }

    public void setNome(String nome){
        modeloEstudante.setNome(nome);
    }

    public void visualizarDelalhes(){
        view.visualizarDelalhes(modeloEstudante.getCodigo(), modeloEstudante.getNome());
        //System.out.println("Codigo: ", modeloEstudante.getCodigo(), "");
    }
}
