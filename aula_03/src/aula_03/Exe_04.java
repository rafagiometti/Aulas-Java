package aula_03;

import java.util.Scanner;

public class Exe_04 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        String a, b, c;

        
        a = leia.nextLine();

        b = leia.nextLine();

        c = leia.nextLine();

        if (a.equalsIgnoreCase("vertebrado")) {
            if (b.equalsIgnoreCase("ave")) {
                if (c.equalsIgnoreCase("carnívoro")) {
                    System.out.println("Águia");
                } else if (c.equalsIgnoreCase("onívoro")) {
                    System.out.println("Pomba");
                }
            } else if (b.equalsIgnoreCase("mamífero")) {
                if (c.equalsIgnoreCase("onívoro")) {
                    System.out.println("Homem");
                } else if (c.equalsIgnoreCase("herbívoro")) {
                    System.out.println("Vaca");
                }
            }
        } else if (a.equalsIgnoreCase("invertebrado")) {
            if (b.equalsIgnoreCase("inseto")) {
                if (c.equalsIgnoreCase("hematófago")) {
                    System.out.println("Pulga");
                } else if (c.equalsIgnoreCase("herbívoro")) {
                    System.out.println("Lagarta");
                }
            } else if (b.equalsIgnoreCase("anelídeo")) {
                if (c.equalsIgnoreCase("hematófago")) {
                    System.out.println("Sanguessuga");
                } else if (c.equalsIgnoreCase("onívoro")) {
                    System.out.println("Minhoca");
                }
            }
        }

        leia.close();
    }
}
