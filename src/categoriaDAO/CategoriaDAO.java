package categoriaDAO;

import categoria.domain.Categoria;
import categoria.domain.Categoria;
import categoria.domain.Categoria;
import cliente.dao.DataBaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;



public class CategoriaDAO {
    private DataBaseConnection bancoDados;

    public CategoriaDAO() { bancoDados = new DataBaseConnection(); }
	
	public boolean inserirCategoria(Categoria categoria) {
		Connection connection = DataBaseConnection.getConexao();
	    PreparedStatement statement = null;
	    try {
	        statement = connection.prepareStatement("INSERT INTO categoria (nome, endereco)VALUES(?,?)");
	        statement.setInt(1, categoria.getId());
	        statement.setString(2, categoria.getNome());
	        statement.executeUpdate();
	        return true;
	        
	    } catch (SQLException ex) {
	       // JOptionPane.showMessageDialog(null, "Não foi possível cadastrar: " + ex);
	        return false;
	    }
	    finally{
	        DataBaseConnection.fecharConexao(connection, statement);
	    }
        }
        public int buscarIdCategoria() throws SQLException{
            boolean result = false; 
            int idCliente = 0;
            Connection connection = DataBaseConnection.getConexao();
            PreparedStatement statement = null;
            ResultSet rs = null;
            try{
                statement = connection.prepareStatement("SELECT max(id_Categoria) id_Categoria FROM categoria");
                rs = statement.executeQuery(); 
                rs.next();
                idCliente = rs.getInt("id_Categoria");

            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao buscar Id: " + ex);
            }
            finally{

                DataBaseConnection.fecharConexao(connection, statement);
            }
            return idCliente;
        }
	
	public boolean editarCategoria(Categoria categoria) {
		Connection connection = DataBaseConnection.getConexao();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("UPDATE Categoria set nome = ? ,id = ? where id_Categoria = ?");
            statement.setString(1, categoria.getNome());
            statement.setInt(2, categoria.getId());
            statement.setInt(3, categoria.getId());
            statement.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível editar categoria: " + ex);
            return false;
        }
        finally{
            DataBaseConnection.fecharConexao(connection, statement);
        }
		
	}
	public boolean removerCategoria(int id_categoria) {
		Connection connection = DataBaseConnection.getConexao();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("DELETE from Categoria WHERE id_categoria = ?");
            statement.setInt(1, id_categoria);
            statement.executeUpdate();
            return true;          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar categoria: " + ex);
        }
        finally{
            DataBaseConnection.fecharConexao(connection, statement);
        }
        return false;
		
	}
	public ArrayList<Categoria> listaCategorias(String query, String[] args) {
            ArrayList<Categoria> listaCategorias = new ArrayList<Categoria>();
            Connection connection = DataBaseConnection.getConexao();
            PreparedStatement statement = null;
            ResultSet rs = null;
            try {
                statement = connection.prepareStatement("Select * from Categoria");
                rs = statement.executeQuery(); 
                while (rs.next()){
                    Categoria categoria = new Categoria();
                    categoria.setId(rs.getInt("id"));
                    categoria.setNome(rs.getString("nome"));

                    listaCategorias.add(categoria);
                }            
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao buscar categorias: " + ex);
            }
            finally{
                DataBaseConnection.fecharConexao(connection, statement, rs);
            }
            return listaCategorias;
            }
        

}
