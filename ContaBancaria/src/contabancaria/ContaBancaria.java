package contabancaria;

public class ContaBancaria {
    String numCont;
    String titular;
    double saldo;
    
    public ContaBancaria(String numCont, String titular, double saldInic) {
    this.numCont = numCont;
    this.titular = titular;
    this.saldo = saldInic;
}

public void saque (double valor) {
    if (valor <= 0) {
        System.out.println("O valor para o saque e invalido.");
    } else if (valor <= saldo) {
        saldo -= valor;
        System.out.println("O valor sacado e de R$ " + valor + ", e foi realizado com sucesso.");
    } else {
        System.out.println("Saldo insuficiente para o saque.");
    }
}

public void depositar(double valor) {
    if (valor > 0) {
        saldo += valor;
        System.out.println("O Deposito no valor de R$ " + valor + " foi realizado com sucesso.");
    } else {
        System.out.println("O valor inserido e invalido para deposito.");
    }
}
    public void consultSald(){
        System.out.println("O saldo da conta " + numCont + " do titular " + titular + " tem o saldo de valor: R$ " + saldo + " disponivel."); 
    }
}