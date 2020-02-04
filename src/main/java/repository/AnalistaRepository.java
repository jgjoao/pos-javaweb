package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import antlr.collections.List;
import model.Analista;

public interface AnalistaRepository extends JpaRepository<Analista,Long> {
	
	List findbynomeAnalista(String nome);

}
