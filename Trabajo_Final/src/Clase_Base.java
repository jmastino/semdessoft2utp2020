import java.text.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Clase_Base {
	Embarque arreglo[] = new Embarque[12];
	float totalf=0.00f,totalea=0.00f;
	
	public void ingresar()
	{   
    	for(int contventa=0;contventa<arreglo.length;contventa++) 
    	{
	
    	String codigo;
    	String descripcion;
    	float costoDeFabrica =0.00f;
    	int cantidad =0 ;
    	float costoEnAlmacen =0.00f;
    	float pventa1 = 0.00f;
    	float pventa2 = 0.00f;
    	float pventa3 = 0.00f;	
    	JOptionPane.showMessageDialog(null, "GENERADORES ESPECIALIZADOS, S.A.\nBienvenido\nUsted Introducira datos para generar un informe y definir costes de almacen para iniciar distribuci�n\nESTE INFORME COMPONE 12 REGISTROS");
    	
        codigo = JOptionPane.showInputDialog(null, "Ingrese el codigo");
        descripcion = JOptionPane.showInputDialog(null, "Ingrese la descripci�n");
        costoDeFabrica = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el costo De Fabrica: ")) ;
        cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad: ")) ;
        costoEnAlmacen = costoDeFabrica*1.05f;
        pventa1=costoEnAlmacen*1.30f;
        pventa2=costoEnAlmacen*1.40f;
        pventa3=costoEnAlmacen*1.50f;
        
 
        Embarque temp = new Embarque();
 
        temp.setCodigo(codigo); 
        temp.setDescripcion(descripcion);        
        temp.setCostoDeFabrica(costoDeFabrica);
        temp.setCantidad(cantidad);
        temp.setCostoEnAlmacen(costoEnAlmacen);
        temp.setPventa1(pventa1); 
        temp.setPventa2(pventa2);
        temp.setPventa3(pventa3);
        arreglo[contventa] = temp;    
        
    	}
    }

	public void rellenoautomatico() 
	{ 

	//String codigo;
	//String descripcion;
	//float costoDeFabrica =0.00f;
	//int cantidad =0 ;
	float costoEnAlmacen =0f;
	float pventa1 = 0f;
	float pventa2 = 0f;
	float pventa3 = 0f;	
	
	for(int i=0;i<arreglo.length;i++) {
	
    if(i==0) {
    Embarque temp= new Embarque();
	temp.setCodigo("CX3500");    
	temp.setDescripcion("GENERADOR ELECTRICO, 3500W, POWERMATE 208CC");
	temp.setCostoDeFabrica(350.00f);	
	temp.setCantidad(6);
	costoEnAlmacen=350.00f*1.05f;
	pventa1 = costoEnAlmacen*1.30f;
	pventa2= costoEnAlmacen*1.40f;
	pventa3= costoEnAlmacen*1.50f;
	temp.setCostoEnAlmacen(costoEnAlmacen);
	temp.setPventa1(pventa1);
	temp.setPventa2(pventa2);
	temp.setPventa3(pventa3);
    arreglo[i]= temp;
    }
    if(i==1) {
    	Embarque temp= new Embarque();
	temp.setCodigo("CX6500E");
	temp.setDescripcion("GENERADOR ELECTRICO,6500W, POWERMATE 420CC");
	temp.setCostoDeFabrica(425.00f);
	temp.setCantidad(5);
	costoEnAlmacen = 425.00f*1.05f;
	temp.setCostoEnAlmacen(costoEnAlmacen);
	pventa1 = costoEnAlmacen*1.30f;
	temp.setPventa1(pventa1);
	pventa2= costoEnAlmacen*1.40f;
	temp.setPventa2(pventa2);
	pventa3= costoEnAlmacen*1.50f;
	temp.setPventa3(pventa3);
    arreglo[i]= temp;
    
    }
    if(i==2) {
    Embarque temp= new Embarque();
    temp.setCodigo("CX8000E");
	temp.setDescripcion("GENERADOR ELECTRICO,8000W, POWERMATE OHV");
	temp.setCostoDeFabrica(550.00f);
	temp.setCantidad(10);
	costoEnAlmacen = 550.00f*1.05f;
	temp.setCostoEnAlmacen(costoEnAlmacen);
	pventa1 = costoEnAlmacen*1.30f;
	temp.setPventa1(pventa1);
	pventa2= costoEnAlmacen*1.40f;
	temp.setPventa2(pventa2);
	pventa3= costoEnAlmacen*1.50f;
	temp.setPventa3(pventa3);
    arreglo[i]= temp;
    }
	if(i==3) {
	Embarque temp= new Embarque();
	temp.setCodigo("GD6500E");
	temp.setDescripcion("GENERADOR PORTATIL DIESEL,5500W,ECOMAX");
	temp.setCostoDeFabrica(400.00f);
	temp.setCantidad(12);
	costoEnAlmacen = 400.00f*1.05f;
	temp.setCostoEnAlmacen(costoEnAlmacen);
	pventa1 = costoEnAlmacen*1.30f;
	temp.setPventa1(pventa1);
	pventa2= costoEnAlmacen*1.40f;
	temp.setPventa2(pventa2);
	pventa3= costoEnAlmacen*1.50f;
	temp.setPventa3(pventa3);
    arreglo[i]= temp;
	}
	if(i==4) {
	Embarque temp= new Embarque();
	temp.setCodigo("GD7000E");
	temp.setDescripcion("GENERADOR PORTATIL DIESEL,7000W,ECOMAX");
	temp.setCostoDeFabrica(500.00f);
	temp.setCantidad(8);
	costoEnAlmacen = 500.00f*1.05f;
	temp.setCostoEnAlmacen(costoEnAlmacen);
	pventa1 = costoEnAlmacen*1.30f;
	temp.setPventa1(pventa1);
	pventa2= costoEnAlmacen*1.40f;
	temp.setPventa2(pventa2);
	pventa3= costoEnAlmacen*1.50f;
	temp.setPventa3(pventa3);
    arreglo[i]= temp;
	}
	if(i==5) {
	Embarque temp= new Embarque();
	temp.setCodigo("GP3250");
	temp.setDescripcion("GENERADOR ELECTRICO,3250W, GENERAC OHV");
	temp.setCostoDeFabrica(350.00f);
	temp.setCantidad(4);
	costoEnAlmacen = 350.00f*1.05f;
	temp.setCostoEnAlmacen(costoEnAlmacen);
	pventa1 = costoEnAlmacen*1.30f;
	temp.setPventa1(pventa1);
	pventa2= costoEnAlmacen*1.40f;
	temp.setPventa2(pventa2);
	pventa3= costoEnAlmacen*1.50f;
	temp.setPventa3(pventa3);
    arreglo[i]= temp;
	}
	if(i==6) {
	Embarque temp= new Embarque();
	temp.setCodigo("GP3600");
	temp.setDescripcion("GENERADOR ELECTRICO,3600W, GENERAC OHV");
	temp.setCostoDeFabrica(425.00f);
	temp.setCantidad(6);
	costoEnAlmacen = 425.00f*1.05f;
	temp.setCostoEnAlmacen(costoEnAlmacen);
	pventa1 = costoEnAlmacen*1.30f;
	temp.setPventa1(pventa1);
	pventa2= costoEnAlmacen*1.40f;
	temp.setPventa2(pventa2);
	pventa3= costoEnAlmacen*1.50f;
	temp.setPventa3(pventa3);
    arreglo[i]= temp;
	}
	if(i==7) {	
	Embarque temp= new Embarque();
	temp.setCodigo("GP15000E");
	temp.setDescripcion("GENERADOR ELECTRICO,15000W, GENERAC OHVI");
	temp.setCostoDeFabrica(575.00f);
	temp.setCantidad(15);
	costoEnAlmacen = 575.00f*1.05f;
	temp.setCostoEnAlmacen(costoEnAlmacen);
	pventa1 = costoEnAlmacen*1.30f;
	temp.setPventa1(pventa1);
	pventa2= costoEnAlmacen*1.40f;
	temp.setPventa2(pventa2);
	pventa3= costoEnAlmacen*1.50f;
	temp.setPventa3(pventa3);
    arreglo[i]= temp;
	}
	if(i==8) {	
	Embarque temp= new Embarque();
	temp.setCodigo("GP17500E");
	temp.setDescripcion("GENERADOR ELECTRICO,17500W, GENERAC OHVI");
	temp.setCostoDeFabrica(650.00f);
	temp.setCantidad(7);
	costoEnAlmacen = 650.00f*1.05f;
	temp.setCostoEnAlmacen(costoEnAlmacen);
	pventa1 = costoEnAlmacen*1.30f;
	temp.setPventa1(pventa1);
	pventa2= costoEnAlmacen*1.40f;
	temp.setPventa2(pventa2);
	pventa3= costoEnAlmacen*1.50f;
	temp.setPventa3(pventa3);
    arreglo[i]= temp;
	}
	
	if(i==9) {
	Embarque temp= new Embarque();
	temp.setCodigo("GP2200I");
	temp.setDescripcion("GENERADOR ELECTRICO INVERTER, 1700W, GENERAC");
	temp.setCostoDeFabrica(498.75f);
	temp.setCantidad(9);
	costoEnAlmacen = 498.75f*1.05f;
	temp.setCostoEnAlmacen(costoEnAlmacen);
	pventa1 = costoEnAlmacen*1.30f;
	temp.setPventa1(pventa1);
	pventa2= costoEnAlmacen*1.40f;
	temp.setPventa2(pventa2);
	pventa3= costoEnAlmacen*1.50f;
	temp.setPventa3(pventa3);
    arreglo[i]= temp;
	}
	if(i==10) {	
	Embarque temp= new Embarque();
	temp.setCodigo("GP3000I");
	temp.setDescripcion("GENERADOR ELECTRICO INVERTER, 2300W, GENERAC");
	temp.setCostoDeFabrica(555.85f);
	temp.setCantidad(5);
	costoEnAlmacen = 555.85f*1.05f;
	temp.setCostoEnAlmacen(costoEnAlmacen);
	pventa1 = costoEnAlmacen*1.30f;
	temp.setPventa1(pventa1);
	pventa2= costoEnAlmacen*1.40f;
	temp.setPventa2(pventa2);
	pventa3= costoEnAlmacen*1.50f;
	temp.setPventa3(pventa3);
    arreglo[i]= temp;
	}
	if(i==11) {	
	Embarque temp= new Embarque();
	temp.setCodigo("GP3500IO");
	temp.setDescripcion("GENERADOR ELECTRICO INVERTER, 3000W, GENERAC");
	temp.setCostoDeFabrica(700.00f);
	temp.setCantidad(10);
	costoEnAlmacen = 700.00f*1.05f;
	temp.setCostoEnAlmacen(costoEnAlmacen);
	pventa1 = costoEnAlmacen*1.30f;
	temp.setPventa1(pventa1);
	pventa2= costoEnAlmacen*1.40f;
	temp.setPventa2(pventa2);
	pventa3= costoEnAlmacen*1.50f;
	temp.setPventa3(pventa3);
    arreglo[i]= temp;
	}
	
	}
	
	}
	
	public void calctotales() 
	{totalf=0;
	totalea=0;
		for(int i=0;i<arreglo.length;i++)
		{
			totalf+=arreglo[i].getCostoDeFabrica()*arreglo[i].getCantidad();
			totalea+= arreglo[i].getCostoEnAlmacen()*arreglo[i].getCantidad();
		}
	}	
	
	public void mostrargui()
	{	SimpleDateFormat formatter= new SimpleDateFormat("dd-MM-yyyy 'Hora:' HH:mm:ss");
	Date date = new Date(System.currentTimeMillis());
	String ax= "\t\t\t\tUNIVERSIDAD TECNOL�GICA DE PANAM�\n\t\t\t\tCENTRO REGIONAL DE CHIRIQU�";
	ax+="\n\t\t\t\tFACULTAD DE INGENIERIA DE SISTEMAS COMPUTACIONALES";
	ax+="\n\t\t\t\tREPORTE DE COSTOS Y PRECIOS DE VENTA";
	ax+="\n\t\t\t\t\t\t\t\t\t\t\tFecha:"+(formatter.format(date));
	ax+="\nESTUDIANTE: JORDY MASTINO\t\t\t\t\t"+"PROFESOR: CECILIA G,DE BEITIA";
	ax+="\nC�DULA: 0-000-0000\t\t\t\t\t\t"+"SEGUNDO SEMESTRE 2020";
	ax+="\nCARRERA: LIC. EN DESARROLLO DE SOFTWARE\t\t\t\t"+"GRUPO: 2LS212";
	ax+="\n\n\tC�DIGO\t\tDESCRIPCION\t\t\tCOSTODEFABRICA\tCANTIDAD\tCOSTOENALMACEN\tPRECIOVTA1\tPRECIOVTA2\tPRECIOVTA3\n";
	JTextArea salida = new JTextArea();
	salida.setText(ax);
	
	for(int i=0;i<arreglo.length;i++)
	{
		salida.append((i+1)+"\t");
		salida.append(arreglo[i].getCodigo()+"\t");
		salida.append(arreglo[i].getDescripcion()+"\t");
		salida.append(String.format("%.2f",arreglo[i].getCostoDeFabrica())+"\t\t");
		salida.append(arreglo[i].getCantidad()+"\t");
		salida.append(String.format("%.2f",arreglo[i].getCostoEnAlmacen())+"\t\t");
		salida.append(String.format("%.2f",arreglo[i].getPventa1())+"\t");
		salida.append(String.format("%.2f",arreglo[i].getPventa2())+"\t");
		salida.append(String.format("%.2f",arreglo[i].getPventa3())+"\t\n");   
	}
salida.append("\t\t\tCOSTO TOTAL EN FABRICA: \t\t"+String.format("%.2f", totalf));
salida.append("\n\t\t\tCOSTO TOTAL EN ALMACEN: \t\t\t\t\t"+String.format("%.2f",totalea));
	JOptionPane.showMessageDialog(null, salida,"GENERADORES ESPECIALIZADOS, S.A.,",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void main(String[] args) 
	{
		Clase_Base here = new Clase_Base();
		//here.ingresar(); //llenado con joptionpane 12 casillas hasta su tama�o dinamico
		here.rellenoautomatico(); //llenado automatico
		here.calctotales(); //calculado de totales de la tabla
		here.mostrargui();
	}	
}