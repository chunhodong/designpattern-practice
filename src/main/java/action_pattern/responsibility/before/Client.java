package action_pattern.responsibility.before;

/**
 * 핸들러가 바뀌거나 여러 핸들러가 같이 동작할경우 클라이언트코드를 수정해야함
 */
public class Client {

    public static void main(String[] args) {
        Request request = new Request("무궁화 꽃이 피었습니다.");
        RequestHandler requestHandler = new LoggingRequestHandler();
        requestHandler.handler(request);
    }
}
