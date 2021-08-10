package CollectionJava.ExCollectionsJavaDio.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class ExList1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();
        double soma = 0;
        double media = 0;
        for(int i=0; i<6; i++){
            System.out.print("Temperatura do mes "+(i+1)+": ");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            soma += temp;
            System.out.println("\ncom GET: "+temperaturas.get(i));
            //System.out.println("com IndexOf: "+temperaturas.indexOf(i));
        }
        media = soma / temperaturas.size();

        System.out.println("Temperatura media primeiro semestre: "+media);

        System.out.println("Meses acima da Media:");
        for (int i=0; i < temperaturas.size(); i++){
            if(temperaturas.get(i) > media){
                switch (i) {
                    case 0:
                        System.out.println("\tJaneiro: "+temperaturas.get(i));
                        break;
                    case 1:
                        System.out.println("\tFevereiro: "+temperaturas.get(i));
                        break;
                    case 2:
                        System.out.println("\tMarco: "+temperaturas.get(i));
                        break;
                    case 3:
                        System.out.println("\tAbril: "+temperaturas.get(i));
                        break;
                    case 4:
                        System.out.println("\tMaio: "+temperaturas.get(i));
                        break;
                    case 5:
                        System.out.println("Junho: "+temperaturas.get(i));
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
