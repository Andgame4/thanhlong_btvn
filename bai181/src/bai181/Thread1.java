/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai181;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phamt
 */
public class Thread1 extends Thread{
     Data data;

    public Thread1(Data data) {
        this.data = data;
    }
    Random rd = new Random(26);
    @Override
    public void run() {
       while(true){
           synchronized(data){
               int rdnumber = rd.nextInt();
               data.c = (char) (rdnumber +'a');
               System.out.println(""+data.c);
               data.notifyAll();
               try {
                   data.wait();
               } catch (InterruptedException ex) {
                   Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
               }
               
               try {
                   sleep(2000);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
               }
;
           }
       }
    }
    
}
