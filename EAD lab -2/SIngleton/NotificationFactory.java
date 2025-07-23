public class NotificationFactory {
    private static NotificationFactory instance;

    private NotificationFactory() {
        System.out.println("NotificationFactory initialized.");
    }

    public static NotificationFactory getInstance() {
        if (instance == null) {
            instance = new NotificationFactory();
        }
        return instance;
    }

    public Notification createNotification(String type) {
        switch (type.toUpperCase()) {
            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SMSNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown notification type");
        }
    }
}
