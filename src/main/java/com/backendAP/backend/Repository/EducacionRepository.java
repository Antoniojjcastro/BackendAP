
package com.backendAP.backend.Repository;


import com.backendAP.backend.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EducacionRepository extends JpaRepository<Educacion,Integer> {
    
    public Optional<Educacion> findBySchool(String school);
    public boolean existsBySchool(String school);
}