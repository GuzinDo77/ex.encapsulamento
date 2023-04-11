public class Principal {
    public static void main(String[] args){

        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(225);
        conta.setTitular("Guza MM");
        conta.setSaldo(1000);

        System.out.println("Saldo atual: "+conta.getSaldo());

        conta.depositaValor(500);

        System.out.println("Saldo atual: "+conta.getSaldo());

        conta.sacaValor(700);

        System.out.println("Saldo atual: "+conta.getSaldo());
    }
    
}
