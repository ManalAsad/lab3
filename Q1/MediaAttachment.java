public class MediaAttachment extends Attachment {
    // length of media
    private int length_Second;
    // media attachment constructor
    public MediaAttachment(int id, String author, int length_Second) {
        super(id, author);
        this.length_Second = length_Second;
    }
    // media attachment to string
    @Override
    public String toString() {
        return "Media[length=" + length_Second + " sec, author=" + getAuthor() + "]";
    }
}