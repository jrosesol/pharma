package com.pharma.is.client.ui;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.HasHandlers;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.inject.Inject;

import com.gwtplatform.mvp.client.ViewImpl;

public class MainPageView extends ViewImpl implements MainPagePresenter.MyView {
    private final Button showTop1;
    private final Button showTop2;
    private final Button showBottom1;
    private final Button showBottom2;
    private final Label message;

    @Inject
    public MainPageView() {
        showTop1 = new Button("Show top view 1");
        showTop2 = new Button("Show top view 2");
        showBottom1 = new Button("Show bottom view 1");
        showBottom2 = new Button("Show bottom view 2");
        message = new Label();

        RootPanel.get("showViewTop1").add(showTop1);
        RootPanel.get("showViewTop2").add(showTop2);
        RootPanel.get("showViewBottom1").add(showBottom1);
        RootPanel.get("showViewBottom2").add(showBottom2);
    }

    public Widget asWidget() {
        return RootPanel.get();
    }

    public Button getSendButton() {
        return showTop1;
    }

    public void resetAndFocus() {
    }

    public void setError(String errorText) {
        message.setText(errorText);
    }

    @Override
    public String getName() {
        return message.getText();
    }

    @Override
    public HasClickHandlers getTopView1Handler() {
        return showTop1;
    }

    @Override
    public HasClickHandlers getTopView2Handler() {
        return showTop2;
    }

    @Override
    public HasClickHandlers getBottomView1Handler() {
        return showBottom1;
    }

    @Override
    public HasClickHandlers getBottomView2Handler() {
        return showBottom2;
    }
}