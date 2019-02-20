package cliente.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataBaseConnection {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
//    private static final String URL = "jdbc:mysql://localhost:3306/locadora?useTimezone=true&serverTimezone=UTC";
    private static final String URL = "jdbc:mysql://localhost:3306/locadorafilmes";
    private static final String USER = "root";
    private static final String PASS = "";
//    private static final String PASS = "pass123";;
    
    
    public static Connection getConexao(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão: ", ex);
        }        
    }
    
    public static void fecharConexao(Connection connection){
        try {
            if (connection != null){
                connection.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void fecharConexao(Connection connection, PreparedStatement statement){
        fecharConexao(connection);
        try {
            if(statement != null){
                statement.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void fecharConexao(Connection connection, PreparedStatement statement, ResultSet resultSet){
        fecharConexao(connection, statement);
        try {
            if(resultSet != null){
                resultSet.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
