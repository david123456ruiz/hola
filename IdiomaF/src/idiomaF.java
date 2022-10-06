import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class idiomaF {

	private JFrame frmIdiomaDeLa;
	private JTextArea txtTraduccion;
	private JTextArea txtTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					idiomaF window = new idiomaF();
					window.frmIdiomaDeLa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public idiomaF() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIdiomaDeLa = new JFrame();
		frmIdiomaDeLa.setTitle("Idioma de la F");
		frmIdiomaDeLa.getContentPane().addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String texto=txtTexto.getText().toString();
				txtTraduccion.setText(texto);
				
			}
		});
		frmIdiomaDeLa.setBounds(100, 100, 450, 300);	
		frmIdiomaDeLa.setLocationRelativeTo(null);
		frmIdiomaDeLa.setIconImage(TooLkit()getImage)
		frmIdiomaDeLa.setResizable(false);
		frmIdiomaDeLa.setTitle("Idioma de la F");
		frmIdiomaDeLa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frmIdiomaDeLa.getContentPane().setLayout(null);
		
		
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTexto.setText("");
				txtTraduccion.setText("");
			}
		});
		btnBorrar.setBounds(168, 124, 89, 23);
		frmIdiomaDeLa.getContentPane().add(btnBorrar);
		
		txtTexto = new JTextArea();
		txtTexto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String texto= txtTexto.getText().toString();
				texto=texto.replace("a", "afa");
				texto=texto.replace("e", "efe");
				texto=texto.replace("i", "efi");
			    texto=texto.replace("o", "ofo");
			    texto=texto.replace("u", "ufu");
			    txtTraduccion.setText(texto);
			    		
			}
		});
		txtTexto.setBounds(10, 0, 157, 239);
		frmIdiomaDeLa.getContentPane().add(txtTexto);
		
		txtTraduccion = new JTextArea();
		txtTraduccion.setBounds(256, 11, 157, 239);
		frmIdiomaDeLa.getContentPane().add(txtTraduccion);
	}
}
