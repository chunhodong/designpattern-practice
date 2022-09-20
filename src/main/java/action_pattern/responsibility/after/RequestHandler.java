package action_pattern.responsibility.after;

import action_pattern.responsibility.before.Request;

public interface RequestHandler {

    void setHandler(RequestHandler requestHandler);
    void handle(Request request);
}
