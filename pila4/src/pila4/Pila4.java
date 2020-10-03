package pila4;
import java.util.Scanner;//declaras scanner
public class Pila4 {

    public static void main(String[] args) {//main

        Scanner mc=new Scanner(System.in);//creas el scanner
        Pila4 c = new Pila4();//para llamar a los metodos
        int op=0;
        do{//ciclo do
        System.out.println("Que desea hacer con el programa");//mensajes del programa
             System.out.println("1 llenar\n"
                    + "2 mostrar\n"
                    + "3 eliminar\n"
                    + "4 agregar\n"
                    + "5 Ordenar\n"
                    + "6 salir\n");//mensajes del programas
           switch (op=mc.nextInt()){//creas condicionales
                    case 1://creas condicionales
                    c.llenar();//lammas al primer metodo
                    break;//creas las condicionales
                   case 2://cras la condicional
                    c.mostrar();//llamas al metodo
                     case 3://llamas la condicion
                    c.eliminar();//llamas al metodo
                    break;//cierras
                   case 4://la condiconal
                    c.agregar();//llamas al metodo
                    case 5://la condicion
                    c.ordenar();//llamas al metodo
                    break;//cerras el metodo
           }} while (op != 6);//es para hacer un bucle
    }
  char pila[]=new char [26];//creas la pila
int tope=0;//creas un tope
public void llenar() {//creas el metodo
     for (int i = 0; i < 26; i++) {//la condcion for para rellenar
            if (tope < 26) {//creas un if
                char letra = 0;//inicializas la variable
                pila[tope] = letra;//condicionas
                letra++;//el tope
                tope++;//el tope
            } else {//en caso de que no se cumpla
                System.out.println("pila llena");//mensaje 
                break;//cierrAS
            }
        }
        System.out.println("valores agregados");//MENSAJE SE EXITO
    }

      public void mostrar() {//metodo ordenare
        for (int i = tope - 1; i >= 0; i--) {//para crear un for para mostrar
            System.out.print(" " + pila[i]);//imprimes la pila
        }
    }

    public void eliminar() {//metodo de eliminar
        tope--;//ocupas el tope
        System.out.println("dato eliminado...");//mensaje 
    }

    public void agregar(char w) {//metodo agregar
        pila[tope] = w; //ocupas el tope
        tope++;//condiciones
        System.out.println("dato agregado..");//mensaje de correcto
    }
public void ordenar(){//metodo de ordenar
    
char letra = 0;//inicializas 
    for(int i=0 ; i<26; i++){//for para ordenar
    for(int j=0 ; j<26; j++){//ayuda a ordenar
     if (tope < 26) {//condicionas el tope
                pila[tope] = letra;//igualas
                letra++;//condicionas
                tope++;//copndicionas 
    }
    }
}}

    private void agregar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
