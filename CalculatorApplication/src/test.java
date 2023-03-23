import javax.swing.*;   
import java.awt.Dimension;
import java.awt.Toolkit;
public class test {

	public static void main(String[] args) {

		//이벤트 디스패치 스레드에서 실행
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	//프로그램 맨상단 이름
                JFrame frame = new JFrame("계산기");
                //사용자가 윈도우를닫을때 프로그램을 종료시키는 역할
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //frame 의 크기 설정
                frame.setPreferredSize(new Dimension(800, 600));
                //label 을 생성하고 "계산기"라는 텍스트 가진 레이블 만듬.
                //SwingConstatns.CENTER 는 레이블의 텍스트를 중앙정렬
                JLabel label = new JLabel("계산기", SwingConstants.CENTER);
                //frame객체의 contentPane에 레이블을add함
                //getContentPane() 메서드는 frame객체의 ContentPane을반환함.
                //ContentPane은 컨테이너이며 다른 컴포넌트를 포함할수 있음.
                frame.getContentPane().add(label);
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                //frame의 위치 설정
                //dim.width/2-800/2 는 스크린 가로 해상도의 절반에서 프레임의 가로길이
                //800의 절반을 뺀 값
                frame.setLocation(dim.width/2-800/2, dim.height/2-600/2);
                //프레임 내의 모든 컴포넌트의 크기와 위치를 고려하여 프레임의 최소 크기 계산, 보여줌
                frame.pack();
                //프레임을 사용자에게 표시하는 방법
                frame.setVisible(true);
            }
        });
	}

}
