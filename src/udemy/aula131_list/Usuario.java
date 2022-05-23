package udemy.aula131_list;

public class Usuario {

    String nome;

    // Criando um construtor
    Usuario(String nome) {
        this.nome = nome;
    }

    // Método que retorna as informações contidas no objeto
    public String toString() {
        return "Meu nome é " + this.nome + ".";
    }


    // Definindo o hashCode
    @Override
    public int hashCode() {
        // Algoritmo para que seja gerado números mais diferentes possível
        final int prime = 31;
        int result = 1;
        result = prime * result + (((nome == null)) ? 0 : nome.hashCode());
        return result;
    }


    // Definindo o equals
/*    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;*/

    // Sobreescrevendo o método equals, pois se trata de um caso mais simples
    @Override
    public boolean equals(Object obj) {
        Usuario outroUsuario = (Usuario) obj;
        return this.nome.equals(outroUsuario.nome);

    }
}
