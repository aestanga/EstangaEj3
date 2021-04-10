package estangaej3;

public class CuentaBancaria {
    //ATRIBUTOS
    private String nombreTitular, tipodeCuenta="";
    private final String nombreclientes [] = {"Aylen Estanga","Ezequiel Perez","Luka Gomez","Alejo Sanchez","Vanesa Diaz","Ariel Gutierrez"};
    private final String tipodeCuentaclientes [] = {"Caja de Ahorro","Cuenta de Nòmina","Caja de Ahorro","Cuenta Corriente","Cuenta Corriente","Cuenta Corriente"};
    private int saldo, dni=0, numcliente=0, clave=0;
    private final int dniclientes [] = {21585238,19554987,13656457,29885698,42536921,25863654};
    private final int saldoclientes [] = {25000,80000,15800,157960,369740,10058};
    private final int claveclientes [] = {1234,2200,1478,8855,4321,1717};
        
    //MÈTODOS
    public void setdni(int dni){
        for(int i=0; i<dniclientes.length ; i++){
            if (dniclientes[i] == dni){
                this.dni = dni;
                nombreTitular = nombreclientes [i];
                saldo = saldoclientes [i];
                numcliente = i;
            }
        }            
       }    
    public int getdni(){
           return dni;
    }
    public void settipodeCuenta (String tipodeCuenta){
                if (tipodeCuentaclientes[numcliente].equals(tipodeCuenta)){
                   this.tipodeCuenta = tipodeCuenta;
                }
    }
    public String gettipodeCuenta (){
        return tipodeCuenta;
    }
    public void mensaje(){
        System.out.println("\nEstimado "+nombreTitular+"\n");
    }
    public void setclave (int clave){
                if (claveclientes[numcliente] == clave){
                   this.clave = clave;
                }
    }
    public int getclave (){
        return clave;
    }
    public void saldo (){
        System.out.println("===================================");
        System.out.println("Su saldo actual es de $"+saldo);
        System.out.println("===================================");
        System.exit(0);
    }
    public void extraer (int monto){
        if (saldoclientes[numcliente] >= monto && monto>0){
            saldo = saldoclientes[numcliente] - monto;
            System.out.println("===================================");
            System.out.println("Extracciòn exitosa");
            System.out.println("Su saldo actual es de $"+saldo);
            System.out.println("===================================");
            System.exit(0);
        } else {
            System.out.println("===================================");
            System.out.println("No hay fondos suficientes para realizar la extracciòn");
            System.out.println("Su saldo actual es de $"+saldo);
            System.out.println("===================================");
            System.exit(0);
        }
    }
    public void imprimir (){
        System.out.println("==========================================");
        System.out.println("================ BANCO SI ================");
        System.out.println("==========================================");
        System.out.println("   FECHA     |    HORA   |  CAJERO");
        System.out.println(" 06/04/2021     11:10:27     AB1234");
        System.out.println("==========================================");
        System.out.println("DOMICILIO Av. Sáenz 1010, C1437DOB, CABA");
        System.out.println("==========================================");
        System.out.println("NÙMERO DE DNI "+dni+" | NÙMERO DE CLIENTE "+numcliente);
        System.out.println("NOMBRE COMPLETO "+nombreTitular);
        System.out.println("TIPO DE CUENTA "+tipodeCuenta);
        System.out.println("==========================================");
        System.out.println("SU SALDO ACTUAL ES: $"+saldo);
        System.out.println("==========================================");
        System.exit(0);
    }

}
