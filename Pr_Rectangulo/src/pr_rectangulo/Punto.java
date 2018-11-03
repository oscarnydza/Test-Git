/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr_rectangulo;

/**
 *
 * @author oscar
 */

public class Punto {
    private int x;
    private int y;
    //esto es un comentario
    public Punto(int a, int b){
        if(a < 0){
            System.err.println("las coordenadas no pueden ser negativas");
        } else {
            this.x = a;        
        }
        
        if(b < 0){
            System.err.println("las coordenadas no pueden ser negativas");
        } else {
            this.y = b;        
        }    

    }

    public int getX() {
        return x;
    }

    public void setX(int a) {
        if(a < 0){
            System.err.println("las coordenadas no pueden ser negativas");
        } else {
            this.x = a;        
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int b) {
        if(b < 0){
            System.err.println("las coordenadas no pueden ser negativas");
        } else {
            this.y = b;        
        } 
    }
    
    
    @Override
    public String toString(){
        return ("x = " + this.x + ", y = " + this.y);
    }
    
    public Punto desplazarXY(int a, int b){
        this.x += a;
        this.y += b;
        
        if(this.x < 0 || this.y < 0 || ((this.x < 0) && (this.y < 0)) ){
            System.err.println("las coordenadas no pueden ser negativas");
        } else {
            return this;
        }
        return this;
    }   
    
    public boolean esIgual(Punto aux){
        return (this.x == aux.x && this.y == aux.y);
    }
    
    public Punto copia(){
        return new Punto(this.x,this.y);
    }
    
    public boolean estaDebajo(Punto aux){
        return (this.y < aux.y);
    }
    
    public boolean estaDerecha(Punto aux){
        return (this.x > aux.x);
    }
}
