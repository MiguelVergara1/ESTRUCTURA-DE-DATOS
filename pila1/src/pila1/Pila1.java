
package pila1;
import java.util.Scanner;
public class Pila1 {
    public static void main(String[] args) {
        Scanner mc = new Scanner(System.in);
        int a, top = 0, b;
        System.out.println("ingresa el tamaño de la pila");
        int[] pila = new int[ b =  mc.nextInt()];
        do{
            System.out.println("\n1 - agregar\n"
                    + "2 - mostrar\n"
                    + "3 - eliminar\n"
                    + "5 - salir\n");
            switch(a = mc.nextInt()){
                case 1:
                    if(top < b){
                    System.out.println("ingresa un valor");
                    pila[top]=mc.nextInt();
                    top++;
                    }else{System.out.println("la pila esta llena..");}
                break;
                case 2:
                    if(top> 0){
                    for(int i= top-1 ; i >=0  ; i--){
                        System.out.print(" "+pila[i]);
                    }}else{System.out.println("la pila esta vacia..");}
                break;
                case 3:
                    if(top > 0){
                    System.out.println("el dato ha eliminado..");
                    top--;
                    }else{System.out.println("la pila esta vacia..");}
                break;
            }
        }while(a != 5 );
        
        
    
    
    }

}