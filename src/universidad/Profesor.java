/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Profesor {
    
    private int id;
    String nombre;
    ArrayList<Curso> cursos;

   

    public int getId() {
        return id;
    }

    public Profesor(int id){
        this.id = id;
        cursos = new ArrayList();  
    }
    
    public boolean agregarCurso(Curso curso){
        if (cursos.size() < 10){
            cursos.add(curso);
            return true;
        }
        return false;
    }
    
    public int numeroCursos(int id ,Curso curso){
        return cursos.size();
    }
    
   
}