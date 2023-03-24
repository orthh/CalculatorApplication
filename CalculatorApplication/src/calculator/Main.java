package calculator;

import java.awt.*;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		//일단 만들고 다 끝나고 리팩토링
		//이벤트 디스패치 스레드에서 실행
				javax.swing.SwingUtilities.invokeLater(new Runnable() {
		            public void run() {
		            	JFrame frame = new JFrame("계산기");
		                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		                // JFrame에 BorderLayout 설정
		                //frame 레이아웃 설정 (그리드)
		                frame.setPreferredSize(new Dimension(800, 600));
		                GridBagLayout gridBagLayout = new GridBagLayout();
		                frame.setLayout(gridBagLayout);
		                
		                //frame grid 제약조건
		                //input field 제약조건
		                //(0,0)은 좌측상단
		                GridBagConstraints a = new GridBagConstraints();
		                a.gridx = 0; // 시작점 x좌표
		                a.gridy = 0; // 시작점 y좌표
		                a.gridwidth = 4; // w너비
		                a.gridheight = 1; // h너비
		                a.weightx = 0.1; // 비율로 영역 분배
		                a.weighty = 0.1; // 비율로 영역 분배
		                a.fill = GridBagConstraints.BOTH; // 컴포넌트의 크기가 셀의 크기보다 작을 때, 채울 방법
		                
		                a.insets = new Insets(0, 0, 0, 0); // 컴포넌트와 셀의 간격
		                
		                //btnPanel 제약조건
		                GridBagConstraints b = new GridBagConstraints();
		                b.gridx = 3; // 컴포넌트가 위치할 열 번호
		                b.gridy = 3; // 컴포넌트가 위치할 행 번호
		                b.gridwidth =  4; // 컴포넌트가 차지할 열의 개수
		                b.gridheight = 6; // 컴포넌트가 차지할 행의 개수
		                b.weightx = 0.1; // 컴포넌트의 가로 크기 비율
		                b.weighty = 0.4; // 컴포넌트의 세로 크기 비율
		                b.fill = GridBagConstraints.BOTH; // 컴포넌트의 크기가 셀의 크기보다 작을 때, 채울 방법
		              
		                b.insets = new Insets(0, 0, 0, 0); // 컴포넌트와 셀의 간격
		                
		                //recordPanel 제약조건
		                GridBagConstraints c = new GridBagConstraints();
		                c.gridx = 4; // 컴포넌트가 위치할 열 번호
		                c.gridy = 0; // 컴포넌트가 위치할 행 번호
		                c.gridwidth =  1; // 컴포넌트가 차지할 열의 개수
		                c.gridheight = 6; // 컴포넌트가 차지할 행의 개수
		                c.weightx = 0.1; // 컴포넌트의 가로 크기 비율
		                c.weighty = 0.7; // 컴포넌트의 세로 크기 비율
		                c.fill = GridBagConstraints.BOTH; // 컴포넌트의 크기가 셀의 크기보다 작을 때, 채울 방법
		               
		                c.insets = new Insets(0, 0, 0, 0); // 컴포넌트와 셀의 간격
		                
		                //입력시 화면에 출력하는 부분
		                
		                JTextField inputField = new JTextField();
		                //로그 기록부분
		                JLabel recordField = new JLabel("기록");
		                
		                
		                // JPanel 생성 및 GridLayout 설정 --x:6, y:7
		                JPanel buttonPanel = new JPanel(new GridLayout(4, 5));
		                // JButton 생성 및 추가
		                JButton button1 = new JButton("Button 1");
		                buttonPanel.add(button1);

		                JButton button2 = new JButton("Button 2");
		                buttonPanel.add(button2);

		                JButton button3 = new JButton("Button 3");
		                buttonPanel.add(button3);

		                JButton button4 = new JButton("Button 4");
		                buttonPanel.add(button4);
		                JButton button5 = new JButton("Button 4");
		                buttonPanel.add(button5);
		                JButton button6 = new JButton("Button 4");
		                buttonPanel.add(button6);
		                JButton button7 = new JButton("Button 4");
		                buttonPanel.add(button7);
		                JButton button8 = new JButton("Button 4");
		                buttonPanel.add(button8);
		                JButton button9 = new JButton("Button 4");
		                buttonPanel.add(button9);
		                JButton button10 = new JButton("Button 4");
		                buttonPanel.add(button10);
		                JButton button11 = new JButton("Button 4");
		                buttonPanel.add(button11);
		                JButton button12 = new JButton("Button 4");
		                buttonPanel.add(button12);
		                JButton button13 = new JButton("Button 4");
		                buttonPanel.add(button13);
		                JButton button14 = new JButton("Button 4");
		                buttonPanel.add(button14);
		                JButton button15 = new JButton("Button 4");
		                buttonPanel.add(button15);
		                JButton button16 = new JButton("Button 4");
		                buttonPanel.add(button16);
		                JButton button17 = new JButton("Button 4");
		                buttonPanel.add(button17);
		                JButton button18 = new JButton("Button 4");
		                buttonPanel.add(button18);
		                JButton button19 = new JButton("Button 4");
		                buttonPanel.add(button19);
		                JButton button20 = new JButton("Button 4");
		                buttonPanel.add(button20);

		                
		                // frame에 추가
		                frame.add(inputField,  a);
		                frame.add(buttonPanel, b);	  
		                frame.add(recordField, c);

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
