package utn.tienda_libros;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServicio implements ILibroServicio {

    @Autowired
    private LibroRepositorio libroRepositorio;

    @Override
    public Libro buscarLibroPorId(Integer idLibro) {
        Libro libro = libroRepositorio.findById(idLibro).orElse(null);
        return libro;
    }

    @Override
    public void eliminarLibro(Libro libro) {

        libroRepositorio.delete(libro);
    }

    @Override
    public void guardarLibro(Libro libro) {

        libroRepositorio.save(libro);
    }

    @Override
    public List<Libro> listarLibros() {

        return libroRepositorio.findAll();
    }

}
