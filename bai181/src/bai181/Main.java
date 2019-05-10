/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai181;

/**
 *
 * @author phamt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Data data = new Data();
        Thread1 t1 = new Thread1(data);
        Thread t2 = new Thread2(data);
        t1.start();
        t2.start();
    }
    
}
