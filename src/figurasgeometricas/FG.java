/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author isaac
 */
public abstract class FG {

    public double getPerimetro() {
        return this.CalcularPerimetro();
    }

    public double getArea() {
        return this.CalcularArea();
    }
    
    
    protected abstract double CalcularPerimetro();
    
    protected abstract double CalcularArea();
    
}
