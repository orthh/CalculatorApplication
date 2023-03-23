package calculator;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		//이벤트 디스패치 스레드에서 실행
				javax.swing.SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		            	JFrame frame = new JFrame("Example");
		                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		                // JFrame에 BorderLayout 설정
		                frame.setLayout(new BorderLayout());
		                frame.setPreferredSize(new Dimension(800, 600));
		                // JPanel 생성 및 GridLayout 설정
		                JPanel panel = new JPanel(new GridLayout(2, 2));

		                // JButton 생성 및 추가
		                JButton button1 = new JButton("Button 1");
		                panel.add(button1);

		                JButton button2 = new JButton("Button 2");
		                panel.add(button2);

		                JButton button3 = new JButton("Button 3");
		                panel.add(button3);

		                JButton button4 = new JButton("Button 4");
		                panel.add(button4);

		                
		                // JPanel을 JFrame의 중앙에 추가
		                frame.add(panel, BorderLayout.CENTER);

		                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		                //frame의 위치 설정
		                //dim.width/2-800/2 는 스크린 가로 해상도의 절반에서 프레임의 가로길이
		                //800의 절반을 뺀 값
		                frame.setLocation(dim.width/2-800/2, dim.height/2-600/2);
		                frame.pack();
		                frame.setVisible(true);
		            }
		        });
	}

}
