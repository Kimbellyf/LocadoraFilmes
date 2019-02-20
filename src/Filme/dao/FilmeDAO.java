/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filme.dao;

import Filme.model.Filme;
import cliente.dao.DataBaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Kimbelly
 */
public class FilmeDAO {
    public boolean inserirFilme(Filme filme) {
	Connection connection = DataBaseConnection.getConexao();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("INSERT INTO Filme (nome, id_filme )VALUES(?,?)");
            statement.setString(1, filme.getNome());
            statement.setInt(2, filme.getId());
            statement.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível cadastrar: " + ex);
            return false;
        }
        finally{
            DataBaseConnection.fecharConexao(connection, statement);
        }
    }
    public int buscarIdFilme() throws SQLException{
        boolean result = false; 
        int idFilme = 0;
        Connection connection = DataBaseConnection.getConexao();
        PreparedStatement statement = null;
        ResultSet rs = null;
        try{
            statement = connection.prepareStatement("SELECT max(id_filme) id_filme FROM Filme");
            rs = statement.executeQuery(); 
            rs.next();
            idFilme = rs.getInt("id_filme");

        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Id: " + ex);
        }
        finally{
            DataBaseConnection.fecharConexao(connection, statement);
        }
        return idFilme;
    } 
    public boolean editarFilme(Filme filme) {
        Connection connection = DataBaseConnection.getConexao();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("UPDATE Filme set nome = ? ,id = ? where id_filme = ?");
            statement.setString(1, filme.getNome());
            statement.setInt(2, filme.getId());
            statement.executeUpdate();
            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível editar filme: " + ex);
            return false;
        }
        finally{
            DataBaseConnection.fecharConexao(connection, statement);
        }

    }
    public boolean removerFilme(int id_filme) {
        Connection connection = DataBaseConnection.getConexao();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("DELETE from Filme WHERE id_filme = ?");
            statement.setInt(1, id_filme);
            statement.executeUpdate();
            return true;          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar Filme " + ex);
        }
        finally{
            DataBaseConnection.fecharConexao(connection, statement);
        }
        return false;

    }
    public ArrayList<Filme> listaFilmes() {
        ArrayList<Filme> listaFilmes = new ArrayList<Filme>();
        Connection connection = DataBaseConnection.getConexao();
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = connection.prepareStatement("Select * from Filme");
            rs = statement.executeQuery(); 
            while (rs.next()){
                Filme filme = new Filme();
                filme.setId(rs.getInt("id"));
                filme.setNome(rs.getString("nome"));

                listaFilmes.add(filme);
            }            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar filmes: " + ex);
        }
        finally{
            DataBaseConnection.fecharConexao(connection, statement, rs);
        }
        return listaFilmes;
        }
}
