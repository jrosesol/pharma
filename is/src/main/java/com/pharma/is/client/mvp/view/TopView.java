/**
 *
 *
 * @author Jose Rose
 * Nov 25, 2010
 */
package com.pharma.is.client.mvp.view;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.Style.LayoutRegion;
import com.extjs.gxt.ui.client.util.Margins;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.VerticalPanel;
import com.extjs.gxt.ui.client.widget.Viewport;
import com.extjs.gxt.ui.client.widget.button.Button;
import com.extjs.gxt.ui.client.widget.form.FieldSet;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.FormPanel.LabelAlign;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.layout.BorderLayoutData;
import com.extjs.gxt.ui.client.widget.layout.ColumnData;
import com.extjs.gxt.ui.client.widget.layout.ColumnLayout;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.extjs.gxt.ui.client.widget.layout.FlowLayout;
import com.extjs.gxt.ui.client.widget.layout.FormData;
import com.extjs.gxt.ui.client.widget.layout.FormLayout;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;
import com.pharma.is.client.mvp.presenter.TopPresenter;

/**
 * 
 *
 */
public class TopView extends ViewImpl implements TopPresenter.TopViewInterface {

    ///////////////////////////////////////////////////////////////////////////
    // Members
    ///////////////////////////////////////////////////////////////////////////
    public final VerticalPanel mainPanel;
    public final Button addTextButton;
    public final Label placeholderDescriptor;
    private final FormData formData;

    ///////////////////////////////////////////////////////////////////////////
    // Constructors
    ///////////////////////////////////////////////////////////////////////////
    public TopView() {
        mainPanel = new VerticalPanel();
        addTextButton = new Button("Add Text");
        placeholderDescriptor = new Label();
        
        formData = new FormData("-20");
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

    @Override
    public void setContentA() {
        mainPanel.removeAll();

        FormPanel form2 = new FormPanel();
        form2.setFrame(true);
        form2.setHeading("Simple Form with FieldSets");
        form2.setWidth(350);
        form2.setLayout(new FlowLayout());

        FieldSet fieldSet = new FieldSet();  
        fieldSet.setHeading("User Information");  
        fieldSet.setCheckboxToggle(true);  
      
        FormLayout layout = new FormLayout();  
        layout.setLabelWidth(75);  
        fieldSet.setLayout(layout);  
      
        TextField<String> firstName = new TextField<String>();  
        firstName.setFieldLabel("First Name");  
        firstName.setAllowBlank(false);  
        fieldSet.add(firstName, formData);  
      
        TextField<String> lastName = new TextField<String>();  
        lastName.setFieldLabel("Last Name");  
        fieldSet.add(lastName, formData);  
      
        TextField<String> company = new TextField<String>();  
        company.setFieldLabel("Company");  
        fieldSet.add(company, formData);  
      
        TextField<String> email = new TextField<String>();  
        email.setFieldLabel("Email");  
        fieldSet.add(email, formData);

        form2.add(fieldSet);
        form2.setButtonAlign(HorizontalAlignment.CENTER);
        form2.addButton(new Button("Save"));
        form2.addButton(new Button("Cancel"));

        mainPanel.add(form2);
        mainPanel.layout();
    }

    @Override
    public void setContentB() {
        mainPanel.removeAll();
        
        FormPanel form2 = new FormPanel();
        form2.setFrame(true);
        form2.setHeading("Simple Form with FieldSets");
        form2.setWidth(350);
        form2.setLayout(new FlowLayout());

        FieldSet fieldSet = new FieldSet();
        fieldSet = new FieldSet();
        fieldSet.setHeading("Phone Numbers");
        fieldSet.setCollapsible(true);

        FormLayout layout = new FormLayout();
        layout.setLabelWidth(75);
        fieldSet.setLayout(layout);

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
        form2.setButtonAlign(HorizontalAlignment.CENTER);
        form2.addButton(new Button("Save"));
        form2.addButton(new Button("Cancel"));

        mainPanel.add(form2);
        mainPanel.layout();
    }

    ///////////////////////////////////////////////////////////////////////////
    // Functions
    ///////////////////////////////////////////////////////////////////////////
    

    ///////////////////////////////////////////////////////////////////////////
    // Get / Set
    ///////////////////////////////////////////////////////////////////////////

}
