package pktJordyMastino;
/**
 * Esta es la clase para Calcular Salarios segun se pida en la clase de Desarrollo de software II
 *<br>Universidad Tecnológica de Panamá
 *<br>Centro Regional Universitario de Chiriquí
 * @version 1.0
 * @author CeciliaGonzalezdeBeitia
 * @author Jordy Mastino
 * @Grupo 2LS211
 * @Año 2020
 */
public class CalcularSalarios 
{	/**	<br>existen variables locales de clase 
	*	{@code float} bono y {@code float} aumento.
	*/	
	float bono, aumento;

/** Constructor por defecto, no tiene parámetros ademas no calcula bono.
*/
	CalcularSalarios()
	{
		bono = 0;
	}

/** Constructor sobrecargado con un parámetro y si el parametro es un numero retorna según
 * @param m variable {@code type int}
 * @return retorna 100 a la variable bono si el numero es 12.
 * @see CalcularSalarios
 */
	CalcularSalarios(int m)
	{
		if(m==12)
			bono = 100;
		else
			bono = 0;
	}

/**Constructor Salario fijo de 250.00
 * 
 * @return 250+variable bono de la clase {@link CalcularSalarios}
 */
	float salario()
	{
		return 250 + bono;
	}

/**El salario depende de las horas trabajadas y el pago que recibe por hora trabajada
 * 
 * @param horas las horas de trabajo
 * @param pagoHora el pago por hora de trabajo
 * @return  retorna en {@code type float} las horas multiplicado por pago de hora mas la bonificacion de la clase {@link CalcularSalarios}
 */
	float salario(int horas, float pagoHora) 
	{
		return horas * pagoHora + bono;
	}
	
/**Si las horas trabajadas exceden de 48, las horas extras se pagan con un porcentaje de recargo
 * 
 * @param horas las horas de trabajo
 * @param pagoHora el pago por hora de trabajo
 * @param porcHrsExtra {@code float} introduzca el procentaje pero ya dividido entre 100.
 * @return {@code float}<br>retorna el pago por hora multiplicado las horas mas el salario extra + variable bono de la clase {@link CalcularSalarios}
 */
	float salario(int horas, float pagoHora, float porcHrsExtra) 
	{
		float salarioExtra=0;
		int extra=0;
		if(horas > 48)
		{
			extra = horas - 48;
			salarioExtra = (porcHrsExtra + 1) * pagoHora * extra;
			horas = 48;
		}
		return pagoHora * horas + salarioExtra + bono;
	}

/** El salario tiene un aumento por hora, de acuerdo al turno en que trabaja
 * 
 * @param horas las horas de trabajo.
 * @param pagoHora el pago por hora de trabajo.
 * @param turno el turno es 'D' o 'd' no existe aumento, si es otro aumenta el pago por hora.
 * @return {@code float}=horas * (aumento+pagohora)+bono de la clase {@link CalcularSalarios}
 */
	float salario(int horas, float pagoHora, char turno) 
	{
		if(turno == 'D'||turno=='d')
			aumento = 0;
		else
			aumento = 5.75f;
		return horas * (aumento + pagoHora) + bono;
	}

/** Además del turno en que trabaja, recibe un aumento por hora si es día domingo
 * 
 * @param horas  las horas de trabajo.
 * @param pagoHora el pago por hora de trabajo.
 * @param turno es 'D'  o 'N' si el turno es D no existe aumento, si es otro aumenta el pago por hora.
 * @param dia se define como (1-7) el 7 activa un aumento. 
 * @return {@code float} =horas * (aumento+ pagoHora) +bono de la clase {@link CalcularSalarios}.<br>si el dia es 7 (osea domingo) y el turno 'D' aumento = 4.25f pero si turno es otro aumento = 6.50f
 * <br>si dia es otro !=7 entonces turno D aumento es cero, si dia !=7 y turno N aumento = 5.75f.
 */
	float salario(int horas, float pagoHora, char turno, int dia) 
	{
		if(dia == 7)
			if(turno == 'D'||turno == 'd')
				aumento = 4.25f;
			else
				aumento = 6.50f;
		else
			if(turno == 'N'||turno == 'n')
				aumento = 5.75f;
			else
				aumento = 0;
		return horas * (aumento + pagoHora) + bono;
	}

/*
	// HACER metodo de salario en panama gente
	void salario(int feriado)
	{
		
	}
	void encabezado()
	{
		System.out.println("se supone que aqui describe la sobre carga de metodos\n SIN FINALIZAR");
	}
*/
	/*
	//HACER  genero otro constructor forma panameña gente
		CalcularSalarios(char s)
		{
			if (s=='N') 
			{
				
			}
		}
		
	*/
	
}