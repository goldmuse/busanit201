package com.example.todosampleapp.Login.model.datasources.local;

import android.util.Log;

import com.example.todosampleapp.common.AppDatabaseProvider;
import com.example.todosampleapp.Login.model.LoginRepository;
import com.example.todosampleapp.Login.model.User;
import com.example.todosampleapp.Login.model.datasources.DataSource;

public class LocalDataSourceImpl implements DataSource {

    LoginRepository loginRepository;

    @Override
    public void setRepository(LoginRepository repository) {
        this.loginRepository = repository;
    }

    @Override
    public void loginProc(User user) {

        new Thread(() -> {
            try {
                UserDao userDao = AppDatabaseProvider.getINSTANCE().getUserDao();
                UserEntity entity = new UserEntity();
                entity.setId(user.getId());
                entity.setPwd(user.getPwd());
                userDao.addUser(entity);

                UserEntity selectedEntity = userDao.login(user.getId(), user.getPwd());
                Log.d("DB", selectedEntity.toString());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        this.loginRepository.loginDone();
    }
}
