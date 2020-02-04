package services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Analista;
import repository.AnalistaRepository;

@Service
public class AnalistaService implements CrudInterface<Analista> {

	@Autowired
	private AnalistaRepository analistaRepository;

	@Override
	public List<Analista> findAll() {

		return analistaRepository.findAll();
	}

	@Override
	public Optional<Analista> save(Analista entity) {

		return Optional.of(analistaRepository.save(entity));
	}

	@Override
	public Optional<Analista> findById(long id) {

		return analistaRepository.findById(id);
	}

	@Override
	public void delete(Analista entity) {
		analistaRepository.delete(entity);

	}

	@Override
	public void deleteById(long id) {
		analistaRepository.deleteById(id);

	}

	@Override
	public long count() {
		return analistaRepository.count();
	}

}
