package org.lessons.java.spring.spring_la_mia_pizzeria_crud.repository;

import org.lessons.java.spring.spring_la_mia_pizzeria_crud.model.Offert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OffertRepository extends JpaRepository<Offert, Integer> {

}
