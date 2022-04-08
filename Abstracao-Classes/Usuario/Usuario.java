public class Usuario {
    private String nome;
    private String login;
    private String senha;
    public String message[] = new String[3];

    Usuario(String nome, String login, String senha) {
        if(nome.equals(nome.toUpperCase())) {
            this.nome = nome;
         }
        if(login.equals(login.toLowerCase())) {
            this.login = login;
         }
        if(senha.length() <= 16) {
            this.senha = senha;
    }
    }

    public String setNome(String nome) {
        this.nome = nome;
    }

    public String setLogin(String login) {
        this.login = login;
    }

    public String setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}

    