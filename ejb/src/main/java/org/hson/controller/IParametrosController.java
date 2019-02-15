package org.hson.controller;

import org.hson.model.GlParametros;

import javax.ejb.Local;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Hyun Woo Son on 2/13/19
 **/
@Local
public interface IParametrosController extends Serializable {

    void remove();

    List<GlParametros> getGlParametros();
    void setGlParametros(List<GlParametros> glParametros);

    void obtainAll();

}
