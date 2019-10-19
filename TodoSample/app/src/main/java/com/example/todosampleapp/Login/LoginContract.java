package com.example.todosampleapp.Login;

import com.example.todosampleapp.base.BasePresenter;
import com.example.todosampleapp.base.BaseView;
import com.example.todosampleapp.Login.model.User;

public class LoginContract {
    public interface View extends BaseView {
        void loginDone();
    }

    public interface Presenter extends BasePresenter<View> {
        void loginProc(User user);
        void loginDone();
    }
}
