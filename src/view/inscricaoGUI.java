package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author Pedro Rissi
 *
 */

public class InscricaoGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldCPF;
	private JLabel lbltitulo;
	private JLabel lblNome;
	private JLabel lblCpf;
	private JLabel lblCargo;
	private JRadioButton rdbtnFundamental;
	private JRadioButton rdbtnEnsinoMedio;
	private JRadioButton rdbtnEnsinoSuperior;
	private ButtonGroup grupoBotao;
	private JButton btnLimpar;
	private JButton btnEnviar;

	
	public InscricaoGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbltitulo = new JLabel("INSCRI\u00C7\u00C3O DE CANDIDATO");
		lbltitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbltitulo.setBounds(101, 30, 243, 14);
		contentPane.add(lbltitulo);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(101, 94, 210, 20);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		lblNome = new JLabel("NOME");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setBounds(101, 69, 46, 14);
		contentPane.add(lblNome);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setColumns(10);
		textFieldCPF.setBounds(101, 154, 210, 20);
		contentPane.add(textFieldCPF);
		
		lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCpf.setBounds(101, 129, 46, 14);
		contentPane.add(lblCpf);
		
		lblCargo = new JLabel("CARGO");
		lblCargo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCargo.setBounds(101, 200, 83, 14);
		contentPane.add(lblCargo);
		
		rdbtnFundamental = new JRadioButton("Professor Ensino Fundamental");
		rdbtnFundamental.setBounds(101, 221, 193, 23);
		contentPane.add(rdbtnFundamental);
		
		rdbtnEnsinoMedio = new JRadioButton("Professor Ensino M\u00E9dio");
		rdbtnEnsinoMedio.setBounds(101, 247, 167, 23);
		contentPane.add(rdbtnEnsinoMedio);
		
		rdbtnEnsinoSuperior = new JRadioButton("Professor Ensino Superior");
		rdbtnEnsinoSuperior.setBounds(101, 273, 167, 23);
		contentPane.add(rdbtnEnsinoSuperior);
		
		grupoBotao = new ButtonGroup();
		grupoBotao.add(rdbtnFundamental);
		grupoBotao.add(rdbtnEnsinoMedio);
		grupoBotao.add(rdbtnEnsinoSuperior);
		
		btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limpar();			
				
			}
		});
		
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnLimpar.setBounds(101, 358, 99, 23);
		contentPane.add(btnLimpar);
		
		btnEnviar = new JButton("ENVIAR");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nome = textFieldNome.getText();
				String cpf = textFieldCPF.getText();
				if(nome.equals("") || cpf.equals("")) {
					JOptionPane.showMessageDialog(null, "Nenhum campo pode estar vazio!", "ALERTA", 2, null );
				}else {
					JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!", "Confirmação", 1, null);
					limpar();
				}
			}
		});
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEnviar.setBounds(214, 358, 108, 23);
		contentPane.add(btnEnviar);
		
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
		
		
		
	}
	
	public void limpar() {
		textFieldNome.setText("");
		textFieldCPF.setText("");
		grupoBotao.clearSelection();
	}
	
	
	
}
