package structure_pattern.decorator.after;

/**
 * 기존 클래스에서 사용하는 기능에 부가기능을 추가하거나 조합하기위해 새로운 클래스를 생성해야함
 */
public class Client {


    public static void main(String[] args) {
        CommentService commentService = new TrimmingCommentService(new SpamFilteringCommentService(new DefaultCommentService()));
        commentService.addComment("hi");
    }

}
