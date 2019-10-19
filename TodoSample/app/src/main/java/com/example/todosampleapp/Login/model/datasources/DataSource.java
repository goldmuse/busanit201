package com.example.todosampleapp.Login.model.datasources;

import com.example.todosampleapp.Login.model.LoginRepository;
import com.example.todosampleapp.Login.model.User;

public interface DataSource {
    public void setRepository(LoginRepository repository);
    public void loginProc(User user);
}
