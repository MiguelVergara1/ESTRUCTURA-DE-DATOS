//es un programa de bajas y altas
package proyecto1;

import javax.swing.JOptionPane;//importo la libreria de cuadros de dialogo


public class Proyecto1 {//nombre de la clase

   
    public static void main(String[] args) {//Es la clase main
         int menu1;//variable para seleccionar el menu principal
         //mando un cuadro de dialogo
 JOptionPane.showMessageDialog(null,"usted esta a punto de ingresar al menu principal ");//es una aviso de menu principal
//es un menu para eligir si quieres ingresar como gerente o empleado
menu1=Integer.parseInt(JOptionPane.showInputDialog(null,"bienvenido al menu principal"+ "\n\ningrese el numero 1 si quiere ingresar como gerente"+"\n.ingrese el numero 2 si quiere ingresar como empleado"+"\n\n"));
  //menu gerente
 if (menu1==1){//primera condicional
cgerente CG=new cgerente();//llamas a la clase cgerente
 CG.metodo1();//llamas al metodo de la clase gerente 
 }//cierras la condicional
 //menu empleado
 else if (menu1==2){//segunda condicional 
Cempleado CE=new Cempleado();//llmas a la clase cempleado
 CE.metodo2();//llamas al metodo de la clase cempleado
 
 }//cierras la condicional   
    }//cierras main
    
}//cierras la clase
