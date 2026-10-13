public class CuentaBancaria {
  //Atributos de la clase CuentaBancaria
  
  //Atributos Publicos
  String numeroCuenta;
  String titular;
  //Atributos Privados
  private double saldoInicial;
  private int totalTransacciones;
  
  //constructor
  CuentaBancaria(String titular, String numeroCuenta, double saldoInicial){
    this.titular = titular;
    this.numeroCuenta = numeroCuenta;
    
    if(saldoInicial < 0){
      this.saldoInicial = 0.0;
      this.totalTransacciones = 0;     
      }else{
        this.saldoInicial = saldoInicial;
      }
  }

  //GETTERS
  double getSaldo(){
    return this.saldoInicial;
  }
  int getTotalTransacciones(){
    return this.totalTransacciones;
  }

  //METODOS O FUNCIONES

    //METODO #1: DEPOSITAR
    void depositar(double monto){
        if(monto > 0){
            this.saldoInicial = this.saldoInicial + monto;
            this.totalTransacciones = this.totalTransacciones + 1;
            System.out.println("El Deposito se realizo Correctamente"); 
        }else{
            System.out.println("El monto debe ser mayor a 0"); 

        }
    } 

    //METODO #2: RETIRAR
    boolean retirar(double monto){
        if(monto > 0 && monto <= this.saldoInicial){
            this.saldoInicial = this.saldoInicial - monto;
            this.totalTransacciones = this.totalTransacciones + 1;
            return true;
        }else{
            System.out.println("El monto ingresado debe ser mayor a 0 o tiene Fondos insuficientes");
            return false;
        }
    }

    //METODO #3 : MOSTRAR DATOS
    void mostrardatos(){
        System.out.println("Titular : " + this.titular);
        System.out.println("Numero de Cuenta : " + this.numeroCuenta);
        System.out.println("Saldo : " + getSaldo());
        System.out.println("Total de Transacciones : " + getTotalTransacciones());
    }

}