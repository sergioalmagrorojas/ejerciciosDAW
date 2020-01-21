/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_array;
import java.util.Scanner;
/**
 *
 * @author sergi
 */
public class ejercicio4 {
    static int maximo=10;
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int opcion;
        String nuevoCodigo;
        String nuevoAutor;
        String nuevoGenero;
        int nuevaDuracion;
        String nuevoTitulo;
        int libre;
        String duracion;
        
        Disco[] album=new Disco[maximo];
        
        for (int i =0;i<maximo;i++){
            album[i]=new Disco();
        }
        
        do{
            System.out.println("Coleccion de discos");
            System.out.println("-------------------");
            System.out.println("1.Listado.");
            System.out.println("2.Nuevo disco.");
            System.out.println("3.Modificar disco.");
            System.out.println("4.Borrar");
            System.out.println("5.Salir");
            System.out.println("Introduce una de las opciones.");
            opcion=s.nextInt();
            s.nextLine();
            
            switch(opcion){
                case 1 :
                    System.out.println("");
                    System.out.println("Listado:");
                    for(int i =0;i<maximo;i++){
                        if(!(album[i].obtenerCodigo().equals("Libre"))){
                            System.out.println(album[i]);
                        }
                    }
                break; 
                    
                case 2 :
                    System.out.println("");
                    System.out.println("Nuevo Disco: ");
                    System.out.println("Empiece a introducir los datos");
                  
                    libre=-1;
                    do{
                        libre++;
                    } while(!((album[libre].obtenerCodigo()).equals("Libre")));
                   
                    System.out.println("Duración: ");
                    nuevaDuracion=s.nextInt();
                    s.nextLine();
                    album[libre].ponerDuracion(nuevaDuracion);
                    
                    System.out.println("Autor: ");
                    nuevoAutor=s.nextLine();
                    album[libre].ponerAutor(nuevoAutor);
                    
                    System.out.println("Titulo: ");
                    nuevoTitulo=s.nextLine();
                    album[libre].ponerTitulo(nuevoTitulo);
                    
                    System.out.println("Código: ");
                    nuevoCodigo=s.nextLine();
                    album[libre].ponerCodigo(nuevoCodigo);
                    
                    System.out.println("Género: ");
                    nuevoGenero=s.nextLine();
                    album[libre].ponerGenero(nuevoGenero);
                break;
                    
                case 3 : 
                    System.out.println("");
                    System.out.println("Modificar: ");
                    
                    System.out.println("Introduzca el código del disco a modificar : ");
                    nuevoCodigo=s.nextLine();
                    
                    
                    int i =-1;
                    
                    do{
                        i++;
                    }while(!((album[i].obtenerCodigo()).equals(nuevoCodigo)));
                    
                    System.out.println("Nueva duración :  "  );
                    duracion=s.nextLine();
                    
                    if(!duracion.equals("")){
                        album[i].ponerDuracion(Integer.parseInt(duracion));
                    }
                
                    System.out.println("Nuevo autor/a :  "  );
                    nuevoAutor=s.nextLine();
                    if(!nuevoAutor.equals("")){
                        album[i].ponerAutor(nuevoAutor);
                    }
                
                    System.out.println("Nuevo titulo :  "  );
                    nuevoTitulo=s.nextLine();
                    if(!nuevoTitulo.equals("")){
                        album[i].ponerTitulo(nuevoTitulo);
                    }
                
                    System.out.println("Nuevo codigo :  "  );
                    nuevoCodigo=s.nextLine();
                    if(!nuevoCodigo.equals("")){
                        album[i].ponerCodigo(nuevoCodigo);
                    }
                
                    System.out.println("Nuevo género :  "  );
                    nuevoGenero=s.nextLine();
                    if(!nuevoGenero.equals("")){
                        album[i].ponerGenero(nuevoGenero);
                    }
                break;
                    
                    
                case 4:
                    System.out.println("Borrar.");
                    
                    System.out.println("Que album quiere borrar?");
                    nuevoCodigo=s.nextLine();
                    
                    
                     i =-1;
                    
                    do{
                        i++;
                    }while(!((album[i].obtenerCodigo()).equals(nuevoCodigo)));
                    
                    album[i].ponerCodigo("Libre");
                    System.out.println("Se ha borrado el album ");
                    System.out.println("");
                    
                break;
            }
            
        }while(opcion!=5);
        
    }
}
