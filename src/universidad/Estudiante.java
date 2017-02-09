package universidad;

import java.util.ArrayList;


public class Estudiante {
    int cod;
    String nombre;
    ArrayList<Curso> cursos;

    

    public int getCod() {
        return cod;
    }
    
    public Estudiante(int cod) {
        this.cod=cod;
        cursos = new ArrayList();
    }
    
    public void agregarCurso(Curso curso){
        cursos.add(curso);
    }
    
    
}