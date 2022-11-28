package edu.eci.proyectocvds.persistence.mybatisimpl;

import com.google.inject.Inject;
import edu.eci.proyectocvds.entities.EstadoRecurso;
import edu.eci.proyectocvds.entities.Genero;
import edu.eci.proyectocvds.entities.Portatil;
import edu.eci.proyectocvds.entities.Recurso;
import edu.eci.proyectocvds.managedBeans.TipoBusqueda;
import edu.eci.proyectocvds.persistence.DAORecurso;
import edu.eci.proyectocvds.persistence.PersistenceException;
import edu.eci.proyectocvds.persistence.mybatisimpl.mappers.PortatilMapper;

import java.util.List;

public class MyBatisDAOPortatil implements DAORecurso<Portatil> {
    @Inject
    PortatilMapper portatilMapper;
    @Override
    public boolean saveRecurso(Portatil recurso) throws PersistenceException {
        try{
            portatilMapper.setNewPortatil(recurso);
            return true;
        }
        catch(Exception e){
            throw new PersistenceException("Error al consultar los pacientes:"+e.getLocalizedMessage(), e);
        }
    }

    @Override
    public List<Portatil> loadResource(String name, String location, TipoBusqueda genre, int capacity) throws PersistenceException {
        return null;
    }

    @Override
    public void updateResourceState(String id, EstadoRecurso estadoRecurso) throws PersistenceException {

    }
}
