package controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Empregado;
import services.EmpregadoService;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpregadoResource {

	@Autowired
	private EmpregadoService empregadoService;

	@GetMapping("/empregado")
	public List<Empregado> getEmpregados() {

		return empregadoService.findAll();
	}

	@PostMapping("/empregado")
	public ResponseEntity<Empregado> save(@RequestBody Empregado Empregado) {

		Empregado = empregadoService.save(Empregado).get();

		return ResponseEntity.ok().body(Empregado);
	}

	@PutMapping("/empregado")
	public ResponseEntity<Empregado> update(@RequestBody Empregado empregado) {

		empregado = empregadoService.save(empregado).get();

		return ResponseEntity.ok().body(empregado);
	}

	@DeleteMapping("/empregado")
	public ResponseEntity<String> delete(@RequestBody Empregado empregado) {

		empregadoService.delete(empregado);
		return ResponseEntity.ok().body("Empregado excluded " + empregado.getId());
	}

}
