package gui;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.myframework.movie.model.MovieManager;

//�����α׷����� �����ߴ� ��ȭ �Ǵ� ���α׷��� ����
//�ڹ� �������α׷����� ������� �����غ���..
//�̋� ������) �������� ����(view) �� ������ ������ ����� ���ϻ�
//������ ���� ��ü�� ����(����)�ϸ� �ð�, ����� �����!!
public class MovieClient extends JFrame{
	Choice ch;
	JButton bt;
	MovieManager manager;
	public MovieClient() {
		ch= new Choice();
		ch.add("�ص����");
		ch.add("�����̴��� ������ Ȩ");
		ch.add("���κ�3");
		bt= new JButton("�Ǵܿ�û");
		manager = new MovieManager();
		setLayout(new FlowLayout());
		add(ch);
		add(bt);
		
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg=manager.getAdvice(ch.getSelectedItem());
				JOptionPane.showMessageDialog(MovieClient.this,msg );
			}
		});
		
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

	
	
	public static void main(String[] args) {
		new MovieClient();
	}
}
