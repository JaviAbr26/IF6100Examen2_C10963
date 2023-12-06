/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import cr.go.ucr.OperacionAritmetica;
import cr.go.ucr.operaciones.Division;
import cr.go.ucr.operaciones.Multiplicacion;
import cr.go.ucr.operaciones.Resta;
import cr.go.ucr.operaciones.Sumar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Javier B
 */
public class JUnitTest {
    
    public JUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @Test   
    public void testSumar() {
        OperacionAritmetica operacion = new OperacionAritmetica(new Sumar());
        assertEquals(15, operacion.procesar(5, 10)); 
        assertNotEquals(2, operacion.procesar(4, 8));    
    }
    
    public void testSumarNegativo() {
        OperacionAritmetica operacion = new OperacionAritmetica(new Sumar());
        assertEquals(-1, operacion.procesar(-5, 10));   
    }

    public void testRestar() {
        OperacionAritmetica operacion = new OperacionAritmetica(new Resta());
        assertEquals(5, operacion.procesar(5, 10)); 
        assertNotEquals(5, operacion.procesar(5, 4));    
    }

    public void testRestarMayor() {
        OperacionAritmetica operacion = new OperacionAritmetica(new Resta());
        assertEquals(-2, operacion.procesar(20, 4));    
    }

    public void testMultiplicacion() {
        OperacionAritmetica operacion = new OperacionAritmetica(new Multiplicacion());
        assertEquals(20, operacion.procesar(5, 4)); 
        assertNotEquals(5, operacion.procesar(2, 5));    
    }

    public void testDivision() {
        OperacionAritmetica operacion = new OperacionAritmetica(new Division());
        assertEquals(1, operacion.procesar(5, 5)); 
        assertNotEquals(8, operacion.procesar(4, 1));    
    }
    
    public void testDivisionCero() {
        OperacionAritmetica operacion = new OperacionAritmetica(new Division());
        assertEquals(-3, operacion.procesar(5, 0));    
    }

}


