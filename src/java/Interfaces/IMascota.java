
package Interfaces;

import Entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author USUARIO
 */
public interface IMascota {

    public abstract boolean guardarMascota(Mascota mascota);
    public abstract ArrayList<Mascota> listarMascotas();
    public abstract boolean actualizarMascota(Session session,Mascota mascota);
    public abstract boolean eliminarMascota(Mascota mascota);
    public abstract ArrayList<Mascota> listPastor(Session sesion);
    public abstract ArrayList<Mascota> listSANDOR(Session sesion);
    public abstract Integer listCount(Session sesion);
    



}
