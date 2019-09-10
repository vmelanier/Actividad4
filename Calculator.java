import java.util.Scanner;
 class Calculator {
     private static float n1;
     private static float n2;
     private static float suma;
     private static float resta;
     private static float multiplicacion;
     private static float division;
     private static float modulo;

    public static void leenum(){
        Scanner input = new Scanner (System.in);
        System.out.println("Digita numero 1:"); 
        n1 = input.nextInt();
        
        System.out.println("Digita numero 2"); 
        n2 = input.nextInt();
            
    }
    public static void sum(){
        suma = n1+n2;
        System.out.println("El Resultado de la Suma es :" + suma);

    }
    public static void rest(){
        resta = n1-n2;
        System.out.println("El Resultado de la Resta :" + resta);
    }
    public static void mult(){
        multiplicacion = n1*n2;
        System.out.println("El Resultado de la Multiplicacion es :" + multiplicacion);

    }
    public static void divi(){
        division = n1/n2;
        System.out.println("El Resultado de la Division es :" + division);

    }
    public static void mod(){
        modulo = n1%n2;
        System.out.println("El Resultado del Modulo es :" + modulo);

    }
    public static void main(String[]args) {

            leenum();
            sum();
            rest();
            mult();
            divi();
            mod();
    
    }
}