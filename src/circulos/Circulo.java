/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulos;
import figurasgeometricas.FG;
/**
 *
 * @author isaac
 */
public class Circulo extends FG {
    private double radio;
    private static final double PI=Math.PI;

    public double getRadio() {
        return this.radio;
    }
    
    public double getDiametro(){
        return this.radio*2;
    }
    
    public static double getPI(){
        return PI;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
   
    
    @Override
    public double CalcularPerimetro(){
        this.perimetro=2*radio*PI;
        return perimetro;
    }
    
    
    @Override
    public double CalcularArea(){
        this.area=Math.pow(radio, 2)*PI;
        return area;
    }
    
    
    
    
}
