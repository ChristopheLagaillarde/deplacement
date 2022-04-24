package deplacement;

import deplacement.Deplacement;
import deplacement.MoyenDeTransport;

/**
 * La classe machine est un moyen de transport g�n�rique
 * @author Lagaillarde
 *
 */
public class Machine extends MoyenDeTransport implements Deplacement{

	Machine() {
		super("Machine G�n�rique", 0, 0, 0);
	}

}

