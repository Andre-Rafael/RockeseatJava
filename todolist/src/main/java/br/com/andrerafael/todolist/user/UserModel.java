package br.com.andrerafael.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
// import lombok.Getter;
// import lombok.Setter;

// gera getter e setter automaticamente

@Data
@Entity(name = "tb_users")
public class UserModel {

    // caso queira usar em um atributo especifico, no caso o username
    // @Getter or @Setter
    // private String username;

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;

    @Column(name = "usuario", unique = true)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
