package CollectionJava.ExCollectionsJavaDio.Set;

import java.util.*;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra 'v';
f) Remova todas as cores que não começam com a letra 'v';
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */
public class ExSet1 {
    public static void main(String[] args) {
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("violeta");
        coresArcoIris.add("anil");
        coresArcoIris.add("azul");
        coresArcoIris.add("verde");
        coresArcoIris.add("amarelo");
        coresArcoIris.add("laranja");
        coresArcoIris.add("vermelho");
        System.out.println(coresArcoIris);

        //a) Exiba todas as cores o arco-íris uma abaixo da outra;
        System.out.println("\na) Exiba todas as cores o arco-íris uma abaixo da outra;");
        for (String cor : coresArcoIris) {
            System.out.println(cor);
        }

        //b) A quantidade de cores que o arco-íris tem;
        System.out.println("\nb) A quantidade de cores que o arco-íris tem;");
        System.out.println(coresArcoIris.size());

        //c) Exiba as cores em ordem alfabética;
        System.out.println("\nc) Exiba as cores em ordem alfabética;");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);

        //d) Exiba as cores na ordem inversa da que foi informada;
        System.out.println("\nd) Exiba as cores na ordem inversa da que foi informada;");
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris2);
        Collections.reverse(coresArcoIrisList); // o método só funciona com List
        System.out.println(coresArcoIrisList);

        //e) Exiba todas as cores que começam com a letra 'v';
        System.out.println("\nExiba todas as cores que começam com a letra 'v';");
        for (String cor: coresArcoIris2) {
            if(cor.startsWith("v")){
                System.out.println(cor);
            }
        }

        //f) Remova todas as cores que não começam com a letra 'v';
        System.out.println("f) Remova todas as cores que não começam com a letra 'v';");
        Iterator<String> iterator = coresArcoIris2.iterator();
        while (iterator.hasNext()){
            if(iterator.next().startsWith("v"))
                iterator.remove();
        }
        System.out.println(coresArcoIris2);

        //g) Limpe o conjunto;
        System.out.println("\ng) Limpe o conjunto; 'coresArcoIris2.clear();'");
        coresArcoIris2.clear();

        //h) Confira se o conjunto está vazio;
        System.out.println("\nh) Confira se o conjunto está vazio;");
        System.out.println("coresArcoIris2 esta vazio? " + coresArcoIris2.isEmpty());
        System.out.println("coresArcoIris esta vazio? " + coresArcoIris.isEmpty());
    }
}
