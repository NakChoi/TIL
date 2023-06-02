package com.group.libraryapp.dto.user.request;


import lombok.Getter;

@Getter
public class UserCreateRequest {

    private String name;
    private Integer age; // Integer -> Null를 표시할 수 있는 자료형

}

