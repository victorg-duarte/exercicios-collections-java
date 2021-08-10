package CollectionJava.CopiasAulasCollections.ExemploOrdenacaoSet;

import java.util.Comparator;

public class ComparatorTempoEpisodio implements Comparator<Serie> {
    @Override
    public int compare(Serie s1, Serie s2) {
        return s1.getTempoEpisodio().compareTo(s2.getTempoEpisodio());

    }
}
