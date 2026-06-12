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
    

    public double getRadio(){
        return this.radio;
    }
    
    public double getDiametro(){
        return CalcularDiametro();
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
    
    private double CalcularDiametro(){
        return 2*radio;
    }
   
    
    @Override
    protected double CalcularPerimetro(){
        return 2*radio*PI;
    }
    
    
    @Override
    protected double CalcularArea(){
        return Math.pow(radio, 2)*PI;
    }
   
}
