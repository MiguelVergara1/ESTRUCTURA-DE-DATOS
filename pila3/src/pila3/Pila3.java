
package pila3;
import java.util.Scanner;//libreria scanner
import java.util.Stack;
public class Pila3 {
    int pila1[] = new int[10 ];///creo las pilas 
    int pila2[]=new int[10 ];//creo las pilas 
     int pila3[]=new int[10 ];//creo las pilas 
    int tope = 0;//es un tope
    public void llenar() {//creo el metodo llenar
        int letra = '1'; //creo una variable
        for (int i = 0; i < 10; i++) {//creo un ciclo for para que lo llene 
            if (tope < 10) {//creo un if para que entre
                pila1[tope] = letra;//declkaro
                letra++;//un bucle
                tope++;//otro bucle
            } else {///por si no es correcto o esta llena la pila
                System.out.println("pila llena");//mensaje 
                break;//cerrar
            }
        }
        System.out.println("valores agregados");//mensaje de exito
    }
        public void llenar1() {//creo el metodo llenar
        int letra = '1'; //creo una variable
        for (int j = 0; j < 10; j++) {//creo un ciclo for para que lo llene 
            if (tope < 10) {//creo un if para que entre
                pila2[tope] = letra;//declaro
                letra++;//topes
                tope++;//topes
            } else {//por si nones ninguna opcion
                System.out.println("pila llena");//mensaje 
                break;//cierra
            }
        }
        System.out.println("valores agregados");//mensaje de valores agregados
    }
        
    public void mostrar() {//metodo de mostar
        for (int i = tope - 1; i >= 0; i--) {//creas un for
            System.out.print(" " + pila1[i]);//imprimes la pila
        }
    }
public void mostrar1() {//metodo de mostar la otra pila
        for (int j = tope - 1; j >= 0; j--) {//creas un for
            System.out.print(" " + pila2[j]);//impries la pila 2
        }
    }

    public void eliminar() {//metodo para eliminar
        tope--;
        System.out.println("datos eliminados...");//eliminas los datos
    }

      public static int sumaPilaEnteros(Stack pila)//sumkar la pila
        {

                if(pila.empty())//creas un if
                { return 0;}//retorna un dato
                else
                {
    return ((Integer)pila.pop()).intValue()+sumaPilaEnteros(pila);//para declarar la suma 
                }  }
public static String sumaPilaCadenas(Stack pila)//utilizas otro nmetodo
        {if(pila.empty())//utilizas un if 
                {return "";      }
                else
                {return (String)pila.pop()+sumaPilaCadenas(pila);}}//retorna la suma
public void mostrarsuma() {//metodo para mostar suma
        for (int j = tope - 1; j >= 0; j--) {//creas ub for
            System.out.print(" " + pila3[j]);//imprimes la pila 
        }
    }
    public static void main(String[] args) {//metodo main
        Pila3 c = new Pila3();//creas un llamador de datos
        
        Scanner mc = new Scanner(System.in);//declaras escanner
        int opt = 0;//inicianizo
        do {
            System.out.println("\n1 llenar\n"//creo el menu
                    + "2 mostrar\n"
                    + "3 eliminar\n"
                    + "4 agregar"
                    + "5 unir pilas\n"
                    + "6mostrar\n");
            switch (opt = mc.nextInt()) {//creo un case
                case 1:
                    c.llenar();//llama los metodos
                    c.llenar1();//llama los metodos
                    break;
                case 2:
                    c.mostrar();//llama los metodos
                    System.out.println("");  //imprime el valor  
                    c.mostrar1();//llama los metodos
                    break;
                case 3:
                    c.eliminar();//llama los metodos
                break;
                case 4:
                    c.mostrarsuma();//llama los metodos
                break;
                case 5:
                c.mostrarsuma();//llama los metodos
                break;
            }
        } while (opt != 6);//regresa a las opciones 
    }
}