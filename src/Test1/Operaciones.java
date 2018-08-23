package Test1;

/*
Clase para crear constantes
Puede crear metodos, dar valores
No es necesario poner identificador de acceso al constructor 
no se crea objetos en la clase ENUM 
*/

public enum Operaciones {
	SUMA("+"),RESTA("-"),MULTIPLICACION("*"),DIVISION("/");
	
	private String valor;
	
	Operaciones(String valor){
		this.valor = valor;
		
	}
	
	public String getValor(){
		return valor;
	}
}

