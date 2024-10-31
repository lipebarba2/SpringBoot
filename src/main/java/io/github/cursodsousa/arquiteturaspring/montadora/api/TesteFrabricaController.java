package io.github.cursodsousa.arquiteturaspring.montadora.api;


import io.felipe.aquiteturaspring.montadora.CarroStatus;
import io.github.cursodsousa.arquiteturaspring.montadora.Chave;
import io.github.cursodsousa.arquiteturaspring.montadora.HondaHRV;
import io.github.cursodsousa.arquiteturaspring.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("carros")
public class TesteFrabricaController {

    @Autowired
    @Turbo
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave) {
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }


}
