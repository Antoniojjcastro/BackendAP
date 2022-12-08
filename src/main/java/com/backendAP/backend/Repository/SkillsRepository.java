
package com.backendAP.backend.Repository;


import com.backendAP.backend.Entity.Skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SkillsRepository extends JpaRepository<Skills,Integer> {
    
    public Optional<Skills> findByName(String name);
    public boolean existsByName(String name);
}

