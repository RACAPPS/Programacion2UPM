package progii.juegotablero.model.ajedrez.piezas;

import list.ArrayList;
import progii.juegotablero.model.Casilla;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;
import anotacion.Programacion2;

@Programacion2 (
	nombreAutor1 = "Rub�n",
	apellidoAutor1 = "Aguado Cosano",
	emailUPMAutor1 = "ruben.aguadoc@alumnos.upm.es"
)
/**
 * Clase que representa al Alfil
 * @author Rub�n Aguado
 *
 */

public class Alfil extends PiezaAjedrez  {

	/**
	 * Crea un alfil pertenenciente a jugador en la posición (x,y) del tablero
	 * @param jugador El jugador al que pertenece la pieza
	 * @param fila Fila que ocupa 
	 * @param columna Columna que ocupa
	 */
	public Alfil(Jugador jugador, int fila, char columna) {
		super(jugador, TipoPiezaAjedrez.ALFIL, fila, columna);
	}


	@Override
	public ArrayList<Casilla> movimientosValidos() {
		ArrayList<Casilla> resultado = new ArrayList<>();
		/* El alfil se puede mover en diagonal
		 * Si hay una ficha de color contrario también puede moverse a esa posición comíendose la pieza 
		 * A continuaci'on se desccriben las 4 diagonales
		*/
		casillasVisitables (resultado, -1, -1);
		casillasVisitables (resultado, -1, 1);
		casillasVisitables (resultado, 1, -1);
		casillasVisitables (resultado, 1, 1);
		return resultado;
	}

}

