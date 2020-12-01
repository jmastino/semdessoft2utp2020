
import javax.swing.JOptionPane;
public class ClaseBase 
{   
		int contventa=0, cod=1;
	Register Venta[]= new Register[10];
	
	public void Clasebase(){
		String ax;
		int op=0;
		do {
			ax = JOptionPane.showInputDialog(null, "1. Ingresar \n"
                    +"2. Mostrar \n"
                    +"3. Buscar \n"
                    +"4. Eliminar \n"
                    +"5. Salir");
			if(ax!=null && !ax.equals("")){
                op = Integer.parseInt(ax);
                
                switch(op){
                case 1:
                    ingresar();
                    break;
                case 2:
                    mostrar();
                    break;
                case 3:
                    buscar();
                    break;
                case 4:
                    eliminar();
                    break;
                case 5:
                    break;
                default:
                    {JOptionPane.showMessageDialog(null, "No es una opción valida!!!");} 
                }
			}
			
		}while(op!=5);
		}
		
		 
	    public void ingresar(){        
	 
	        int no;
	        int dia;
	        int mes;
	        int ano;
	        int telefono;
	        String nombre, apellido;
	        String descripcion;
	        int cantidad;
	        int totald;
	        int subtotal;
	        int itbms;
	        int saldototal;
	        int metododepago; //1 contado, 2 credito
	    	

	        no = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el no de ticket"));
	        dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dia para este ticket: ")) ;
	        mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el mes para este ticket: ")) ;
	        ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año para este ticket: ")) ;
	        telefono = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el Telefono del Cliente: ")) ;
	        nombre = JOptionPane.showInputDialog(null, "Ingrese el Nombre del Cliente: ");
	        apellido = JOptionPane.showInputDialog(null, "Ingrese el Apellido del Cliente: ");
	        descripcion = JOptionPane.showInputDialog(null, "Ingrese descripcion del articulo vendido: ");
	        cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad del articulo: ")) ;
	        totald = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese total por descripcion de este articulo")) ;
	        subtotal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese subtotal por descripcion de este articulo")) ;
	        itbms = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese itbms de este registro")) ;
	        saldototal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese  saldo total")) ;
	        metododepago = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el metodo de pago 1 contado 2 credito ")) ;
	        
	        
	 
	        Register temp = new Register();
	 
	        temp.setNo(no); 
	        temp.setDia(dia);        
	        temp.setMes(mes);
	        temp.setAno(ano);
	        temp.setTelefono(telefono);
	        temp.setNombre(nombre); 
	        temp.setApellido(apellido);
	        temp.setDescripcion(descripcion);
	        temp.setCantidad(cantidad);
	        temp.setTotald(totald);
	        temp.setSubtotal(subtotal);
	        temp.setItbms(itbms);
	        temp.setSaldototal(saldototal);
	        temp.setMetododepago(metododepago);
	        
	        
	        
	        
	        Venta[contventa] = temp;
	        contventa++;  
	        cod++;      
	    }
	 
	    public void mostrar(){
	 
	        String ay="";
	        for(int i=0; i<contventa; i++){
	            ay+="No: "+Venta[i].getNo()+"\n"
	              + "Día: "+Venta[i].getDia()+"\n"
	              + "Mes: "+Venta[i].getMes()+"\n"
	              + "Año: "+Venta[i].getAno()+"\n"
	              + "Telefono: "+Venta[i].getTelefono()+"\n"	  
	              + "Nombre: "+Venta[i].getNombre()+"\n"
	              + "Apellido: "+Venta[i].getApellido()+"\n"
	              + "Descripcion: "+Venta[i].getDescripcion()+"\n"
	              + "Cantidad: "+Venta[i].getCantidad()+"\n"
	              + "Total desc: "+Venta[i].getTotald()+"\n"
	              + "Subtotal: "+Venta[i].getSubtotal()+"\n"
	              + "ITBMS: "+Venta[i].getItbms()+"\n"
	             + "Saldo Total: "+Venta[i].getSaldototal()+"\n"
	              + "Metodo de Pago: "+Venta[i].getMetododepago()+"\n\n";         
	        }
	        JOptionPane.showMessageDialog(null, ay);
	    }
	 
