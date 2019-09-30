/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzy_octo_computing_machine;

/**
 *
 * @author mohssine.elarfaoui
 */
public class Prime_Test {
    private double num;
    
    public Prime_Test(double n){
        this.num=n;
    }
    
    public boolean Primo(){
        boolean tmp=true;
        for(double i=num-1;i>1;i--){
            if(num%i==0){
                tmp=false;
            }
        }
        return tmp;
    }
}
