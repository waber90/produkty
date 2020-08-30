package pl.sda.shop.products;

import javax.persistence.*;

@Entity
@Table(name = "Users")
class User {@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;
    private String name;
    private String mail;
    private String surname;

    Long getId() {
        return id;
    }

    void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}

