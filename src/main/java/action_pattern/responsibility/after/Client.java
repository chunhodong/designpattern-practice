package action_pattern.responsibility.after;

import action_pattern.responsibility.before.Request;

public class Client {

    public static void main(String[] args) {
        RequestHandler authRequestHandlerV1 = new AuthRequestHandlerV1();
        RequestHandler loggingHandlerV1 = new LoggingRequestHandlerV1();
        RequestHandler httpRequestHandlerV1 = new HttpRequestHandlerV1();

        httpRequestHandlerV1.setHandler(loggingHandlerV1);
        loggingHandlerV1.setHandler(authRequestHandlerV1);

        httpRequestHandlerV1.handle(new Request("request body"));

    }
}
