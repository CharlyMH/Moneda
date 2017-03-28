/**
 * Created by Carlos on 28/03/2017.
 */

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class lamina implements ActionListener {
    JLabel l1 = new JLabel("Nº lanzamientos:");
    JTextField t1 = new JTextField(5);
    JButton b1 = new JButton("Lanzar");
    JLabel l2 = new JLabel("Caras");
    JTextField t2 = new JTextField(5);
    JLabel l3 = new JLabel("Cruces");
    JTextField t3 = new JTextField(5);
    JLabel l4 = new JLabel("Diferencia");
    JTextField t4 = new JTextField(5);
    OMoneda mi;
    JPanel panelTexto = new JPanel();
    GridLayout gl = new GridLayout(4, 2);
    JPanel panelBoton = new JPanel();

    lamina(OMoneda m1) {
        mi = m1;

        panelTexto.setLayout(gl);
        panelTexto.add(l1);
        panelTexto.add(t1);
        panelTexto.add(l2);
        panelTexto.add(t2);
        panelTexto.add(l3);
        panelTexto.add(t3);
        panelTexto.add(l4);
        panelTexto.add(t4);

        panelBoton.setLayout(new FlowLayout());
        panelBoton.add(b1);

        b1.addActionListener(this);

        KeyListener k = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_ENTER) {
                    Evento();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        };
        t1.addKeyListener(k);
    }

    private static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    public void actionPerformed(ActionEvent e) {
        Evento();
    }

    private void Evento() {
        if (isNumeric(t1.getText()) && Integer.parseInt(t1.getText()) < 0) {
            mi.lanazamientos(Integer.parseInt(t1.getText()));
            t2.setText(String.valueOf(mi.getCaras()));
            t3.setText(String.valueOf(mi.getCruces()));
            t4.setText(String.valueOf(mi.getDiferencia()));
        }
    }
}
