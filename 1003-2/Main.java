public class Main {
    public static void main(String[] args){
        //Definindo Instâncias
        Conta c1 = new Conta();
        Conta c2 = new Conta();

        //Definindo nome das Instâncias
        c1.setNome("Kauan");
        c2.setNome("João");

        //Realizando depósitos
        c1.depositar(100);
        c2.depositar(200);

        //Imprimindo valores
        System.out.println("c1 - Nome: " + c1.getNome());
        System.out.println("c1 - Saldo: " + c1.getSaldo());
        System.out.println("c2 - Nome: " + c2.getNome());
        System.out.println("c2 - Saldo: " + c2.getSaldo());
    }
}