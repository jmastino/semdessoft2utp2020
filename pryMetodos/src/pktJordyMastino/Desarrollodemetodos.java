package pktJordyMastino;
import java.io.*;
import java.util.*;
public class Desarrollodemetodos 
{
	Scanner sc = new Scanner(System.in);
	//------ESPACIO METODO-------ESPACIO METODO-----------------
	public void encabezado()
	{
		System.out.println("Nombre\tSalario Normal\tBonificación\tSalario Total\tSalario Real");
	}
	//------ESPACIO METODO-------ESPACIO METODO-----------------
	public int mtdnumi()  
	{ int num=0;
	//Scanner sc = new Scanner(System.in);
	System.out.println("Introduzca el valor:");	
	num=sc.nextInt();
	return num;
	}
	//------ESPACIO METODO-------ESPACIO METODO-----------------
	public float mtdnumf()
	{float num=0;
	//Scanner sc = new Scanner(System.in);
	System.out.println("Introduzca el valor:");
	num=sc.nextFloat();
	return num;
	}
	//------ESPACIO METODO-------ESPACIO METODO-----------------
	
	public static void main(String[] args) throws IOException 
	{
		CaracteristicaNumeros llam = new CaracteristicaNumeros();
		Desarrollodemetodos ent = new Desarrollodemetodos();
		CalcularSalarios cs = new CalcularSalarios();
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		float ce=0.25f,SalN=0,SalT=0,SalR=0,bon=0,pagoHora=0;  //LOS SALARIOS SE ENCUENTRAN DECLARADOS AQUI 
		int horas=0,cont=0,num1=0,num2=0;
		byte nacimiento=0,mesnac=0;
		Random rnd = new Random();
		while(num1<200)
		{num1=rnd.nextInt(9565);}
		while(num2<200)
		{num2=rnd.nextInt(9565);}
		
		do {
		System.out.println("-----Bienvenido al programa para calcular su salario-----");
		System.out.println("Introduzca el Nombre del Empleado");
		nombre=sc.nextLine();	
		if(!nombre.equals("FIN"))
			{
				do
				{	System.out.println("Introduzca el Fecha de Nacimiento del Empleado "+nombre+":");
					nacimiento=sc.nextByte();
				}while(nacimiento<=0||nacimiento>=32);
				
				if(llam.mtdperfecto(nacimiento)=='S')
				{
					bon+=50.00f;
				}
				
				do
				{	System.out.println("Introduzca el mes de Nacimiento del Empleado "+nombre+"(1-12)"+": ");
					mesnac=sc.nextByte();
				}while(mesnac<=0||mesnac>=13);
				if(llam.mtdprimo(mesnac)=='S') 
				{
					bon+=30.00f;
				}
				//randoms pero si se necesitan pedir por teclado no los coloque porque tuve la duda!!!
				
				/*while(num1<200 || num1>9564)
				{
				System.out.println("Introduzca un numero entero entre 200 y 9564.");
				num1=ent.mtdnumi();
				}
				while(num2<200 || num2>9564)
				{System.out.println("Introduzca un numero entero entre 200 y 9564");
				num2=ent.mtdnumi();
				}
				//randoms
				 * 
				 */
				if(llam.mtdamigos(num1, num2)==true)
				{
					bon+=100.00f;
				}
				if(llam.mtdnumarmstrong(num1)=='S'||llam.mtdnumarmstrong(num2)=='S')
				{
				 bon+=150.00f;
				}
				if(llam.mtdfeliz(num1)=='S'^llam.mtdfeliz(num2)=='S') 
				{
					bon+=375.00f;
				}
				System.out.println("Introduzca las Horas trabajadas de "+nombre+" en la primera semana:");
				horas=ent.mtdnumi();
				System.out.println("Introduzca el pago por hora de "+nombre+" en la primera semana:");
				pagoHora=ent.mtdnumf();
				SalN+=cs.salario(horas, pagoHora, ce);
				//semana 2
				horas=0; pagoHora=0;
				System.out.println("Introduzca las Horas trabajadas de "+nombre+" en la segunda semana:");
				horas=ent.mtdnumi();
				System.out.println("Introduzca el pago por hora de "+nombre+" en la segunda semana:");
				pagoHora=ent.mtdnumf();
				sc.nextLine();
				SalN=cs.salario(horas, pagoHora, ce);
				SalT=SalN+bon;
				float invertido=0;
				invertido=llam.mtdinvertir((int)SalT); //detalle la profesora pidio truncamiento
				if(invertido>SalT)
				{
					SalR=invertido;
				}
				else 
				{SalR=SalT;}
				cont++; 
				ent.encabezado();
				System.out.println(nombre+"\t\t"+SalN+"\t"+bon+"\t\t"+SalT+"\t\t"+SalR);
				num1=0; num2=0; SalN=0.0f; bon=0; SalT=0; SalR=0; pagoHora=0; horas=0; invertido=0; mesnac=0; nacimiento=0;
			}	
		}  
		while(!nombre.equals("FIN"));
		llam.mtdulam(cont);
	sc.close();
	}

}
