package BackendTarea.Spring.modelsDAO.estudiantecontroller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import BackendTarea.Spring.modelentity.Estudiante;
import BackendTarea.Spring.estudianteservice.IEstudianteService;

@RestController
@RequestMapping("/api")
public class EstudianteRestController {
	@Autowired
	private IEstudianteService estudianteservice;
	@GetMapping("/estudiantes")
	public List<Estudiante> listarPersonas(){
		return estudianteservice.findAll();
	}
	@PostMapping("/estudiantes")
	@ResponseStatus(HttpStatus.CREATED)
	public Estudiante guardar(@RequestBody Estudiante e) {
		return estudianteservice.save(e);
	}
	@DeleteMapping("/estudiantes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar(@PathVariable Long id) {
		estudianteservice.delete(id);
	}
	@GetMapping("/estudiantes/{id}")
	public Estudiante encontraporId(@PathVariable Long id) {
		return estudianteservice.encontrarporId(id);
	}
	@PutMapping("/estudiantes/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public Estudiante editar(@PathVariable Long id,@RequestBody Estudiante e) {
		Estudiante actual=estudianteservice.encontrarporId(id);
		actual.setNombre(e.getNombre());
		actual.setApellido(e.getApellido());
		return estudianteservice.save(actual);
	}
	@GetMapping("/estudiantes/promedio/{promedio}")
	public List<Estudiante> encontraporPromedio(@PathVariable Double promedio) {
		return estudianteservice.encontrarporPromedio(promedio);
	}
}
