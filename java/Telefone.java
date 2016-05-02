
public class Telefone {

    private static int totalTelefones;

    private String numero;
    private int credito;

    public Telefone(String numero, int credito) {
        this.numero = numero;
        this.credito = credito;

        totalTelefones++;
    }

    public Telefone(String numero) {
        this.numero = numero;
        credito = 50;
    }

    public void ligar(String destinatario) {

        if (credito >= 5) {
            System.out.println("Efetuando ligação para " + destinatario + "...");
            credito -= 5;
        } else {
            System.out.println("Não foi possível efetuar ligação, crédito insuficiente.");
        }

    }

    public void addCredito(int quantidade) {
        credito += quantidade;
    }

    public static int getTotalTelefones() {
        return  totalTelefones;
    }

}
