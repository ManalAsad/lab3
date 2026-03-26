
public class NotificationBar {
    // used in the printNotification method
    private NotificationCollection notifications;

    // // notificaiton bar constructor recieves collection
    public NotificationBar(NotificationCollection notifications) {
        this.notifications = notifications;
    }
    // prints all notifications using iterator pattern
    public void printNotifications() {
        NotificationIteratorIF iterator = notifications.createIterator();
        while (iterator.hasNext()) {
            Notification n = iterator.next();
            System.out.println(n.getContent());
        }
    }
}
