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
public class Thread1 extends Thread {
    Thread1 t1;
    SharedData data;
   
public Thread1(SharedData data) {
  this.data = data;
    }

    @Override
    public void run() {
        while (true){
            if (data.getTotal() < 100 || data.getTotal() > -100) {
                System.out.println("STOP!");
				System.exit(0);
            }
            else{
                data.add(0);
                System.out.println("t1");
            }
             try {
                sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
       
    }


}
