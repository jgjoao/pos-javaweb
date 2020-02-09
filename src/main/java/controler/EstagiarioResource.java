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

import model.Estagiario;
import services.EstagiarioService;

@RestController
@RequestMapping("/api")
public class EstagiarioResource {

	@Autowired
	private EstagiarioService estagiarioService;

	@GetMapping("/estagiario")
	public List<Estagiario> getGerentes() {

		return estagiarioService.findAll();
	}

	@PostMapping("/estagiario")
	public ResponseEntity<Estagiario> save(@RequestBody Estagiario estagiario) {

		estagiario = estagiarioService.save(estagiario).get();

		return ResponseEntity.ok().body(estagiario);
	}

	@PutMapping("/estagiario")
	public ResponseEntity<Estagiario> update(@RequestBody Estagiario estagiario) {

		estagiario = estagiarioService.save(estagiario).get();

		return ResponseEntity.ok().body(estagiario);
	}

	@DeleteMapping("/estagiario")
	public ResponseEntity<String> delete(@RequestBody Estagiario estagiario) {

		estagiarioService.delete(estagiario);
		return ResponseEntity.ok().body("Funcioario excluded " + estagiario.getId());
	}

}
