package com.pharma.is.client.gin;

//import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.inject.Provider;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.gwtplatform.mvp.client.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyFailureHandler;
import com.pharma.is.client.mvp.TopPresenter;
import com.pharma.is.client.ui.MainPagePresenter;


/**
 * TODO: Add comments for MyGinjector
 *
 */
@GinModules({ DispatchAsyncModule.class, MyModule.class })
public interface MyGinjector extends Ginjector {

    EventBus getEventBus();

    Provider<MainPagePresenter> getMainPagePresenter();

    PlaceManager getPlaceManager();

    ProxyFailureHandler getProxyFailureHandler();

    AsyncProvider<TopPresenter> getTopPresenter();
}
