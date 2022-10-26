package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classe.Celular;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtMarca;
	private JTextField txtSistema;
	private JTextField txtCor;
	private JTextField txtTela;
	private JTextField txtArmazenamento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCadastro() {
		setTitle("Cadastro de Celular");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Marca: ");
		lblNewLabel.setFont(new Font("Poppins", Font.BOLD, 14));
		lblNewLabel.setBounds(29, 55, 61, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sistema Op: ");
		lblNewLabel_1.setFont(new Font("Poppins", Font.BOLD, 14));
		lblNewLabel_1.setBounds(29, 91, 94, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cor: ");
		lblNewLabel_2.setFont(new Font("Poppins", Font.BOLD, 14));
		lblNewLabel_2.setBounds(29, 128, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tela: ");
		lblNewLabel_3.setFont(new Font("Poppins", Font.BOLD, 14));
		lblNewLabel_3.setBounds(29, 173, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Armazenamento(em G): ");
		lblNewLabel_4.setFont(new Font("Poppins", Font.BOLD, 14));
		lblNewLabel_4.setBounds(29, 212, 187, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Cadastro de Celular");
		lblNewLabel_5.setFont(new Font("Poppins", Font.BOLD, 14));
		lblNewLabel_5.setBounds(152, 11, 153, 14);
		contentPane.add(lblNewLabel_5);
		
		txtMarca = new JTextField();
		txtMarca.setFont(new Font("Poppins", Font.PLAIN, 14));
		txtMarca.setBounds(284, 55, 144, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		txtSistema = new JTextField();
		txtSistema.setFont(new Font("Poppins", Font.PLAIN, 14));
		txtSistema.setBounds(284, 91, 144, 20);
		contentPane.add(txtSistema);
		txtSistema.setColumns(10);
		
		txtCor = new JTextField();
		txtCor.setFont(new Font("Poppins", Font.PLAIN, 14));
		txtCor.setBounds(284, 128, 144, 20);
		contentPane.add(txtCor);
		txtCor.setColumns(10);
		
		txtTela = new JTextField();
		txtTela.setFont(new Font("Poppins", Font.PLAIN, 14));
		txtTela.setBounds(284, 173, 144, 20);
		contentPane.add(txtTela);
		txtTela.setColumns(10);
		
		txtArmazenamento = new JTextField();
		txtArmazenamento.setFont(new Font("Poppins", Font.PLAIN, 14));
		txtArmazenamento.setBounds(284, 212, 144, 20);
		contentPane.add(txtArmazenamento);
		txtArmazenamento.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Celular c1 = new Celular(txtMarca.getText(), txtSistema.getText()
		                , txtCor.getText(), txtTela.getText()
		                , Integer.parseInt(txtArmazenamento.getText()));
				
				try (PrintWriter writer = new PrintWriter(new File("celular.csv"))){
		            
		            StringBuilder sb = new StringBuilder();
		            sb.append(c1.getMarca());
		            sb.append(",");
		            sb.append(c1.getCor());
		            sb.append(",");
		            sb.append(c1.getArmazenamento());
		            sb.append(",");
		            sb.append(c1.getSistema());
		            sb.append(",");
		            sb.append(c1.getTela());
		            writer.write(sb.toString());
		            writer.close();
		            
		            JOptionPane.showMessageDialog(null, "Gravação concluida!");
		        } catch (FileNotFoundException ex){
		        	JOptionPane.showMessageDialog(null, "Ocorreu um erro na gravação!" + ex.getMessage());
		        }
				
				txtMarca.setText(c1.getMarca());
		        txtCor.setText(c1.getCor());
		        txtArmazenamento.setText(Integer.toString(c1.getArmazenamento()) + "Gigas");
		        txtSistema.setText(c1.getSistema());
		        txtTela.setText(c1.getTela());
				
			}
		});
		btnCadastrar.setFont(new Font("Poppins", Font.BOLD, 14));
		btnCadastrar.setBounds(163, 266, 120, 23);
		contentPane.add(btnCadastrar);
	}
}
