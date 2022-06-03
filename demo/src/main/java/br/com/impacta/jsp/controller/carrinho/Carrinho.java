package br.com.impacta.jsp.controller.carrinho;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class Carrinho {
    @GetMapping("/carrinho")
public String getCarrinho(){
    return "/carrinho-de-compra/carrinho";
}
}
