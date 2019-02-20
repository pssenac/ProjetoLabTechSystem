
package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexaoBD {
    public Connection connection = null;
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String DBNAME = "dbsistema";
    private final String URL = "jdbc:mysql://localhost:3306/" + DBNAME;
    private final String LOGIN = "root";
    private final String SENHA = "senac";
    
    
   public boolean getConnection(){
        try{
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, LOGIN, SENHA);
            //JOptionPane.showMessageDialog(null, "Conectou");
            return true;
        }catch(ClassNotFoundException erro){
            JOptionPane.showMessageDialog(null, "Driver não encontrado:\n"
                    + erro.toString());
            return false;
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "problemas na conexão com a"
                    + " fonte de dados:\n" + erro);
            return false;
        }
       
    }
    public void close(){
        try{
            connection.close();
            //JOptionPane.showMessageDialog(null, "Desconectou");
        }catch(SQLException erro){}
    }
    
    
    
    
    
}
