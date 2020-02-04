package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import antlr.collections.List;
import model.Empregado;
import model.Gerente;

public interface GerenteRepository extends JpaRepository<Gerente,Long> {
	
	List findbynomeEmpregado(String nome); 

		
}