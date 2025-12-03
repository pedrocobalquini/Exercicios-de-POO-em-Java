package entities;

import java.util.Date;

public class Client {
    private String nome;
    private String email;
    private String data;

    public Client() {
    }

    public Client(String nome, String email, String data) {
        this.nome = nome;
        this.email = email;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String toString() { //da pra colocar toString em mais classes
        return "Nome Cliente: " + nome + " | Email: " + email + " | Data: " + data;
    }
}
