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
public class Alumno {
    private String nome;
    private int nota;
    
    public void darNota(int not) {
        nota = not;
    }
    public int devolverNota(){
        return nota;
    }
}
