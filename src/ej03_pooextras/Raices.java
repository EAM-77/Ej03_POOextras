
package ej03_pooextras;

public class Raices {
    
    // Atributos
    float a, b, c;
    
    // Constructores

    public Raices() {
    }

    public Raices(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    // Getter & Setter

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Raices{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
}
