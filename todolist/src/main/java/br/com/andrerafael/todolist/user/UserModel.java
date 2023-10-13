package br.com.andrerafael.todolist.user;

import lombok.Data;

// gera getter e setter automaticamente

@Data
public class UserModel {

    // caso queira usar em um atributo especifico, no caso o username
    // @Getter
    private String username;
    private String name;
    private String password;

    
}
