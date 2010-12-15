/**
 *
 *
 * @author Jose Rose
 * Dec 14, 2010
 */
package com.pharma.is.client.mvp.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

/**
 * TODO: Add comments for AppStartPage
 *
 */
public class AppStartPageActivity extends AbstractActivity {

    ///////////////////////////////////////////////////////////////////////////
    // Interfaces
    ///////////////////////////////////////////////////////////////////////////

    public interface AppStartViewInterface extends IsWidget {

    }

    ///////////////////////////////////////////////////////////////////////////
    // Members
    ///////////////////////////////////////////////////////////////////////////

    /**
     * Because this class has a default constructor, it can
     * be used as a binder template. In other words, it can be used in other
     * *.ui.xml files as follows:
     * <ui:UiBinder xmlns:ui="urn:ui:com.google.gwt.uibinder"
     *   xmlns:g="urn:import:**user's package**">
     *  <g:**UserClassName**>Hello!</g:**UserClassName>
     * </ui:UiBinder>
     * Note that depending on the widget that is used, it may be necessary to
     * implement HasHTML instead of HasText.
     */
    public AppStartPageActivity() {
    }

    /**
     * Invoked by the ActivityManager to start a new Activity
     */
    @Override
    public void start(AcceptsOneWidget panel, EventBus eventBus) {
        // TODO Auto-generated method stub
        
    }
    
    /**
     * Ask user before stopping this activity
     */
    @Override
    public String mayStop() {
        return "Please hold on. This activity is stopping.";
    }

    /**
     * Navigate to a new Place in the browser
     */
    public void goTo(Place place) {
        //clientFactory.getPlaceController().goTo(place);
    }
    
    ///////////////////////////////////////////////////////////////////////////
    // Constructors
    ///////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////
    // Handlers
    ///////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////
    // Functions
    ///////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////
    // Get / Set
    ///////////////////////////////////////////////////////////////////////////

}
