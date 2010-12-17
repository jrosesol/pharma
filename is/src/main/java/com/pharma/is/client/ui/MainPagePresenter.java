package com.pharma.is.client.ui;


import com.google.inject.Inject;
import com.gwtplatform.dispatch.client.DispatchAsync;
import com.gwtplatform.mvp.client.EventBus;
import com.gwtplatform.mvp.client.HasUiHandlers;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.Place;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;
//import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.Proxy;

public class MainPagePresenter extends
        Presenter<MainPagePresenter.MyView, MainPagePresenter.MyProxy>
        implements MainPageUiHandlers {
    
    /**
     * {@link MainPagePresenter}'s proxy.
     */
    @ProxyStandard
    @NameToken(nameToken)
    public interface MyProxy extends Proxy<MainPagePresenter>, Place {
    }

    /**
     * {@link MainPagePresenter}'s view.
     */
    public interface MyView extends View, HasUiHandlers<MainPageUiHandlers> {
        // HasClickHandlers getTopView1Handler();
        // HasClickHandlers getTopView2Handler();
    }

    public static final String nameToken = "main";

    @SuppressWarnings("unused")
    private final PlaceManager placeManager;

    @SuppressWarnings("unused")
    private DispatchAsync dispatcher;

    @Inject
    public MainPagePresenter(EventBus eventBus, MyView view, MyProxy proxy,
            PlaceManager placeManager, DispatchAsync dispatcher) {
        super(eventBus, view, proxy);
        this.placeManager = placeManager;
        this.dispatcher = dispatcher;

        getView().setUiHandlers(this);
    }

    @Override
    protected void onBind() {
        super.onBind();

        // registerHandler(getView().getTopView1Handler().addClickHandler(
        // new ClickHandler() {
        // @Override
        // public void onClick(ClickEvent event) {
        // placeManager.revealPlace((new
        // PlaceRequest(TopPresenter.nameToken)).with("number", "1"));
        // }
        // }));
    }

    @Override
    protected void onReset() {
        super.onReset();
    }

    @Override
    protected void revealInParent() {
        RevealRootContentEvent.fire(this, this);
    }

    /**
     * Send the name from the nameField to the server and wait for a response.
     */
    @SuppressWarnings("unused")
    private void sendNameToServer() {
        // // First, we validate the input.
        // getView().setError("");
        // String textToServer = getView().getName();
        // if (!FieldVerifier.isValidName(textToServer)) {
        // getView().setError("Please enter at least four characters");
        // return;
        // }
        //
        // //
        // GenericAction genAction = new GenericAction();
        // try {
        // genAction.defaultExecution(dispatcher);
        // getView().setError("Worked!");
        // } catch (Exception e) {
        // e.printStackTrace();
        // getView().setError("Fuck!");
        // }

        // dispatcher.execute(new SendTextToServer("Test send."),
        // new AsyncCallback<SendTextToServerResult>() {
        //
        // public void onFailure(Throwable caught) {
        // getView().setError("Fuck!");
        //
        // }
        //
        // public void onSuccess(SendTextToServerResult result) {
        // getView().setError(result.getResponse());
        // }
        //
        // });

        // Then, we transmit it to the ResponsePresenter, which will do the
        // server
        // call
        // placeManager.revealPlace(new
        // PlaceRequest(ResponsePresenter.nameToken)
        // .with(ResponsePresenter.textToServerParam, textToServer));
    }

    @Override
    public void Test() {
        // TODO Auto-generated method stub
        
    }

}