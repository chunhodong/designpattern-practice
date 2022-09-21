package action_pattern.observer.after;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ChatServer2가 옵저버를 등록
 */
public class ChatServer2 {

    private Map<String, List<Subscriber>> messages;

    public ChatServer2() {
        this.messages = new HashMap<>();
    }


    public void add(String subject, Subscriber subscriber) {
        if (messages.containsKey(subject)) {
            messages.get(subject).add(subscriber);
        } else {
            List<Subscriber> subscriberList = new ArrayList<>();
            subscriberList.add(subscriber);
            messages.put(subject, subscriberList);
        }
    }

    public void getMessage(String subject) {
        messages.get(subject)
                .forEach(subscriber -> subscriber.handleMessage(subject));
    }
}
