/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author b6
 */
public class YearUtilitiesTest {
    
    public YearUtilitiesTest() {
    }
    
   

    /**
     * Test of isLeap method, of class YearUtilities.
     */
    @Test
    public void testIsLeap() {
        YearUtilities instance = new YearUtilities();
       assertTrue(instance.isLeap(4));          //es bisiesto
       assertFalse(instance.isLeap(100));       //No es bisiesto
       assertTrue(instance.isLeap(400));        //es bisiesto
       assertFalse(instance.isLeap(2011));      //no es bisiesto
       assertTrue(instance.isLeap(2012));       //es bisiesto
    }
    
}
