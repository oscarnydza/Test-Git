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
public class Pr_Rectangulo {
    private Punto inf_izd;
    private Punto sup_der;
    
///////////////CONSTRUCTOR//////////   
    
    public Pr_Rectangulo(){
        this.inf_izd.setX(0);
        this.inf_izd.setY(0);
        
        this.sup_der.setX(0);
        this.sup_der.setY(0);
    }
    
    public Pr_Rectangulo(int altura, int anchura){
        this.inf_izd.setX(0);
        this.inf_izd.setY(0);
        
        this.sup_der.setX(anchura);
        this.sup_der.setY(altura);
    }
    
    public Pr_Rectangulo(Punto aux_izd, Punto aux_der){
        this.inf_izd = aux_izd;
        this.sup_der = aux_der;
    }
    
    public Pr_Rectangulo(Pr_Rectangulo aux){
        this.inf_izd = aux.inf_izd;
        this.sup_der = aux.sup_der;
    }
/////////////////GET & SET/////////////////
    
    public Punto getInf_izd() {
        return inf_izd;
    }

    public void setInf_izd(Punto aux_izd) {
        this.inf_izd = aux_izd;
    }

    public Punto getSup_der() {
        return sup_der;
    }

    public void setSup_der(Punto aux_der) {
        this.sup_der = aux_der;
    }
///////////////METODOS//////////////
    @Override
    public String toString(){
        return ("Inferior izquierdo = [" + this.inf_izd.getX() + "," + this.inf_izd.getY() + "]. Superior Derecho = [" + this.sup_der.getX() + "," + this.sup_der.getY() + "]");
    }
    
    public float base(){
        return Math.abs(this.inf_izd.getY() - this.sup_der.getY());
    }
    
    public float altura(){
        return Math.abs(this.inf_izd.getX() - this.sup_der.getX());
    }
    
    public float area(){
        return this.base() * this.altura();
    }
    
    public boolean esIgual(Pr_Rectangulo aux){
        return (this.inf_izd == aux.inf_izd && this.sup_der == aux.sup_der);
    }
    
    public Pr_Rectangulo desplazarX(int aux){
        this.inf_izd.setX(this.inf_izd.getX() + aux);
        this.sup_der.setX(this.sup_der.getX() + aux);
        return this;
    }
    
    
    
    
    
    public static void main(String[] args) {
        

    }
    
}
