
interface MessageService {
    void sendMessage(String message);
}

class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}

class Notification {
    private MessageService service;

    Notification(MessageService service) {
        this.service = service;
    }

    void notifyUser(String message) {
        service.sendMessage(message);
    }
}

public class DIPExample {
    public static void main(String[] args) {

        MessageService email = new EmailService();

        Notification notification = new Notification(email);

        notification.notifyUser("Welcome to our application!");
    }
}
