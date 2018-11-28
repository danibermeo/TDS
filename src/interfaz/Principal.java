package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.sun.prism.Image;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.CardLayout;
import java.awt.Color;

public class Principal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Creo panel principal
		JPanel PanelTop = new JPanel();
		frame.getContentPane().add(PanelTop, BorderLayout.NORTH);
		GridBagLayout gbl_PanelTop = new GridBagLayout();
		gbl_PanelTop.columnWidths = new int[]{0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 20, 0, 20, 0, 0, 0, 0, 0, 0, 0};
		gbl_PanelTop.rowHeights = new int[]{0, 0, 0, 0};
		gbl_PanelTop.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_PanelTop.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		PanelTop.setLayout(gbl_PanelTop);
		
		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		ImageIcon unaImagen = new ImageIcon("imagenes/imagen1.png");
	
		b1.setIcon(unaImagen); 
		
		

	/*	try {
				imgamen1 = ImageIO.read(getClass().getResource("/imagenes/imagen1.png"));
			
		            b1.setIcon(new ImageIcon());
		} catch (IOException e) {
		            e.printStackTrace();
		}*/
		
		
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 1;
		PanelTop.add(b1, gbc_btnNewButton);
		
		JButton btnRegistro = new JButton("Registro");
		btnRegistro.setForeground(new Color(139, 0, 139));
		GridBagConstraints gbc_btnRegistro = new GridBagConstraints();
		gbc_btnRegistro.insets = new Insets(0, 0, 5, 5);
		gbc_btnRegistro.gridx = 11;
		gbc_btnRegistro.gridy = 1;
		PanelTop.add(btnRegistro, gbc_btnRegistro);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setForeground(new Color(0, 100, 0));
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogin.gridx = 12;
		gbc_btnLogin.gridy = 1;
		PanelTop.add(btnLogin, gbc_btnLogin);
		
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setForeground(Color.BLUE);
		GridBagConstraints gbc_btnLogout = new GridBagConstraints();
		gbc_btnLogout.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogout.gridx = 15;
		gbc_btnLogout.gridy = 1;
		PanelTop.add(btnLogout, gbc_btnLogout);
		
		JButton btnPremium = new JButton("Premium");
		btnPremium.setForeground(Color.RED);
		GridBagConstraints gbc_btnPremium = new GridBagConstraints();
		gbc_btnPremium.insets = new Insets(0, 0, 5, 5);
		gbc_btnPremium.gridx = 17;
		gbc_btnPremium.gridy = 1;
		PanelTop.add(btnPremium, gbc_btnPremium);
		
		JButton Explorar = new JButton("Explorar");
		GridBagConstraints gbc_Explorar = new GridBagConstraints();
		gbc_Explorar.fill = GridBagConstraints.BOTH;
		gbc_Explorar.insets = new Insets(0, 0, 0, 5);
		gbc_Explorar.gridx = 5;
		gbc_Explorar.gridy = 2;
		PanelTop.add(Explorar, gbc_Explorar);
		
		JButton misListas = new JButton("Mis listas");
		GridBagConstraints gbc_misListas = new GridBagConstraints();
		gbc_misListas.insets = new Insets(0, 0, 0, 5);
		gbc_misListas.gridx = 6;
		gbc_misListas.gridy = 2;
		PanelTop.add(misListas, gbc_misListas);
		
		JButton btnRecientes = new JButton("Recientes");
		GridBagConstraints gbc_btnRecientes = new GridBagConstraints();
		gbc_btnRecientes.insets = new Insets(0, 0, 0, 5);
		gbc_btnRecientes.gridx = 7;
		gbc_btnRecientes.gridy = 2;
		PanelTop.add(btnRecientes, gbc_btnRecientes);
		
		JButton btnNuevaLista = new JButton("Nueva Lista");
		GridBagConstraints gbc_btnNuevaLista = new GridBagConstraints();
		gbc_btnNuevaLista.insets = new Insets(0, 0, 0, 5);
		gbc_btnNuevaLista.gridx = 8;
		gbc_btnNuevaLista.gridy = 2;
		PanelTop.add(btnNuevaLista, gbc_btnNuevaLista);
		
		JLabel lblBienvenido = new JLabel("");
		GridBagConstraints gbc_lblBienvenido = new GridBagConstraints();
		gbc_lblBienvenido.anchor = GridBagConstraints.WEST;
		gbc_lblBienvenido.gridwidth = 6;
		gbc_lblBienvenido.insets = new Insets(0, 0, 0, 5);
		gbc_lblBienvenido.gridx = 12;
		gbc_lblBienvenido.gridy = 2;
		PanelTop.add(lblBienvenido, gbc_lblBienvenido);
		
		//Panel central con todos los difentes tipos en un cardLayout
		JPanel panelCentro = new JPanel();
		frame.getContentPane().add(panelCentro, BorderLayout.CENTER);
		panelCentro.setLayout(new CardLayout(0, 0));
		
		//Cada uno de los cardLayouts
		JPanel panelBienvenida = new JPanel();
		panelCentro.add(panelBienvenida, "Bienvenida");
		
		JLabel lblBienvenida = new JLabel("Bienvenido a AppVideo");
		panelBienvenida.add(lblBienvenida);
		
		JPanel panelExplorar = new JPanel();
		panelCentro.add(panelExplorar, "Explorar");
		
		JLabel lblExplorar = new JLabel("Explorar");
		panelExplorar.add(lblExplorar);
		
		JPanel panelMisListas = new JPanel();
		panelCentro.add(panelMisListas, "Mis listas");
		
		JLabel lblMisListas = new JLabel("Mis listas");
		panelMisListas.add(lblMisListas);
		
		JPanel panelRecientes = new JPanel();
		panelCentro.add(panelRecientes, "Recientes");
		
		JLabel lblRecientes = new JLabel("Recientes");
		panelRecientes.add(lblRecientes);
		
		JPanel panelNuevaLista = new JPanel();
		panelCentro.add(panelNuevaLista, "Nueva lista");
		
		JLabel lblNuevaLista = new JLabel("Nueva lista");
		panelNuevaLista.add(lblNuevaLista);
		
		//Los handlers para cada uno de los botones
		Explorar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout) panelCentro.getLayout();
				c.show(panelCentro, "Explorar");
			}
		});
		
		
		misListas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout) panelCentro.getLayout();
				c.show(panelCentro, "Mis listas");
			}
		});
		
		btnRecientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout) panelCentro.getLayout();
				c.show(panelCentro, "Recientes");
			}
		});
		
		btnNuevaLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c = (CardLayout) panelCentro.getLayout();
				c.show(panelCentro, "Nueva lista");
			}
		});
		
		
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login();
				String usuario = "Damaso";
				lblBienvenido.setText("Bienvenido, " + usuario);
			}
		});
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Registro();
			}
		});
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}