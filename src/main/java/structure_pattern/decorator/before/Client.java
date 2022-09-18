package structure_pattern.decorator.before;

/**
 * 기존 클래스에서 사용하는 기능에 부가기능을 추가하거나 조합하기위해 새로운 클래스를 생성해야함
 */
public class Client {

    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        Client client = new Client(new SpamFilteringCommentService());
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");
    }

}
