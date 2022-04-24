package deplacement;

/**
 * La classe machine est un moyen de transport g�n�rique
 * @author Lagaillarde
 *
 */
public class Machine extends MoyenDeTransport implements Deplacement{

	Machine() {
		super("Machine G�n�rique", 0, 0, 0);
	}
	
	void afficher() {
		System.out.println("Position avec Machine");
		super.afficher();
		System.out.println("\n");

	}
	
	@Override
	public void seDeplace(int origine, int destination) {
			this.x = deplacerEnX(origine,destination);
	}

}

