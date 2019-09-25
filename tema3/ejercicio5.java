public class ejercicio5 {
  public static void main(String[]  args){
    
    
    double base;
    double altura;
    String linea;
    
    
    System.out.println("Introduzca la base");
    linea=System.console().readLine();
    base=Integer.parseInt(linea);
    
    System.out.println("Introduzca la altura");
    linea=System.console().readLine();
    altura=Integer.parseInt(linea);
    
    double area= base*altura;
    
     System.out.println("El área del rectángulo es : " + area);
  }
}
