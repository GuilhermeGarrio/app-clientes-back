package guilhermeGarrio.clientes.model.repository;

import guilhermeGarrio.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Servico, Integer> {

}
