package Cuentas;
public class Main {

    public static void main(String[] args) {
        CCuenta Cuenta1;
        double saldoActual;

        Cuenta1 = new CCuenta("Antonio López García","1000-2365-85-1230456789",2500,0);
        saldoActual = Cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
           Cuenta1.operativaCuenta(2300,695);
        } catch (Exception e) {
            System.out.print("Fallo en operativa");
        }
       
    }
}
