/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;
import Procesos.*;
import Entidades.*;
import GUI.*;


/**
 *
 * @author roban
 */
public class Factory {
    
    //Instancia de Procesos
    public BaseDatos baseDatos(){
        return new BaseDatos();
    }
    
    //Instancia de Entidades
    public Comentario comentario(int id_restaurante, String usuario, String comentario, int calificacion){
        return new Comentario(id_restaurante, usuario, comentario, calificacion);
    }
    
    public Restaurante restaurante(int id, String nombre, String tipoComida, String direccion, int telefono, String horarios, String propietarios, String coordenadas, Double clasificacion){
        return new Restaurante(id, nombre, tipoComida, direccion, telefono, horarios, propietarios, coordenadas, clasificacion);
    }
    
    public Principal principal(){
        return new Principal();
    }
    
    public ComentariosGUI comentariosForm(int ID_restaurante){
        return new ComentariosGUI(ID_restaurante);
    }
    
}
