/**
 *
 *
 * @author Jose Rose
 * Dec 14, 2010
 */
package com.pharma.is.client.mvp.view;

import com.extjs.gxt.ui.client.Style.HorizontalAlignment;
import com.extjs.gxt.ui.client.Style.LayoutRegion;
import com.extjs.gxt.ui.client.util.Margins;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.Viewport;
import com.extjs.gxt.ui.client.widget.form.FormPanel;
import com.extjs.gxt.ui.client.widget.form.FormPanel.LabelAlign;
import com.extjs.gxt.ui.client.widget.form.TextField;
import com.extjs.gxt.ui.client.widget.layout.BorderLayoutData;
import com.extjs.gxt.ui.client.widget.layout.ColumnData;
import com.extjs.gxt.ui.client.widget.layout.ColumnLayout;
import com.extjs.gxt.ui.client.widget.layout.FitLayout;
import com.extjs.gxt.ui.client.widget.layout.FormData;
import com.extjs.gxt.ui.client.widget.layout.FormLayout;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.pharma.is.client.mvp.activity.AppStartPageActivity;


/**
 * TODO: Add comments for AppStartPageView
 * 
 */
public class AppStartPageView extends Composite implements AppStartPageActivity.AppStartViewInterface {
    
    private static AppStartPageViewUiBinder uiBinder = GWT
    .create(AppStartPageViewUiBinder.class);
    
    @UiField
    SimplePanel simplePanel;

    public AppStartPageView() {

        initWidget(uiBinder.createAndBindUi(this));
        
        ContentPanel mainContainer = new ContentPanel();
        mainContainer.setHeading("Hebert, Marc-Andre");
        mainContainer.setLayout(new FitLayout());
        mainContainer.setBorders(false);
        
        LayoutContainer mainLayout = new LayoutContainer();
        LayoutContainer leftColumn = new LayoutContainer();
        LayoutContainer centerColumn = new LayoutContainer();
        LayoutContainer rightColumn = new LayoutContainer();
        
        
        leftColumn.setStyleAttribute("paddingRight", "10px");  
        FormLayout layoutColumn = new FormLayout();  
        layoutColumn.setLabelAlign(LabelAlign.LEFT);  
        leftColumn.setLayout(layoutColumn);
        
        centerColumn.setStyleAttribute("paddingRight", "10px");  
        layoutColumn = new FormLayout();  
        layoutColumn.setLabelAlign(LabelAlign.LEFT);  
        centerColumn.setLayout(layoutColumn);
        
        rightColumn.setStyleAttribute("paddingRight", "10px");  
        layoutColumn = new FormLayout();  
        layoutColumn.setLabelAlign(LabelAlign.LEFT);  
        rightColumn.setLayout(layoutColumn);
        
        
        FormData formData = new FormData("100%");  
        formData.setMargins(new Margins(5,5,5,5));
        FormPanel panel = new FormPanel();  
 
        panel.setHeading("FormPanel");  

        panel.setButtonAlign(HorizontalAlignment.CENTER);
        panel.setLayout(new FitLayout());
        
        
        mainLayout.setLayout(new ColumnLayout());
        mainLayout.setBorders(false);

        
        
        ContentPanel picture = new ContentPanel();
        picture.setBodyStyleName("person");
        picture.setHeight(200);
        picture.setHeaderVisible(false);
        leftColumn.add(picture, formData);
        

        TextField<String> name = new TextField<String>();
        name.setFieldLabel("First Name");
        name.setValue("Marc-Andre");
        centerColumn.add(name, formData);

        TextField<String> last = new TextField<String>();
        last.setFieldLabel("Last Name");
        last.setValue("Hebert");

        centerColumn.add(last, formData);

        TextField<String> address = new TextField<String>();
        address.setFieldLabel("Address");
        rightColumn.add(address, formData);

        TextField<String> phone = new TextField<String>();
        phone.setFieldLabel("Phone");
        rightColumn.add(phone, formData);

        
        

        BorderLayoutData centerData = new BorderLayoutData(LayoutRegion.CENTER);
        centerData.setMargins(new Margins(0));
        
        
        mainLayout.add(leftColumn, new ColumnData(.2));  
        mainLayout.add(centerColumn, new ColumnData(.4));
        mainLayout.add(rightColumn, new ColumnData(.4));
        
        mainContainer.add(mainLayout);
        
        Viewport v = new Viewport();
        v.setLayout(new FitLayout());
        v.add(mainContainer);
        
        simplePanel.add(v);
    }

    interface AppStartPageViewUiBinder extends UiBinder<Widget, AppStartPageView> {
        
    }

    // /////////////////////////////////////////////////////////////////////////
    // Members
    // /////////////////////////////////////////////////////////////////////////

    // /////////////////////////////////////////////////////////////////////////
    // Constructors
    // /////////////////////////////////////////////////////////////////////////

    // /////////////////////////////////////////////////////////////////////////
    // Handlers
    // /////////////////////////////////////////////////////////////////////////

    // /////////////////////////////////////////////////////////////////////////
    // Functions
    // /////////////////////////////////////////////////////////////////////////

    // /////////////////////////////////////////////////////////////////////////
    // Get / Set
    // /////////////////////////////////////////////////////////////////////////

}
