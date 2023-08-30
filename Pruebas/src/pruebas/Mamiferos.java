package pruebas;

public class Mamiferos {
private boolean pelo;
private boolean parir;
private Felino especie;

public Mamiferos(Felino especie) {
	
	this.especie=especie;
	
}

public void esMamifero() {
	if (this.pelo==true & this.parir==true) {
		System.out.println("Es mamifero");
	}else {
		System.out.println("Es de otra especie");
	}
}
	









	
	
}

