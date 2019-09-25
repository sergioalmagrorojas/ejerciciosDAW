public class equivalencias {
  public static void main(String[]  args){
    
    
    int megas;
    int kilo;
    int bytes;
    int numero;
    int resto;
    
    System.out.println("Introduzca el número de bytes: " );
    numero =Integer.parseInt(System.console().readLine());
    megas=numero/1048576;
    resto =numero%1048576;
    kilo=resto/1024;
    bytes=resto%1024;
    
    
    System.out.printf(" %d mega/s\n" ,megas);
    
    System.out.printf(" %d kilobyte/s\n" , kilo);
    
    System.out.printf(" %d byte/s" , bytes);
  }
}
