package lucas.aprendizado;

public class variaveis {
    public static void main(String[] args) {
        //para garantir a aplicação que estou ciente que se eu alterar uma declaração que 
        //suporta um valor maior que outra declaração necessita colocar a declaração entre parenteses
        byte idade = 10;
        int idade_dois = idade;
        byte idade_tres = (byte) idade_dois; //quanto declarado entre parenteses estou garantindo que
        System.out.println(idade_tres);      //estou ciente de qualquer erro que possa dar


        //para declara um valor de uma variavel como algo que nunca vai mudar devemos
        //antes de declara o tipo da variavel colocar a palavra "final".
        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);

    }

}
