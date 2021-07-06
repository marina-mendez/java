package first.proyect.marina;

public class trips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		destinos info = new destinos(); 
		// Nuestro primer objeto perteneciente a una clase: 
		//Instanciar objetos es el proceso de 
		// generar un ejemplar de una clase, es
		// decir, la clase es como una declaración de una forma
		// y el objeto es un caso o
		// elemento concreto que responde a esa forma.
		

		System.out.println( info.cordobaInfo());
		
		destinos stars =new destinos();
		
		stars.setEstrellas();
		//nombredelobjeto.metodosetter
		
		System.out.println(stars.getEstrellas());
		//nombredelobjeto.metodogetter
	}

}
  