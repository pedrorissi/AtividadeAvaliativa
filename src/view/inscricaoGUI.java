package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class inscricaoGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldCPF;

	
	public inscricaoGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INSCRI\u00C7\u00C3O DE CANDIDATO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(101, 30, 243, 14);
		contentPane.add(lblNewLabel);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(101, 94, 210, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setBounds(101, 69, 46, 14);
		contentPane.add(lblNome);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setColumns(10);
		textFieldCPF.setBounds(101, 154, 210, 20);
		contentPane.add(textFieldCPF);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCpf.setBounds(101, 129, 46, 14);
		contentPane.add(lblCpf);
		
		JLabel lblCargo = new JLabel("CARGO");
		lblCargo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCargo.setBounds(101, 200, 83, 14);
		contentPane.add(lblCargo);
		
		JRadioButton rdbtnFundamental = new JRadioButton("Professor Ensino Fundamental");
		rdbtnFundamental.setBounds(101, 221, 193, 23);
		contentPane.add(rdbtnFundamental);
		
		JRadioButton rdbtnEnsinoMedio = new JRadioButton("Professor Ensino M\u00E9dio");
		rdbtnEnsinoMedio.setBounds(101, 247, 167, 23);
		contentPane.add(rdbtnEnsinoMedio);
		
		JRadioButton rdbtnEnsinoSuperior = new JRadioButton("Professor Ensino Superior");
		rdbtnEnsinoSuperior.setBounds(101, 273, 167, 23);
		contentPane.add(rdbtnEnsinoSuperior);
	}
}
