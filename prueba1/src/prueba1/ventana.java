package prueba1;

import javax.swing.JFrame;


public class ventana extends JFrame{
	public ventana(){
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setTitle("Ventana de Prueba");
		this.setSize(300,100);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new ventana();

	}

}
