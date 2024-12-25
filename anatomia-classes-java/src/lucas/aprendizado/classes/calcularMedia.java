import java.util.Scanner;


public class calcularMedia {

public static void main(String [] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite sua nota do primerio trimestre: ");
    String primerioTrimestre = scanner.nextLine();
    System.out.println("\n");
    System.out.println("Digite sua nota do segundo trimestre: ");
    String segundoTrimestre = scanner.nextLine();
    System.out.println("\n");
    System.out.println("Digite sua nota do terceiro trimestre: ");
    String terceiroTrimestre =  scanner.nextLine();
    System.out.println("\n");
    float primerio = Float.parseFloat(primerioTrimestre);
    float segundo = Float.parseFloat(segundoTrimestre);
    float terceiro = Float.parseFloat(terceiroTrimestre);

    float calcularMedia = media (primerio, segundo, terceiro);
    System.out.println("sua media de notas este ano foi: " + calcularMedia);
}
public static float media (float primerio, float segundo, float terceiro) {
    float mediaTotal = (primerio + segundo + terceiro) / 3; 
    if ( mediaTotal >= 9 ) {
        System.out.println ( "PARABENS! VOCÊ TEVE UMA NOTA EXELENTE ESTE ANO! Você está garantido no proximo ano. \n");
    }
    else if (mediaTotal >= 6) {
        System.out.println("Aprovado!");
    }
    else{
        System.out.println("Reprovado!");
    }
    return Math.round(mediaTotal * 100.0f)/100.0f;
}
}

