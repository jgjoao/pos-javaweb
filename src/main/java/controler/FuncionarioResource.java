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

import model.Funcionario;
import services.FuncionarioService;

@RestController
@RequestMapping("/api")
public class FuncionarioResource {

	@Autowired
	private FuncionarioService funcionarioService;

	@GetMapping("/funcionario")
	public List<Funcionario> getGerentes() {

		return funcionarioService.findAll();
	}

	@PostMapping("/funcionario")
	public ResponseEntity<Funcionario> save(@RequestBody Funcionario funcionario) {

		funcionario = funcionarioService.save(funcionario).get();

		return ResponseEntity.ok().body(funcionario);
	}

	@PutMapping("/funcionario")
	public ResponseEntity<Funcionario> update(@RequestBody Funcionario funcionario) {

		funcionario = funcionarioService.save(funcionario).get();

		return ResponseEntity.ok().body(funcionario);
	}

	@DeleteMapping("/funcionario")
	public ResponseEntity<String> delete(@RequestBody Funcionario funcionario) {

		funcionarioService.delete(funcionario);
		return ResponseEntity.ok().body("Funcioario excluded " + funcionario.getId());
	}

}
