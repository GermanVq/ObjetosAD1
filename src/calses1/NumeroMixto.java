/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calses1;

/**
 *
 * @author Lenovo
 */
public class NumeroMixto {
    
    private int numerador;
    private int denominador;
    private int entera;
    
    public NumeroMixto (  int Numerador , int Denominador , int Entera){
        this.denominador = Denominador;
        this.numerador = Numerador;
        this.entera = Entera;
       
       
        
    }

    public NumeroMixto(int nu, int de) {
        
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int Numerador) {
        this.numerador = Numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenomiador(int Denominador) {
        this.denominador = Denominador;
    }

    public int getEntera() {
        return entera;
    }

    public void setEntera(int Entera) {
        this.entera = Entera;
    }
    public NumeroMixto Numeromixto (){
        int num , den , ent;
        NumeroMixto m;
        
       
        den = this.denominador;
        ent = this.numerador / this.denominador;
        num = this.numerador - (this.denominador*ent);
        
        m = new NumeroMixto ( num , den , ent);
        return m;
        
    }
    
}
