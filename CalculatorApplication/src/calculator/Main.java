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
		//일단 만들고 다 끝나고 리팩토링
		//이벤트 디스패치 스레드에서 실행
				javax.swing.SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		            	JFrame frame = new JFrame("Example");
		                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		                // JFrame에 BorderLayout 설정
		                //frame.setLayout(new BorderLayout());
		                frame.setPreferredSize(new Dimension(800, 600));
		                
		                //입력시 화면에 출력하는 부분
		                JPanel panelPrint = new JPanel();
		        
		                // JPanel 생성 및 GridLayout 설정 --x:6, y:7
		                JPanel panelCalc = new JPanel(new GridLayout(6, 7));
		                // JButton 생성 및 추가
		                JButton button1 = new JButton("Button 1");
		                panelCalc.add(button1);

		                JButton button2 = new JButton("Button 2");
		                panelCalc.add(button2);

		                JButton button3 = new JButton("Button 3");
		                panelCalc.add(button3);

		                JButton button4 = new JButton("Button 4");
		                panelCalc.add(button4);
		                JButton button5 = new JButton("Button 4");
		                panelCalc.add(button5);
		                JButton button6 = new JButton("Button 4");
		                panelCalc.add(button6);
		                JButton button7 = new JButton("Button 4");
		                panelCalc.add(button7);
		                JButton button8 = new JButton("Button 4");
		                panelCalc.add(button8);
		                JButton button9 = new JButton("Button 4");
		                panelCalc.add(button9);
		                JButton button10 = new JButton("Button 4");
		                panelCalc.add(button10);
		                JButton button11 = new JButton("Button 4");
		                panelCalc.add(button11);
		                JButton button12 = new JButton("Button 4");
		                panelCalc.add(button12);
		                JButton button13 = new JButton("Button 4");
		                panelCalc.add(button13);
		                JButton button14 = new JButton("Button 4");
		                panelCalc.add(button14);
		                JButton button15 = new JButton("Button 4");
		                panelCalc.add(button15);
		                JButton button16 = new JButton("Button 4");
		                panelCalc.add(button16);
		                JButton button17 = new JButton("Button 4");
		                panelCalc.add(button17);
		                JButton button18 = new JButton("Button 4");
		                panelCalc.add(button18);
		                JButton button19 = new JButton("Button 4");
		                panelCalc.add(button19);
		                JButton button20 = new JButton("Button 4");
		                panelCalc.add(button20);

		                
		                // JPanel을 JFrame의 중앙에 추가
		                frame.add(panelCalc);

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
