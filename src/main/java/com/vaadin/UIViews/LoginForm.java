package com.vaadin.UIViews;

import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.PropertyId;
import com.vaadin.model.User;
import com.vaadin.service.UserServiceImpl;
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
	
	private UserServiceImpl serviceImpl = new UserServiceImpl();
	

	private MyUI myUI;

	private User user;

	@PropertyId("username")
	TextField username = new TextField("Username");
	@PropertyId("password")
	PasswordField password = new PasswordField("Password");
	@PropertyId("email")
	TextField email = new TextField("Email");
	
	private Button registerButton = new Button("Register");

	public LoginForm(MyUI myUI) {
		this.myUI = myUI;
		register.addClickListener(e -> register());
		HorizontalLayout buttons = new HorizontalLayout(login, register);
		addComponents(txtUsername, txtPassword, buttons);
	}

	private void register() {
		Window window = new Window("Register Dialog");
		VerticalLayout layout = new VerticalLayout();

		registerButton.addClickListener(e -> registerToUser());
		
		layout.addComponents(username, password, email, registerButton);
		window.setWidth("30%");
		window.setHeight("50%");
		window.center();
		layout.setSizeFull();
		window.setContent(layout);
		UI.getCurrent().addWindow(window);
	}

	public void setUser(User user) {
		this.user = user;
		BeanFieldGroup.bindFieldsUnbuffered(user, this);
	}

	private void registerToUser() {
		serviceImpl.registerUser(user);
	}

}
