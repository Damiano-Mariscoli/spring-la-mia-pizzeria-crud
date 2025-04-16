package org.lesson.java.spring_pizzeria.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.lesson.java.spring_pizzeria.model.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza, Integer> {
    
}

