package io.felipe.aquiteturaspring.montadora;

import java.awt.*;

public class Carro {

    private String carro;
    private Color cor;
    private Motor motor;
    private Montadora montadora;


    public Carro(Motor motor) {
        this.motor = motor;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public CarroStatus darIgnicao(Chave chave) {
        if(chave.getMontadora() != this.montadora) {
            return new CarroStatus("Não é possível iniar carro com esta chave");
        }
        return new CarroStatus("Carro ligado. Com o motor: " + motor);
    }
}
