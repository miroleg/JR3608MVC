package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

import java.util.ArrayList;
import java.util.List;

public class FakeModel implements Model{
    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return this.modelData;
    }

    public void loadUsers(){
        List<User> users =  new ArrayList<User>();
        users.add(new User( "A" ,1,1));
        users.add(new User( "B" ,2,2));
        modelData.setUsers(users);

    }

    public void loadDeletedUsers() {
        throw new UnsupportedOperationException("Операция не поддерживается");
       // List<User> users = userService.getAllDeletedUsers();
    }

    @Override
    public void loadUserById(long userId) {
        throw new UnsupportedOperationException("Операция не поддерживается");
    }

    @Override
    public void deleteUserById(long id) {
        throw new UnsupportedOperationException("Операция не поддерживается");
    }

    @Override
    public void changeUserData(String name, long id, int level) {
        throw new UnsupportedOperationException("Операция не поддерживается");
    }


}
