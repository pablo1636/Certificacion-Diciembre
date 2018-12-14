/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import modelo.*;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author pablo
 */
public class operaciones {
    
    public List<Tiposuelo> tipoSueloVer(){
        List<Tiposuelo> listaTipoSuelo;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Criteria crit = session.createCriteria(Tiposuelo.class);
        listaTipoSuelo = crit.list();
        tx.commit();
        session.close();
        return listaTipoSuelo;
    
    }
    public List<Lote> lotesVer(int id){
        
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        List<Lote> listaLotes = session.createCriteria(Lote.class).add(Restrictions.eq("idCampo", id)).list();
        tx.commit();
        session.close();
        return listaLotes;
    
    }
    
    public boolean buscar_campo (String nombre){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Campo camp = (Campo) session.createCriteria(Campo.class)
                .add(Restrictions.eq("nombre", nombre)).uniqueResult();
        tx.commit();
        session.close();
        try {
            if(camp!=null){
                    return true;
            }else{
                    return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    public int guardar_campo(Campo campo){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        int idGenerado = ( int )session.save( campo );
        // session.save( inscripcion );
        tx.commit();
        session.close();
        return idGenerado;
        // JOptionPane.showMessageDialog(null, "Empleado insertado correctamente");
    }
    
    public int guardar_lote(Lote lote){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        int idGenerado = ( int )session.save( lote );
        // session.save( inscripcion );
        tx.commit();
        session.close();
        return idGenerado;
        // JOptionPane.showMessageDialog(null, "Empleado insertado correctamente");
    }
    public int obtener_id_suelo(String numero){
        
        int result=0;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Tiposuelo suelo = (Tiposuelo) session.createCriteria(Tiposuelo.class)
                .add(Restrictions.eq("nombreTiposuelo", numero)).uniqueResult();
        tx.commit();
        session.close();
        result= suelo.getIdTiposuelo();
    
    return result;
    }
    public String obtener_nombre_suelo(int idsuelo){
        
        String result="";
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Tiposuelo suelo = (Tiposuelo) session.createCriteria(Tiposuelo.class)
                .add(Restrictions.eq("idTiposuelo", idsuelo)).uniqueResult();
        tx.commit();
        session.close();
        result= suelo.getNombreTiposuelo();
    
    return result;
    }
    public Campo cargar_campo(int id){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        Campo campo = (Campo) session.createCriteria(Campo.class)
                .add(Restrictions.eq("idCampo", id)).uniqueResult();
        tx.commit();
        session.close();
    return campo;
    }
    
    
    
      
    
}
