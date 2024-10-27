package io.felipe.aquiteturaspring.montadora.api;


import io.felipe.aquiteturaspring.montadora.CarroStatus;
import io.felipe.aquiteturaspring.montadora.Chave;
import io.felipe.aquiteturaspring.montadora.HondaHRV;
import io.felipe.aquiteturaspring.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carros")
public class TesteFrabricaController {

    @Autowired
    @Qualifier("motorEletrico")
    private Motor motor;


    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);

    }
}
