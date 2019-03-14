package com.mayab.calidad.stats;

import org.hamcrest.junit.ExpectedException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyDouble;


@RunWith(MockitoJUnitRunner.class)
public class statsTest{
    @Mock
    private StatisticsService statsService; 
    private DataService dataService;
    StatisticsService statsServiceMock;
    DataService dataServiceMock;
    @Before 
    public void setup(){
        this.statsServiceMock = mock(StatisticsService.class);
        this.dataServiceMock = mock(DataService.class);
        when(dataService.getData()).thenAnswer(new Answer<ArrayList<Integer>>(){
            public ArrayList<Integer> answer(InvocationOnMock invocation) throws Throwable{
                return null;
            }
        });
    }
    @Test
    public void testAnswer(){
        when(statsServiceMock.getAverage()).thenAnswer(new Answer<Double>(){
            public Double answer(InvocationOnMock invocation) throws Throwable{
                return 0.0;
            }
        });

        assertThat(statsServiceMock.getAverage(), is(0.0));
    }
}