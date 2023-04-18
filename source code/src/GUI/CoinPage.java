package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

public class CoinPage extends JPanel {
	
	private JTextField textField;
	
				
	/**
	 * Create the panel.
	 */
	public CoinPage() {
		
		setPreferredSize(new Dimension(386, 263));
		setBorder(null);
		setBackground(new Color(255, 255, 255));
		setLayout(null);

		JButton btnStart = new JButton("Inicio");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard newFrame = new Dashboard();
				newFrame.setVisible(true);
				newFrame.setLocationRelativeTo(null);
								
			}
		});
		
		btnStart.setBounds(21, 220, 89, 23);
		add(btnStart);
		
		JLabel lblTitle2 = new JLabel("Convertidor de Monedas");
		lblTitle2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle2.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblTitle2.setBounds(0, 0, 386, 25);
		add(lblTitle2);
		
		JLabel lblInsignia2 = new JLabel("");
		lblInsignia2.setIcon(new ImageIcon("C:\\Users\\A&B\\Documents\\Programming\\C.png"));
		lblInsignia2.setBounds(228, 25, 140, 162);
		add(lblInsignia2);
		
		JLabel lblAS2 = new JLabel("Anibal Saavedra");
		lblAS2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAS2.setBounds(236, 194, 127, 25);
		add(lblAS2);
		
		JLabel lblDevelopBy2 = new JLabel("Desarrollado por:");
		lblDevelopBy2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDevelopBy2.setBounds(249, 185, 103, 14);
		add(lblDevelopBy2);
						
		JButton btnQuit2 = new JButton("Salir");
		btnQuit2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(-1);
			}
		});
		btnQuit2.setBounds(270, 220, 89, 23);
		add(btnQuit2);
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"Seleccione la opción:", "USD - COP", "USD - EURO", "USD - GBP", "GBP - USD", "EURO - USD", "COP - USD"}));
		comboBox1.setBounds(20, 67, 165, 22);
		add(comboBox1);
		
		JLabel lblSeleccion = new JLabel("Divisas");
		lblSeleccion.setHorizontalAlignment(SwingConstants.LEFT);
		lblSeleccion.setBounds(21, 49, 94, 14);
		add(lblSeleccion);
		
		JLabel lblValor = new JLabel("Ingrese el Valor:");
		lblValor.setBounds(20, 115, 107, 14);
		add(lblValor);
		
		textField = new JTextField();
		textField.setBounds(20, 134, 200, 50);
		add(textField);
		textField.setColumns(10);
				
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valor1Str = textField.getText();
		        if (valor1Str.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Por favor ingrese un número para convertir", "Error",
		                    JOptionPane.ERROR_MESSAGE);
		        } else {
		            try {
				double valor1 = Double.parseDouble(valor1Str);
				int cambio1 = comboBox1.getSelectedIndex();
				
				double valorUsdCop;
				double valorUsdEuro;
				double valorUsdGbp;
				double valorGbpUsd;
				double valorEuroUsd;
				double valorCopUsd;
				
				switch(cambio1) {
				
				case 0:
					JOptionPane.showMessageDialog(comboBox1, "Seleccione un ITEM de la lista", "Error", JOptionPane.ERROR_MESSAGE);
					break;
				
				case 1:
					valorUsdCop = valor1 * 4591.40;
					JOptionPane.showMessageDialog(null, valorUsdCop,"Resultado de la Conversión 04/04/23", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 2:
					valorUsdEuro = valor1 * 0.91;
					JOptionPane.showMessageDialog(null, valorUsdEuro,"Resultado de la Conversión 04/04/23", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 3:
					valorUsdGbp = valor1 * 0.8;
					JOptionPane.showMessageDialog(null, valorUsdGbp,"Resultado de la Conversión 04/04/23", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 4:
					valorGbpUsd = valor1 * 1.25;
					JOptionPane.showMessageDialog(null, valorGbpUsd,"Resultado de la Conversión 04/04/23", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 5:
					valorEuroUsd = valor1 * 1.10;
					JOptionPane.showMessageDialog(null, valorEuroUsd,"Resultado de la Conversión 04/04/23", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 6:
					valorCopUsd = valor1 * 0.00022;
					JOptionPane.showMessageDialog(null, valorCopUsd,"Resultado de la Conversión 04/04/23", JOptionPane.INFORMATION_MESSAGE);
					break;
				}
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "El valor ingresado no es válido. Por favor ingrese un número válido para convertir", "Error", JOptionPane.ERROR_MESSAGE);
			}
		   }
		 }
		});
		btnCalcular.setBounds(145, 220, 89, 23);
		add(btnCalcular);
		
	}
}

