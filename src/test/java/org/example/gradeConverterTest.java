package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class gradeConverterTest {

    public gradeConverter gc;

    @Before
    public void setUp() throws Exception {
        gc = new gradeConverter();
    }

    @Test
    public void TestConvert() {
        String expect = "A" ;
        String actual = gc.convert(100) ;
        assertEquals(expect,actual);
    }

    @Test
    public void TestConvert2() {
        String expect = "A" ;
        String actual = gc.convert(90) ;
        assertEquals(expect,actual);
    }
}