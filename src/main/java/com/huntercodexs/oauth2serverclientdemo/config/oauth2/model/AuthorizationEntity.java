package com.huntercodexs.oauth2serverclientdemo.config.oauth2.model;

import javax.persistence.*;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "authorization_server_client")
public class AuthorizationEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column
    private String client;

    @Column
    private String secret;

    @Column
    private String scope;

    @Column
    private int accessTokenValiditySeconds;

    @Column
    private int refreshTokenValiditySeconds;
    
}
