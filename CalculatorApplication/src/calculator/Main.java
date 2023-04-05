package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.Caret;

public class Main {
	public static boolean isOperator(char c) {
	    return c == '+' || c == '-' 
	    		|| c == '*' || c == '/' || 
	    		c== '%' || c=='.';
	}
	
	

	public static void main(String[] args) {
		//입력값 저장
		//String input = "1+2+3";
		
		//기록창
		String record = "<html><p>첫번째 줄</p><p>두번째 줄</p></html>";
		//C를 눌르면 초기화X
		//CE 누르면 초기화O
		

		//일단 만들고 다 끝나고 리팩토링
		//이벤트 디스패치 스레드에서 실행
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	JFrame frame = new JFrame("계산기");
            	//frame에 패딩값 주기
            	JPanel contentPane = (JPanel)frame.getContentPane();
            	contentPane.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15)); // 상하좌우 10픽셀의 패딩
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // JFrame에 BorderLayout 설정
                //frame 레이아웃 설정 (그리드)
                frame.setPreferredSize(new Dimension(800, 600));
                GridBagLayout gridBagLayout = new GridBagLayout();
                frame.setLayout(gridBagLayout);
                
                //컴포넌트 생성
                JTextField inputField = new JTextField();
                JPanel bp = new JPanel(new GridLayout(5, 4));
                JLabel recordField = new JLabel(record);

                
                ///////////inputField 조절
                //커서 숨기기 override
                Caret caret = new HiddenCaret();
                inputField.setCaret(caret);
                //폰트 사이즈 조절
                Font font = new Font("SansSerif", Font.PLAIN, 20);
                inputField.setFont(font);
                //내부 패딩값 조절
                inputField.setMargin(new Insets(10, 10, 10, 10)); // top, left, bottom, right
                //사용할 값 제외 키보드이벤트 막기
                inputField.addKeyListener(new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                    	char c = e.getKeyChar();
                    	if(Character.isDigit(c)
                    			||isOperator(c) 
                    			|| c == KeyEvent.VK_BACK_SPACE) 
                    	{
                    		//
                    	}else {
                            // 입력 무시
                            e.consume();
                    	}
                    		

                    }
                    @Override
                    public void keyPressed(KeyEvent e) {
                    	char c = e.getKeyChar();
                    	if(Character.isDigit(c)
                    			||isOperator(c)
                    			|| c == KeyEvent.VK_BACK_SPACE ) 
                    	{
                    		//
                    	}else {
                            // 입력 무시
                            e.consume();
                    	}
                    		
                    }
                    @Override
                    public void keyReleased(KeyEvent e) {
                    	char c = e.getKeyChar();
                    	if(Character.isDigit(c)
                    			||isOperator(c) 
                    			|| c == KeyEvent.VK_BACK_SPACE) 
                    	{
                    		//키보드 입력시 값 저장
	                   		 

	                   		 
	                   		
                   		
                    	}else if(c == KeyEvent.VK_ENTER){
                    		////엔터 입력시 이벤트
                    		
                    		//inputField입력값 가져오기
                    		String text = inputField.getText();
	                   		System.out.println(text);
	                   		
	                   		//계산한값 출력
	                   		inputField.setText(getCalculate(text));;
	                   	

	                   		//기록에 저장
                    	}else {
                    		 // 입력 무시
                            e.consume();
                    	}
                    		
                    }
                });
                
                //inputField에 키보드 이벤트 등록
                
               
                ///////////기록칸 조절
                
                //위로 정렬
                recordField.setVerticalAlignment(JLabel.TOP);
                
                //버튼생성
                JButton b1 = new JButton("C");
                JButton b2 = new JButton("CE");
                JButton b3 = new JButton("%");
                JButton b4 = new JButton("/");
                JButton b5 = new JButton("7");
                JButton b6 = new JButton("8");
                JButton b7 = new JButton("9");
                JButton b8 = new JButton("*");
                JButton b9 = new JButton("4");
                JButton b10 = new JButton("5");
                JButton b11 = new JButton("6");
                JButton b12 = new JButton("-");
                JButton b13 = new JButton("1");
                JButton b14 = new JButton("2");
                JButton b15 = new JButton("3");
                JButton b16 = new JButton("+");
                JButton b17 = new JButton("");
                JButton b18 = new JButton("0");
                JButton b19 = new JButton(".");
                JButton b20 = new JButton("=");
         
                
                //버튼 커서 삭제
                b1.setFocusable(false);
                b2.setFocusable(false);
                b3.setFocusable(false);
                b4.setFocusable(false);
                b5.setFocusable(false);
                b6.setFocusable(false);
                b7.setFocusable(false);
                b8.setFocusable(false);
                b9.setFocusable(false);
                b10.setFocusable(false);
                b11.setFocusable(false);
                b12.setFocusable(false);
                b13.setFocusable(false);
                b14.setFocusable(false);
                b15.setFocusable(false);
                b16.setFocusable(false);
                b17.setFocusable(false);
                b18.setFocusable(false);
                b19.setFocusable(false);
                b20.setFocusable(false);

                //버튼 폰트 크기 조절
                Font bFont = new Font("SansSerif", Font.PLAIN, 18);
                b1.setFont(bFont);
                b2.setFont(bFont);
                b3.setFont(bFont);
                b4.setFont(bFont);
                b5.setFont(bFont);
                b6.setFont(bFont);
                b7.setFont(bFont);
                b8.setFont(bFont);
                b9.setFont(bFont);
                b10.setFont(bFont);
                b11.setFont(bFont);
                b12.setFont(bFont);
                b13.setFont(bFont);
                b14.setFont(bFont);
                b15.setFont(bFont);
                b16.setFont(bFont);
                b17.setFont(bFont);
                b18.setFont(bFont);
                b19.setFont(bFont);
                b20.setFont(bFont);
                
                //버튼에 색 추가

                b5.setBackground(Color.white);
                b6.setBackground(Color.white);
                b7.setBackground(Color.white);
                b9.setBackground(Color.white);
                b10.setBackground(Color.white);
                b11.setBackground(Color.white);
                b13.setBackground(Color.white);
                b14.setBackground(Color.white);
                b15.setBackground(Color.white);
                b18.setBackground(Color.white);
                
                
                
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
                b.gridheight = 7; // 컴포넌트가 차지할 행의 개수
                b.weightx = 1.0; // 컴포넌트의 가로 크기 비율
                b.weighty = 1.0; // 컴포넌트의 세로 크기 비율
                b.fill = GridBagConstraints.BOTH; // 컴포넌트의 크기가 셀의 크기보다 작을 때, 채울 방법
              
                b.insets = new Insets(0, 0, 0, 0); // 컴포넌트와 셀의 간격
                
                //recordPanel 제약조건
                GridBagConstraints c = new GridBagConstraints();
                c.gridx = 4; // 컴포넌트가 위치할 열 번호
                c.gridy = 0; // 컴포넌트가 위치할 행 번호
                c.gridwidth =  1; // 컴포넌트가 차지할 열의 개수
                c.gridheight = 10; // 컴포넌트가 차지할 행의 개수
                c.weightx = 1.0; // 컴포넌트의 가로 크기 비율
                c.weighty = 1.0; // 컴포넌트의 세로 크기 비율
                c.fill = GridBagConstraints.BOTH; // 컴포넌트의 크기가 셀의 크기보다 작을 때, 채울 방법
               
                c.insets = new Insets(10, 10, 10, 10); // 컴포넌트와 셀의 간격
                
                
                // frame에 추가
                frame.add(inputField,  a);
                frame.add(bp, b);	  
                frame.add(recordField, c);

                //키보드 숫자 키패드 이벤트 추가
                
                
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
	//버튼 이벤트 클래스
	class ButtonListener implements ActionListener{
		private String text;
		
		public ButtonListener(String text) {
			this.text = text;
		}
		
		@Override
	    public void actionPerformed(ActionEvent e) {
	        // 이벤트 핸들러 코드 작성
			String cur = e.getActionCommand();
			System.out.println(cur);
	    }
		
		
	}
	
	
	
	//후위계산법 계산
	static String getCalculate(String str) {
		char operation[] = {'+', '-', '*', '/', '%'};
		
		ArrayList<String> postfix = new ArrayList<>();
		Stack<Character> opStack = new Stack<>();
		Stack<String> calStack = new Stack<>();
		String num = "";
		
		// -로 시작하는 경우 예외 처리
		if(str.charAt(0) == '-') {
			str = "0" + str;
		}
		
		// 후위 연산자로 변경
		for(int i = 0; i < str.length(); i++) {
			boolean checkOp = false;
			for(int j = 0; j < operation.length; j++) {
				if(str.charAt(i) == operation[j]) {
					
					checkOp = true;
					
					if(!num.equals("")) {
						postfix.add(num);
						num = "";
					}
					
					if(operation[j] == '(') { // '(' 이면 무조건 push
						opStack.push(operation[j]);
					}else if(operation[j] == ')') { 
						// '(' 나오기 전까지 
						while(opStack.peek() != '(' && !opStack.isEmpty()) {
							postfix.add(opStack.pop().toString());
						}
						// '(' pop
						opStack.pop();
					}else {
						if(opStack.isEmpty()) {
							opStack.push(operation[j]);
						}else {
							if(opOrder(opStack.peek()) < opOrder(operation[j])) {
								opStack.push(operation[j]);
							}else {
								postfix.add(opStack.pop().toString());
								opStack.push(operation[j]);
							}
						}
					}
				}
			}
			
			if(!checkOp) {
				num += str.charAt(i);
			}
			
		}
		
		// 남은 숫자 처리
		if(!num.equals("")) {
			postfix.add(num);
		}
		
		// 남은 연산자 처리
		while(!opStack.isEmpty()) {
			postfix.add(opStack.pop().toString());
		}
		
		// 후위 연산자를 이용해 최종 결과 구하기
		for(int i = 0; i < postfix.size(); i++) {
			calStack.push(postfix.get(i));
			for(int j = 0; j < operation.length; j++) {
				if(postfix.get(i).charAt(0) == operation[j]) {
					calStack.pop();
					Double n2 = Double.parseDouble(calStack.pop());
					String re = "";
					
					if(operation[j] == '%') {
						re = Double.toString(n2 * 0.01);
					}else {
						Double n1 = Double.parseDouble(calStack.pop());
						if(operation[j] == '+') {
							re = Double.toString(n1 + n2);
						}else if(operation[j] == '-') {
							re = Double.toString(n1 - n2);
						}else if(operation[j] == '*') {
							re = Double.toString(n1 * n2);
						}else if(operation[j] == '/') {
							re = Double.toString(n1 / n2);
						}
					}
			
					calStack.push(re);
				}
			}
		}
		
		Double result = Double.parseDouble(calStack.pop());
		String calResult[] = Double.toString(result).split("\\.");

		if(Double.parseDouble(calResult[1]) == 0) {  
			if(3 <= calResult[1].length() && calResult[1].substring(0, 2).equals("0E")) {
				return Double.toString(result);
			}else { // 정수 일때, 
				return calResult[0];
			}
		}else { //실수일때
			return String.format("%.10f", result);
		}
	}
	
	//연산자 우선순위
	// % > X == / > + == - > 나머지
	static int opOrder(char op) {
		switch(op) {
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
			case '%':
				return 3;
			default:
				return -1;
		}
	}

}
