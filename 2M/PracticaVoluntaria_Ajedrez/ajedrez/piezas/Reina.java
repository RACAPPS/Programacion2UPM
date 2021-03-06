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
 * Clase que representa a la Reina
 * @author Rub�n Aguado
 *
 */

public class Reina extends PiezaAjedrez  {

	/**
	 * Crea una Reina pertenenciente a jugador en la posición (x,y) del tablero
	 * @param jugador El jugador al que pertenece la pieza
	 * @param fila Fila que ocupa 
	 * @param columna Columna que ocupa
	 */
	public Reina(Jugador jugador, int fila, char columna) {
		super(jugador, TipoPiezaAjedrez.REINA, fila, columna);		
	}


	@Override
	public ArrayList<Casilla> movimientosValidos() {
		ArrayList<Casilla> resultado = new ArrayList<>();
		/* La Reina se puede mover en horizontal, vertical y diagonal
		 * Si hay una ficha de color contrario también puede moverse a esa posición comíendose la pieza
		 * A continuaci�n se describen los movimientos de la pieza
		*/
		casillasVisitables (resultado, -1, -1);
		casillasVisitables (resultado, -1, 0);
		casillasVisitables (resultado, -1, 1);
		casillasVisitables (resultado, 0, -1);
		casillasVisitables (resultado, 0, 1);
		casillasVisitables (resultado, 1, -1);
		casillasVisitables (resultado, 1, 0);
		casillasVisitables (resultado, 1, 1);
		return resultado;
	}

}

