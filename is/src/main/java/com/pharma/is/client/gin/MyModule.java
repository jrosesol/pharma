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
import com.pharma.is.client.mvp.presenter.TopPresenter;
import com.pharma.is.client.mvp.view.AppStartPageView;
import com.pharma.is.client.mvp.view.ToolbarView;
import com.pharma.is.client.mvp.view.TopView;
import com.pharma.is.client.ui.CommandDigester;
import com.pharma.is.client.ui.CommandHandlerPresenter;
import com.pharma.is.client.ui.CommandHandlerView;
import com.pharma.is.client.ui.CommandHistory;
import com.pharma.is.client.ui.CommandLineBoxPresenter;
import com.pharma.is.client.ui.CommandLineBoxView;
import com.pharma.is.client.ui.PatientRequiredInfoPresenterWidget;
import com.pharma.is.client.ui.PatientRequiredInfoView;
import com.pharma.is.client.ui.PatientSinglePrescriptionPresenterWidget;
import com.pharma.is.client.ui.PatientSinglePrescriptionView;

public class MyModule extends AbstractPresenterModule {

    @Override
    protected void configure() {
        bind(EventBus.class).to(DefaultEventBus.class).in(Singleton.class);
        bind(CommandDigester.class).in(Singleton.class);
        bind(CommandHistory.class).to(CommandDigester.class);
        bind(PlaceManager.class).to(MyPlaceManager.class).in(Singleton.class);
        bind(TokenFormatter.class).to(ParameterTokenFormatter.class).in(
                Singleton.class);
        bind(RootPresenter.class).asEagerSingleton();
        bind(ProxyFailureHandler.class).to(DefaultProxyFailureHandler.class)
                .in(Singleton.class);

        // Presenters
        bindPresenter(AppStartPagePresenter.class,
                AppStartPagePresenter.AppStartPageViewInterface.class,
                AppStartPageView.class,
                AppStartPagePresenter.AppStartPageProxy.class);

        bindPresenter(TopPresenter.class, TopPresenter.TopViewInterface.class,
                TopView.class, TopPresenter.TopProxy.class);

        bindPresenter(ToolbarPresenter.class,
                ToolbarPresenter.ToolbarViewInterface.class, ToolbarView.class,
                ToolbarPresenter.ToolbarProxy.class);
        
        bindPresenter(CommandLineBoxPresenter.class,
                CommandLineBoxPresenter.CommandLineBoxViewInterface.class, CommandLineBoxView.class,
                CommandLineBoxPresenter.CommandLineBoxProxy.class);
        
        bindSingletonPresenterWidget(CommandHandlerPresenter.class,
                CommandHandlerPresenter.CommandHandlerViewInterface.class, CommandHandlerView.class);

        bindSingletonPresenterWidget(PatientRequiredInfoPresenterWidget.class,
                PatientRequiredInfoPresenterWidget.PatientRequiredInfoViewInterface.class, PatientRequiredInfoView.class);
        
        bindSingletonPresenterWidget(
                PatientSinglePrescriptionPresenterWidget.class,
                PatientSinglePrescriptionPresenterWidget.PatientSinglePrescriptionViewInterface.class,
                PatientSinglePrescriptionView.class);
        
        // bindPresenter(ResponsePresenter.class,
        // ResponsePresenter.MyView.class,
        // ResponseView.class, ResponsePresenter.MyProxy.class);
    }

}