	    public void buscar(){
	 
	        String ax;
	        int c;
	 
	        ax = JOptionPane.showInputDialog(null, "Digite el Numero a buscar");
	        if(ax!=null && !ax.equals("")){
	            c = Integer.parseInt(ax); ax="";
	            if(contventa!=0){
	                for(int i=0; i<contventa; i++){
	                    if(Venta[i].getNo() == c){
	                        ax="";
	                        ax+="No: "+Venta[i].getNo()+"\n"
	              	              + "Día: "+Venta[i].getDia()+"\n"
	            	              + "Mes: "+Venta[i].getMes()+"\n"
	            	              + "Año: "+Venta[i].getAno()+"\n"
	            	              + "Telefono: "+Venta[i].getTelefono()+"\n"	  
	            	              + "Nombre: "+Venta[i].getNombre()+"\n"
	            	              + "Apellido: "+Venta[i].getApellido()+"\n"
	            	              + "Descripcion: "+Venta[i].getDescripcion()+"\n"
	            	              + "Cantidad: "+Venta[i].getCantidad()+"\n"
	            	              + "Total desc: "+Venta[i].getTotald()+"\n"
	            	              + "Subtotal: "+Venta[i].getSubtotal()+"\n"
	            	              + "ITBMS: "+Venta[i].getItbms()+"\n"
	            	             + "Saldo Total: "+Venta[i].getSaldototal()+"\n"
	            	              + "Metodo de Pago: "+Venta[i].getMetododepago()+"\n\n";
	                          break;
	                    }
	                    else{
	                        ax="No se ha encontrado el usuario :("; 
	                    }
	                }
	                JOptionPane.showMessageDialog(null, ax);
	            }
	 
	        }
	    }
	 
	    public void eliminar(){
	        int c;
	        Register ventaTemp[] = new Register[contventa-1];//creando un arreglo temporal con un campo menos
	 
	                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el codigo del estudiante a eliminar: "));//pidiendo el codigo a eliminar
	                        if(c<=contventa){ //si el codigo a eliminar es menor o igual al contador de estudiantes
	 
	                            for(int i=0; i<contventa; i++){ //Inicio ciclo para realizar la eliminacion
	                                if(c == Venta[i].getNo()){ //si el codigo a aliminar coincide con el codigo que hay en la posicion i
	                                    continue; //continua con el ciclo
	                                }
	                                else{
	                                    if(Venta[i].getNo() < c)
	                                        ventaTemp[i] = Venta[i];//si esl codigo es menor se almacena tal cual                     
	                                    if(Venta[i].getNo() > c){
	                                        Venta[i].setNo(i);//si el codigo es mayor se le resta para que quede en consecutivo
	                                        ventaTemp[i-1] = Venta[i]; //se almacena con el nuevo codigo
	                                    }
	                                }                                                                   
	                            } //Fin ciclo para realizar la eliminacion
	                            Venta=null; cod--; contventa--; //se hacen las modificaciones para los nuevos valores                   
	                            Venta = new Register[5]; //se vuelve a crear el arreglo 
	                            for(int i=0; i<ventaTemp.length; i++){ //se almacenan los valores no eliminados
	                                Venta[i]=ventaTemp[i];
	                            }                            
	                        }
	                        else
	                            JOptionPane.showMessageDialog(null, "La venta a eliminar no existe !!!");
	    }
	 
	    public static void main(String[] args) {
	 
	        ClaseBase w = new ClaseBase(); //creacion del objeto w, llamado al constructor de la clase ClaseBase
	        w.Clasebase();
	        System.exit(0);        
	    }

	}
//clase