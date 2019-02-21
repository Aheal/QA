package com.mayab.calidad.tareas;

import java.lang.reflect.Array;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.lang.*;
import java.util.Arrays;
import static org.hamcrest.core.Is.is;

/**
 *
 * @author aleja
 */
@RunWith(Parameterized.class) 

public class TrianguloParamTest {
    Triangulo t;
    private int lado1,lado2,lado3;  
    private String expected;

    @Before
    public void setUp() {
       this.t = new Triangulo();
    }
    
    @After
    public void tearDown() {
    }
    @Parameters
       public static Iterable data(){
           return Arrays.asList(new Object[][]{
           {"equilatero",6,6,6},{"isosceles",6,5,6},{"escaleno",6,5,8},{"no es un triangulo",0,0,0},{"no es un triangulo",-1,0,-10}
            });
       } 
       
       public TrianguloParamTest(String expected, int lado1, int lado2, int lado3){
           this.expected = expected; 
           this.lado1 = lado1; 
           this.lado2 = lado2;
           this.lado3 = lado3; 

       }
       
       @Test
       public void substracting() {
           assertThat(this.t.tipoTriangulo(this.lado1, this.lado2, this.lado3), is(this.expected)); 
           System.out.println(this.expected);
       }
}
