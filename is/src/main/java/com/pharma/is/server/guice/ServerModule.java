package com.pharma.is.server.guice;

import com.gwtplatform.dispatch.server.guice.HandlerModule;
import com.pharma.is.server.handler.GetUUIDHandler;
import com.pharma.is.server.handler.SendTextToServerHandler;
import com.pharma.is.shared.action.GenericAction;
import com.pharma.is.shared.action.SendTextToServer;

public class ServerModule extends HandlerModule {

  @Override
  protected void configureHandlers() {
    bindHandler(SendTextToServer.class, SendTextToServerHandler.class);
    bindHandler(GenericAction.class, GetUUIDHandler.class);
  }
}