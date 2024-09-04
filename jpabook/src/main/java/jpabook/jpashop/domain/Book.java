package jpabook.jpashop.domain;

import jakarta.persistence.Entity;

@Entity
public class Book extends Item {

    private String name;
    private String author;
    private String etc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }
}
