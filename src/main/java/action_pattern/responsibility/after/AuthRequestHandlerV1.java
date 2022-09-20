package action_pattern.responsibility.after;

import action_pattern.responsibility.before.Request;

public class AuthRequestHandlerV1 implements RequestHandler{
    private RequestHandler requestHandler;
    @Override
    public void setHandler(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    @Override
    public void handle(Request request) {
        requestHandler.handle(request);
    }
}
