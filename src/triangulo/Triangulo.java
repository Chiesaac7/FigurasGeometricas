/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulo;
import figurasgeometricas.FG;
/**
 *
 * @author isaac
 */

public abstract class Triangulo extends FG{
    protected double LadoA;
    protected double LadoB;
    protected double LadoC;

    public double getLadoA() {
        return LadoA;
    }

    public double getLadoB() {
        return LadoB;
    }

    public double getLadoC() {
        return LadoC;
    }

    public void setLadoA(double LadoA) {
        this.LadoA = LadoA;
    }

    public void setLadoB(double LadoB) {
        this.LadoB = LadoB;
    }

    public void setLadoC(double LadoC) {
        this.LadoC = LadoC;
    }

    public Triangulo(double LadoA, double LadoB, double LadoC) {
        this.LadoA = LadoA;
        this.LadoB = LadoB;
        this.LadoC = LadoC;
    }

    
    @Override
    protected double CalcularPerimetro(){
        return LadoA+LadoB+LadoC;
    }
    
}
