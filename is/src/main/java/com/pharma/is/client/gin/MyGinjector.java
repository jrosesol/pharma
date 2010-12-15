package com.pharma.is.client.gin;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.PlaceController;
import com.pharma.is.client.mvp.view.AppStartPageView;

/**
 * TODO: Add comments for MyGinjector
 *
 */
@GinModules({ MyModule.class })
public interface MyGinjector extends Ginjector {

    EventBus getEventBus();

    PlaceController getPlaceController();

    AppStartPageView getAppStartPageView();
}
