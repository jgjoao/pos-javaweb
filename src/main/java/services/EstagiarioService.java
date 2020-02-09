package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import model.Estagiario;

import repository.EstagiarioRepository;

public class EstagiarioService implements CrudInterface<Estagiario> {

	@Autowired
	private EstagiarioRepository estagiariorepository;

	@Override
	public List<Estagiario> findAll() {

		return estagiariorepository.findAll();
	}

	@Override
	public Optional<Estagiario> save(Estagiario entity) {

		return Optional.of(estagiariorepository.save(entity));
	}

	@Override
	public Optional<Estagiario> findById(long id) {

		return estagiariorepository.findById(id);
	}

	@Override
	public void delete(Estagiario entity) {
		estagiariorepository.delete(entity);

	}

	@Override
	public void deleteById(long id) {
		estagiariorepository.deleteById(id);

	}

	@Override
	public long count() {

		return estagiariorepository.count();
	}

}
