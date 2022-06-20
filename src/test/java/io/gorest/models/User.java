package io.gorest.models;

import lombok.Getter;
import lombok.Setter;

public class User {

    @Getter @Setter
    private Integer id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private String email;
    @Getter @Setter
    private String gender;
    @Getter @Setter
    private String status;

}
