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
    protected double perimetro;
    protected double area;

    public double getPerimetro() {
        return this.perimetro;
    }

    public double getArea() {
        return this.area;
    }
    
    
    public abstract double CalcularPerimetro();
    
    public abstract double CalcularArea();
    
}
