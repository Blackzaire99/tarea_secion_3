public class Main {
    public static void main(String[] args) {

      suma(10,30, 5);

   }
    public static int suma(int a, int b, int c) {
        int resultado;
        resultado  =  a + b+ c;

      System.out.println(resultado);
   }
}

public class Main {

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.PonerPuertas();
        System.out.println(miCoche.puertas);
    }
    public static int suma(int a, int b){
        return a + b;
    }
}

class Coche {
    public int puertas = 0;
    public void PonerPuertas() {
        this.puertas++;
    }
}


