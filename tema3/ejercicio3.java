public class ejercicio3 {
  public static void main(String[]  args){
    
    
    System.out.println("Que cantidad desea convertir?\n");
    int pesetas=Integer.parseInt(System.console().readLine());
    double euros=pesetas / 166;
    
    
     System.out.println("La conversión da : " + euros + " euro/os");
  }
}
