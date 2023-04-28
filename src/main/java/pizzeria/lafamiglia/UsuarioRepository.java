package pizzeria.lafamiglia;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // No es necesario agregar la anotación @Repository, ya que JpaRepository
    // ya tiene la anotación @Repository
    // public Usuario save(Usuario usuario);
    // El método save() ya está definido en JpaRepository, por lo que no es
    // necesario redefinirlo aquí. Si necesitas personalizar la lógica de
    // guardado, puedes hacerlo mediante una clase que implemente la interfaz
    // JpaRepository y agregando la anotación @Repository.
}
