package com.pharma.is.server.guice;

import com.google.inject.servlet.ServletModule;
import com.gwtplatform.dispatch.server.DispatchServiceImpl;
import com.gwtplatform.dispatch.shared.ActionImpl;


/**
 * For more details see: <a href="http://code.google.com/p/google-guice/wiki/Servlets">Guice Servlet</a>
 * 
 * @author JROSE-HP
 *
 */
public class DispatchServletModule extends ServletModule {

  @Override
  public void configureServlets() {
    serve("/" + ActionImpl.DEFAULT_SERVICE_NAME)
        .with(DispatchServiceImpl.class);
  }

}