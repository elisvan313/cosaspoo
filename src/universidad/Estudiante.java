package universidad;

import java.util.ArrayList;


public class Estudiante {
    int cod;
    String nombre;
    ArrayList<Curso> cursos;

    

    public Estudiante(int cod) {
        this.cod = cod;
        cursos = new ArrayList();
    }
    
   
 public boolean agregarCurso(Curso curso){
        if (cursos.size() < 10){
            cursos.add(curso);
            return true;
        }
        return false;
    }    
    
}