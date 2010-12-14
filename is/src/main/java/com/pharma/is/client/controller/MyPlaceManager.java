package com.pharma.is.client.controller;

import com.google.inject.Inject;
import com.gwtplatform.mvp.client.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManagerImpl;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.TokenFormatter;
import com.pharma.is.client.ui.MainPagePresenter;

public class MyPlaceManager extends PlaceManagerImpl {

    @Inject
    public MyPlaceManager(EventBus eventBus, TokenFormatter tokenFormatter) {
        super(eventBus, tokenFormatter);
    }

    public void revealDefaultPlace() {
        revealPlace(new PlaceRequest(MainPagePresenter.nameToken));
    }

}
