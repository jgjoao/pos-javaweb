package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import antlr.collections.List;
import model.Empregado;



public interface EmpregadoRepository extends JpaRepository<Empregado,Long> {
	
	List findbynomeEmpregado(String nome);

}
