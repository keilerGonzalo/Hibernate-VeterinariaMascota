/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import DAO.MascotaDao;
import Utilitarios.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author USUARIO
 */
public class Ejemplo06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer contar;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
       MascotaDao mascotadao = new MascotaDao();
       contar= mascotadao.listCount(sesion);

        System.out.println(contar);
    }
    
}
