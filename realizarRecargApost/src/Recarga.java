public class Recarga {

    private String Saldo;
    private String banco;
    private String cedulaApostador;
    private String numerocuenta;

    public Recarga(String saldo, String banco, String cedulaApostador, String numerocuenta) {
        this.Saldo = saldo;
        this.banco = banco;
        this.cedulaApostador = cedulaApostador;
        this.numerocuenta = numerocuenta;
    }


    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getCedulaApostador() {
        return cedulaApostador;
    }

    public void setCedulaApostador(String cedulaApostador) {
        this.cedulaApostador = cedulaApostador;
    }

    public String getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public String getSaldo() {
        return Saldo;
    }

    public void setSaldo(String saldo) {
        Saldo = saldo;
    }
}
