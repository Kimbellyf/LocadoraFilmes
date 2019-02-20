package Filme.model;

public class Filme {
    private int id;
    private int idCategoria;
    private String nome;
    private boolean filmeNacional;

    public int getId() {
            return id;
    }
    public void setId(int id) {
            this.id = id;
    }
    public int getIdCategoria() {
            return idCategoria;
    }
    public void setIdCategoria(int idCategoria) {
            this.idCategoria = idCategoria;
    }
    public String getNome() {
            return nome;
    }
    public void setNome(String nome) {
            this.nome = nome;
    }
    public boolean isFilmeNacional() {
            return filmeNacional;
    }
    public void setFilmeNacional(boolean filmeNacional) {
            this.filmeNacional = filmeNacional;
    }
	
}
