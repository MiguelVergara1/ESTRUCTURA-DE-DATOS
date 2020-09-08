
package proyecto1;
import javax.swing.JOptionPane;//importas la libreria
public class cgerente {//clase gerente
     public void metodo1(){//metodo de la clase gerente
 //mando un mensaje
  JOptionPane.showMessageDialog(null,"usted ingreso como gerente ");//mensaje
//inicializas las variable 
  String usuario="miguel";//usuario
 String clave="1234";//clave 
 String usuario_introducido="";//sirve para poder comparar
 String clave_introducida="";//sirve para poder comparar
 //Es una condicion que te sirve para poner contraseña
 while(usuario_introducido.equals(usuario)==false||clave_introducida.equals(clave)==false)//hace la comparacion y si esta bien puedes continuar
 { usuario_introducido=JOptionPane.showInputDialog(null,"ingrese el usuario");//compara
 clave_introducida=JOptionPane.showInputDialog(null,"ingrese la contraseña");//compara
 } int menu2,repetir;//variables para acceder al menu
 //funcion para poder repetir
 do{//sirve para poder repetir
 //Es el menu de gerente
  menu2=Integer.parseInt(JOptionPane.showInputDialog(null,"bienvenido al menu gerente"+ "\n\ningrese el numero 1 si quiere dar de baja a un empleado"+"\n\ningrese el numero 2 si quiere dar de alta a un empleado"+"\n\n"));
    
   
 //si tecleas 1 ingresas a dar de baja empledo
if (menu2==1){//primera condicionbal
   JOptionPane.showMessageDialog(null,"usted ingreso a dar de baja a un empleado");//mensaje
   String   usuario1 = JOptionPane.showInputDialog(null,"ingrese empleado");//ingresa empleado
   String   contraseña1 = JOptionPane.showInputDialog(null,"ingrese contraseña");//ingresa la contraseña
   JOptionPane.showMessageDialog(null,"se dio de baja con exito ");//mensaje
        
  
  }//cierras la condicional
 //si teclas dos ingresas a dar de alta empleado
    if (menu2==2){//segunda condicional 
         JOptionPane.showMessageDialog(null,"usted ingreso a dar de alta a un empleado");//mensaje 
   String   nombre = JOptionPane.showInputDialog(null,"ingrese nombre");//ingresa el empleado
   String   usuario1 = JOptionPane.showInputDialog(null,"ingrese usuario");//ingrese el usuario
   String   contraseña1 = JOptionPane.showInputDialog(null,"ingrese contraseña");//ingrese la contraseña
   JOptionPane.showMessageDialog(null,"se dio de alta con exito ");//mensaje
  }//cierras la condicional
 //condicional para poder regresar al meno principal
  repetir=JOptionPane.showConfirmDialog(null,"DESEAS REGRESAR AL MENU PRINCIPAL");//mensaje
    }while(repetir==JOptionPane.YES_OPTION);//cierra el do 
    
}//cierra el metodo
}//cierra la clase 
