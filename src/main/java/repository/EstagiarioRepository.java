package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import antlr.collections.List;
import model.Estagiario;

public interface EstagiarioRepository extends JpaRepository<Estagiario,Long> {
	
	List findbynomeEstagiario(String nome); 
	
}
