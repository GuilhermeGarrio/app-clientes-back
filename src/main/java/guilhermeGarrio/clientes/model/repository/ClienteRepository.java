package guilhermeGarrio.clientes.model.repository;

import guilhermeGarrio.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
