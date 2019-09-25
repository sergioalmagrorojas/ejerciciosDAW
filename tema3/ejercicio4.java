public class ejercicio4 {
  public static void main(String[]  args){
    
    
    System.out.println("Introduzca 2 números");
    int a=Integer.parseInt(System.console().readLine());
    int b =Integer.parseInt(System.console().readLine());
    double multiplicacion= a*b;
    double suma=a+b;
    double resta=a-b;
    double division=a/b;
    
     System.out.println("La multiplicación  da : " + multiplicacion);
     System.out.println("La suma  da : " + suma);
     System.out.println("La resta  da : " + resta);
     System.out.println("La division  da : " + division);
  }
}

