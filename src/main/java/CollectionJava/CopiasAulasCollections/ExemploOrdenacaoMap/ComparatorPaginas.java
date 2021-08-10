package CollectionJava.CopiasAulasCollections.ExemploOrdenacaoMap;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
}
