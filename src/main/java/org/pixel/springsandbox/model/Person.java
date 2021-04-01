package org.pixel.springsandbox.model;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Person {
    private int id;

    @NotEmpty(message = "Nickname must not be empty")
    @Size(min = 5, max = 21, message = "Nickname must be between 5 and 21 characters")
    private String nickname;

    @NotEmpty(message = "Email must not be empty")
    @Email(message = "Email must be correct")
    private String email;

    public Person() {
    }

    public Person(int id, String nickname, String email) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
