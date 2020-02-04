package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Gerente;
import repository.GerenteRepository;

@Service
public class GerenteService implements CrudInterface<Gerente> {

	@Autowired
	private GerenteRepository gerenteRepository;

	@Override
	public List<Gerente> findAll() {

		return gerenteRepository.findAll();
	}

	@Override
	public Optional<Gerente> save(Gerente entity) {

		return Optional.of(gerenteRepository.save(entity));
	}

	@Override
	public Optional<Gerente> findById(long id) {

		return gerenteRepository.findById(id);
	}

	@Override
	public void delete(Gerente entity) {
		gerenteRepository.delete(entity);

	}

	@Override
	public void deleteById(long id) {
		gerenteRepository.deleteById(id);

	}

	@Override
	public long count() {

		return gerenteRepository.count();
	}

}
