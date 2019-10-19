package com.example.todosampleapp.Login.presenter;

import com.example.todosampleapp.Login.LoginContract;
import com.example.todosampleapp.base.BasePresenterImpl;
import com.example.todosampleapp.Login.model.LoginRepository;
import com.example.todosampleapp.Login.model.LoginRepositoryImpl;
import com.example.todosampleapp.Login.model.User;

public class LoginPresenter
        extends BasePresenterImpl<LoginContract.View>
        implements LoginContract.Presenter {

    LoginContract.View view;

    LoginRepository repository = new LoginRepositoryImpl();

    @Override
    public void setView(LoginContract.View view) {
        this.view = view;
        repository.setPresenter(this);
    }

    @Override
    public void removeView() {
        view = null;
    }


    @Override

    public void loginProc(User user) {
        repository.loginProc(user);
    }


    @Override

    public void loginDone() {
        view.loginDone();
    }
}
