package controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Gerente;
import services.GerenteService;

@RestController
@RequestMapping("/api")
public class GerenteResouce {
	
	@Autowired
	private GerenteService gerenteService;

	@GetMapping("/gerente")
	public List<Gerente> getGerentes() {

		return gerenteService.findAll();
	}

	@PostMapping("/gerente")
	public ResponseEntity<Gerente> save(@RequestBody Gerente gerente) {

		gerente = gerenteService.save(gerente).get();

		return ResponseEntity.ok().body(gerente);
	}

	@PutMapping("/gerente")
	public ResponseEntity<Gerente> update(@RequestBody Gerente gerente) {

		gerente = gerenteService.save(gerente).get();

		return ResponseEntity.ok().body(gerente);
	}

	@DeleteMapping("/gerente")
	public ResponseEntity<String> delete(@RequestBody Gerente gerente) {

		gerenteService.delete(gerente);
		return ResponseEntity.ok().body("Gerente excluded " + gerente.getId());
	}


}
