package text.format;

// após utilizar 3 aspas, o texto fica formatado da maneira que foi inserido. Java -> 13 
public class Exemplo {
    public static void main(String[] args) {

        String textoFormatado = """
                javinha é brabo
                textinho formatadoooooooooooooooooooo                
                """;
        System.out.println(textoFormatado);
    }
}
