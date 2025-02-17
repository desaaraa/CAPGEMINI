package BBDD.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.*;

public class conexionBBDD {

    public static void main(String[] args) {
        // URL de conexión a Oracle, ajusta el SID según tu configuración
        String url = "jdbc:oracle:thin:@frparccsw:1521/FREEPDB1"; 
        String usuario = "user1";  // Usuario de tu base de datos Oracle
        String contrasena = "user1";  // Contraseña de tu base de datos Oracle

        try {
            // Establecemos la conexión con la base de datos
            Connection con = DriverManager.getConnection(url, usuario, contrasena);
            Statement stmt = con.createStatement();

            // 1. Consultar (SELECT) clientes
            String selectQuery = "SELECT * FROM clientes";
            ResultSet rs = stmt.executeQuery(selectQuery);
            System.out.println("Clientes:");
            while (rs.next()) {
                int id = rs.getInt("id_cliente");
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad);
            }

            // 2. Actualizar la edad de un cliente
            String updateQuery = "UPDATE clientes SET edad = 30 WHERE id_cliente = 2222"; // Cambiar edad de cliente con id 2
            int rowsUpdated = stmt.executeUpdate(updateQuery);
            if (rowsUpdated > 0) {
                System.out.println("Edad del cliente actualizada con éxito.");
            }

            // 3. Eliminar un cliente con un WHERE
            String deleteQuery = "DELETE FROM clientes WHERE id_cliente = 1111"; // Eliminar cliente con id 3
            int rowsDeleted = stmt.executeUpdate(deleteQuery);
            if (rowsDeleted > 0) {
                System.out.println("Cliente eliminado con éxito.");
            }

            // Cerrar ResultSet y la conexión
            rs.close();
            con.close();

        } catch (SQLException e) {
            // Capturamos y mostramos cualquier excepción SQL que ocurra
            System.out.println("Error SQL: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            // Capturamos cualquier otra excepción
            System.out.println("Error inesperado: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
