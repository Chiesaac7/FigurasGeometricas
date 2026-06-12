/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulo;

/**
 *
 * @author isaac
 */
public class TrianguloEscaleno extends Triangulo{
    
    
    
    public TrianguloEscaleno(double LadoA, double LadoB, double LadoC){
        super(LadoA, LadoB, LadoC);
    }
    
    private double CalcularSemiperimetro(){
        return getPerimetro()/2;
    }

    @Override
    protected double CalcularArea() {
        double S=CalcularSemiperimetro();
        return Math.sqrt(S*(S-LadoA)*(S-LadoB)*(S-LadoC));
    }
    
}
