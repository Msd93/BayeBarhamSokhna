package sn.dev.bayebarhamsokhna.model;

import java.io.Serializable;
import java.util.List;

public class Theme implements Serializable {
    private int id;
    private String nom;
    private List<Article> articleList;

    public Theme(int id, String nom, List <Article> articleList) {
        this.id = id;
        this.nom = nom;
        this.articleList = articleList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List <Article> getArticleList() {
        return articleList;
    }

    public void setArticleList(List <Article> articleList) {
        this.articleList = articleList;
    }
}
