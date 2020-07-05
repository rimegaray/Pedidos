/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Producto;
import model.Promocion;
import org.hibernate.Query;
import org.hibernate.Session;
import utilitarios.HibernateUtil;


/**
 *
 * @author Juan Carlos
 */
public class PromocionDao {
    
    public boolean buscarCodigo(String codigo){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM Promocion WHERE codigo='"+codigo+"'";
        Query query = session.createQuery(hql);       
        Promocion promocion = (Promocion)query.uniqueResult();
        return promocion != null;     
    }
    
    public Integer obtenerPrecio(String nombre){
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "FROM Producto WHERE nombre='"+nombre+"'";
        Query query = session.createQuery(hql);
        Producto producto = (Producto)query.uniqueResult();
        
        return producto.getPrecio();
        //String a un Integer  --> parse
        //return Integer.parseInt(producto.getPrecio());
    }
            
}
