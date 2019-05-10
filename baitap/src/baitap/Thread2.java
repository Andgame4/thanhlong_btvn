/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phamt
 */
public class Thread2 extends Thread {
    Thread2 t2;
     SharedData data;
   
    public Thread2(SharedData data) {
 this.data = data;
    }
   
     @Override
    public void run() {
        while (true) {
            
             if(data.total <=-100 || data.total >=100){
                 System.out.println("STOP!");
				System.exit(0);
             }else{
                 
            data.add(100);
                 System.out.println("t2");
             }
            try {
                sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}

