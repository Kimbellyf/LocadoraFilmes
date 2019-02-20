package cliente.dao;

import cliente.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClientePessoaDAO {
    
    public boolean inserirCliente(Cliente cliente){
        Connection connection = DataBaseConnection.getConexao();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("INSERT INTO cliente (nome, endereco)VALUES(?,?)");
            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getEndereco());
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
    
    public boolean verificarCpfBD(String cpf){
        boolean result = false; 
        Connection connection = DataBaseConnection.getConexao();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("SELECT * FROM pessoa_fisica WHERE cpf ='" + cpf + "'");
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
                result = true;
            }            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao validar CPF: " + ex);
        }
        finally{
            DataBaseConnection.fecharConexao(connection, statement);
        }
        return result;
    }
    
    
    public int buscarIdCliente() throws SQLException{
        boolean result = false; 
        int idCliente = 0;
        Connection connection = DataBaseConnection.getConexao();
        PreparedStatement statement = null;
        ResultSet rs = null;
        try{
            statement = connection.prepareStatement("SELECT max(id_Cliente) id_Cliente FROM cliente");
            rs = statement.executeQuery(); 
            rs.next();
            idCliente = rs.getInt("id_Cliente");
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Id: " + ex);
        }
        finally{
            DataBaseConnection.fecharConexao(connection, statement);
        }
        return idCliente;
    }
    
    public boolean inserirPFisica(int idCliente, PessoaFisica pessoa){
        Connection connection = DataBaseConnection.getConexao();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("INSERT INTO pessoa_fisica (Id_Cliente, sexo, data_nascimento, cpf)VALUES(?,?,?,?)");
            statement.setInt(1, idCliente);
            statement.setString(2, pessoa.getSexo());
            statement.setString(3, pessoa.getDataNascimento());
            statement.setString(4, pessoa.getCpf());
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
    
    
    public PessoaFisica buscarPessoaFisica(String cpf){
        PessoaFisica pessoa = new PessoaFisica();
        Connection connection = DataBaseConnection.getConexao();
        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = connection.prepareStatement("Select * from pessoa_fisica where cpf = '" + cpf + "'");
            rs = statement.executeQuery(); 
            if (rs.next()){
                pessoa.setId(rs.getInt("Id_Cliente"));
                pessoa.setDataNascimento(rs.getString("data_nascimento"));
                pessoa.setSexo(rs.getString("sexo"));
                pessoa.setCpf(rs.getString("cpf"));
            }
            else{
                return null;
            }

            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar pessoa: " + ex);
        }
        finally{
            DataBaseConnection.fecharConexao(connection, statement, rs);
        }
        return pessoa;
    }
    
    public Cliente buscarCliente(int id){
        Cliente cliente = new Cliente();
        Connection connection = DataBaseConnection.getConexao();
        PreparedStatement statement = null;
        ResultSet rs = null;
        try{
            statement = connection.prepareStatement("Select * from cliente where id_Cliente = '" + id + "'");
            rs = statement.executeQuery(); 
                rs.next();
                cliente.setId(rs.getInt("id_Cliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEndereco(rs.getString("endereco"));
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente: " + ex);
        }
        finally{
            DataBaseConnection.fecharConexao(connection, statement, rs);
        }
        return cliente;
    }
    
    public boolean deletarPessoaFisica(int id){
        Connection connection = DataBaseConnection.getConexao();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("Delete from pessoa_fisica where Id_Cliente = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar pessoa: " + ex);
        }
        finally{
            DataBaseConnection.fecharConexao(connection, statement);
        }
        return false;
    }

  
    
    public boolean deletarCliente(int id){
        Connection connection = DataBaseConnection.getConexao();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("Delete from cliente where id_Cliente = ?");
            statement.setInt(1, id);
            statement.executeUpdate();
            return true;          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar cliente: " + ex);
        }
        finally{
            DataBaseConnection.fecharConexao(connection, statement);
        }
        return false;
    }
    
    public boolean verificarCnh(int cnh){
        boolean result = false; 
        Connection connection = DataBaseConnection.getConexao();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("SELECT * FROM motorista WHERE cnh ='" + cnh + "'");
            ResultSet rs = statement.executeQuery();
            if(rs.next()){
                result = true;
            }            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar CNH: " + ex);
        }
        finally{
            DataBaseConnection.fecharConexao(connection, statement);
        }
        return result;
    }
    
    
    public boolean editarCliente(Cliente cliente){
        Connection connection = DataBaseConnection.getConexao();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("UPDATE cliente set nome = ? ,endereco = ? where id_Cliente = ?");
            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getEndereco());
            statement.setInt(3, cliente.getId());
            statement.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível editar cliente: " + ex);
            return false;
        }
        finally{
            DataBaseConnection.fecharConexao(connection, statement);
        }
    }
        
    public boolean editarPFisica(int idCliente, PessoaFisica pessoa){
        Connection connection = DataBaseConnection.getConexao();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("UPDATE pessoa_fisica set data_nascimento = ?, cpf = ?, sexo = ? where Id_Cliente = ?");
            statement.setString(1, pessoa.getDataNascimento());
            statement.setString(2, pessoa.getCpf());
            statement.setString(3, pessoa.getSexo());
            statement.setInt(4, idCliente);
            statement.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível editar pessoa física: " + ex);
            return false;
        }
        finally{
            DataBaseConnection.fecharConexao(connection, statement);
        }
    }
    
}
