package cuentas;

public class Main {
    public static void main(String[] args) {
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        System.out.println("El saldo actual es " + cuenta1.getSaldo());
        operaciones(cuenta1);
        System.out.println("El saldo actual es " + cuenta1.getSaldo());
    }

    public static void operaciones(CCuenta cuenta) {
        cuenta.retirar(2300);
        cuenta.ingresar(685);
    }
}