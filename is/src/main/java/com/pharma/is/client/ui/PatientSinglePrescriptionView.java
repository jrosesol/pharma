/**
 *
 *
 * @author Jose Rose
 * Dec 28, 2010
 */
package com.pharma.is.client.ui;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.FieldSet;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.layout.FlowLayout;
import com.extjs.gxt.ui.client.widget.layout.FormData;
import com.extjs.gxt.ui.client.widget.layout.FormLayout;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.google.inject.Inject;
import com.pharma.is.client.mvp.presenter.*;

/**
 * PatientSinglePrescription Presenter's view
 * TODO: PatientSinglePrescription description
 */
public class PatientSinglePrescriptionView extends ViewImpl implements
        PatientSinglePrescriptionPresenterWidget.PatientSinglePrescriptionViewInterface {

    ///////////////////////////////////////////////////////////////////////////
    // Members
    ///////////////////////////////////////////////////////////////////////////
    private final VerticalPanel mainPanel;

    ///////////////////////////////////////////////////////////////////////////
    // Constructors
    ///////////////////////////////////////////////////////////////////////////
    @Inject
    public PatientSinglePrescriptionView(final VerticalPanel mainPanel) {
        this.mainPanel = mainPanel;
        
        final FormPanel form2 = new FormPanel();
        form2.setLayout(new FlowLayout());
        form2.setWidth(400);
        form2.setBorders(false);
        form2.setBodyBorder(false);
        
        FieldSet fieldSet = new FieldSet();
        fieldSet = new FieldSet();
        fieldSet.setHeading("Phone Numbers");
        fieldSet.setCollapsible(true);

        FormLayout layout = new FormLayout();
        layout.setLabelWidth(75);
        fieldSet.setLayout(layout);

        final FormData formData = new FormData();
        TextField<String> field = new TextField<String>();
        field.setFieldLabel("Home");
        fieldSet.add(field, formData);

        field = new TextField<String>();
        field.setFieldLabel("Business");
        fieldSet.add(field, formData);

        field = new TextField<String>();
        field.setFieldLabel("Mobile");
        fieldSet.add(field, formData);

        field = new TextField<String>();
        field.setFieldLabel("Fax");
        fieldSet.add(field, formData);

        form2.add(fieldSet);

        mainPanel.add(form2);
        mainPanel.layout();
    }

    ///////////////////////////////////////////////////////////////////////////
    // Overrides
    ///////////////////////////////////////////////////////////////////////////
    @Override
    public Widget asWidget() {
        return mainPanel;
    }
    

    ///////////////////////////////////////////////////////////////////////////
    // Functions
    ///////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////
    // Get / Set
    ///////////////////////////////////////////////////////////////////////////

}

