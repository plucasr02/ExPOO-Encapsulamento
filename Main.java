package ExerciciosPOO.Exercicio2;

public class Main {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente(011, "Lucas Rocha", "Nubank", true, 1.500, 5.000);
        System.out.println("Numero da conta: " + conta1.getNumConta());
        System.out.println("Nome: " + conta1.getNome());
        System.out.println("Banco: " + conta1.getBanco());
        System.out.printf("Limite especial R$%.3f \n", conta1.getLimiteEspecial());
        conta1.depositar(500.00);
        conta1.realizarSaque(200.00);
        conta1.saldo();
        conta1.verificaChequeEspecial();
        System.out.println("\nEspecial: " + conta1.getLimiteEspecial());
    }
}
