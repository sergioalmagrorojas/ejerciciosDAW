public class ejercicio12 {
  public static void main(String[]  args){
    
    
    
    
     System.out.println("Introduzca la nota del examen: " );
     double notaPrimero=Double.parseDouble(System.console().readLine());
     System.out.println("Introduzca la nota que deseas : " );
     double evaluacion=Double.parseDouble(System.console().readLine());
     
     double notaSegundo = ((evaluacion *1) - (notaPrimero * 0.40))/0.60;
     
     System.out.println("Debes sacar un " + notaSegundo + " en el segundo examen para obtener un " + evaluacion);
     
  }
}

