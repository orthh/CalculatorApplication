package calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPlus extends JButton implements ActionListener{
	public ButtonPlus(String label) {
        super(label);
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // 버튼이 클릭되었을 때 실행할 코드 작성
    }
}
