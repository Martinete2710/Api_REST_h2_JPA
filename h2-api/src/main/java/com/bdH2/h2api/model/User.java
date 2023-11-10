package com.bdH2.h2api.model;


import jakarta.persistence.*;

@Entity //para decirle que es una entidad la que estamos creando en base a los parametros que pongamos
//se va a crear nuestra base de datos.

@Table(name="users")//aqui estamos diciendole que la tabla se va a llamar users cuando la cree
public class User {
    @Id//le decimos que el valor de abajo es el id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//definimos la estrategia
    private long id;
private String firstName;//como no es mysql no necesitamos decirle que columna es
private String lastName;//como no es mysql no necesitamos decirle que columna es
private String email;//como no es mysql no necesitamos decirle que columna es


//geter y seters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
//no ocupa constructor ni constructor vacio.