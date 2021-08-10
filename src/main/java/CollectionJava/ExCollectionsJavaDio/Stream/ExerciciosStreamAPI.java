package CollectionJava.ExCollectionsJavaDio.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {
        //List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        List<String> numerosAleatorios = Arrays.asList("9", "8", "7", "4", "4", "6", "5", "3", "12", "1");
        System.out.println("Imprima todos os elementos dessa lista de String: ");

        // simplificando 3
        numerosAleatorios.forEach(System.out::println);

        // simplificando 1
        //numerosAleatorios.stream().forEach(s -> System.out.println(s));

        // completo
       /*numerosAleatorios.stream().forEach(new Consumer<String>() {
           @Override
           public void accept(String s) {
               System.out.println(s);
           }
       });*/

/************************************************************************************/
        System.out.println("\nPegue os 5 primeiros números e coloque dentro de um Set:");
        Set<String> numerosAleatorios5Primeiros = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet());
        System.out.println(numerosAleatorios5Primeiros);
// ou
/*        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);*/


/***********************************************************************************/
        System.out.println("\nTransforme esta lista de String em uma lista de números inteiros.");
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        //.forEach(System.out::println);
//ou
        // simplificando 2
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // simplificando 1
        /*numerosAleatorios.stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList())
                .forEach(System.out::println);*/

        // completo
        /*numerosAleatorios.stream()
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                })
                .collect(Collectors.toList())
                .forEach(System.out::println);*/

/***********************************************************************************/
        System.out.println("\nPegue os números pares e maiores que 2 e coloque em uma lista:");
        // simplificando 2
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);
//ou
        /*List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(integer -> integer % 2 == 0 && integer>2)
                .collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);*/

        // completo
        /*List<Integer> listParesMaioresQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) {
                        if(integer % 2 == 0 && integer>2)
                            return true;

                        return false;
                    }
                }).collect(Collectors.toList());
        System.out.println(listParesMaioresQue2);*/

/***********************************************************************************/
        System.out.println("\nMostre a média dos números: ");

        // simplificando 2
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        // simplificando 1
        /*numerosAleatorios.stream()
                .mapToInt(s -> Integer.parseInt(s))
                .average()
                .ifPresent(value ->System.out.println(value));*/

        // completo
       /* numerosAleatorios.stream()
                .mapToInt(new ToIntFunction<String>() {
                    @Override
                    public int applyAsInt(String s) {
                        return Integer.parseInt(s);
                    }
                })
                .average()
                .ifPresent(new DoubleConsumer() {
                    @Override
                    public void accept(double value) {
                        System.out.println(value);
                    }
                });*/


/***********************************************************************************/
        System.out.println("\nRemova os valores ímpares: ");

        // simplificando 1
        numerosAleatoriosInteger.removeIf(integer -> integer % 2 != 0);
        System.out.println(numerosAleatoriosInteger);

       /* numerosAleatoriosInteger.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer % 2 != 0)
                    return true;
                return false;
            }
        });
        System.out.println(numerosAleatoriosInteger);*/

/***********************************************************************************/
//        Para você
        System.out.println("\nIgnore os 3 primeiros elementos da lista e imprima o restante:");
        numerosAleatoriosInteger.stream()
                .skip(3)
                .forEach(System.out::println);
/***********************************************************************************/
        System.out.println("\nRetirando os números repetidos da lista, quantos números ficam?");
        long contNumerosDistintos = numerosAleatoriosInteger.stream()
                .distinct()
                .count();// return a long
        System.out.println(contNumerosDistintos);
/***********************************************************************************/
        System.out.print("\nMostre o menor valor da lista: ");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);
/***********************************************************************************/
        System.out.print("\nMostre o maior valor da lista: ");
        numerosAleatoriosInteger.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);
/***********************************************************************************/
        System.out.println("\nPegue apenas os números pares e some: ");
        int somaDosNumerosPares = numerosAleatoriosInteger.stream()
                .filter(i -> (i % 2 == 0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(somaDosNumerosPares);
/***********************************************************************************/
        System.out.println("\nMostre a lista na ordem númerica: ");
        /*List<Integer> numerosOrdemNatural = numerosAleatoriosInteger.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList())
                .forEach(System.out::println);
        //System.out.println(numerosOrdemNatural);*/
// ou
        List<Integer> ordemNumerica = numerosAleatoriosInteger.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(ordemNumerica);

        /* com TreeSet: Ordem Natural numerica *(não repete os numeros)
        Set<Integer> numerosOrdem = new TreeSet<>(numerosAleatoriosInteger);
        System.out.println("\n"+numerosOrdem);*/
/***********************************************************************************/
        // com filter
        System.out.println("\nAgrupe os valores ímpares múltiplos de 3 ou de 5:");
        List<Integer> numerosMultiplos3e5 = numerosAleatoriosInteger.stream()
                .filter(x -> x % 3 == 0 || x % 5 == 0)
                .collect(Collectors.toList());
        System.out.println(numerosMultiplos3e5);
// ou
        // com o método da classe Collectors: groupingBy()
        System.out.println("\nAgrupe os valores ímpares múltiplos de 3 ou de 5: (com groupingBy())");
        // dica: collect(Collectors.groupingBy(new Function())
        Map<Boolean, List<Integer>> collectNumerosMultiplosDe3E5 = numerosAleatoriosInteger.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumerosMultiplosDe3E5);
    }
}

