package com.vaadin.UIViews;

import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

public class LoginForm extends FormLayout {

	Window registerWindow;

	private TextField txtUsername = new TextField("username");
	private PasswordField txtPassword = new PasswordField("password");

	private Button login = new Button("Login");
	private Button register = new Button("Register");
	
	private MyUI myUI;

	private TextField registerUsername = new TextField("username");
	private TextField registerPassword = new TextField("password");
	private TextField registerEmail = new TextField("email");
	private Button  registerButton = new Button("Register");

	
	public LoginForm(MyUI myUI) {
		this.myUI = myUI;
		login.addClickListener(e -> login());
		register.addClickListener(e -> register());
		HorizontalLayout buttons = new HorizontalLayout(login, register);
		addComponents(txtUsername, txtPassword, buttons);
	}

	private void register() {
		Window window = new Window("Register Dialog");
		VerticalLayout layout = new VerticalLayout();
		layout.addComponents(registerUsername, registerPassword, registerEmail,registerButton);
		window.setWidth("30%");
		window.setHeight("50%");
		window.center();
		layout.setSizeFull();
		window.setContent(layout);
		UI.getCurrent().addWindow(window);
	}
	private Object login() {
		return null;
	}

}
