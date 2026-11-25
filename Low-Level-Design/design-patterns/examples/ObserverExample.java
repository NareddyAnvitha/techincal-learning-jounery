
import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class User implements Observer {
    private String name;

    User(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

class NotificationService {
    private List<Observer> observers = new ArrayList<>();

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    void notifyUsers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

public class ObserverExample {
    public static void main(String[] args) {

        NotificationService service = new NotificationService();

        service.addObserver(new User("Anu"));
        service.addObserver(new User("Rahul"));

        service.notifyUsers("New notification available!");
    }
}
