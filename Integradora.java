import java.util.Scanner;
/** 
 *name: Integradora
 *Description: this code can leave result whit input varibles ask by system
 *Pre: Ready to inscribe in the system the user in one route, and asking other parameters but realize the activity
 *Pos: The weather condition for the activity was verified
 *@param name name of the user. name != int && name != float
 *@param cedula ID of the user. cedula != null && cedula != "".
 *@param ruta got the choose the user
 *@param participantes number to the people participate in the activity
 *@param guias number of guides in the activity
 *@param grados climate temperature in degrees Celsius
 *@param humedad climate humidity 
 *@param daMeteo deposit of the results of the subroutines
 *@param nCamiones deposit of the results of the subroutines
 */
public class Integradora{
    public static void main (String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Bienvenido voluntario a la aplicacion de interaccion de rutas Ecologicas COP 16 Cali-Colombia.");
        System.out.println("¿Cual es su nombre?");
            String name= sc.nextLine();
        System.out.println("Por favor, dijite su cedula.");
            int cedula=sc.nextInt();
        System.out.println("¡Bienvenido, "+name);
        System.out.println("¿Que ruta registraras el dia de hoy?");
        System.out.println("digite el numero de la ruta a elegir.");
        System.out.println("[1] Farallones.");
        System.out.println("[2] Jardín botánico");
        System.out.println("[3] Ecoparque Río Pance");
            sc.nextLine();
            int ruta=sc.nextInt();
            rutas(ruta);
        
        System.out.println("¿Cuantos participantes acudiran a la caminata el dia de hoy?");
            int participantes=sc.nextInt();
        System.out.println("¿Cuantos guias acudiran a la caminata?");
            int guias=sc.nextInt();
        System.out.println("Ingrese la temperatura en grados centigrados");
            double grados=sc.nextDouble();
        System.out.println("Ingrese el porcentaje de humedad relativa (0%-100%)");
            int humedad=sc.nextInt();

        String daMeteo=datosMeteorologicos(grados, humedad);
        int nCamiones= numCamiones(participantes, guias);
        System.out.println(daMeteo);
        System.out.print("Se necesitan "+nCamiones);
        System.out.println(" camiones para llevar a cabo la actividad");
        

    }
    public static String datosMeteorologicos(double gr, int hum){
        String salida;
        salida="El clima no es favorable para realizar la actividad";
        if(gr<15 && gr>9 && hum>39 && hum<61){
            salida="Lleve chaqueta para protegerse del frio y de la lluvia";
        }
        else if(gr>28 && gr<36 && hum>39 && hum<61){
            salida="Lleve termo del agua, beba para hidratarse";
        }
        else if(gr>19 && gr<26 && hum>39 && hum<61){
            salida="¡Hace un buen dia para caminar por Cali!";
        }
        return salida;
    }

    public static int numCamiones(int par, int gui){
        int salida2;
        int sum=par+gui;
        int def=sum/25;
        salida2=(sum % 25 != 0)?1:0;
        salida2 += def;
        return salida2;
    }

    public static void rutas(int rut){
      String salida3;
      String uno1="¡Exelente! La Ruta de los Farallones tiene como punto de encuentro Calle 16-Universidad del Valle iniciando a las 6:40 am, y termina a las 4:00 pm";
      String dos2="¡Exelente! La Ruta del Jardín botánico tiene como punto de encuentro Cl. 18 #122-135 en el Barrio Pance, junto a la univercidad ICESI. Esta iniciara a las 2:15 pm y terminara a las 8:00 pm";
      String tres3="¡Exelente! La Ruta del Ecoparque Río Pance tiene como punto de encuentro Calle 25-Universidad Autonoma De Occidente. Esta iniciara a las 9:45 am y terminara a las 5:05 pm";
      salida3="Esa ruta no esta registrada";  

    if (rut==1){
        salida3=uno1;
    }
    
    else if (rut==2){
        salida3=dos2;
    }
    
    else if (rut==3){
        salida3=tres3;
    }
    System.out.println(salida3);
    }

    public static int regalo(String name){
        string salida4;
        
    }
}