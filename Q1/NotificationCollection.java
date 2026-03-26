import java.util.ArrayList;

public class NotificationCollection implements NotificationCollectionIF{
    // list of notifications variable
    private ArrayList<Notification> items;
    // assigns notification collection items to list of notificaitons
    public NotificationCollection() {
        items = new ArrayList<>();
    }
    // add notification
    public void addItem(String content) {
        items.add(new Notification(content));
    }
    // get notification
    public Notification getItem(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        }
        return null;
    }
    // get length of nottificaion collection
    public int getLength() {
        return items.size();
    }
    // set attachments to notificaion
    public void setAttachment(Attachment a, int index) {
        Notification n = getItem(index);
        if (n != null) {
            n.setAttachment(a);
        }
    }
    // create notification iterator
    @Override
    public NotificationIteratorIF createIterator(){
        return new NotificationIterator(this);
    }
}
