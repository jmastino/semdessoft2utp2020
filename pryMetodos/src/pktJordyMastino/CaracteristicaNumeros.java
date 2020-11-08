package pktJordyMastino;
/**
 * Esta es la clase para procesar numeros o cadenas segun se pida en la clase de Desarrollo de software II
 *<br>Universidad Tecnológica de Panamá
 *<br>Centro Regional Universitario de Chiriquí
 * 
 * @version 1.0
 * @author Jordy Mastino
 * @Grupo 2LS211
 * @Año 2020
 */

public class CaracteristicaNumeros {
	//mtd suma divisores por reutilizar codigo
	/**Metodo para verificar si un numero entero es primo.
     * @param num  el numero a verificar por este método.
     * @return retorna S si es número primo N si no es un número primo.
     * @see CaracteristicaNumeros
     */
	public char mtdprimo(int num) 
	{	int a=0;
		for(int i=1;i<(num+1);i++)
		{
	         if(num%i==0)
	         {
	             a++;
	         }
		}
	         if(a!=2)
	         {
	              return 'N';
	         }
	         else
	         {
	                return 'S';
	         }		         
	}
	/** Metodo para calcular si el numero entero es perfecto
	 * 
	 * @param num el numero a verificar por este metodo.
	 * @return 'S' o 'N' segun si el numero INT es perfecto
	 * @see CaracteristicaNumeros
	 *
	 */
	public char mtdperfecto(int num)
	{
		int i,sum=0, mul=0;
		for(i=1; i<num; i++) 
		{
			mul=num%i;
			if(mul==0) 
			{
				sum+=i;
			}
		}
		if(sum==mul)
		{
			return 'S';
		}
		else
			return 'N';
	}
	/**
	 * Metodo para devolver la cantidad de cifras de un numero.
	 * @param num el numero a verificar por este Metodo.
	 * @return retorna el limite en tipo de dato Byte sobre la cantidad de digitos introducidos al metodo.
	 */
	public byte mtdcifras(long num)
	{	byte cifras=0;
		while(num!=0)
		{             //mientras a n le queden cifras
            num = num/10;         //le quitamos el último dígito
           cifras++;
		}
		return cifras;
	}
	/**
	 * Metodo para verificar si un numero es par o Impar.
	 * @param num el numero int a verificar por este metodo.
	 * @return retorna 'P' si es par 'I' si es impar.
	 */
	public char mtdparimpar(int num)
	{
		 if ( num % 2 == 0 )
	        {
	            return 'P';
	        }
	        else
	        {
	            return 'I';
	        }
	}
	/**
	 * Metodo para calcular el factorial de un numero entero
	 * @param num el numero int a calcular por este metodo.
	 * @return retorna el factorial de tipo {@code Long} para este metodo.
	 */
	public long mtdfactorial(int num)
	{	
		long factorial=1;
		while(num!=0)
		{
		factorial = factorial * num;
        num--;
        }
	return factorial;
	}
	/**Metodo invertir el numero long.
	 * @param num el numero introducido tipo long para ser procesado.
	 * @return devuelve procesado este numero de manera invertida.
	 */
	public long mtdinvertir(long num)
	{
        long cifra, inverso = 0;
        while(num!=0){
            cifra = num%10;
            inverso = (inverso * 10) + cifra;
            num/=10;
        }
        return inverso;
    }
	/**Metodo invertir el numero float.
	 * @param num el numero introducido tipo {@code Float} para ser procesado.
	 * @return devuelve procesado este número de manera invertida.
	 */
	public float mtdinvertir(float num)
	{
        float cifra, inverso = 0;
        while(num!=0){
            cifra = num%10;
            inverso = (inverso * 10) + cifra;
            num/=10;
        }
        return inverso;
    }
	
