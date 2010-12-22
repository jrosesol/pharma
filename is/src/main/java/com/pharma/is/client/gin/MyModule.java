package com.pharma.is.client.gin;

import com.google.inject.Singleton;
import com.gwtplatform.mvp.client.DefaultEventBus;
import com.gwtplatform.mvp.client.DefaultProxyFailureHandler;
import com.gwtplatform.mvp.client.EventBus;
import com.gwtplatform.mvp.client.RootPresenter;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.ProxyFailureHandler;
import com.gwtplatform.mvp.client.proxy.TokenFormatter;
import com.pharma.is.client.controller.MyPlaceManager;
import com.pharma.is.client.mvp.presenter.AppStartPagePresenter;
import com.pharma.is.client.mvp.presenter.ToolbarPresenter;
import com.pharma.is.client.mvp.presenter.ToolbarPresenter.ToolbarView;
import com.pharma.is.client.mvp.presenter.TopPresenter;
import com.pharma.is.client.mvp.view.AppStartPageView;
import com.pharma.is.client.mvp.view.TopView;

public class MyModule extends AbstractPresenterModule {

    @Override
    protected void configure() {
        bind(EventBus.class).to(DefaultEventBus.class).in(Singleton.class);
        bind(PlaceManager.class).to(MyPlaceManager.class).in(Singleton.class);
        bind(TokenFormatter.class).to(ParameterTokenFormatter.class).in(
                Singleton.class);
        bind(RootPresenter.class).asEagerSingleton();
        bind(ProxyFailureHandler.class).to(DefaultProxyFailureHandler.class)
                .in(Singleton.class);

        // Presenters
        bindPresenter(AppStartPagePresenter.class, AppStartPagePresenter.AppStartPageViewInterface.class,
                AppStartPageView.class, AppStartPagePresenter.AppStartPageProxy.class);

        bindPresenter(TopPresenter.class, TopPresenter.TopView.class, TopView.class, TopPresenter.TopProxy.class);
        
        bindPresenter(ToolbarPresenter.class, ToolbarPresenter.ToolbarView.class, ToolbarView.class, ToolbarPresenter.ToolbarProxy.class);

        // bindPresenter(ResponsePresenter.class,
        // ResponsePresenter.MyView.class,
        // ResponseView.class, ResponsePresenter.MyProxy.class);
    }

}
