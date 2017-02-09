/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Universidad {

    ArrayList<Curso> cursos;
    ArrayList<Profesor> profesores;
    ArrayList<Estudiante> estudiantes;
    
    
    public Universidad(){
      cursos = new ArrayList<>();  
      profesores = new ArrayList<>();
      estudiantes = new ArrayList<>();
    }
    
    Scanner leer = new Scanner(System.in);
    
    public void agregarProfesor(){
        boolean continuar = true;
        int codigo, opc;
        String nombre;
        while (continuar) {          
            System.out.println("Digite el codigo del profesor");
            codigo = leer.nextInt();
            Profesor i = new Profesor(codigo);
            profesores.add(i);
            System.out.println("Desea continuar(1 YES/0 NO)");
            opc = leer.nextInt();
            if (opc==0) {
                continuar = false;
//                if (profesores.size()==1) {
//                    System.out.println("Hay " + profesores.size()+ " Profesor");
//                }
//                else
//                {
//                    System.out.println("Hay " + profesores.size()+ " Profesores");
//                }
            }
        }
    }
    
    public void agregarEstudiante(){
//       Estudiante e1 = new Estudiante(0101);
//       estudiantes.add(e1);
        boolean continuar = true;
        int codigo, opc;
        String nombre;
        while (continuar) {          
            System.out.println("Digite el codigo del Estudiante");
            codigo = leer.nextInt();
            Estudiante i = new Estudiante(codigo);
            estudiantes.add(i);
            System.out.println("Desea continuar(1 YES/0 NO)");
            opc = leer.nextInt();
            if (opc==0) {
                continuar = false;
//                if (profesores.size()==1) {
//                    System.out.println("Hay " + profesores.size()+ " Profesor");
//                }
//                else
//                {
//                    System.out.println("Hay " + profesores.size()+ " Profesores");
//                }
            }
        }
    }    
    
    public void agregarCurso(){
        Curso c = new Curso(10);
        cursos.add(c);
    }
    
    public void registrarProfesorCurso(Profesor p, Curso c){
       p.cursos.add(c);
       c.setProfesor(p);
    }
     public void registrarEstudiantesCurso(Estudiante e, Curso c){
       e.cursos.add(c);
       c.setEstudiantes(e);
    }
  
    
    
    public static void main(String[] args) {
        int apc;
        do {
            
        
        
       System.out.println("Menu");
       System.out.println("Agregar profesor 1");
       System.out.println("Agregar estudiante 2");
       System.out.println("Agregar curso 3");
       System.out.println("Asignar curso a profesor 4");
       System.out.println("Asignar estudiante a curso 5");
       System.out.println("Cuantos cursos tiene cada profesor 6");
       System.out.println("Cuantos cursos tiene cada estudiante 7");
       System.out.println("Lista de estudiantes por curso 8");
       System.out.println("SALIR 0");
       Scanner leeer=new Scanner(System.in);
        apc=leeer.nextInt();
       
       Universidad universidad = new Universidad();
        switch (apc) {
            case 1:
                universidad.agregarProfesor();
                break;
            case 2:
                universidad.agregarEstudiante();
                break;
            case 3:
                universidad.agregarCurso();
                break;
            case 4:
                System.out.println("Digite el codigo del profesor");
                int codigo=leeer.nextInt();
                System.out.println("Digite el nrc del curso");
                int nrc=leeer.nextInt();
//                universidad.registrarProfesorCurso(p, c);
                Profesor p = new Profesor(codigo);
                Curso cu = new Curso (nrc);
                universidad.registrarProfesorCurso(p, cu);
                break;
            case 5:
                System.out.println("Ingrese Codigo del estudiante");
                int id = leeer.nextInt();
                Estudiante e = new Estudiante(id);
                
                break;
            case 6:
                System.out.println("");
                break;
            case 7:
                
                break;
            case 8:
                
                break;
            case 0:   
                
                break;
            default:
               
        }} while (apc !=0);
       
       
       
    }
    
}