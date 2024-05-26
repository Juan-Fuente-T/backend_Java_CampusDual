package junit;

public class CuentaBancaria {
    private int saldo;

    private String password;

    public CuentaBancaria(int saldoInicial, String pass) {
        this.saldo = saldoInicial;
        this.password = pass;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int depositar(int cantidad) {
        this.setSaldo(this.getSaldo() + cantidad);
        return this.getSaldo();
    }

    public int retirar(int cantidad, String pass) {
        if (this.getPassword().equals(pass)) {
            if (this.getSaldo() >= cantidad) {
                this.setSaldo(this.getSaldo() - cantidad);
                return cantidad;
            } else {
                System.out.println("No te doy nada. Pides más de lo que tienes en cuenta.");
                return 0;
            }
        } else {
            System.out.println("No te doy nada. Tu contraseña está mal.");
            return 0;
        }
    }

    public int dimeSaldo() {
        return this.getSaldo();
    }

    public String dimePassword() {
        return this.getPassword();
    }
}
