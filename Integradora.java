import java.util.Scanner;
/** 
 *name: main
 *Description: This code registers the user to a route and will inform of the requirements for the activity.
 *Pre: Ready to inscribe in the system the user in one route, and asking other parameters but realize the activity.
 *Pos: The conditions for the activity have been recorded in the activity.
 *@param name Name of the user. name != int && name != float
 *@param cedula ID of the user. cedula != null && cedula != "".
 *@param obtenerRegalo Deposit of the results of the subroutines. Designates or not a free entry.
 *@param ruta Got the choose the user. ruta != null && ruta !="".
 *@param rutas Deposit of the results of the subroutines. route information.
 *@param participantes Number to the people participate in the activity. participantes != null && participantes !="".
 *@param guias Number of guides in the activity. guias != null && guias !="".
 *@param grados Climate temperature in degrees Celsius. grados != null && grados !="".
 *@param humedad Climate humidity. humedad != null && humedad !="".
 *@param daMeteo Deposit of the results of the subroutines. Report the weather condition
 *@param nCamiones Deposit of the results of the subroutines. Number of trucks needed
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
        
        obtenerRegalo(name);

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
    /**
     * name: [static] datosMeteorologicos
     * description: The weather condition is calculated based on humidity and temperature to carry out the activity.
     * pre: The comparison of meteorological data with established conditions begins.
     * pos: The message reporting the weather condition is recorded in the output variable and returned to the main.
     * @param salida Information message about the weather for the activity.
     * @param hum Humidity percentage of the current climate.
     * @param gr Degrees Celsius of the current climate
     */
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

    /**
     * name: [static] numCamiones
     * description: Calculate the number of trucks needed to transport all guides and participants.
     * pre: The calculation of the buses has started.
     * pos: A value is generated and entered into the output variable to be printed in the main.
     * @param salida2 Return variable with the required number of buses.
     * @param gui Parameter with the number of guides.
     * @param par Parameter with the number of participants.
     */
    public static int numCamiones(int par, int gui){
        int salida2;
        int sum=par+gui;
        int def=sum/25;
        salida2=(sum % 25 != 0)?1:0;
        salida2 += def;
        return salida2;
    }

    /**
     * name: [void] rutas
     * description: The system compares the user's route selection with the conditions to release the corresponding preset route information.
     * pre: The comparison of the conditionals with the parameter begins.
     * pos: Depending on the condition, the corresponding message is printed.
     * @param rut Parameter with the number of the selected route.
     * @param salida3 Return value with the route information.
     * @param uno1 Route one information.
     * @param dos2 Route two information.
     * @param tres3 Route three information.
     */
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

    /**
     * name: [void] obtenerRegalo
     * description: If the first letter of the username is a vowel, you will be given a free ticket to COP16.
     * pre: The first letter of the name is enclosed to evaluate it in the condition.
     * pos: The output message is printed.
     * @param nombre Parameter with the user name.
     * @param primera_letra Store the first letter as a char.
     * @param palabra Store the first letter as String.
     */
    public static void obtenerRegalo(String nombre){
        char primera_letra= nombre.charAt(0);
        String palabra = primera_letra +"";
        if (palabra.equals("a") || palabra.equals("e") || palabra.equals("i") || palabra.equals("o") || palabra.equals("u")){
            System.out.println("Comuniquese al número 1800456789 para obtener una entrada gratuita a una conferencia del cop16");
        }
        else if(palabra.equals("A") || palabra.equals("E") || palabra.equals("I") || palabra.equals("O") || palabra.equals("U")){
            System.out.println("Comuniquese al número 1800456789 para obtener una entrada gratuita a una conferencia del cop16");
        }
        else{
            System.out.println("Su nombre no empieza por vocal"+palabra);
        }
    }
}
