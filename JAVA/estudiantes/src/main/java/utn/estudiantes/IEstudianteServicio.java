package utn.estudiantes;

import java.util.List;

public interface IEstudianteServicio {
    
    public List<Estudiantes> listarEstudiantes();

    public Estudiantes buscarEstudiantePorId(Integer idEstudiantes);

    public void guardarEstudiante(Estudiantes estudiante);

    public void eliminarEstudiante(Estudiantes estudiante);
}
