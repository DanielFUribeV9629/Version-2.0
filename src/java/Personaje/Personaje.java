package Personaje;

import ejercito.Ejercito;
import ejercito.ElfoFabrica;
import ejercito.EnanoFabrica;
import ejercito.HechizeroFabrica;
import ejercito.HombreFabrica;
import java.util.Scanner;

public class Personaje {

    public static Ejercito getEjercito(String tipo) {
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Ingrese el numero del personaje:\n"
                    + "1. Hombre\n"
                    + "2. Enano\n"
                    + "3. Elfo\n"
                    + "4. Hechizero\n");
            opcion = scanner.nextInt();
        } while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4);

        switch (opcion) {
            case 1:
                return new HombreFabrica();

            case 2:
                return new EnanoFabrica();

            case 3:
                return new ElfoFabrica();

            case 4:
                return new HechizeroFabrica();

        }
        return null;
    }
}
/*Ejercito fabrica
  Armadura armadura;
  Arma arma;      
  Cuerpo cuerpo;
  Escudo escudo;
  Scanner escaner;  
  int opcion = 0;

  public void operacion(){

        escaner = new Scanner (System.in);

        do{
         System.out.println("Ingrese el numero del personaje:\n"
                 + "1. Hombre\n"
                 + "2. Enano\n"
                 + "3. Elfo\n"
                 + "4. Hechizero\n");
         opcion = scanner.nextInt();
     }while(opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4);
    
    
        switch(opcion){
            case 1:
                fabrica = new HombreFabrica();
                
            case 2:
                fabrica = new EnanoFabrica();
                 
            case 3:
                fabrica = new ElfoFabrica();
                 
            case 4:
                fabrica = new HechizeroFabrica();
            }

            armadura = fabrica.darArmadura();
            arma = fabrica.darArma();
            cuerpo = fabrica.darCuerpo();
            escudo = fabrica.darEscudo();
}
 */
