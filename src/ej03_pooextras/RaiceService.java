package ej03_pooextras;

import java.util.Scanner;

public class RaiceService {
    Scanner leer = new Scanner(System.in);
    public Raices crearEcuacion(){
        Raices ra = new Raices();
        System.out.println("Ingrese termino A: ");
        ra.setA(leer.nextFloat());
        System.out.println("Ingrese termino B: ");
        ra.setB(leer.nextFloat());
        System.out.println("Ingrese termino C: ");
        ra.setC(leer.nextFloat());
        
        return ra;
    }
    
    /*
    Método getDiscriminante(): devuelve el valor del discriminante (double). 
    El discriminante tiene la siguiente formula: (b^2)-4*a*c
    */
    public double getDiscriminante(Raices ra){
        double valor = ((ra.getB() * ra.getB())- 4*ra.getA()*ra.getC());
//        boolean varlorRecuperado = tieneRaices(ra);
        return valor;
    }

    /*
    Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
    que esto ocurra, el discriminante debe ser mayor o igual que 0.
    */
    public boolean tieneRaices(Raices ra){
//        double valor1 = (-ra.getB()+ Math.sqrt((ra.getB()*ra.getB())-(4*ra.getA()*ra.getC()))/(2*ra.getA()));
//        double valor2 = (-ra.getB()- Math.sqrt((ra.getB()*ra.getB())-(4*ra.getA()*ra.getC()))/(2*ra.getA()));
        
          double valor1 = ra.getB()*3;
          double valor2 = ra.getC() *1;
            
        calcularMayor(valor1, valor2, ra);
        
        System.out.println("La 1er raiz es: " + valor1 + "\n La 2da raíz es: " + valor2 + "\n");
        return (valor1 >= 0 && valor2 >= 0);
    }
    public void calcularMayor(double a, double b, Raices fabri){
        if (a > b) {
            System.out.println("El mayor valor es: " + a);
        }else 
            System.out.println("El mayor valor es: " + b);
        System.out.println("Los valores son: " + fabri);
    }
}
