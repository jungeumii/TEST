package Test1;
// windows - show view - others - git - Git repositories
// Team - share project
// Team - comit (para compartir local) - arrastrar a stage changes - agregar comentarios - dar en COMMIT 
// en la ventana de Git repository dar en branches
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Operaciones.MULTIPLICACION);
		System.out.println(Operaciones.SUMA.getValor());
		System.out.println(Operaciones.SUMA.name());
		
		Operaciones[] values = Operaciones.values();

		for(Operaciones elemento:Operaciones.values()){
			System.out.println(elemento.getValor());
			System.out.println(elemento.name());
		}

		

	}

}
