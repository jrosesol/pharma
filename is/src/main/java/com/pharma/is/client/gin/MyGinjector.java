package com.pharma.is.client.gin;

import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.inject.Provider;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.gwtplatform.mvp.client.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyFailureHandler;
import com.pharma.is.client.mvp.presenter.AppStartPagePresenter;
import com.pharma.is.client.mvp.presenter.ToolbarPresenter;
import com.pharma.is.client.mvp.presenter.TopPresenter;
import com.pharma.is.client.ui.CommandDigester;
import com.pharma.is.client.ui.CommandLineBoxPresenter;


/**
 * TODO: Add comments for MyGinjector
 *
 */
@GinModules({ DispatchAsyncModule.class, MyModule.class })
public interface MyGinjector extends Ginjector {

    EventBus getEventBus();
    
    CommandDigester getCommandDigester();

    Provider<AppStartPagePresenter> getAppStartPagePresenter();
    
    Provider<CommandLineBoxPresenter> getCommandLineBoxPresenter();

    PlaceManager getPlaceManager();

    ProxyFailureHandler getProxyFailureHandler();

    AsyncProvider<TopPresenter> getTopPresenter();
    
    AsyncProvider<ToolbarPresenter> getToolbarPresenter();
    
}
