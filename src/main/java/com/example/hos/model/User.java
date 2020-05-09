package com.example.hos.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class User {
    @Value("${user.fb.name}")
    private String fbUserName;
    @Value("${user.fb.password}")
    private String fbUserPassword;

    private String hobby;

    private String lesson;

    public String getFbUserName() {
        return fbUserName;
    }

    public void setFbUserName(String fbUserName) {
        this.fbUserName = fbUserName;
    }

    @Override
    public String toString() {
        return "User{" +
                "fbUserName='" + fbUserName + '\'' +
                ", fbUserPassword='" + fbUserPassword + '\'' +
                '}';
    }
}
