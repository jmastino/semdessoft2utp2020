
public class Embarque {

	private String codigo;
	private	String descripcion;
	private float costoDeFabrica=0.00f;
	private int cantidad;
	private float costoEnAlmacen =0.00f;
	private float pventa1 = 0.00f;
	private float pventa2 = 0.00f;
	private float pventa3 = 0.00f;
 	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getCostoDeFabrica() {
		return costoDeFabrica;
	}

	public void setCostoDeFabrica(float costoDeFabrica) {
		this.costoDeFabrica = costoDeFabrica;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getCostoEnAlmacen() {
		return costoEnAlmacen;
	}

	public void setCostoEnAlmacen(float costoEnAlmacen) {
		this.costoEnAlmacen = costoEnAlmacen;
	}
	
	public float getPventa1() {
		return pventa1;
	}

	public void setPventa1(float pventa1) {
		this.pventa1 = pventa1;
	}

	public float getPventa2() {
		return pventa2;
	}

	public void setPventa2(float pventa2) {
		this.pventa2 = pventa2;
	}

	public float getPventa3() {
		return pventa3;
	}

	public void setPventa3(float pventa3) {
		this.pventa3 = pventa3;
	}	
}