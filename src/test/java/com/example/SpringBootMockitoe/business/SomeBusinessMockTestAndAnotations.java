package com.example.SpringBootMockitoe.business;

import com.example.SpringBootMockitoe.data.SomeDataService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockTestAndAnotations {

    @InjectMocks
    SomeBusinessImpl business;

    @Mock
    SomeDataService dataServiceMock;
  /*  @Before
    public void setUp() throws Exception {
        business.setSomeDataServie(dataServiceMock);
    }
*/
    @Test
    public void calculateSumUsingDataService_basic() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1, 2, 3});


        int actualResult = business.calculateSumUsinDataServie();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_empty() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        int actualResult = business.calculateSumUsinDataServie();
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_oneValue() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{5});

        int actualResult = business.calculateSumUsinDataServie();
        int expectedResult = 5;
        assertEquals(expectedResult, actualResult);
    }
}
