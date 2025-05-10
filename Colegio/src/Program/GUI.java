package Program;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtcode;
	private JLabel lblApellidosYNombres;
	private JTextField txtname;
	private JLabel lblNotaN;
	private JLabel lblNotaN_4;
	private JLabel lblNotaN_1;
	private JLabel lblNotaN_2;
	private JTextField txtnota1;
	private JTextField txtnota2;
	private JTextField txtnota3;
	private JTextField txtnota4;
	private JButton btnNewButton;
	private JButton btnBuscar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 781, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Número de lista : ");
			lblNewLabel.setBounds(27, 41, 125, 13);
			contentPane.add(lblNewLabel);
		}
		{
			txtcode = new JTextField();
			txtcode.setBounds(162, 38, 96, 19);
			contentPane.add(txtcode);
			txtcode.setColumns(10);
		}
		{
			lblApellidosYNombres = new JLabel("Apellidos y Nombres : ");
			lblApellidosYNombres.setBounds(27, 90, 125, 13);
			contentPane.add(lblApellidosYNombres);
		}
		{
			txtname = new JTextField();
			txtname.setBounds(158, 87, 296, 19);
			contentPane.add(txtname);
			txtname.setColumns(10);
		}
		{
			lblNotaN = new JLabel("Nota N° 1");
			lblNotaN.setBounds(63, 149, 59, 13);
			contentPane.add(lblNotaN);
		}
		{
			lblNotaN_4 = new JLabel("Nota N° 2");
			lblNotaN_4.setBounds(277, 149, 59, 13);
			contentPane.add(lblNotaN_4);
		}
		{
			lblNotaN_1 = new JLabel("Nota N° 3");
			lblNotaN_1.setBounds(483, 149, 59, 13);
			contentPane.add(lblNotaN_1);
		}
		{
			lblNotaN_2 = new JLabel("Nota N° 4");
			lblNotaN_2.setBounds(671, 149, 59, 13);
			contentPane.add(lblNotaN_2);
		}
		{
			txtnota1 = new JTextField();
			txtnota1.setBounds(52, 172, 70, 19);
			contentPane.add(txtnota1);
			txtnota1.setColumns(10);
		}
		{
			txtnota2 = new JTextField();
			txtnota2.setColumns(10);
			txtnota2.setBounds(266, 172, 70, 19);
			contentPane.add(txtnota2);
		}
		{
			txtnota3 = new JTextField();
			txtnota3.setColumns(10);
			txtnota3.setBounds(472, 172, 70, 19);
			contentPane.add(txtnota3);
		}
		{
			txtnota4 = new JTextField();
			txtnota4.setColumns(10);
			txtnota4.setBounds(660, 172, 70, 19);
			contentPane.add(txtnota4);
		}
		{
			btnNewButton = new JButton("Registar\r\n");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(483, 10, 85, 21);
			contentPane.add(btnNewButton);
		}
		{
			btnBuscar = new JButton("Buscar");
			btnBuscar.setBounds(626, 10, 85, 21);
			contentPane.add(btnBuscar);
		}
		{
			btnModificar = new JButton("Modificar");
			btnModificar.setBounds(483, 59, 85, 21);
			contentPane.add(btnModificar);
		}
		{
			btnEliminar = new JButton("Eliminar");
			btnEliminar.setBounds(626, 59, 85, 21);
			contentPane.add(btnEliminar);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(27, 207, 710, 262);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	arraystudent arreglo = new arraystudent();
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		Imprimir("Número lista\tNombre\t\tNota 1\tNota 2\tNota 3\tNota 4\tPromedio");
		for (int i = 0; i < arreglo.Tamaño(); i++) {
			Imprimir(""+arreglo.Obtener(i).getCod()+"\t"+arreglo.Obtener(i).getNom()+"\t"+arreglo.Obtener(i).getN1()+
		"\t"+arreglo.Obtener(i).getN2()+"\t"+arreglo.Obtener(i).getN3()+"\t"+arreglo.Obtener(i).getN4()+"\t"+arreglo.Obtener(i).promedio());
		}
	}
	void Imprimir(String s) {
		txtS.append(s+"\n");
	}

}
