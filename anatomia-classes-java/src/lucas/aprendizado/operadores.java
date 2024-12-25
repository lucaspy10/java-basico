package lucas.aprendizado;

public class operadores {

    public static void main(String[] args) {
        //para comparar valores de string devemos ultilizar o "()equals()"
        //e para comparar valores numericos podemos ultilizar os operadores normais.
        String nome1 = "lucas";
        String nome2 = "lucca";
        boolean nome3 = nome1.equals(nome2);
        System.out.println(nome3);

        int numero1 = 78;
        int numero2 = 65;
        boolean numero3 = numero1 == numero2;
        System.out.println(numero3);
    }
    
}
