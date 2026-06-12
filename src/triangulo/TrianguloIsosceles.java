/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulo;

/**
 *
 * @author isaac
 */
public class TrianguloIsosceles extends Triangulo{
    
    public TrianguloIsosceles(double LadoAB, double LadoC){
        super(LadoAB,LadoAB,LadoC);
    }

    @Override
    protected double CalcularArea(){
        return (LadoC/2)*Math.sqrt(Math.pow(LadoA, 2) - Math.pow(LadoC /2,2));

    }
}
