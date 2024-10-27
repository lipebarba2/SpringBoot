package io.felipe.aquiteturaspring.montadora;

import java.awt.*;

public class HondaHRV extends Carro {


    public HondaHRV(Motor motor) {
        super(motor);
        setCarro("Honda HRV");
        setCor(Color.RED);
        setMontadora(Montadora.HONDA);


    }
}
