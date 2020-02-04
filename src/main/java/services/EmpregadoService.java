package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Empregado;
import repository.EmpregadoRepository;

@Service
public class EmpregadoService implements CrudInterface<Empregado> {

	@Autowired
	private EmpregadoRepository empregadorepository;

	@Override
	public List<Empregado> findAll() {

		return empregadorepository.findAll();
	}

	@Override
	public Optional<Empregado> save(Empregado entity) {

		return Optional.of(empregadorepository.save(entity));
	}

	@Override
	public Optional<Empregado> findById(long id) {

		return empregadorepository.findById(id);
	}

	@Override
	public void delete(Empregado entity) {
		empregadorepository.delete(entity);

	}

	@Override
	public void deleteById(long id) {
		empregadorepository.deleteById(id);

	}

	@Override
	public long count() {

		return empregadorepository.count();
	}

}
