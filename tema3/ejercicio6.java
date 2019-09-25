public class ejercicio6 {
  public static void main(String[]  args){
    
    
    System.out.println("Introduzca la base");
    int a=Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca la altura");
    int b =Integer.parseInt(System.console().readLine());
    int area= (a*b)/2;
    
     System.out.println("El área es : " + area);
  }
}
