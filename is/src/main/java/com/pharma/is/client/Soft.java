package com.pharma.is.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;

import com.gwtplatform.mvp.client.DelayedBindRegistry;
import com.pharma.is.client.gin.MyGinjector;
import com.pharma.is.client.mvp.view.AppStartPageView;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Soft implements EntryPoint {

    public final MyGinjector ginjector = GWT.create(MyGinjector.class);

    //private static final AppStartPageView firstView = new AppStartPageView();
    
    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        
        //RootLayoutPanel.get().add(firstView);

        //DelayedBindRegistry.bind(ginjector);

        // ginjector.getPlaceManager().revealCurrentPlace();

    }
}
