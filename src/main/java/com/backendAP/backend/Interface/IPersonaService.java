
package com.backendAP.backend.Interface;


import com.backendAP.backend.Entity.Persona;
import java.util.List;
import java.util.Optional;


public interface IPersonaService {
   
    public List<Persona> getpersona();
    
    public void savePersona(Persona persona);
    
    public void deletePersona(Long id);
    
    public Persona findPersona(Long id);  
   
    public Optional<Persona> getOne(long id);
}
