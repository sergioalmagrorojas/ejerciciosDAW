/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6_1;
import java.util.Scanner;
/**
 *
 * @author sergi
 */
public class ejercicio15 {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        
        int numeroNotas =4*(int)(Math.random()*7+1);
        String notas="";
        String nota1="";
        int cuentaNotas;
        
        for (cuentaNotas=1;cuentaNotas<=numeroNotas;cuentaNotas++){
            
            switch((int)(Math.random()*8+1)){
                case 1:
                    notas="do";
                break;
                case 2:
                    notas="re";
                break;
                case 3 :
                    notas ="mi";
                break;
                case 4 :
                    notas ="fa";
                break;
                case 5 :
                    notas="sol";
                break;
                case 6:
                    notas ="la";
                break;
                case 7 :
                    notas ="si";
                break;
                default:   
                    
            }
            if (cuentaNotas == 1) {
                nota1 = notas;
            }
            if (cuentaNotas == numeroNotas) {
                notas = nota1;
            }
            System.out.print(notas +"  " );
            
            
            if(cuentaNotas==numeroNotas){
                System.out.print("||");
            }else if (cuentaNotas%4==0){
                System.out.print("| ");
            }
            
            
        }
        System.out.println();
    }
}
