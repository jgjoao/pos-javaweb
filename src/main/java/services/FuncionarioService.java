package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import model.Funcionario;
import repository.FuncionarioRepository;

public class FuncionarioService implements CrudInterface<Funcionario> {

	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@Override
	public List<Funcionario> findAll() {

		return funcionarioRepository.findAll();
	}

	@Override
	public Optional<Funcionario> save(Funcionario entity) {

		return Optional.of(funcionarioRepository.save(entity));
	}

	@Override
	public Optional<Funcionario> findById(long id) {

		return funcionarioRepository.findById(id);
	}

	@Override
	public void delete(Funcionario entity) {
		funcionarioRepository.delete(entity);

	}

	@Override
	public void deleteById(long id) {
		funcionarioRepository.deleteById(id);

	}

	@Override
	public long count() {

		return funcionarioRepository.count();
	}

}
