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

import model.Analista;
import services.AnalistaService;

@RestController
@RequestMapping("/api")
public class AnalistaResource {
     
	@Autowired
	private AnalistaService analistaService;
	
	
	@GetMapping("/analista")
	
	public List<Analista> getAnalistas() {

		return analistaService.findAll();
	}

	@PostMapping("/analista")
	public ResponseEntity<Analista> save(@RequestBody Analista analista) {

		analista= analistaService.save(analista).get();

		return ResponseEntity.ok().body(analista);
	}

	@PutMapping("/analista")
	public ResponseEntity<Analista> update(@RequestBody Analista analista) {

		analista = analistaService.save(analista).get();

		return ResponseEntity.ok().body(analista);
	}

	@DeleteMapping("/analista")
	public ResponseEntity<String> delete(@RequestBody Analista analista) {

		analistaService.delete(analista);
		return ResponseEntity.ok().body("Analista excluded " + analista.getId());
	}

	
	
	
}
