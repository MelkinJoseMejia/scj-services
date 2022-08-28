package co.gov.scj.web.rest.service;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();

        try {
            Class<?> jacksonProvider = Class.forName("org.codehaus.jackson.jaxrs.JacksonJsonProvider");
            resources.add(jacksonProvider);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, (String) null, ex);
        }
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(co.gov.scj.web.rest.service.ConsultaTurnoFacadeREST.class);
    }
}
