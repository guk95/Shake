/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana.pkg7;

/**
 *
 * @author laboratorio
 */
public class Semana7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        System.out.println(lista.toString());
        lista.shake(5);
        System.out.println(lista.toString());

    }

}
