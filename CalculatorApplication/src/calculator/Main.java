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
		                
		                //컴포넌트 생성
		                JTextField inputField = new JTextField();
		                JPanel bp = new JPanel(new GridLayout(4, 5));
		                JLabel recordField = new JLabel("기록");
		                
		                //버튼생성
		                JButton b1 = new JButton("Button 1");
		                JButton b2 = new JButton("Button 1");
		                JButton b3 = new JButton("Button 1");
		                JButton b4 = new JButton("Button 1");
		                JButton b5 = new JButton("Button 1");
		                JButton b6 = new JButton("Button 1");
		                JButton b7 = new JButton("Button 1");
		                JButton b8 = new JButton("Button 1");
		                JButton b9 = new JButton("Button 1");
		                JButton b10 = new JButton("Button 1");
		                JButton b11 = new JButton("Button 1");
		                JButton b12 = new JButton("Button 1");
		                JButton b13 = new JButton("Button 1");
		                JButton b14 = new JButton("Button 1");
		                JButton b15 = new JButton("Button 1");
		                JButton b16 = new JButton("Button 1");
		                JButton b17 = new JButton("Button 1");
		                JButton b18 = new JButton("Button 1");
		                JButton b19 = new JButton("Button 1");
		                JButton b20 = new JButton("Button 1");
		                
		                //bp(buttonPanel)에 버튼 추가
		                bp.add(b1);
		                bp.add(b2);
		                bp.add(b3);
		                bp.add(b4);
		                bp.add(b5);
		                bp.add(b6);
		                bp.add(b7);
		                bp.add(b8);
		                bp.add(b9);
		                bp.add(b10);
		                bp.add(b11);
		                bp.add(b12);
		                bp.add(b13);
		                bp.add(b14);
		                bp.add(b15);
		                bp.add(b16);
		                bp.add(b17);
		                bp.add(b18);
		                bp.add(b19);
		                bp.add(b20);
		                
		                //제약조건
		                //(0,0)은 좌측상단
		                GridBagConstraints a = new GridBagConstraints();
		                a.gridx = 0; // 시작점 x좌표
		                a.gridy = 0; // 시작점 y좌표
		                a.gridwidth = 4; // w너비
		                a.gridheight = 1; // h너비
		                a.weightx = 1.0; // 비율로 영역 분배
		                a.weighty = 1.0; // 비율로 영역 분배
		                a.fill = GridBagConstraints.BOTH; // 컴포넌트의 크기가 셀의 크기보다 작을 때, 채울 방법
		                
		                a.insets = new Insets(0, 0, 0, 0); // 컴포넌트와 셀의 간격
		                //
		                //btnPanel 제약조건
		                GridBagConstraints b = new GridBagConstraints();
		                b.gridx = 0; // 컴포넌트가 위치할 열 번호
		                b.gridy = 1; // 컴포넌트가 위치할 행 번호
		                b.gridwidth =  3; // 컴포넌트가 차지할 열의 개수
		                b.gridheight = 10; // 컴포넌트가 차지할 행의 개수
		                b.weightx = 1.0; // 컴포넌트의 가로 크기 비율
		                b.weighty = 1.0; // 컴포넌트의 세로 크기 비율
		                b.fill = GridBagConstraints.BOTH; // 컴포넌트의 크기가 셀의 크기보다 작을 때, 채울 방법
		              
		                b.insets = new Insets(0, 0, 0, 0); // 컴포넌트와 셀의 간격
		                
		                //recordPanel 제약조건
		                GridBagConstraints c = new GridBagConstraints();
		                c.gridx = 4; // 컴포넌트가 위치할 열 번호
		                c.gridy = 1; // 컴포넌트가 위치할 행 번호
		                c.gridwidth =  1; // 컴포넌트가 차지할 열의 개수
		                c.gridheight = 10; // 컴포넌트가 차지할 행의 개수
		                c.weightx = 1.0; // 컴포넌트의 가로 크기 비율
		                c.weighty = 1.0; // 컴포넌트의 세로 크기 비율
		                c.fill = GridBagConstraints.BOTH; // 컴포넌트의 크기가 셀의 크기보다 작을 때, 채울 방법
		               
		                c.insets = new Insets(0, 0, 0, 0); // 컴포넌트와 셀의 간격
		                
		                
		                // frame에 추가
		                frame.add(inputField,  a);
		                frame.add(bp, b);	  
		                frame.add(recordField, c);




		                
		                
		                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		                //frame의 위치 설정
		                //dim.width/2-800/2 는 스크린 가로 해상도의 절반에서 프레임의 가로길이
		                //800의 절반을 뺀 값
		                frame.setLocation(dim.width/2-800/2, dim.height/2-600/2);
		                frame.setMinimumSize(new Dimension(400,400));
		                frame.pack();
		                frame.setVisible(true);
		            }
		        });
	}

}
