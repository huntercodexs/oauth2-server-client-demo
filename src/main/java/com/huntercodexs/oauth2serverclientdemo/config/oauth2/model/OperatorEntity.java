package com.huntercodexs.oauth2serverclientdemo.config.oauth2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Calendar;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "operator_server_client")
public class OperatorEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String role;

    @Column
    private String email;

    @Column
    private boolean deleted;

    @Column
    private int status;

}
