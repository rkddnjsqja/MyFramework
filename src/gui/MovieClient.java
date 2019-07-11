package gui;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.myframework.movie.model.MovieManager;

//웹프로그램으로 구현했던 영화 판단 프로그램을 단지
//자바 응용프로그램으로 기반으로 제작해본다..
//이떄 주의점) 보여지는 영역(view) 즉 디자인 영역이 변경된 것일뿐
//기존의 로직 자체는 보존(재사용)하면 시간, 비용이 덜드다!!
public class MovieClient extends JFrame{
	Choice ch;
	JButton bt;
	MovieManager manager;
	public MovieClient() {
		ch= new Choice();
		ch.add("앤드게임");
		ch.add("스파이더맨 파프롬 홈");
		ch.add("맨인블랙3");
		bt= new JButton("판단요청");
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
