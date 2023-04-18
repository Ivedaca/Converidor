package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class TempPage extends JPanel {

	private JTextField textField2;
		
	
	/**
	 * Create the panel.
	 */
	public TempPage() {
		setBorder(null);
		setPreferredSize(new Dimension(386, 263));
		setBackground(new Color(255, 255, 255));
		setLayout(null);

		JLabel lblTitle3 = new JLabel("Convertidor de Temperatura");
		lblTitle3.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle3.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblTitle3.setBounds(0, 0, 386, 25);
		add(lblTitle3);

		JLabel lblSeleccion2 = new JLabel("Temperatura");
		lblSeleccion2.setHorizontalAlignment(SwingConstants.LEFT);
		lblSeleccion2.setBounds(21, 49, 94, 14);
		add(lblSeleccion2);

		JComboBox comboBox2 = new JComboBox();
		comboBox2.setModel(new DefaultComboBoxModel(new String[] { "Seleccione la opción:", "Centígrados - Fahrenheit",
				"Fahrenheit - Centígrados", "Centígrados - Kelvin", "Kelvin - Centígrados", "Fahrenheit - Kelvin" }));
		comboBox2.setBounds(20, 67, 165, 22);
		add(comboBox2);

		JLabel lblValor2 = new JLabel("Ingrese el Valor:");
		lblValor2.setBounds(20, 115, 107, 14);
		add(lblValor2);

		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(20, 134, 200, 50);
		add(textField2);

		JLabel lblDevelopBy3 = new JLabel("Desarrollado por:");
		lblDevelopBy3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDevelopBy3.setBounds(249, 185, 103, 14);
		add(lblDevelopBy3);

		JLabel lblAS3 = new JLabel("Anibal Saavedra");
		lblAS3.setHorizontalAlignment(SwingConstants.CENTER);
		lblAS3.setBounds(236, 194, 127, 25);
		add(lblAS3);

		JLabel lblInsignia3 = new JLabel("");
		lblInsignia3.setIcon(new ImageIcon("C:\\Users\\A&B\\Documents\\Programming\\C.png"));
		lblInsignia3.setBounds(228, 25, 134, 161);
		add(lblInsignia3);

		JButton btnStart2 = new JButton("Inicio");				
		btnStart2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard newFrame = new Dashboard();
				newFrame.setVisible(true);
				newFrame.setLocationRelativeTo(null);
				
			}
		});
		btnStart2.setBounds(21, 220, 89, 23);
		add(btnStart2);

		JButton btnCalcular2 = new JButton("Calcular");
		btnCalcular2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String valor2Str = textField2.getText();
		        if (valor2Str.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Por favor ingrese un número para convertir", "Error",
		                    JOptionPane.ERROR_MESSAGE);
		        } else {
		            try {
		                double valor2 = Double.parseDouble(valor2Str);
		                int cambio2 = comboBox2.getSelectedIndex();

		                double valorCF;
		                double valorFC;
		                double valorCK;
		                double valorKC;
		                double valorFK;

		                switch (cambio2) {
		                    case 0:
		                        JOptionPane.showMessageDialog(comboBox2, "Seleccione un ITEM de la lista", "Error",
		                                JOptionPane.ERROR_MESSAGE);
		                        break;
		                    case 1:
		                        valorCF = (valor2 * 9) / 5 + 32;
		                        JOptionPane.showMessageDialog(null, valorCF, "Resultado de la Conversión",
		                                JOptionPane.INFORMATION_MESSAGE);
		                        break;
		                    case 2:
		                        valorFC = (valor2 - 32) / 1.8000;
		                        JOptionPane.showMessageDialog(null, valorFC, "Resultado de la Conversión",
		                                JOptionPane.INFORMATION_MESSAGE);
		                        break;
		                    case 3:
		                        valorCK = valor2 + 273.15;
		                        JOptionPane.showMessageDialog(null, valorCK, "Resultado de la Conversión",
		                                JOptionPane.INFORMATION_MESSAGE);
		                        break;
		                    case 4:
		                        valorKC = valor2 - 273.15;
		                        JOptionPane.showMessageDialog(null, valorKC, "Resultado de la Conversión",
		                                JOptionPane.INFORMATION_MESSAGE);
		                        break;
		                    case 5:
		                        valorFK = (((valor2 - 32) * 5) / 9) + 273.15;
		                        JOptionPane.showMessageDialog(null, valorFK, "Resultado de la Conversión",
		                                JOptionPane.INFORMATION_MESSAGE);
		                        break;
		                }
		            } catch (NumberFormatException ex) {
		                JOptionPane.showMessageDialog(null, "El valor ingresado no es válido. Por favor ingrese un número válido para convertir", "Error",
		                    JOptionPane.ERROR_MESSAGE);
		            }
		        }
		    }
		});

		btnCalcular2.setBounds(145, 220, 89, 23);
		add(btnCalcular2);
	
		JButton btnQuit3 = new JButton("Salir");
		btnQuit3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(-1);
			}
		});
		btnQuit3.setBounds(270,220,89,23);
		add(btnQuit3);

		
		
	}

}
