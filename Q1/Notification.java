public class Notification {
    // content of notification
    private String content;
    // attachment of notification
    private Attachment attachment;
    // notification constructor
    public Notification(String content) {
        this.content = content;
    }
    // get content
    public String getContent(){
        // if there is a attachment, return attachment and content
        if(attachment != null) {
            return content + " | Attachment: " + attachment.toString();
        }
        // if there is no attachment, just return content
        return content;
    }
    // attach attachment to notification
    public void setAttachment(Attachment a){
        this.attachment = a;
    }
}
