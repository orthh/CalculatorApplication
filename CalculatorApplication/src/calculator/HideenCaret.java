package calculator;

import java.awt.Graphics;

import javax.swing.text.DefaultCaret;

class HiddenCaret extends DefaultCaret {
    @Override
    public void paint(Graphics g) {
        // do nothing
    }
}