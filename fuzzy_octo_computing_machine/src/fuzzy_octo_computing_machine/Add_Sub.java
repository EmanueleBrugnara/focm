/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzy_octo_computing_machine;

/**
 *
 * @author matteo.lorenzini
 */
public class Add_Sub {
    int n1;
    int n2;
    
    public Add_Sub(int n1, int n2){
        this.n1=n1;
        this.n2=n2;
    }
    
    public int Add(int n1, int n2){
        return n1+n2;
    }
    
    public int Sub(int n1, int n2){
        return n1-n2;
    }
   
}
