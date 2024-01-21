/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Conexion.Conexion;
import Interface.CRUD;
import java.sql.ResultSet;

public class GrupoM implements CRUD {

    Conexion conn = new Conexion();
    private int numeroGrupo;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getNumeroGrupo() {
        return numeroGrupo;
    }

    public void setNumeroGrupo(int numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }
    
    @Override
    public void Agregar() {
        // Establecer la conexión
        conn.conectar();

        // Puedes realizar operaciones en la base de datos aquí, por ejemplo:
        String sql = "INSERT INTO grupo (numero_grupo) VALUES (" + this.getNumeroGrupo() + ")";

        conn.ejecutarUpdate(sql);

        // Cerrar la conexión
        conn.cerrarConexion();
    }

    @Override
    public void Modificar() {
        // Establecer la conexión
        conn.conectar();

        // Puedes realizar operaciones en la base de datos aquí, por ejemplo:
        String sql = "UPDATE grupo SET numero_grupo = " + this.getNumeroGrupo() + " WHERE id = "+ this.getId();

        conn.ejecutarUpdate(sql);

        // Cerrar la conexión
        conn.cerrarConexion();

    }

    @Override
    public void Eliminar() {
        // Establecer la conexión
        conn.conectar();

        // Puedes realizar operaciones en la base de datos aquí, por ejemplo:
        String sql = "DELETE from grupo WHERE id = "+ this.getId();

        conn.ejecutarUpdate(sql);

        // Cerrar la conexión
        conn.cerrarConexion();
    }

    @Override
    public Object Consultar() {
        // Establecer la conexión
        conn.conectar();

        // Realizar una consulta y obtener datos
        ResultSet resultSet = conn.ejecutarQuery("SELECT * FROM grupo");

        // Cerrar la conexión
        conn.cerrarConexion();

        return resultSet;
    }

    @Override
    public Object ConsultarId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
