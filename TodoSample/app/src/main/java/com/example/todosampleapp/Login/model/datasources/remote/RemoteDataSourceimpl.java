package com.example.todosampleapp.Login.model.datasources.remote;

import com.example.todosampleapp.Login.model.LoginRepository;
import com.example.todosampleapp.Login.model.User;
import com.example.todosampleapp.Login.model.datasources.DataSource;

public class RemoteDataSourceimpl implements DataSource {
    @Override
    public void setRepository(LoginRepository repository) {

    }

    @Override
    public void loginProc(User user) {
        return;
    }
}
