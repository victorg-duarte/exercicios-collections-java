package CollectionJava.ExCollectionsJavaDio.Map;

import java.util.*;

public class ExMap1 {
    public static void main(String[] args) {

        // Crie um dicionário e relacione os estados e suas populações;
        System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
        Map<String, Integer> populacao = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacao);

        //Substitua a população do estado do RN por 3.534.165;
        System.out.println("\nSubstitua a população do estado do RN por 3.534.165;");
        populacao.put("RN",3534165);

        //Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
        System.out.println("\nConfira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;");
        if(!populacao.containsKey("PB")){
            populacao.put("PB",4039277);
            System.out.println(populacao);
        }

        //Exiba a população PE;
        System.out.println("\nExiba a população PE;");
        System.out.println(populacao.get("PE"));

        //Exiba todos os estados e suas populações na ordem que foi informado;
        System.out.println("\nExiba todos os estados e suas populações na ordem que foi informado;");
        Map<String, Integer> populacao2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacao2);

        //Exiba os estados e suas populações em ordem alfabética;
        System.out.println("\nExiba os estados e suas populações em ordem alfabética;");
        Map<String, Integer> populacao3 = new TreeMap<>(populacao2);
        System.out.println(populacao3);

        //Exiba o estado com o menor população e sua quantidade;
        System.out.println("\nExiba o estado com o menor e maior população e sua quantidade;");
        Set<Map.Entry<String, Integer>> entries = populacao3.entrySet();
        String estadoMenorPopulacao="";
        String estadoMaiorPopulacao="";

        for (Map.Entry<String, Integer> entry : entries) {
            if(entry.getValue().equals(Collections.max(populacao3.values())))
                estadoMaiorPopulacao = entry.getKey();
            if(entry.getValue().equals(Collections.min(populacao3.values())))
                estadoMenorPopulacao = entry.getKey();
        }
        System.out.printf("Estado com MAIOR populacao:  %s - %d",
                estadoMaiorPopulacao,Collections.max(populacao3.values()));
        System.out.printf("\nEstado com MENOR populacao:  %s - %d",
                estadoMenorPopulacao,Collections.min(populacao3.values()));

        //Exiba a soma da população desses estados;
        System.out.println("\nExiba a soma da população desses estados;");

        int soma=0;
        for (Map.Entry<String, Integer> entry : populacao3.entrySet()) {
            soma += entry.getValue();
        }
        System.out.println(soma);

        //Exiba a média da população deste dicionário de estados;
        System.out.println("\nExiba a média da população deste dicionário de estados;");
        System.out.println("Média da populacao: "+soma/populacao3.size());

        //Remova os estados com a população menor que 4.000.000;
        System.out.println("\nRemova os estados com a população menor que 4.000.000;");
        Iterator<Integer> iterator = populacao3.values().iterator();

        while(iterator.hasNext()){
            if(iterator.next()<4000000)
                iterator.remove();
        }
        System.out.println(populacao3);

        //Apague o dicionário de estados;
        System.out.println("\nApague o dicionário de estados;");
        populacao3.clear();

        //Confira se o dicionário está vazio.
        System.out.println("\nConfira se o dicionário está vazio: "+populacao3.isEmpty());

    }
}
