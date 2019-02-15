package org.hson.service;

import org.hson.model.GlParametros;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by Hyun Woo Son on 2/13/19
 **/
@Local
public interface ParametrosService {

    List<GlParametros> obtenerGlParametros();
}
