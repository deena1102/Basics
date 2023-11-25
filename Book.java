/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.Objects;

/**
 *
 * @author ppu
 */
public class Book implements Display {

    private String title;
    private Author author;
    private int NO;
    private String genre;
    private int version;
    private Date date ;
    private boolean onLone; 

    public Book(String title, Author author, int NO, String genre, int version, Date date, boolean onLone) {
        this.title = title;
        this.author = author;
        this.NO = NO;
        this.genre = genre;
        this.version = version;
        this.date = date;
        this.onLone = onLone;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getNO() {
        return NO;
    }

    public void setNO(int NO) {
        this.NO = NO;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.NO != other.NO) {
            return false;
        }
        if (this.version != other.version) {
            return false;
        }
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.genre, other.genre)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String getInfo() {
        return  " NO : " + this.NO + "\n Title :" + this.title + " \n Author " + this.author.getInfo()+ " \n Gener : " + this.genre + " \n Version : " + this.version + "\n Date :" + this.date.getInfo();
    }

    @Override
    public boolean inLoan() {
         return onLone; 
    }
    
    

}
