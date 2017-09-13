/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author sdist
 */
public class POJO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(agregaAlumno("124", "Paloma", "L", "G"));
    }

    private static String agregaAlumno(java.lang.String clave, java.lang.String nombre, java.lang.String apPaterno, java.lang.String apMaterno) {
        serviciosweb.GestorAlumnos_Service service = new serviciosweb.GestorAlumnos_Service();
        serviciosweb.GestorAlumnos port = service.getGestorAlumnosPort();
        return port.agregaAlumno(clave, nombre, apPaterno, apMaterno);
    }
    
    
    
}
