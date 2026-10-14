public class CuentaCorriente extends CuentaBancaria {
    String nombreEmpresa;
    private double limiteSobregiro;
    private double sobregiroUtilizado = 0.0;
    private double creditoDisponible = 0.0;
    
    CuentaCorriente(String titular, String numeroCuenta, double saldoInicial, 
                    String nombreEmpresa, double limiteSobregiro){
                        super(titular,numeroCuenta,saldoInicial);
                        this.nombreEmpresa = nombreEmpresa;
                        this.limiteSobregiro = limiteSobregiro; 
                        this.creditoDisponible = limiteSobregiro;
                    }
    

    double getLimiteSobregiro(){
        return this.limiteSobregiro;
    }
    double getSobregiroUtilizado(){
        return this.sobregiroUtilizado;
    }

    double getCreditoDisponible(){
        return this.creditoDisponible;
    }

    void retirarConSobregiro(double monto){
        double maximoRetirable, creditoNecesario, recargo;
        creditoDisponible = this.limiteSobregiro - sobregiroUtilizado;
        maximoRetirable = getSaldo()+creditoDisponible;

        if(monto<=getSaldo()){
            retirar(monto);
            System.out.println("Saldo Actual : " + getSaldo());
            System.out.println("Credito Usado : " + getSobregiroUtilizado());
            
            
        }else if(monto > maximoRetirable){
            System.out.println("Operación rechazada: el monto excede el saldo y el crédito disponible.");
        }else if(monto > getSaldo()){
            creditoNecesario = monto - getSaldo();
            recargo = creditoNecesario * 0.03;
            if(getSaldo()> 0){
                retirar(getSaldo());
            }          
            sobregiroUtilizado = sobregiroUtilizado + creditoNecesario + recargo;
            creditoDisponible = this.limiteSobregiro - sobregiroUtilizado;
            System.out.println("El Credito Necesario : " + creditoNecesario);
            System.out.println("El Recargo : " + recargo);
            System.out.println("Saldo Actual : " + getSaldo());
            
        }

        
    }

    void pagarSobregiro(double monto){
        double sobrante;
        if(monto<=0){
            System.out.println("Operacion rechazada: El valor debe ser mayor a 0");
            //pago parcial o igual
        }else if(monto <= sobregiroUtilizado){
            sobregiroUtilizado = sobregiroUtilizado - monto;
            creditoDisponible = creditoDisponible + monto;
            System.out.println("Abono : " + monto);
            System.out.println("Credito Pendiente : " + sobregiroUtilizado);
            System.out.println("Credito Disponible : " + creditoDisponible);
            
            //pago a la deuda (sobrante o pagar sin deuda)
        }else if(monto > sobregiroUtilizado){
            sobrante = monto - sobregiroUtilizado;
            sobregiroUtilizado -= sobregiroUtilizado;
            depositar(sobrante);
            creditoDisponible = limiteSobregiro;
            System.out.println("Abono : " + monto);
            System.out.println("Credito Pendiente : " + sobregiroUtilizado);
            System.out.println("Credito Disponible : " + creditoDisponible);
            System.out.println("El Sobrante del pago: " + sobrante);
            System.out.println("El saldo Actual es : " + getSaldo());
        }
    }

}