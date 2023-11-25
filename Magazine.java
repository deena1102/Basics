/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author ppu
 */
public class Magazine extends Book {
     private int issueNo ;
    private Date releaseDate ;

    public Magazine(int issueNo, Date releaseDate, String title, Author author, int NO, String genre, int version, Date date, boolean onLone) {
        super(title, author, NO, genre, version, date, onLone);
        this.issueNo = issueNo;
        this.releaseDate = releaseDate;
    }

    public int getIssueNo() {
        return issueNo;
    }

    public void setIssueNo(int issueNo) {
        this.issueNo = issueNo;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
    
    public String getInfo()
    {
        return "Magazine" + super.getInfo() + " issueNo  : " +this.issueNo + "releaseDate : " + this.releaseDate.getInfo();
    }
   
    
    
    
    
    
}
