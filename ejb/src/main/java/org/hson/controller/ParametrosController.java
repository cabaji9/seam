/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hson.controller;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.hson.model.GlParametros;
import org.hson.service.ParametrosService;
import org.hson.service.ParametrosServiceBean;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Destroy;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;

import javax.ejb.EJB;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.List;

// The @Model stereotype is a convenience mechanism to make this a request-scoped bean that has an
// EL name
// Read more about the @Model stereotype in this FAQ:
// http://sfwk.org/Documentation/WhatIsThePurposeOfTheModelAnnotation
@Stateful
@Slf4j
@Getter @Setter
@Name("IParametrosController")
@Scope(ScopeType.CONVERSATION)
public class ParametrosController implements IParametrosController  {


    

    @In
    private FacesContext facesContext;

    @EJB
    private ParametrosService parametrosServiceBean;

    private List<GlParametros> glParametros;

    public void obtainAll(){
        glParametros = parametrosServiceBean.obtenerGlParametros();
        log.debug("glparametros | {}",glParametros);
    }

    @Remove
    @Destroy
    public void remove(){}



}
