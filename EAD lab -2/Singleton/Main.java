public class Main {
    public static void main(String[] args) {
        NotificationFactory factory1 = NotificationFactory.getInstance();
        NotificationFactory factory2 = NotificationFactory.getInstance();

        Notification n1 = factory1.createNotification("EMAIL");
        n1.notifyUser();

        Notification n2 = factory1.createNotification("SMS");
        n2.notifyUser();

        Notification n3 = factory2.createNotification("PUSH");
        n3.notifyUser();

        System.out.println("Are both factories same? " + (factory1 == factory2)); // true
    }
}
