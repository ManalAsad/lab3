public class FileAttachment extends Attachment {
    // size of file
    private int size_Byte;
    // file attachment constructor
    public FileAttachment(int id, String author, int size_Byte) {
        super(id, author);
        this.size_Byte = size_Byte;
    }
    // file attachment to string
    @Override
    public String toString() {
        return "File[size=" + size_Byte + " bytes, author=" + getAuthor() + "]";
    }
}