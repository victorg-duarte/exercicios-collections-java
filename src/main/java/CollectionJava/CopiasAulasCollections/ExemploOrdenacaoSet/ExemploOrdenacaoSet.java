package CollectionJava.CopiasAulasCollections.ExemploOrdenacaoSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatoria\t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("breaking bad","ficcao",60));
            add(new Serie("bates motel","terror",61));
            add(new Serie("better call saul","comedia",45));
        }};
        for (Serie serie: minhasSeries) {
            System.out.println(serie.getNome()+" - "
            + serie.getGenero()+" - "+ serie.getTempoEpisodio());
        }

        System.out.println("\n--\tOrdem de insercao\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("breaking bad","ficcao",60));
            add(new Serie("bates motel","terror",60));
            add(new Serie("better call saul","comedia",45));
        }};
        for (Serie serie: minhasSeries1) {
            System.out.println(serie.getNome()+" - "
                    + serie.getGenero()+" - "+ serie.getTempoEpisodio());
        }
        System.out.println("\n--\tOrdem de natural tempoEpidosio/Genero\t--");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2) {
            System.out.println(serie.getNome()+" - "
                    + serie.getGenero()+" - "+ serie.getTempoEpisodio());
        }

        System.out.println("\n--\tOrdem de natural Nome/tempoEpidosio/Genero\t--");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie: minhasSeries3) {
            System.out.println(serie.getNome()+" - "
                    + serie.getGenero()+" - "+ serie.getTempoEpisodio());
        }

        //Pra você
        System.out.println("\n--\tOrdem gênero\t--");
        Set<Serie> minhasSeries4= new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie: minhasSeries4) {
            System.out.println(serie.getNome()+" - "
                    + serie.getGenero()+" - "+ serie.getTempoEpisodio());
        }
        System.out.println("\n--\tOrdem Tempo Episódio\t--");
        Set<Serie> minhasSeries5= new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie: minhasSeries5) {
            System.out.println(serie.getNome()+" - "
                    + serie.getGenero()+" - "+ serie.getTempoEpisodio());
        }

    }
}
