package br.senai.sp.jandira.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Frame {
	
	public void criarTela() {
		
		// X, Y, width, height
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setTitle("Testando o JList");
		frame.setLayout(null);
		
		JTextField txtCidade = new JTextField();
		txtCidade.setBounds(20, 20, 120, 30);
		
		
		JButton btnAdd = new JButton();
		btnAdd.setText("Add");
		btnAdd.setBounds(150, 20, 60, 30);
		
		
		JButton btnDel = new JButton();
		btnDel.setText("Del");
		btnDel.setBounds(220, 20, 60, 30);
		
		// JList
		// Precisamos de um JScroll (e/ou uma lista)
			
		
		DefaultListModel cidadeModel = new DefaultListModel();
		cidadeModel.addElement("Jandira");
		cidadeModel.addElement("Itapevi");
		cidadeModel.addElement("Barueri");
		cidadeModel.addElement("Osasco");
		cidadeModel.addElement("GOMBAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		cidadeModel.addElement("Pirapora");
		cidadeModel.addElement("Santana de Paraíba");
		cidadeModel.addElement("Vargem Grande Paulista");
		cidadeModel.addElement("São Roque");
		cidadeModel.addElement("Cotia");
		
		
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(20, 60, 260, 150);
		
		
		
		JList cidadeList = new JList(cidadeModel);
		scroll.getViewport().add(cidadeList);
		
		
		
		frame.getContentPane().add(txtCidade);
		frame.getContentPane().add(btnAdd);
		frame.getContentPane().add(btnDel);
		frame.getContentPane().add(scroll);
		
		
		// Último
		
		frame.setVisible(true);
		
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				cidadeModel.addElement(txtCidade.getText());
			}
		});
		
		btnDel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Remover item selecionado
				
//				int i = cidadeList.getSelectedIndex();
//				cidadeModel.remove(i);
				
				// Remover do primeiro até o último item
				
				int firstIndex = cidadeList.getMinSelectionIndex();
				int lastIndex = cidadeList.getMaxSelectionIndex();
				
				cidadeModel.removeRange(firstIndex, lastIndex);
				
				
			}
		});
		
	}

}
