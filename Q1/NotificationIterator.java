public class NotificationIterator implements NotificationIteratorIF {
    // notificaion collection
    private NotificationCollection collection;
    // start of position in collection
    private int position;
    // 
    public NotificationIterator(NotificationCollection collection) {
        this.collection = collection;
        // start at the first element
        this.position = 0; 
    }
    // determine if notificaiton in collection has a next notificaion
    @Override
    public boolean hasNext() {
        return position < collection.getLength();
    }
    // moves the position in the notification collection
    @Override
    public Notification next() {
        if (!hasNext()) {
            return null;
        }
        Notification current = collection.getItem(position);
        position++;
        return current;
    }
}