package prueba1;

import javax.swing.JFrame;


public class ventana extends JFrame{
	public ventana(){
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setTitle("He cambiado el titulo de la ventana");
		this.setSize(640,408);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new ventana();
		System.out.println("Hola mundo");

	}

}
