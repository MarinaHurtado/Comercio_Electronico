/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.UUID;

/**
 *
 * @author sdist
 */
public class POJO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 100;
        long avg = 0, min = -1, max = -1, sqrt = 0;
        for(int i=0; i<n; i++){
            UUID uuid = UUID.randomUUID();
            String randomUUIDString = uuid.toString();
            long millis = System.currentTimeMillis();
            System.out.println(agregaAlumno(randomUUIDString.substring(0, 9), randomUUIDString.substring(10, 14), randomUUIDString.substring(16, 20), randomUUIDString.substring(26, 30)));
            long time = System.currentTimeMillis() - millis;
            
            if(min == -1)
                min = time;
            else if (min > time)
                min = time;
            
            if(max == -1)
                max = time;
            else if(max < time)
                max = time;
            
            avg += time;
            sqrt += (time*time);
        }
        
        long prom = avg/n;
        float stdv = (sqrt - (n*(prom*prom)))/n;         
        System.out.println("Tiempo primedio total: " + prom + "ms");
        System.out.println("Tiempo mínimo: " + min);
        System.out.println("Tiempo máximo: " + max);
        System.out.println("Desviación estándar: " + stdv);
    }

    private static String agregaAlumno(java.lang.String clave, java.lang.String nombre, java.lang.String apPaterno, java.lang.String apMaterno) {
        serviciosweb.GestorAlumnos_Service service = new serviciosweb.GestorAlumnos_Service();
        serviciosweb.GestorAlumnos port = service.getGestorAlumnosPort();
        return port.agregaAlumno(clave, nombre, apPaterno, apMaterno);
    }
    
    
    
}
