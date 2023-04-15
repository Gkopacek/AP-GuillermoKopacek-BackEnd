package com.myportfolioAP.gk.Service;

import com.myportfolioAP.gk.Entity.HardySoftS;
import com.myportfolioAP.gk.Repository.IHardySoftSRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HardySoftS_Service {

    @Autowired IHardySoftSRepository ShYs;
    
    
    
    public List<HardySoftS> list(){
    return ShYs.findAll();
    }

public Optional<HardySoftS> getOne(int id){
    System.out.println("se ejecuta la funcion getOne desde el service de soft y hard skills");
    return ShYs.findById(id);
    }

public Optional<HardySoftS> getByNombre(String nombre){
    System.out.println("se ejecuta la funcion getByNombre desde el service de soft y hard skills");
    return ShYs.findByNombre(nombre);
    }

public Optional<HardySoftS> getByPorcentaje(int porcentaje){
    System.out.println("se ejecuta la funcion getByPorcentaje desde el service de soft y hard skills");
    return ShYs.findByPorcentaje(porcentaje);
    }

public void save(HardySoftS hardySoftS){
    System.out.println("se ejecuta la funcion save desde el service de soft y hard skills");
    ShYs.save(hardySoftS);
}

public void delete(int id){
    System.out.println("se ejecuta la funcion delete desde el service de soft y hard skills");
    ShYs.deleteById(id);
}

public boolean existsById(int id){
    System.out.println("se ejecuta la funcion existsById desde el service de soft y hard skills");
    return ShYs.existsById(id);
}

public boolean existsByNombre(String nombre){
    System.out.println("se ejecuta la funcion existsByNombre desde el service de soft y hard skills");
    return ShYs.existsByNombre(nombre);
}

    public String findByPorcentaje() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

