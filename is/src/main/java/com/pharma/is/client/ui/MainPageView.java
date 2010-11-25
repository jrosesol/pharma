package com.pharma.is.client.ui;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.inject.Inject;

import com.gwtplatform.mvp.client.ViewImpl;

public class MainPageView extends ViewImpl implements MainPagePresenter.MyView {

	private static String html = "<h1>Web Application Starter Project</h1>\n"
			+ "<table align=\"center\">\n"
			+ "  <tr>\n"
			+ "    <td colspan=\"2\" style=\"font-weight:bold;\">Please enter your name:</td>\n"
			+ "  </tr>\n"
			+ "  <tr>\n"
			+ "    <td id=\"nameFieldContainer\"></td>\n"
			+ "    <td id=\"sendButtonContainer\"></td>\n"
			+ "  </tr>\n"
			+ "  <tr>\n"
			+ "    <td colspan=\"2\" style=\"color:red;\" id=\"errorLabelContainer\"></td>\n"
			+ "  </tr>\n" + "</table>\n";

	HTMLPanel panel = new HTMLPanel(html);

	private final Label errorLabel;
	private final TextBox nameField;
	private final Button sendButton;

	@Inject
	public MainPageView() {
		sendButton = new Button("Send");
		nameField = new TextBox();
		nameField.setText("GWT User");
		errorLabel = new Label();

		// We can add style names to widgets
		sendButton.addStyleName("sendButton");

		// Add the nameField and sendButton to the RootPanel
		// Use RootPanel.get() to get the entire body element
		panel.add(nameField, "nameFieldContainer");
		panel.add(sendButton, "sendButtonContainer");
		panel.add(errorLabel, "errorLabelContainer");
	}

	public Widget asWidget() {
		return panel;
	}

	public String getName() {
		return nameField.getText();
	}

	public Button getSendButton() {
		return sendButton;
	}

	public void resetAndFocus() {
		// Focus the cursor on the name field when the app loads
		nameField.setFocus(true);
		nameField.selectAll();
	}

	public void setError(String errorText) {
		errorLabel.setText(errorText);
	}
}