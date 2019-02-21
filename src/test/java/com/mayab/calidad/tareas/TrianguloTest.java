package com.mayab.calidad.tareas;

import static org.hamcrest.core.Is.is;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException; 
import com.mayab.calidad.tareas.Triangulo; 
import junit.*;

/**
 *
 * @author aleja
 */
public class TrianguloTest {
    private Triangulo t;
    
    public TrianguloTest() {
    }
       
    @Before
    public void setUp() {
        this.t = new Triangulo();

    }
    
    @After
    public void tearDown() {

    }
    @Test
    public void testEquilatero(){
        assertThat(this.t.tipoTriangulo(5, 5,5), is("equilatero"));
    }
    @Test
    public void testIsosceles(){
        assertThat(this.t.tipoTriangulo(5, 5, 10), is("isosceles"));
    }
    @Test
    public void testEscaleno(){
        assertThat(this.t.tipoTriangulo(5, 6, 10), is("escaleno"));
    } 
    @Test
    public void testEsTriangulo(){
        assertThat(this.t.tipoTriangulo(-1, 0, 0), is("no es un triangulo"));
    } 
   
}