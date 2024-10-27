package io.felipe.aquiteturaspring.montadora.config;


import io.felipe.aquiteturaspring.montadora.Motor;
import io.felipe.aquiteturaspring.montadora.tipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MotadoraConfiguration {

    @Bean(name = "motorAspirado")
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipo(tipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalos(300);
        motor.setCilindros(6);
        motor.setModelo("X-0");
        motor.setLitragem(3.0);
        motor.setTipo(tipoMotor.TURBO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindros(3);
        motor.setModelo("XG-0");
        motor.setLitragem(2.0);
        motor.setTipo(tipoMotor.ELETRICO);
        return motor;
    }
}
