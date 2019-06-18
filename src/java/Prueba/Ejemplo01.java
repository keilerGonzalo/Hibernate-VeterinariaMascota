/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import DAO.MascotaDao;
import Entidades.Mascota;

/**
 *
 * @author USUARIO
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        // TODO code application logic here
        MascotaDao mascotadao = new MascotaDao();
        Mascota mimascota = new Mascota(5, "Rambo", "Juana", "Dogo");

        mascotadao.guardarMascota(mimascota);
    }
}
