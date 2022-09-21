package action_pattern.observer.after;

import action_pattern.observer.before.ChatServer;

import java.util.List;

public class User2 implements Subscriber{

    @Override
    public void handleMessage(String message) {
        System.out.println("receive message:"+message);
    }
}
