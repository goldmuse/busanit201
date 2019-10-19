package com.example.todosampleapp.Login.model;

import com.example.todosampleapp.Login.LoginContract;

// Data Layer
public interface LoginRepository {
    void setPresenter(LoginContract.Presenter presenter);
    void loginProc(User user);
    void loginDone();
}
