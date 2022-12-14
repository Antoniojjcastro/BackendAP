
package com.backendAP.backend.Service;


import com.backendAP.backend.Entity.Educacion;
import com.backendAP.backend.Repository.EducacionRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EducacionService {
    @Autowired
    EducacionRepository iEducacionRepository ;
    
    public List<Educacion> list(){
        return iEducacionRepository.findAll();
    }
    
     public Optional<Educacion> getOne(int id){
        return iEducacionRepository.findById(id);
    }
     
      public Optional<Educacion> getBySchool(String school){
        return iEducacionRepository.findBySchool(school);
      }
    
     
    public Optional<Educacion> findBySchool(String school){
        return iEducacionRepository.findBySchool(school);
    }
    
     
       
    public void saveEducacion(Educacion educacion) {
     iEducacionRepository.save(educacion);
    }

 
    public void deleteEducacion(int id) {
      iEducacionRepository.deleteById(id);
    }

    
    public Educacion findEducacion(int id){
        Educacion educacion = iEducacionRepository.findById(id).orElse(null);
        return educacion;
    }
    
    public boolean existsById(int id){
      return  iEducacionRepository.existsById(id);
    }
    
     public boolean existsBySchool(String school){
      return  iEducacionRepository.existsBySchool(school);
    }  
}