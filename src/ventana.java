/**
 * Created by Carlos on 28/03/2017.
 */

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

public class ventana {
    ventana(OMoneda m1) {
        JFrame f = new JFrame("Moneda");

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension tamañoPantalla = tk.getScreenSize();

        f.setLocation((tamañoPantalla.width / 2) - 150, (tamañoPantalla.height / 2) - 100);
        f.setSize(300, 200);
        f.setResizable(false);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        lamina l = new lamina(m1);
        l.t2.setEnabled(false);
        l.t3.setEnabled(false);
        l.t4.setEnabled(false);

        Container c = f.getContentPane();
        c.add(l.panelTexto, BorderLayout.CENTER);
        c.add(l.panelBoton, BorderLayout.SOUTH);
        //f.add(l);

        f.setVisible(true);
    }
}
