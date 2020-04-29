package de.kohnlehome;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;


public class MaxKursAnstiegFallTest {
    private MaxKursAnstiegFall maxKursAnstiegFall;


    @BeforeEach
    public void init() {
        IBoersenReader boersenReader = mock(IBoersenReader.class);
        when(boersenReader.readKurs("Google", 2012)).thenReturn(new double[]{12.0,17.3,2.0,37.99,5.0});
        when(boersenReader.readKurs("Vodafone", 2013)).thenReturn(new double[]{12.3,13.4,123.4,1.0});
        maxKursAnstiegFall = new MaxKursAnstiegFall(boersenReader);

    }

    @Test
    public void maxKursAnstiegTestGoogle() {
        double result = maxKursAnstiegFall.maxKursanstieg("Google", 2012);
        assertThat(result).isEqualTo(35.99);
    }

    @Test
    public void maxKursAnstiegTestVodafone() {
        double result = maxKursAnstiegFall.maxKursanstieg("Vodafone", 2013);
        assertThat(result).isEqualTo(110.0);
    }

    @Test
    public void maxKursFallTestGoogle() {
        double result = maxKursAnstiegFall.maxKursfall("Google", 2012);
        assertThat(result).isEqualTo(2.0);
    }

    @Test
    public void maxKursFallTestVodafone() {
        double result = maxKursAnstiegFall.maxKursfall("Vodafone", 2013);
        assertThat(result).isEqualTo(110.0);
    }
}