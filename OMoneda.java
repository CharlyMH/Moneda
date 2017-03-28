/**
 * Created by Carlos on 21/03/2017.
 */

import java.util.Random;
import static java.lang.Math.abs;

public class OMoneda {
    public static int CARA = 0;
    public static int CRUZ = 1;
    private int caras;
    private int cruces;
    private int diferencia;
    private Random a = new Random(System.nanoTime());

    public OMoneda() {
    }

    public int getCaras() {
        return caras;
    }

    public int getCruces() {
        return cruces;
    }

    public int getDiferencia() {
        return diferencia;
    }

    public void lanazamientos(int n) {
        caras = 0;
        cruces = 0;
        diferencia = 0;
        for (int i = 0; i < n; i++) {
            if (a.nextInt(2) == CARA) {
                caras++;
            } else cruces++;
        }
        diferencia();
    }

    private void diferencia() {
        diferencia = abs(abs(caras) - abs(cruces));
    }
}