package lucas.aprendizado;
public class AulaUm {


    public static void main (String[] args) {
    
        String primeiroNome = "H";
        String segundoNome = "Lucas";
    
        String meu_Nome = meuNome (primeiroNome,segundoNome);
        System.out.println(meu_Nome.toUpperCase() + " prazer em conhecer vocês!");
    }
    
    public static String meuNome (String primeiroNome, String segundoNome) {
        return "O resultado desse test agora é. " + primeiroNome.concat(" ").concat(segundoNome);
    }
    
}