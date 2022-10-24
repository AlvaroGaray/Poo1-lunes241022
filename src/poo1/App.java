package poo1;

public class App  {

	public static void main(String[] args) {

		Computadora pc1=new Computadora();
		 /*/ pc1.cantidadRAM= 8;
		pc1.espacioDisco=1024;
		pc1.frecuenciaTrabajo=3.5;
		pc1.marca="Dell";
		pc1.precio=500.00;
		pc1.vidautil=5;
		/*/
		
		pc1.ponerMarca("Dell");
		pc1.ponerRam(8);
		pc1.ponerespacio(1024);
		pc1.ponerfrecuenciatrabajo(3.5);
		pc1.ponerprecio(500.00);
		pc1.ponervidautil(5);
		
		Computadora pc2=new Computadora();
		/*/pc2.cantidadRAM= 12;
		pc2.espacioDisco=2048;
		pc2.frecuenciaTrabajo=3.9;
		pc2.marca="Asus";
		pc2.precio=980.00;
		pc2.vidautil=4;
		/*/
		
		pc2.ponerRam(12);
		pc2.ponerespacio(2048);
		pc2.ponerfrecuenciatrabajo(3.9);
		pc2.ponerMarca("Asus");
		pc2.ponerprecio(980.00);
		pc2.ponervidautil(4);
		
		
		Computadora pc3=new Computadora();
		
		System.out.println("Marca de la pc1 :" + pc1.mostrarMarca());
		System.out.println("Espacio de la pc1 :" + pc1.mostrarespacio());

		System.out.println("Marca de la pc2 :" + pc2.mostrarMarca());
		System.out.println("Marca de la pc3 :" + pc3.mostrarMarca());

	}

}
