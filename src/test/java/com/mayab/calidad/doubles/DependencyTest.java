package com.mayab.calidad.doubles;

import com.mayab.calidad.*;

import org.hamcrest.junit.ExpectedException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.invocation.Invocation;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.*;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Matchers.anyInt;

@RunWith(MockitoJUnitRunner.class)
public class DependencyTest{
    @Mock
    private Dependency dependency; 
    String GET_CLASS_NAME = "Dependency";
    Dependency dependecyMock;
    IllegalArgumentException illegal = new IllegalArgumentException("exception");
    @Rule
    public ExpectedException trown = ExpectedException.none();
    @Before 
    public void setup(){
        dependecyMock = mock(Dependency.class);
    }
    @Test 
    public void testDummy(){
        assertThat(dependency.getClassName(), is(nullValue()) );
        assertThat(dependency.getClassNameUpperCase(),is(nullValue()) );
        assertThat(dependency.getSubdependecyClassName(),is(nullValue()) );
    }
    
    @Test 
    public void testThenReturn(){
        when(dependecyMock.getClassName()).thenReturn(GET_CLASS_NAME);

        String className = dependecyMock.getClassName(); 

        assertThat(className, is(GET_CLASS_NAME));
    }
    // @Test
    // public void testThrow(){
    //     when(dependecyMock.throwsException()).thenThrow(illegal); 
    // } 
    // @Test
    // public void testAddTwo(){
    //     when()
    // }
    @Test
    public void testAnswer(){
        when(dependecyMock.addTwoo(anyInt())).thenAnswer(new Answer<Integer>(){
            public Integer answer(InvocationOnMock invocation) throws Throwable{
                int arg = (Integer) invocation.getArguments()[0];
                return arg + 20;
            }
        });

        assertThat(dependecyMock.addTwoo(10), is(30));
    }
}