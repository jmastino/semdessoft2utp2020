package NotacionED2;
import javax.swing.JOptionPane;
/**
 * @author JordyM
 */
public class Prefijos {
//PROGRAMA PARA PREFIJO
		 public static void main(String[] args) {
		        String text = JOptionPane.showInputDialog("Dame infijo :");
		        //System.out.println("Prefijo : "+ Infijo2PrefijoTxt(text));
		        JOptionPane.showMessageDialog(null, "Prefijo : "+ Infijo2PrefijoTxt(text));
		    }
		    public static String Infijo2PrefijoTxt(String infijo){
		        Pila p1 = Infijo2Prefijo(infijo);
		        String text = "";
		        while (p1.i > 0)
		            text += p1.pop();
		        return text;
		 
		    }
		 
		    public static Pila Infijo2Prefijo(String infijo) {
		        infijo = '(' + infijo ; // Agregamos al final del infijo un ')'
		        int tama�o = infijo.length();
		        Pila PilaDefinitiva = new Pila(tama�o);
		        Pila PilaTemp = new Pila(tama�o);
		        PilaTemp.push(')'); // Agregamos a la pila temporal un '('
		        for (int i = tama�o-1; i > -1; i--) {
		            char caracter = infijo.charAt(i);
		            switch (caracter) {
		            case ')':
		                PilaTemp.push(caracter);
		                break;
		            case '+':case '-':case '^':case '*':case '/':
		                while (Jerarquia(caracter) > Jerarquia(PilaTemp.nextPop()))
		                    PilaDefinitiva.push(PilaTemp.pop());
		                PilaTemp.push(caracter);
		                break;
		            case '(':
		                while (PilaTemp.nextPop() != ')')
		                    PilaDefinitiva.push(PilaTemp.pop());
		                PilaTemp.pop();
		                break;
		            default:
		                PilaDefinitiva.push(caracter);
		            }
		        }
		        return PilaDefinitiva;
		    }
		 
		    public static int Jerarquia(char elemento) {
		        int res = 0;
		        switch (elemento) {
		        case ')':
		            res = 5; break;
		        case '^':
		            res = 4; break;
		        case '*': case '/':
		            res = 3; break;
		        case '+': case '-':
		            res = 2; break;
		        case '(':
		            res = 1; break;
		        }
		        return res;
	}
}
