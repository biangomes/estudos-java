package udemy.aula127_equals;

public class Usuario {
    String nome;
    String email;

    @Override
    public boolean equals(Object objeto) {

        // Resolvendo a Exception levantada pelo comentário do Eqyals.java
        if (objeto instanceof Usuario) {

            Usuario outro = (Usuario) objeto;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIgual = outro.email.equals(this.email);

            return nomeIgual && emailIgual;
        }
        else {
            return false;
        }
        //return super.equals(objeto);
    }

    // O hashcode será abordado em outra aula!

    public int hashCode() {
        return 0;
    }
}
