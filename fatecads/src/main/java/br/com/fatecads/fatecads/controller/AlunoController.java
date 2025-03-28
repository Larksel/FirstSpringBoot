package br.com.fatecads.fatecads.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fatecads.fatecads.entity.Aluno;
import br.com.fatecads.fatecads.service.AlunoService;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/alunos")
public class AlunoController {
  
  @Autowired
  private AlunoService alunoService;

  // Método para listar todos os alunos
  @GetMapping("/listar")
  public String listar(Model model) {
    // Buscar todos os alunos
    List<Aluno> alunos = alunoService.findAll();

    // Adiciona os alunos
    model.addAttribute("alunos", alunos);

    // Retorna a página da lista
    return "/aluno/listaAlunos";
  }

}
