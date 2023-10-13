package br.com.andrerafael.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

// @Controller usada quando temos uma estrutura de pagina/template
@RestController // usado para rota de api rest
@RequestMapping("/primeiraRota")
public class MinhaPrimeiraController {

    @GetMapping("/")
    public String primeiraMensagem() {
        return "Funcionou";
    }
}
