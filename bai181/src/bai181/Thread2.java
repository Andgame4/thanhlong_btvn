/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai181;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phamt
 */
public class Thread2 extends Thread {

    public Thread2(Data data) {
        this.data = data;
    }
    
    Data data;

    @Override
    public void run() {
        while(true){
            synchronized(data){
                data.c = (char)(data.c -32);
                data.notifyAll();
                try {
                    data.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Thread2.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    }
    }
}
