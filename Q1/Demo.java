public class Demo {
    public static void main(String[] args) {
        // make new notification collection
        NotificationCollection nc = new NotificationCollection();
        // make new notification bar
        NotificationBar nb = new NotificationBar(nc);
        //1. create Notifications and add them to nc
        nc.addItem("Assignment due tomorrow");
        nc.addItem("New message from professor");
        nc.addItem("Meeting at 3 PM");
        //2. create attachments and 
        Attachment file = new FileAttachment(1, "Maria", 2048);
        Attachment media = new MediaAttachment(2, "John", 120);
        // link them to notifications in nc
        nc.setAttachment(file, 0);
        nc.setAttachment(media, 1);
        nc.setAttachment(media, 2);
        // print all notifications
        nb.printNotifications();
    }
}
