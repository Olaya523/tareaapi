package BackendTarea.Spring.modelsDAO;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import BackendTarea.Spring.modelentity.Estudiante;

public interface IEstudianteDAO extends JpaRepository<Estudiante, Long>{

	List<Estudiante> findAllByPromedio(Double promedio);
	 
}
