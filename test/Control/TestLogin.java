/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Entidad.Usuario;
import java.util.ArrayList;
import static frontera.FramePrincipal.sistema;

/**
 *
 * @author ADMIN
 */
public class TestLogin {
    
    private static ValidarLogin validarLogin= new ValidarLogin();
    
    private String LONG_NOMBRE_INCORRECTA="Longitud nombre incorrecto";
    private String LONG_PASSWORD_INCORRECTA="Longitud password incorrecta";
    private String DATOS_INCORRECTOS="Datos incorrectos";
    private String USUARIO_AUTORIZADO="Bienvenido";
    
    
    public TestLogin() {
    }
    
    @BeforeClass
    public static void setUpClass () throws Exception{
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
    public void testLongitudNombre(){
        Usuario u=new Usuario();
        u.setNombre("R");
        u.setPassword("123456");
        assertEquals(validarLogin.verificarLogin(u), LONG_NOMBRE_INCORRECTA);
        
        u.setNombre("Roberto");
        u.setPassword("123456");
        assertEquals(validarLogin.verificarLogin(u), LONG_NOMBRE_INCORRECTA);
    }
    
     @Test
    public void testLongitudContrasennia(){
        Usuario u=new Usuario();
        u.setNombre("Pepe");
        u.setPassword("12");
        assertEquals(validarLogin.verificarLogin(u), LONG_PASSWORD_INCORRECTA);
        
        u.setNombre("Pepe");
        u.setPassword("123456");
        assertEquals(validarLogin.verificarLogin(u), LONG_PASSWORD_INCORRECTA);
    }
    
    
    @Test
    public void testContrasennia() {
        Usuario u= new Usuario();
        u.setNombre("maria");
        u.setPassword("1234");
        assertEquals(validarLogin.verificarLogin(u), DATOS_INCORRECTOS);
    }
    
    @Test
    public void testDatos(){
        Usuario u=new Usuario();
        u.setNombre("Henry");
        u.setPassword("A234");
        assertEquals(validarLogin.verificarLogin(u), DATOS_INCORRECTOS);
    }
    
    
    @Test
    public void testTodoCorrecto(){
        Usuario u= new Usuario();
        u.setNombre("Juan");
        u.setPassword("1234");
        assertEquals(validarLogin.verificarLogin(u), USUARIO_AUTORIZADO);
        
        u.setNombre("pedro");
        u.setPassword("123");
        assertEquals(validarLogin.verificarLogin(u), USUARIO_AUTORIZADO);
        
        u.setNombre("maria");
        u.setPassword("12345");
        assertEquals(validarLogin.verificarLogin(u),USUARIO_AUTORIZADO);
    }
}
