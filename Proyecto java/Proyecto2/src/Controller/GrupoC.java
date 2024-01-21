/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.GrupoM;
import java.sql.ResultSet;

public class GrupoC {

    public void Agregar(int numeroGrupo) {
        //Objeto del modelo
        GrupoM grupoM = new GrupoM();
        grupoM.setNumeroGrupo(numeroGrupo);
        grupoM.Agregar();
    }

    public void Modificar(int id, int nuevoNumeroGrupo) {
        // Objeto del modelo
        GrupoM grupoM = new GrupoM();
        grupoM.setNumeroGrupo(nuevoNumeroGrupo);
        grupoM.Modificar();
    }
}
