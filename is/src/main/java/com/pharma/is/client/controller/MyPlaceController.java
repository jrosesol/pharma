package com.pharma.is.client.controller;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;

public class MyPlaceController extends PlaceController {

    @Inject
    public MyPlaceController(EventBus eventBus) {
        super(eventBus);
    }

/*    public void revealDefaultPlace() {
        revealPlace(new PlaceRequest(MainPagePresenter.nameToken));
    }
    */

}
