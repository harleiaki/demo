package br.com.impacta.jsp.controller.cadastro;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Cadastro {
@RequestMapping(value = "/cadastro",
                method = RequestMethod.GET)
    public String getCadastro() {
        return "/cadastro/cadastro";
    }
}
