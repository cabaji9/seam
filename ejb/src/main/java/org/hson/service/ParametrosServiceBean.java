package org.hson.service;

import org.hson.model.GlParametros;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by Hyun Woo Son on 2/5/19
 **/
@Stateless
@Name("parametrosService")
@Scope(ScopeType.CONVERSATION)
public class ParametrosServiceBean implements ParametrosService  {

    @PersistenceContext(unitName = "mupi_example")
    EntityManager em;



    public List<GlParametros> obtenerGlParametros(){
        return em.createQuery("select g from GlParametros g").getResultList();
    }




}
