
package com.backendAP.backend.Service;

import com.backendAP.backend.Entity.Persona;
import com.backendAP.backend.Interface.IPersonaService;
import com.backendAP.backend.Repository.PersonaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

@Autowired PersonaRepository  iPersonaRepository;
    
    
    @Override
    public List<Persona> getpersona() {
       List<Persona> listapersonas = iPersonaRepository.findAll();
       return listapersonas;
    }

    @Override
    public void savePersona(Persona persona) {
     iPersonaRepository.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
      iPersonaRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id){
        Persona persona = iPersonaRepository.findById(id).orElse(null);
        return persona;
    }
    
      public Optional<Persona> getOne(long id){
        return iPersonaRepository.findById(id);
    }
    
}
