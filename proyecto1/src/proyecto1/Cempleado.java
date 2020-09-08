
package proyecto1;

import javax.swing.JOptionPane;//importas la libreria
public class Cempleado {//clase empleado
     public void metodo2(){//metodo
  //mando un mensaje
 JOptionPane.showMessageDialog(null,"usted ingreso como empleado ");//mensaje de aviso
 //inicializas las variable 
 String usuario="empleado";//el usuario
 String clave="1234";//la contraseña
 String usuario_introducido="";//sirve para comparar
 String clave_introducida="";//sirve para comparar
 //Es una condicion que te sirve para poner contraseña 
 while(usuario_introducido.equals(usuario)==false||clave_introducida.equals(clave)==false)//se hace la comparacion
  // si el usuario es correcto te deja continuar 
 { usuario_introducido=JOptionPane.showInputDialog(null,"ingrese el usuario");//introduces el usuario
 clave_introducida=JOptionPane.showInputDialog(null,"ingrese la contraseña");//introduces la contraseña
 }//cierras la comparacion
 int menu2,repetir;//variables
 //funcion para poder repetir
 do{
 //Es el menu de empleado
menu2=Integer.parseInt(JOptionPane.showInputDialog(null,"bienvenido al menu empleado"+ "\n\ningrese el numero 1 si quiere dar de baja un producto"+"\n\ningrese el numero 2 si quiere dar de alta un producto"));
 
 // si pones uno ingresas a dar de baja producto
  if (menu2==1){
  JOptionPane.showMessageDialog(null,"usted ingreso a dar de baja un producto");//mensaje
   String   usuario1 = JOptionPane.showInputDialog(null,"ingrese clave del producto");//ingresas la clave del producto
   String   contraseña1 = JOptionPane.showInputDialog(null,"ingrese nombre del producto");//ingresas el nombre del producto
   JOptionPane.showMessageDialog(null,"se dio de baja con exito ");//mensaje de exito
  }//cierras la condicional
   if (menu2==2){
 // si pones dos ingresas dar de alta un producto
       JOptionPane.showMessageDialog(null,"usted ingreso a dar de alta un producto");//mensaje
   String   nombre = JOptionPane.showInputDialog(null,"ingrese clave del producto");//ingresas clave del producto
   String   usuario1 = JOptionPane.showInputDialog(null,"ingrese nombre del producto");//ingresas nombre del producto
   JOptionPane.showMessageDialog(null,"se dio de alta con exito ");//mensaje de exito
   
   }//cierras la condicional
  //es una condicion de confirmacion para regresar al menu principal
      repetir=JOptionPane.showConfirmDialog(null,"DESEAS REGRESAR AL MENU PRINCIPAL");//mensaje
    }while(repetir==JOptionPane.YES_OPTION);//para ver si quieres regresar el menu principal o no 
     
    }//cierras el metodo
}//ciereras la clase
