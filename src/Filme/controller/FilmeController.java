/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filme.controller;

import Filme.dao.FilmeDAO;
import Filme.model.Filme;

/**
 *
 * @author Kimbelly
 */
public class FilmeController {
    public boolean cadastrarFilme(Filme filme){
        FilmeDAO dao = new FilmeDAO();
        return dao.inserirFilme(filme);
       
    }
    public Filme buscarFilme(String nome){
        FilmeDAO dao = new FilmeDAO();
        return dao.buscarFilme(nome);
    }
    public Filme buscarFilme(int idFilme){
        FilmeDAO dao = new FilmeDAO();
        return dao.buscarFilme(idFilme);
    }
    
    public boolean isFilmeCadastrado(String nome){
        FilmeDAO dao = new FilmeDAO();
        return dao.isFilmeCadastrado(nome);
    }
    
    public void deletarFilme(String nome){
        FilmeDAO dao = new FilmeDAO();
        dao.deletarFilme(nome);
    }
    public void deletarFilme(int idfilme){
        FilmeDAO dao = new FilmeDAO();
        dao.deletarFilme(idfilme);
    }
    
    public String getTipoVeiculo(String tipo){
        FilmeDAO dao = new FilmeDAO();
        return dao.getTipo(tipo);
        
    }
    public void updateFilme(int id, String nome){
        FilmeDAO dao = new FilmeDAO();
        Revisao revisao = new Revisao();
        dao.updateRevisao(placa, data);
        dao.revisao(revisao);
    }
   
}