	/**Metodo invertir el numero int.
	 * @param num el numero introducido tipo {@code Int} para ser procesado.
	 * @return devuelve procesado este número de manera invertida.
	 */
	public int mtdinvertir(int num)
	{
        int cifra, inverso = 0;
        while(num!=0){
            cifra = num%10;
            inverso = (inverso * 10) + cifra;
            num/=10;
        }
        return inverso;
    }
	/**
	 * Metodo para verificar si el numero introducido es un numero abundante.
	 * @param num el numero a verificar por este metodo.
	 * @return retorna 'S' si es numero abundante 'N' en caso contrario.
	 */
	public char mtdabundante(int num)
	{
	    int suma = 0;
	    for (int divisor = 1; divisor <= num / 2; ++divisor)
	    {
	        if (num % divisor == 0)
	        {
	            suma += divisor;
	        }
	    }
	    if (suma > num)
	    {
	    	return 'S';
	    }
	    else
	    {
	    	return 'N';
	    }
	    
	}
	/**
	 * Metodo para verificar si dos numero enteros son numeros amigos.
	 * @param num1 el primer numero a ser procesado para verificar si es numero amigo.
	 * @param num2 el segundo numero a ser procesado para verificar si es numero amigo.
	 * @return retorna {@code true} si ambos son numeros amigos y retorna {@code false} si no son números amigos.
	 */
	public boolean mtdamigos(int num1,int num2)
	{
		int a,b,c1=0,c2=0;
		for(a=1;a<=num1/2;a++)
		{
			if (num1 % a==0)
			{
				c1=c1+a;
			}
		}
		for(b=1;b<=num2/2;b++)
		{
			if (num2%b==0)
			{
				c2=c2+b;
			}
		}
		if (c1==num2)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	/**
	 * Metodo para verificar si el numero entero introducido es Armstrong.
	 * @param num el numero a verificar por este metodo.
	 * @return 'S' si es un numero armstrong y 'N' sino es un numero armstrong.
	 */
	public char mtdnumarmstrong(int num)
	{	 	int c=0,a,temp;    
		    temp=num;  
		    while(num>0)  
		    {  
		    a=num%10;  
		    num=num/10;  
		    c=c+(a*a*a);  
		    }  
		    if(temp==c)  
		    {return 'S';}   
		    else  
		    {return 'N';}
	}
	/**
	 * Metodo para imprimir la sucesion ulam de numero al haber introducido un numero entero.
	 * @param num el número a procesar por este metodo.
	 * @return retorna en consola la impresión de la sucesión ulam.
	 */
	public void mtdulam(int num) 
	{
		int contador=0,temporal,par;
        
        if (num > 0) //Utilizado para saber si los números son positivos
        {
            while (num != 1) //Mientras el resultado o numero sea diferente de 1
            {
                contador++;
                temporal = num; //Almacena numero
                par = num % 2; // saca el residuo del numero entre 2
                if (par == 0) //Si el residuo es igual a 0 es un numero par
                {
                    num = num / 2;
                    System.out.println(contador + ". " + temporal + "=" + num);
                }
                else //Si no es par es impar
                {
                   num = (num * 3) + 1;
                    System.out.println(contador + ". " + temporal + "=" + num);
                }
            }
        }
		
	}
	/**
	 * Metodo para retornar si la cadena introducida en el metodo luego de ser procesada es una cadena tipo palindrome
	 * <br> WARNING !!: No procesa palindromes con espacios en blanco o por teclado. 
	 * @param cadena es la {@code String} para procesar y saber si es una palabra palindrome.
	 * @return retorna 'S' en caso de ser una palabra palindrome 'N' sino es palindrome , 
	 */
	public char mtdpalindrome(String cadena)
	{	//int longitud=cadena.length();
		cadena = cadena.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
		String invertida = new StringBuilder(cadena).reverse().toString();
	if(cadena==invertida)
		{
			return 'S';
		}
		else {
			return 'N';
		}
	}
	/**
	 * metodo para verificar si un numero tipo {@code Long} es un numero capicua
	 * @param num el numero a verificar {@code Long} por este metodo.
	 * @return retorna 'S' si es un numero capicua y 'N' en caso contrario
	 */
	public char mtdcapicua(long num)
	{ CaracteristicaNumeros obj = new CaracteristicaNumeros();
		long comparar=0;
		comparar = obj.mtdinvertir(num);
		if (comparar==num)
		{
			return 'S';
		}
		else
		{
			return 'N';
		}
	}
	//HACER EL COMENTARIO DE JAVADOC PARA ESTE METODO
	public char mtdfeliz(int num)
	{	boolean d=false;
		int k=0,sum,g,s;
		do
		{
			for(sum=0;num!=0;sum+=s)
			{
				g=num%10; //se extrae el ultimo digito
				num/=10; //se divide el numero entre 10 para que cambie
				s=g*g; //se eleva el residuo de la division al cuadrado
			}
			if(sum==1){ //si el sumador da 1 se termina el programa
				d=true;}

			else{ //sino se mira la posibilidad de que en la siguiente
				num=sum; //iteraccion el numero de uno, este ciclo se prueba 21 veces
				k++;
				if(k==20) //dado caso que el sumar no de uno en las 21 iteracciones finaliza el programa
				{
					sum=1; //cierro el ciclo forzadamente ya que no se encontro el valor esperado
					d=false;
				}
				} 
		}while(sum!=1); //se evalua la condicion de que solo finaliza cuando la suma de uno
		if(d==true)
		{return 'S';}
		else
		{return 'N';}
	}
	}