/*Crear la clase cuentaBancaria que tenga como atributo nombreTitular, tipoDeCuenta y saldo. 
Elegir el tipo de dato adecuado para cada uno de ellos. Además hacer el método extraer() que permita extraer dinero,
si se puede. Crear un objeto de esta clase y comprobar el funcionamiento*/
package estangaej3;
import java.util.Scanner;

public class EstangaEj3 {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner (System.in);
        int dni, opc, clave, monto;
        String tipodeCuenta="", confirm="", confirm1="", operacion="";
        
        // Creo objeto datos de la clase CuentaBancaria
        CuentaBancaria datos = new CuentaBancaria();
        // Solicito ingresar datos
        System.out.println("====== ¡BIENVENIDO A BANCO SI! ======");
        System.out.println("DNI del titular de la cuenta: ");
        dni = ingresar.nextInt();
        datos.setdni(dni);
        if(datos.getdni()!= dni){
            System.out.println("=================================");
            System.out.println(dni+"= DNI INVÀLIDO, no se encontraron registros. =");
            System.out.println("=================================");
            System.exit(0);
        }

          while (!confirm.equalsIgnoreCase("SI")){
          System.out.println("\n=================================");
          System.out.println("     Opciòn    | Tipo de cuenta");
          System.out.println("      1        | Cuenta Corriente");
          System.out.println("      2        | Caja de Ahorro");
          System.out.println("      3        | Cuenta de Nòmina");
          System.out.println("=================================\n");
          System.out.println("Ingrese la opciòn que corresponda: ");
          opc = ingresar.nextInt();
             switch (opc){
                 case 1:
                    tipodeCuenta = "Cuenta Corriente";
                    break;
                 case 2:
                    tipodeCuenta = "Caja de Ahorro";
                    break;
                 case 3:
                    tipodeCuenta = "Cuenta de Nòmina";
                    break;
             }
                if (opc>3 || opc<1){
                    System.out.println("=======================");
                    System.out.println("====OPCIÒN INVALIDA====");
                    System.out.println("=======================");
                } else {
                   System.out.println("\nUsted eligiò: "+tipodeCuenta);
                   System.out.println("¿Es correcto? Responda con SI o NO.");
                   ingresar.nextLine();
                   confirm = ingresar.nextLine();
                }
          }
          datos.settipodeCuenta(tipodeCuenta);
          if(!datos.gettipodeCuenta().equals(tipodeCuenta)){
            System.out.println("\n=================================================================================");
            System.out.println("No se encuentran registros de "+tipodeCuenta+" que coincidan con el dni "+dni+" .");
            System.out.println("=================================================================================\n");
            System.exit(0);
          }
          
          datos.mensaje();
          System.out.println("Ingrese la clave numèrica para poder avanzar: ");
          clave = ingresar.nextInt();
          datos.setclave(clave);
          if(datos.getclave()!= clave){
            System.out.println("\n================");
            System.out.println("CLAVE INCORRECTA");
            System.out.println("================\n");
            System.exit(0);
          }
          
          while (!confirm1.equalsIgnoreCase("SI")){
          System.out.println("\n===================================");
          System.out.println("     Opciòn    | Operaciòn");
          System.out.println("      1        | Consulta de saldo");
          System.out.println("      2        | Extracciòn de dinero");
          System.out.println("      3        | Imprimir ticket");
          System.out.println("===================================\n");
          System.out.println("Ingrese la opciòn de la operaciòn que desea realizar: ");
          opc = ingresar.nextInt();
             switch (opc){
                 case 1:
                    operacion = "Consulta de saldo";
                    break;
                 case 2:
                    operacion = "Extracciòn de dinero";
                    break;
                 case 3:
                    operacion = "Imprimir ticket";
                    break;
             }
                if (opc>3 || opc<1){
                    System.out.println("\n=======================");
                    System.out.println("====OPCIÒN INVALIDA====");
                    System.out.println("=======================\n");
                } else {
                   System.out.println("\nUsted eligiò: "+operacion);
                   System.out.println("¿Es correcto? Responda con SI o NO.");
                   ingresar.nextLine();
                   confirm1 = ingresar.nextLine();
                }
          }
          
          if (operacion.equals("Consulta de saldo")){
              datos.mensaje();
              datos.saldo();
          } if (operacion.equals("Extracciòn de dinero")) {
              datos.mensaje();
              System.out.println("\nIngrese el monto a extraer: $");
              monto = ingresar.nextInt();
              datos.extraer(monto);
            } if (operacion.equals("Imprimir ticket")){
                datos.mensaje();
                datos.imprimir();
            }
          
    }
    
}
