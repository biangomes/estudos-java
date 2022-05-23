package udemy.exerciciopratico;

import java.util.Objects;

public class Usuario {

    private String nick;
    private String senha;
    private String email;


    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return this.nick;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // TODO: O ideal aqui era que fosse aplicado uma hash
    public String getSenha() {
        return this.senha;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nick, usuario.nick) && Objects.equals(senha, usuario.senha) && Objects.equals(email, usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nick, senha, email);
    }
}
