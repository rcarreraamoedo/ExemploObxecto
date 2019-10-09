/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploobxecto;

/**
 *
 * @author rcarreraamoedo
 */
public class ExemploObxecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instanciamos un obxectos
        Alumno pepito = new Alumno();
        pepito.darNota(7);
        int valorNota=pepito.devolverNota();
        System.out.println("Pepito ten un "+valorNota);
    }
    
}
