
package com.backendAP.backend.Repository;


import com.backendAP.backend.Entity.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Integer> {

    public Optional<Proyecto> findByName(String name);

    public boolean existsByName(String name);
}
