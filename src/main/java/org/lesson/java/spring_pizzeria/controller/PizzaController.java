package org.lesson.java.spring_pizzeria.controller;

import org.lesson.java.spring_pizzeria.repo.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.lesson.java.spring_pizzeria.model.Pizza;
import java.util.List;

@Controller
@RequestMapping("/pizzas")
public class PizzaController {

    @Autowired
    private PizzaRepository repository;

   @GetMapping
   public String index(Model  model){

        List<Pizza> pizzas = repository.findAll();

        model.addAttribute("pizzas", pizzas);
        return "pizzas/index";
   }


   @GetMapping("/{id}")
   public String show(@PathVariable("id") Integer id, Model model){
    Pizza pizza =  repository.findById(id).get();
    model.addAttribute("pizza", pizza);
    return "pizzas/show";
   }
    
}
