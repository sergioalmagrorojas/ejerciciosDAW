public class ejercicio7 {
  public static void main(String[]  args){
    
    
    
    
     System.out.println("Introduzca el precio sin iva del producto : " );
     double base=Double.parseDouble(System.console().readLine());
     
     
     System.out.println("Precio sin iva : " + base);
     System.out.println("IVA : " + base*0.21);
     System.out.println("Total : " + base*1.21);
  }
}

