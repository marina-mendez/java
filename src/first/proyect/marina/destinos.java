package first.proyect.marina;

public class destinos {

		private String MinaClavero;
		
		private String CuraBrochero;
		
		private String Cordoba;
		
		String estrellas;
		
		int km_altura;
		
		boolean piscina, aireAcondicionado, desayuno;
		
/* metodo constructor: se encarga de dar un estado inicial a nuestro objeto */

public destinos(){
	
	MinaClavero= " 3mil habitantes";

	CuraBrochero= "300 habitantes";

	Cordoba= "1 millón de habitantes";

}

public String cordobaInfo() {
	
	return "la poblacion en tu destino es " + Cordoba;
	//este es el Getter de la propiedad Cordoba
}

public void setEstrellas() {
	
	estrellas="cinco";
	//este es el Setter de la variable estrellas
}

public String getEstrellas() {
	
	return "las estrellas de este hotel son " + estrellas;
	
}

}

