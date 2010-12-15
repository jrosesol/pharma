package com.pharma.is.client.gin;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.inject.Singleton;
import com.pharma.is.client.controller.DefaultEventBus;
import com.pharma.is.client.controller.MyPlaceController;
import com.pharma.is.client.mvp.view.AppStartPageView;

public class MyModule extends AbstractGinModule {

    @Override
    protected void configure() {
        bind(EventBus.class).to(DefaultEventBus.class).in(Singleton.class);
        bind(PlaceController.class).to(MyPlaceController.class).in(Singleton.class);
        
        bind(AppStartPageView.class).in(Singleton.class);

//        bind(TokenFormatter.class).to(ParameterTokenFormatter.class).in(
//                Singleton.class);
//        bind(RootLayoutPanel.class).asEagerSingleton();
//        bind(ProxyFailureHandler.class).to(DefaultProxyFailureHandler.class)
//                .in(Singleton.class);

        // Presenters
//        bindPresenter(MainPagePresenter.class, MainPagePresenter.MyView.class,
//                MainPageView.class, MainPagePresenter.MyProxy.class);
//
//        bindPresenter(TopPresenter.class, TopPresenter.TopView.class,
//                TopView.class, TopPresenter.TopProxy.class);

        // bindPresenter(ResponsePresenter.class,
        // ResponsePresenter.MyView.class,
        // ResponseView.class, ResponsePresenter.MyProxy.class);
    }

}
