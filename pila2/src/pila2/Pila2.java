package pila2;

import java.util.Scanner;
public class Pila2 {
    char pilabc[] = new char[26];
    int tope = 0;
    public void llenar() {
        char letra = 'A'; 
        for (int i = 0; i < 26; i++) {
            if (tope < 26) {
                pilabc[tope] = letra;
                letra++;
                tope++;
            } else {
                System.out.println("pila llena");
                break;
            }
        }
        System.out.println("valores agregados");
    }

    public void mostrar() {
        for (int i = tope - 1; i >= 0; i--) {
            System.out.print(" " + pilabc[i]);
        }
    }

    public void eliminar() {
        tope--;
        System.out.println("dato eliminado...");
    }

    public void agregar(char w) {
        pilabc[tope] = w; //$ *
        tope++;
        System.out.println("dato agregado..");
    }

    public static void main(String[] args) {
        Pila2 c = new Pila2();
        
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        do {
            System.out.println("\n1 llenar\n"
                    + "2 mostrar\n"
                    + "3 eliminar\n"
                    + "4 agregar"
                    + "5 Ordenar\n"
                    + "5 salir\n");
            switch (opt = sc.nextInt()) {
                case 1:
                    c.llenar();
                    break;
                case 2:
                    c.mostrar();
                    break;
                case 3:
                    c.eliminar();
                break;
                case 4:
                    System.out.println("ingresa el dato");
                    char w=sc.next().charAt(0);
                    c.agregar(w);
                break;
            }
        } while (opt != 5);
    }
}