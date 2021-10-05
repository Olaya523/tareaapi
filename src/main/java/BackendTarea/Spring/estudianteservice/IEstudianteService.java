package BackendTarea.Spring.estudianteservice;

import java.util.List;

import BackendTarea.Spring.modelentity.Estudiante;

public interface IEstudianteService {
	public List<Estudiante> findAll();
	public Estudiante save(Estudiante e);
	public void delete(Long id);
	public Estudiante encontrarporId(Long id);
	public List<Estudiante> encontrarporPromedio(Double promedio);
}
