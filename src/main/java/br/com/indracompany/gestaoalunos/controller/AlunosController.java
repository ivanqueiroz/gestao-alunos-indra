package br.com.indracompany.gestaoalunos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlunosController {

    @GetMapping("/alunos")
    public String listar() {
        return "ListaAlunos";
    }
}
