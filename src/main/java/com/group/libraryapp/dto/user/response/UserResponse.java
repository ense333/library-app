package com.group.libraryapp.dto.user.response;

import com.group.libraryapp.domain.user.User;

public class UserResponse {

    private long id;
    private String name;
    private int age;

    public UserResponse(User user) {
        this.id = user.getId();
        this.name = user.getName();
        //this.age = user.getAge();
        this.age = (user.getAge() != null) ? user.getAge() : 0;
    }

    public UserResponse(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
