/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import DAO.MascotaDao;
import Entidades.Mascota;
import Utilitarios.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author USUARIO
 * Actualizar en la base de datos la información de una mascota.

 */
public class Ejemplo03 {

    public static void main(String[] args) {
        // TODO code application logic here
        MascotaDao mascotadao= new MascotaDao();
        
        Mascota mascota= new Mascota();
        mascota.setIdMascota(5);
        mascota.setNombreMascota("Prueba");
        mascota.setNombreCliente("Prueva");
        mascota.setRaza("Prueva");
        
        //mascotadao.actualizarMascota(mascota);

        
    }
    
    
}
