/**
 *
 *
 * @author Jose Rose
 * Nov 25, 2010
 */
package com.pharma.is.client.event;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;
import com.gwtplatform.mvp.client.HasEventBus;

/**
 * TODO: Add comments for AddTextToContainerEvent
 * 
 */
public class AddTextToContainerEvent extends
        GwtEvent<AddTextToContainerEvent.AddTextToContainerHandler> {
    // /////////////////////////////////////////////////////////////////////////
    // Members
    // /////////////////////////////////////////////////////////////////////////
    private static final Type<AddTextToContainerHandler> TYPE = new Type<AddTextToContainerHandler>();

    // /////////////////////////////////////////////////////////////////////////
    // Interfaces
    // /////////////////////////////////////////////////////////////////////////
    public interface AddTextToContainerHandler extends EventHandler {
        public void onAddTextToContainer(AddTextToContainerEvent event);
    }

    // /////////////////////////////////////////////////////////////////////////
    // Constructors
    // /////////////////////////////////////////////////////////////////////////
    public AddTextToContainerEvent() {

    }

    // /////////////////////////////////////////////////////////////////////////
    // Overrides
    // /////////////////////////////////////////////////////////////////////////
    @Override
    public Type<AddTextToContainerHandler> getAssociatedType() {
        return getType();
    }

    @Override
    protected void dispatch(AddTextToContainerHandler handler) {
        handler.onAddTextToContainer(this);
    }

    // /////////////////////////////////////////////////////////////////////////
    // Functions
    // /////////////////////////////////////////////////////////////////////////
    public static Type<AddTextToContainerHandler> getType() {
        return TYPE;
    }

    public static void fire(HasEventBus source) {
        source.fireEvent(new AddTextToContainerEvent());
    }

    // /////////////////////////////////////////////////////////////////////////
    // Get / Set
    // /////////////////////////////////////////////////////////////////////////

}
