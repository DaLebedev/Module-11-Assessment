package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Pizza;
@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long>{

}
