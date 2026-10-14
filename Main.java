import java.util.*;

public class Main {
    public static void main(String[] args) {
    
        //CuentaBancaria cuenta1 = new CuentaBancaria("Manrique","20252001099",3000.00);
        //CuentaAhorro cuenta2 = new CuentaAhorro("Manrique","20252001099",3000.00, 5);
        CuentaCorriente cuenta3 = new CuentaCorriente("Manrique","20252001099",1000.00, "Sycom", 5000.00);
        System.out.println("========== Detalle de Cuenta ===========");
        System.out.println("Saldo Actual : " + cuenta3.getSaldo());
        System.out.println("Credito  " + cuenta3.getLimiteSobregiro());
        System.out.println("Credito Usado : " + cuenta3.getSobregiroUtilizado());
        System.out.println("Credito Disponible : " + cuenta3.getCreditoDisponible());
        System.out.println("========== Detalle de Retiro ===========");
        cuenta3.retirarConSobregiro(3500);
        System.out.println("========== Detalle de Cuenta ===========");
        System.out.println("Saldo Actual : " + cuenta3.getSaldo());
        System.out.println("Credito  " + cuenta3.getLimiteSobregiro());
        System.out.println("Credito Usado : " + cuenta3.getSobregiroUtilizado());
        System.out.println("Credito Disponible : " + cuenta3.getCreditoDisponible());
        System.out.println("========== Detalle de Pago ===========");
        cuenta3.pagarSobregiro(1000);
        System.out.println("========== Detalle de Cuenta ===========");
        System.out.println("Saldo Actual : " + cuenta3.getSaldo());
        System.out.println("Credito  " + cuenta3.getLimiteSobregiro());
        System.out.println("Credito Usado : " + cuenta3.getSobregiroUtilizado());
        System.out.println("Credito Disponible : " + cuenta3.getCreditoDisponible());
        System.out.println("========== Detalle de Pago ===========");
        cuenta3.pagarSobregiro(2000);
        System.out.println("========== Detalle de Cuenta ===========");
        System.out.println("Saldo Actual : " + cuenta3.getSaldo());
        System.out.println("Credito  " + cuenta3.getLimiteSobregiro());
        System.out.println("Credito Usado : " + cuenta3.getSobregiroUtilizado());
        System.out.println("Credito Disponible : " + cuenta3.getCreditoDisponible());

        /*
            EXPLICACION:
            como vimos antes ya teniamos una deuda pendiente con el retiro 
            ahora llamos al metodo de pagar y lo hacemos 2 veces para comprobar 
            que cuando se pagada de demas ese sobrante se envia al saldo de la cuenta
        
        
        */    





        /*
            EXPLICACION: 
            Vemos que primero imprime el detalla de cuenta y despues hacemos el retiro 
            y al final nos muestra como quedo nuestra cuenta ya con el retiro hecho
        
        */













        //PRUEBA #4 - Rendimiento de ahorro
        /*
        System.out.println("Saldo Inicial :" + cuenta2.getSaldo());
        cuenta2.aplicarInteresMensual();
        System.out.println("Saldo Inicial :" + cuenta2.getSaldo());
        */
        /*
            EXPLICACION:
            Vemos que primero vemos el saldo inicial que es de 3000.00 y se le
            aplica un interes que se le suma al saldo. 
        
        */










        //PRUEBA #3 - CuentaAhorro (4 Retiros Consecutivos)
        /*
        System.out.println("Saldo Inicial :" + cuenta2.getSaldo());
        cuenta2.retirarComision(100);
        System.out.println("Saldo Actual : " + cuenta2.getSaldo());
        cuenta2.retirarComision(100);
        System.out.println("Saldo Actual : " + cuenta2.getSaldo());
        cuenta2.retirarComision(100);
        System.out.println("Saldo Actual : " + cuenta2.getSaldo());
        cuenta2.retirarComision(100);
        System.out.println("Saldo Final : " + cuenta2.getSaldo());
        */
        /*
            EXPLICACION: 
            Vemos en los 3 primeros retiros no se le cobro ninguna comision 
            hasta el ultimo retiro lanza el mensaje que dice que se el cobro esa 
            comision
        */







        //PRUEBA #1 - ENCAPSULAMIENTO

        //cuenta1.saldoInicial = 12000;
        /*
            EXPLICACION: 
            Le estamos pasando o modificando un valor a un atributo PRIVATE 
            entonces porque que se quiera modificar no se podra hacer y por esa 
            razon da ese error de PRIVATE ACCESS
        */

        //PRUEBA #2 - ACCESO DIRECTO A ATRIBUTOS PUBLICOS
    
        //System.out.println("Titular: " + cuenta1.titular);
        //System.out.println("Cuenta : " + cuenta1.numeroCuenta);

        /*
            EXPLICACION
            Podemos ver que ahora si podemos tener acceso a los atributos del titular y
            el numero de cuenta ya que son atributos publicos
        */    
        
        
        
        
        
        
        
        
        
        
        
        
        /*System.out.println("===============================================");
        System.out.println("DETALLE DE CUENTA");
        cuenta3.mostrardatos();
        System.out.println("===============================================");
        System.out.println("Limite de Credito : " + cuenta3.getLimiteSobregiro());
        System.out.println("Credito Usado : " + cuenta3.getSobregiroUtilizado());
        System.out.println("Credito Disponible : " + cuenta3.getCreditoDisponible());
        System.out.println("===============================================");
        cuenta3.retirarConSobregiro(4000);
        System.out.println("===============================================");
        System.out.println("Limite de Credito : " + cuenta3.getLimiteSobregiro());
        System.out.println("Credito Usado : " + cuenta3.getSobregiroUtilizado());
        System.out.println("Credito Disponible : " + cuenta3.getCreditoDisponible());
        System.out.println("===============================================");
        cuenta3.retirarConSobregiro(1100);
        System.out.println("===============================================");
        System.out.println("Limite de Credito : " + cuenta3.getLimiteSobregiro());
        System.out.println("Credito Usado : " + cuenta3.getSobregiroUtilizado());
        System.out.println("Credito Disponible : " + cuenta3.getCreditoDisponible());
        System.out.println("===============================================");
        cuenta3.pagarSobregiro(3000);
        //cuenta3.pagarSobregiro()
        */        
    }
}