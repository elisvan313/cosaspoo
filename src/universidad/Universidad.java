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
       Estudiante e1 = new Estudiante(0101);
       estudiantes.add(e1);
    }
    
    public void agregarCurso(){
        Curso c = new Curso(10);
        cursos.add(c);
    }
    
    public void registrarProfesorCurso(Profesor p, Curso c){
       p.cursos.add(c);
       c.setProfesor(p);
    }
    
   public static void menu (){

   }
    
    
    
    public static void main(String[] args) {
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
       int apc=leeer.nextInt();
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
                int p=leeer.nextInt();
                System.out.println("Digite el nrc del curso");
                int c1=leeer.nextInt();
//                universidad.registrarProfesorCurso(p, c);
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:
                
                break;
            case 8:
                
                break;
            case 0:   
                
                break;
            default:
                throw new AssertionError();
        }
       
       
       
    }
    
}