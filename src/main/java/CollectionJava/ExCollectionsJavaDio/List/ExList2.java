package CollectionJava.ExCollectionsJavaDio.List;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/
public class ExList2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> repostas = new ArrayList<>();

        System.out.print("1. Telefonou para a vítima? ");
        repostas.add(scan.next());
        System.out.print("2. Esteve no local do crime? ");
        repostas.add(scan.next());
        System.out.print("3. Mora perto da vítima? ");
        repostas.add(scan.next());
        System.out.print("4. Devia para a vítima? ");
        repostas.add(scan.next());
        System.out.print("5. Já trabalhou com a vítima? ");
        repostas.add(scan.next());

        int contS=0;
        Iterator<String> iterator = repostas.iterator();
        while (iterator.hasNext()){ // percorre a list verificando se tem proximo elemento.
            String resp = iterator.next();
            if(resp.contains("s") || resp.contains("S"))
                contS++;
        }

       if(contS == 5){
           System.out.println("Assassina");
       }else if(contS == 3 || contS == 4){
           System.out.println("Cumplice");
       }
       else if(contS == 2){
           System.out.println("Suspeita");
       }else{
           System.out.println("Inocente");
       }

    }
}
