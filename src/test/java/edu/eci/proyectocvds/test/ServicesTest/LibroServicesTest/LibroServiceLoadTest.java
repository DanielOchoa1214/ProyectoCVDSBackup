package edu.eci.proyectocvds.test.ServicesTest.LibroServicesTest;

import edu.eci.proyectocvds.entities.Libro;
import edu.eci.proyectocvds.entities.Portatil;
import edu.eci.proyectocvds.managedbeans.TipoBusqueda;
import edu.eci.proyectocvds.persistence.DAORecurso;
import edu.eci.proyectocvds.errors.PersistenceException;
import edu.eci.proyectocvds.errors.ExcepcionServiciosRecurso;
import edu.eci.proyectocvds.services.ServicioRecurso;
import edu.eci.proyectocvds.services.impl.ServiciosLibroImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LibroServiceLoadTest {
/*    @Mock
    DAORecurso<Libro> daoLibroTest;

    ServicioRecurso<Libro> serviciosLibro;

    @Before
    public void beforeTest(){
        MockitoAnnotations.initMocks(this);
        serviciosLibro = new ServiciosLibroImpl(daoLibroTest);
    }

    *//*
     * Clases de equivalencia
     * No exista ningun recurso
     * Que algun recurso que exista
     * La consulta suelte error
     *//*

    @Test
    public void given_DataBook_when_NoExistMatch_then_ReturnEmptyList() {
        try {
            //ARRANGE
            Libro libro = new Libro("1234", "1", "ACADEMICO", 2, "123", "1234",
                    1, 2, "DISPONIBLE", "yo", false, 1);
            ArrayList<Libro> list = new ArrayList<>();
            list.add(libro);
            Mockito.when(daoLibroTest.load(new Libro("1234", "pos1", 2))).thenReturn(list);
            //ACT
            List<Libro> test = serviciosLibro.load(new Libro("1234", "pos1", 2));
            //ASSERT
            assertEquals(0, test.size());
        } catch (PersistenceException | ExcepcionServiciosRecurso e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void given_DataBook_when_ExistMatch_then_ReturnList() throws PersistenceException, ExcepcionServiciosRecurso {
        //ARRANGE
        Libro libro_1 = new Libro("1234", "pos1", "ACADEMICO", 2, "123", "1234",
                1, 2, "DISPONIBLE", "yo", false, 1);
        Libro libro_2 = new Libro("1234", "pos1", "ACADEMICO", 2, "123", "1234",
                1, 2, "DISPONIBLE", "yo", false, 1);
        ArrayList<Libro> list = new ArrayList<>();
        list.add(libro_1);
        list.add(libro_2);
        Mockito.when(daoLibroTest.load(new Libro("1234", "pos1", 2))).thenReturn(list);
        //ACT
        List<Libro> test = serviciosLibro.load(new Libro("1234", "pos1", 2));
        //ASSERT
        assertEquals(2, test.size());
    }

    @Test(expected = ExcepcionServiciosRecurso.class)
    public void given_DataBook_when_IncorrectQuery_then_ThrowException() throws PersistenceException, ExcepcionServiciosRecurso {
        //ARRANGE
        Libro libro = new Libro("1234", "pos1", "ACADEMICO", 2, "123", "1234",
                1, 2, "DISPONIBLE", "yo", false, 1);
        ArrayList<Libro> list = new ArrayList<>();
        list.add(libro);
        Mockito.when(daoLibroTest.load(new Libro("1234", "pos1", 2))).thenReturn(list);
        Mockito.when(daoLibroTest.load(new Libro("1234", "pos1", 2))).thenThrow(new PersistenceException("Mal_Query"));
        //ACT
        List<Libro> test = serviciosLibro.load(new Libro("1234", "pos1", 2));
        //ASSERT
    }*/
}
