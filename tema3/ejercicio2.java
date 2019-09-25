public class ejercicio2 {
  public static void main(String[]  args){
    
    
    System.out.println("Que cantidad desea convertir?\n");
    int euros=Integer.parseInt(System.console().readLine());
    double pesetas=euros * 166;
    
    
     System.out.println("La conversión da : " + pesetas + " peseta/as");
  }
}

