/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
 */
package ej03_pooextras;


public class Ej03_POOextras {

    public static void main(String[] args) {
      
        RaiceService rs = new RaiceService ();
        Raices r = rs.crearEcuacion();

//        rs.getDiscriminante(r);
        boolean resultado = rs.tieneRaices(r);
        double discri = rs.getDiscriminante(r);
        System.out.println("La respuesta es: " + resultado);
        System.out.println("El valor discriminante es: " + discri);
    }
    
}
