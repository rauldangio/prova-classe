import java.text.DecimalFormat;

public class Banco {
    String titular;
    int numero;
    String agencia;
    double saldo,saque,deposito;
    DecimalFormat df = new DecimalFormat("###,###,##0.00");

    public String getInformacaoCliente(){
        String ic = "nome: "+titular +" "+ "numero: "+numero +" "+"agencia: "+ agencia + " "+ "saldo: "+saldo;
        return ic;
    }

    public double getSaque(){
        saldo -= saque;
        return saldo;
    }

    public double getDeposito(){
        saldo += deposito;
        return saldo;
    }

}
