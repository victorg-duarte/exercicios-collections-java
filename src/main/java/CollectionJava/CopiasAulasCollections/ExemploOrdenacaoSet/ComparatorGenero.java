package CollectionJava.CopiasAulasCollections.ExemploOrdenacaoSet;

import java.util.Comparator;

public class ComparatorGenero implements Comparator<Serie> {
    @Override
    public int compare(Serie s1, Serie s2) {
        int genero =s1.getGenero().compareTo(s2.getGenero());
        return genero;
    }
}
