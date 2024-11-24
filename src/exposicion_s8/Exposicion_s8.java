
package exposicion_s8;
import java.util.Scanner;

/**
 *
 * @author alexanderordonez
 * @author Leonardo
 */
public class Exposicion_s8 {

    static Scanner sc = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);
    static int tamanoArregloTelefonos = 0;
    static telefonos[] telefono= new telefonos[20];
    
    
    
    
    public static void main(String[] args) {
        
        int opcionMenu;
        
        
        do{
        
            opcionMenu = Menu();
            
            switch(opcionMenu){
            
                case 1:
                    System.out.println("Ingresar Telefono");
                    AgregarTelefono();
                    break;
                    
                    
                case 2:
                    System.out.println("Ingresar computadora");
                    break;
                    
                case 3:
                    System.out.println("Mostrar telefonos");
                    MostrarTelefonos();
                    break;
                    
                case 4:
                    System.out.println("Mostrar computadoras");
                    break;
                    
                case 5:
                    System.out.println("Mostrar todos los dispositivos");
                    break;
                    
                case 6:
                    System.out.println("\n- - - - - - - - - - - - - - - - - ");
                    System.out.println("       Gracias por su visita");
                    System.out.println("- - - - - - - - - - - - - - - - - \n");
                    break;
                    
                default:
                    System.out.println("\n* * * * * * * * * * * * * * * * * * *");
                    System.out.println(" POR FAVOR INGRESE UNA OPCION VALIDA");
                    System.out.println("* * * * * * * * * * * * * * * * * * *\n");
                    break;
            
            
            }
            
            
            
            
        
        }while(opcionMenu!=6);
        
        
    }
    
    public static int Menu(){
        int opcion;
        
        
        System.out.println("- - - - - - - - - - - - - - - - - ");
        System.out.println("             M E N U");
        System.out.println("- - - - - - - - - - - - - - - - - ");
        System.out.println("1. Ingresar telefono");
        System.out.println("2. Ingresar computadora");
        System.out.println("3. Mostrar telefonos");
        System.out.println("4. Mostrar Computadoras");
        System.out.println("5. Mostrar todos los dispositivos");
        System.out.println("6. Salir");
        System.out.println("- - - - - - - - - - - - - - - - - ");
        System.out.println("Ingrese su elección: ");
        opcion = sc.nextInt();

    return opcion;
    }
    public static void AgregarTelefono(){
    
        System.out.println("Ingrese la marca");
        String marcaTelefono = sc2.nextLine();
        System.out.println("Ingrese el modelo");
        String modeloTelefono = sc2.nextLine();
        System.out.println("Ingrese el procesador");
        String procesadorTelefono = sc2.nextLine();
        System.out.println("Ingrese el tamaño de almacenamiento en Gb");
        int almacenamientoTelefono = sc.nextInt();
        System.out.println("Ingrese los megapixeles de la camara");
        int camaraTelefono = sc.nextInt();
        System.out.println("Ingrese el tamaño de la memoria Ram en Gb");
        int ramTelefono = sc.nextInt();
        telefonos newtelefono = new telefonos(marcaTelefono, modeloTelefono, procesadorTelefono, almacenamientoTelefono, camaraTelefono, ramTelefono);
            if(tamanoArregloTelefonos<25){
                telefono[tamanoArregloTelefonos]=newtelefono;
                tamanoArregloTelefonos++;
            }
    
    }
    public static void MostrarTelefonos(){
    
        if(tamanoArregloTelefonos==0){
            System.out.println("No hay telefonos registrados para mostrar");
        }
        else {
            for(int i=0;i<tamanoArregloTelefonos;i++){

                System.out.println(telefono[i]);

            }
        }
    
    
    }
    
    
    
}
