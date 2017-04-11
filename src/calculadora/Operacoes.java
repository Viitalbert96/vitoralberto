/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Vitor
 */
public class Operacoes {
    double x;
    double y;
    
    public Operacoes(){
        this.x = 0;
        this.y = 0;
               
        
    }
    public double adicao(){        
    return this.x+this.y;
    }
    
    public double subtracao(){        
    return this.x-this.y;
    }
    public double multplicacao(){    
    return this.x*this.y;
    }    
    public double divisao(){
    return this.x/this.y;
    }
    
    
    
    
    
}
