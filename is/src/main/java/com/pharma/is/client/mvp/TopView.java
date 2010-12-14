/**
 *
 *
 * @author Jose Rose
 * Nov 25, 2010
 */
package com.pharma.is.client.mvp;

import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

/**
 * 
 *
 */
public class TopView extends ViewImpl implements TopPresenter.TopView{

    ///////////////////////////////////////////////////////////////////////////
    // Members
    ///////////////////////////////////////////////////////////////////////////
    final public VerticalPanel mainPanel;
    final public Button addTextButton;
    final public Label placeholderDescriptor;

    ///////////////////////////////////////////////////////////////////////////
    // Constructors
    ///////////////////////////////////////////////////////////////////////////
    public TopView() {
        mainPanel = new VerticalPanel();
        addTextButton = new Button("Add Text");
        placeholderDescriptor = new Label();

        mainPanel.add(placeholderDescriptor);
        mainPanel.add(addTextButton);

        RootPanel.get("topView").add(mainPanel);
    }

    ///////////////////////////////////////////////////////////////////////////
    // Overrides
    ///////////////////////////////////////////////////////////////////////////
    @Override
    public Widget asWidget() {
        return mainPanel;
    }

    @Override
    public void setPlaceholderDescriptor(String description) {
        placeholderDescriptor.setText(description);
    }

    ///////////////////////////////////////////////////////////////////////////
    // Functions
    ///////////////////////////////////////////////////////////////////////////
    

    ///////////////////////////////////////////////////////////////////////////
    // Get / Set
    ///////////////////////////////////////////////////////////////////////////

}
