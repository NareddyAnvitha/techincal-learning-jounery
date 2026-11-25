
interface Notification {
    void send();
}

class EmailNotification implements Notification {
    public void send() {
        System.out.println("Sending Email Notification");
    }
}

class SMSNotification implements Notification {
    public void send() {
        System.out.println("Sending SMS Notification");
    }
}

class NotificationFactory {

    public Notification createNotification(String type) {

        if (type.equalsIgnoreCase("email")) {
            return new EmailNotification();
        }

        if (type.equalsIgnoreCase("sms")) {
            return new SMSNotification();
        }

        throw new IllegalArgumentException("Invalid notification type");
    }
}

public class FactoryExample {
    public static void main(String[] args) {

        NotificationFactory factory = new NotificationFactory();

        Notification email = factory.createNotification("email");
        Notification sms = factory.createNotification("sms");

        email.send();
        sms.send();
    }
}

***Expected Output***
Sending Email Notification
Sending SMS Notification


