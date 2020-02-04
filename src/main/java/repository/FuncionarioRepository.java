package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import antlr.collections.List;
import model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Long> {
	
	List findbynomeFuncionario(String nome);
}