package notacionED1;

import javax.swing.JOptionPane;
/**
 * @author JordyM
 */
public class Postfijos {
// PROGRAMA PARA POSTFIJO
	public static void main(String[] args) {
        String Expresion, postfija="";  
        int i=0;
        Tipo_Pila Pila = new Tipo_Pila();
        Expresion = JOptionPane.showInputDialog("Teclear la expresión a validar:"); 
        char simbolo,elemento;
        while(i<Expresion.length()){
            simbolo=Expresion.charAt(i);
            if(!Pila.esOperador(simbolo))
                postfija+=simbolo;
            else{
                while(!Pila.pilaVacia() &&
                        Pila.Precedencia(Pila.Cima(), simbolo) ){
                    elemento=Pila.quitar();
                    postfija += elemento;
                }
                if (simbolo != ')') 
                    Pila.insertar(simbolo);  
                else           
                    Pila.quitar();
            }
            i++;
        }
        while(!Pila.pilaVacia()){
            elemento = Pila.quitar();
            postfija += elemento;
        }
        JOptionPane.showMessageDialog(null, postfija);
    } 
	
	
	
}
