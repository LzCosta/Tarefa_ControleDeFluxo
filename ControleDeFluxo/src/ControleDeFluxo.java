public class ControleDeFluxo {

    public static void main(String[] args) {
        int nota1 = 10;
        int nota2 = 3;
        int nota3 = 5;
        int nota4 = 7;
        float mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;


        System.out.println("Sua média final é: " + mediaFinal);

        if (mediaFinal >= 7.0) {
            System.out.println("Você está aprovado.");
        } else if (mediaFinal >= 5.0) {
            System.out.println("Você está de recuperação.");
        } else {
            System.out.println("Você está reprovado.");
        }
    }
}