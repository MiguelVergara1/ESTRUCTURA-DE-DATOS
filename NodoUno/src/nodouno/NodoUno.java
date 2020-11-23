package nodouno;
import java.util.Scanner;
public class NodoUno {

    static class Nodo {

        String dato;
        Nodo sig;
    }

    public static void main(String[] args) {
       System.out.println("Que desea ocupar\n"
               + "1. Pila\n" + 
               "2. colas");
       Scanner mc=new Scanner(System.in);
       int op=mc.nextInt();
       switch(op){
           
           case 1:
        Nodo fin = null;
        fin = new Nodo();
        fin.dato = "A";
        fin.sig = null;
        mostrar("caso 1",fin);
        Nodo temp;
        temp=new Nodo();
        temp.dato="B";
        temp.sig=fin;
        fin=temp;
        mostrar("caso 2",fin);
        break;
           case 2:
        temp =new Nodo();
        temp.dato="C";
        temp.sig=null;
        Nodo temp2;
        temp2 = fin;
        while(temp2.sig != null){
        temp2 = temp2.sig;
        }
        temp2.sig=temp;
        mostrar("case 3" , fin);
       
break;
    }}
    static void mostrar(String dato, Nodo actual) {
        System.out.println(dato + " ");
        while (actual != null) {
            System.out.println(actual.dato + " ");
            actual = actual.sig;
        }}
static void ingresar(String dato, Nodo actual){
System.out.println(dato + " ");
        while (actual != null) {
            System.out.println(actual.dato + " ");
            actual = actual.sig;
}
    }}

