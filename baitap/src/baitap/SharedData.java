/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

/**
 *
 * @author phamt
 */
public class SharedData {

    static int getTotal() {
        return 0;
       
    }
    int total;
    public SharedData(){
        
    }
    public int getTatol(){
        return total;
    }
    public void setTotal(int toatl){
        this.total=total;
        
    }
    static int x=0;
    public synchronized void add(int x){
        total=total+x;
    }
}
