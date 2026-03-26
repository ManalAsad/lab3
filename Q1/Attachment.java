public class Attachment {
    // attributes
    private int uniqueID;
    private String author;
    // constructor
    public Attachment(int uniqueID, String author) {
        this.uniqueID = uniqueID;
        this.author = author;
    }
    // getters for attributes
    public int getUniqueID(){
        return uniqueID;
    }
    public String getAuthor(){
        return author;
    }
    // preview of attachment
    public void preview() {
        System.out.println("Previewing attachment by " + author);
    }
    // attachment to string
    @Override
    public String toString(){
        return "";
    }
}
