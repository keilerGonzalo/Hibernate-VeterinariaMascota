
package managedBean;

import DAO.MascotaDao;
import Entidades.Mascota;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
  * @author USUARIO
 */
@ManagedBean
@ViewScoped
public class mascotaBean {

    private Mascota mascota;

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public mascotaBean() {
        this.mascota = new Mascota();
    }

    public String guardarMascota() {

            MascotaDao dao = new MascotaDao();
            boolean respuesta= dao.guardarMascota(mascota);
            if(respuesta){
                
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registro Exitoso"));
            }else{
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error"));
            }
            return "/index.xhtml";
            
    }

    public boolean actualizarMascota() {

        boolean respuesta = true;
        try {
            MascotaDao mascotaDao = new MascotaDao();

        } catch (Exception e) {
            respuesta = false;
        }
        return respuesta;
    }

    public ArrayList<Mascota> listarMascotas() {
        ArrayList<Mascota> milista = new ArrayList<>();
        MascotaDao dao = new MascotaDao();
        milista= dao.listarMascotas();
        
        return milista;
    }
    
    public String limpiar(){
        return "/index.xhtml";
    }
    public String eliminarMascota(){
         MascotaDao dao = new MascotaDao();
            boolean respuesta= dao.eliminarMascota(mascota);
            if(respuesta){
                
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Correcto","Registro Borrado con exito"));
            }else{
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error","No se pudo eliminar"));
            }
            return "/index.xhtml";
        
    }
}
