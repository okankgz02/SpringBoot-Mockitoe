package com.example.SpringBootMockitoe.business;

import com.example.SpringBootMockitoe.data.SomeDataService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class SomeBusinessMockTest {

    SomeBusinessImpl business = new SomeBusinessImpl();

    SomeDataService dataServiceMock = Mockito.mock(SomeDataService.class); //interface mocklandı

    @Before
    public void setUp() throws Exception {
        business.setSomeDataServie(dataServiceMock);
    }

    @Test
    public void calculateSumUsingDataService_basic() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{1, 2, 3});


        int actualResult = business.calculateSumUsinDataServie();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }


}
