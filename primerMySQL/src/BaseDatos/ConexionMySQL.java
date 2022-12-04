/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseDatos;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author alela
 */
public class ConexionMySQL {
    public String bd = "usuarios";
    public String login = "root";
    public String password = "";
    public String url = "jdbc:mysql://localhost/" + bd;

    public Connection conectar() {
        Connection link = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            link = DriverManager.getConnection(this.url, this.login,this.password);
            JOptionPane.showMessageDialog(null,"Conexión establecida");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return link;
    }
}
