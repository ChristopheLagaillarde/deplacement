package deplacement;

import deplacement.Deplacement;
import deplacement.MoyenDeTransport;

/**
 * La classe machine est un moyen de transport générique
 * @author Lagaillarde
 *
 */
public class Machine extends MoyenDeTransport implements Deplacement{

	Machine() {
		super("Machine Générique", 0, 0, 0);
	}

}

