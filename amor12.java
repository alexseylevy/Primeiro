
import java.awt.*;
import java.net.URI; //Abrir link externo
import java.util.Scanner; //Bibilioteca de console

public class amor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mari = ""; //Não precisa declarar nada
        Scanner i = new Scanner(System.in); //console de string

        System.out.println("Quem é você?");
        mari = i.nextLine(); //Chamar o console

        if (mari.equalsIgnoreCase("Marianna")) { //Declara o nome de recebimento de console aqui
            System.out.println("Então, você é o grande amor da minha vida, e eu te amo!");
        } else {
            System.out.println("Você não é a escolhida");
            System.exit(0); //finalizar em caso de else
        }
        Scanner a = new Scanner(System.in);
        if (mari.equalsIgnoreCase("Marianna")) {
            System.out.println("Qual dia nos conhecemos?");
        } else {
        }
        mari = i.nextLine(); //Chamar mais console
        String data = "";
        Scanner b = new Scanner(System.in);
        if (mari.equalsIgnoreCase("23")) {
            System.out.println("Isso mesmo amor");
            System.out.println("Quero que saiba que é um dia muito importante, e que te ter ao meu lado é maravilhoso.");
        } else {
            System.out.println("Deve de ser mesmo!");
            System.out.println("Você deveria se envergonhar de não saber!");
            System.out.println("Tô chateado. Fala comigo mais não.");
            System.exit(0);
        }
        Scanner c = new Scanner(System.in);
        if (mari.equalsIgnoreCase("23")) {
            System.out.println("Vamos no Burguer King hoje?");
            System.out.println("Sim ou não?");
        } else {
        }
        mari = i.nextLine(); //Chamar mais console
        String resposta = "";
        if (mari.equalsIgnoreCase("sim")) {
            try { //abrir link url
                URI link = new URI("www.youtube.com/watch?v=vEnbKUfJalQ&ab_channel=BurgerKingBR"); //METODO ABRIR SITE
                Desktop.getDesktop().browse(link);
            } catch (Exception erro) {
                System.out.println(erro);
            }
        }
        else{
                try { //abrir link url
                    URI link = new URI("https://www.youtube.com/watch?v=-Xccy6MGQvw&ab_channel=TheozinhoMemes"); //METODO ABRIR SITE
                    Desktop.getDesktop().browse(link);
                } catch (Exception erro) {
                    System.out.println(erro);
                }

            }
        }
    }
    
