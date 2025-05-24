package dev.ScrimetEnterprise.CadastroDePessoas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//essas duas anotações andam juntas
@RestController
@RequestMapping

public class NinjaController {
    //ele vai pegar a rota e deixar registrado
    @GetMapping("/boasvindas")
    public String boasVindas() {

        return "essa é minha primeira mensagem nessa rota";
    }

}
