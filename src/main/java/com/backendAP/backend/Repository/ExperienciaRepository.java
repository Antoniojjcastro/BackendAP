
package com.backendAP.backend.Repository;



import com.backendAP.backend.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia,Integer> {
    
    public Optional<Experiencia> findByCompany(String company);
    public boolean existsByCompany(String company);
}
