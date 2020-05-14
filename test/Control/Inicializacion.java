/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.UsuarioDao;
import Entidad.Usuario;
import static frontera.FramePrincipal.sistema;
import java.util.ArrayList;
import org.junit.Test;

/**
 *
 * @author ADMIN
 */

public class Inicializacion {
    @Test
    public void initData(){
        UsuarioDao dao= new UsuarioDao();
        
        ArrayList<Usuario> usuarios= new ArrayList<>();
        Usuario a= new Usuario();
        Usuario b= new Usuario();
        Usuario c= new Usuario();
        Usuario d= new Usuario();
        
        a.setNombre("Juan");
        a.setPassword("1234");
        b.setNombre("pedro");
        b.setPassword("123");
        c.setNombre("maria");
        c.setPassword("12345");
        d.setNombre("Henry");
        d.setPassword("1234");
        
        usuarios.add(a);
        usuarios.add(b);
        usuarios.add(c);
        usuarios.add(d);
        
        //sistema.setUsuarios(usuarios);
        
        for(Usuario u: usuarios){
            System.out.println(u.getNombre());
            System.out.println(u.getPassword());
            System.out.println("------------");
            dao.crear(u);
        }
        
    }
}
