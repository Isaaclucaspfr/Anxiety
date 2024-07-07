import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;

public class App {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String urlAnsiedade = "https://www.youtube.com/watch?v=jKUlx68HIp8";
    String urlMedo = "https://www.youtube.com/watch?v=GQjo8mOUVLk";
    String urlFraco = "https://www.youtube.com/watch?v=jLCQJnUSdWk";
System.out.println("Bem vindo a sua autoajuda! \n Vamos começar: \n Oque está sentindo? \n 1. Ansiedade \n 2.Medo \n 3.Fraco \n 0.Exit ");
int opcao = input.nextInt();
switch (opcao) {
    case 1:
    try {
        URI uri = new URI(urlAnsiedade);
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.BROWSE)) {
                desktop.browse(uri);
            } else {
                System.out.println("Ação de navegação não suportada");
            }
        } else {
            System.out.println("Desktop não suportado");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    break;

    case 2:
    try{
        URI uri= new URI(urlMedo);
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.BROWSE)){
                desktop.browse(uri);
            }else{
                System.out.println("ação de navegação não suportada");
            }
        }else{
            System.out.println("Desktop não suprotado");
        }
    }catch (Exception e){
        e.printStackTrace();
    }
    break;

    case 3:
    try{
        URI uri = new URI(urlFraco);
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.BROWSE)){
                desktop.browse(uri);
            }else{
                System.out.println("Ação de navegação não suportada");
            }
        }else{
            System.out.println("Desktop não suportado");
        }
    }catch (Exception e){
        e.printStackTrace();
    }
    break;

    case 0:
    break;
    default:
        break;
        } 
    }    
}

