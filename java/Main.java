
public class Main {

    public static void main(String[] args) {

        Telefone telefone1 = new Telefone("12345");
        Telefone telefone2 = new Telefone("123456", 4);

        System.out.println("Ligacao telefone 1");
        telefone1.ligar("123123123");

        System.out.println();

        System.out.println("Ligacao telefone 2");
        telefone2.ligar("1231231231");

        System.out.println();

        System.out.println("Adicionando créditos no telefone 2");
        telefone2.addCredito(5);

        System.out.println();

        System.out.println("Ligacao telefone 2, segunda tentativa");
        telefone2.ligar("123123123");

        System.out.println();

        System.out.println("Total telefones 1: " + Telefone.getTotalTelefones());

    }

}
