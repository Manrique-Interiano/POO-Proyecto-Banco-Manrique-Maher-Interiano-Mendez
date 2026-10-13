public class CuentaAhorro extends CuentaBancaria {
    //atributos de la clase CuentaAhorro
    double TasaInteresAnual;
    private int RetirosRealizadosMes = 0;
    private double ComisionPorExceso = 20.0;

    //construtor de CuentaAhorro
    CuentaAhorro (String titular, String numeroCuenta, 
        double saldoInicial, double TasaInteresAnual){
            super(titular, numeroCuenta, saldoInicial);
            this.TasaInteresAnual = TasaInteresAnual;
        }

    //METODO DE COMISION POR RETIROS
    void retirarComision(double monto){
        //VARIABLES DEL METODO
        boolean haycomision = false;
        double total = monto;

        if(RetirosRealizadosMes >= 3){ //EVALUA SI LOS RETIROS SUPERAR A 3
            total = monto + ComisionPorExceso; //SUMA LA COMISION CON EL MONTO
            haycomision = true; //LE DECIMOS QUE SI SE AGREGO AL COMISION
        }
        if(retirar(total)){ //ENVIAMOS EL VALOR AL METODO DE RETIRAR
            RetirosRealizadosMes +=1; //AGREGAMOS 1 POR CADA VES QUE SE RETIRA
            if(haycomision == true){ //SE MANDA A IMPRIMIR UN MSJ SI SE COBRO COMISION
                System.out.println("Se cobro una comision por llego al maximo de retiros en el Mes");
            }

            
        }
    }
    
    public void aplicarInteresMensual(){
        double interes;
        interes = (getSaldo() * (this.TasaInteresAnual/100))/12;
        depositar(interes);
        System.out.println("Su Interes es de: " + interes);
    }    



  

}