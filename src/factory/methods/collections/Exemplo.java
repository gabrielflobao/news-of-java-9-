package factory.methods.collections;

import java.util.List;
import java.util.Set;
//Factory Methods Java -> 9
public class Exemplo {

    public static void main(String[] args) {
        List<String> nomes = List.of("primeiroNome","segundoNome");
        Set<String> nomesSet = Set.of("Gabriel","Paulo","Gabriel");
        System.out.println(nomes);
        System.out.println(nomesSet);
    }
}
