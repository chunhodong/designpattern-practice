package structure_pattern.decorator.after;


public class TrimmingCommentService implements CommentService {
    private CommentService commentService;

    public TrimmingCommentService(CommentService commentService){
        this.commentService = commentService;

    }
    @Override
    public void addComment(String comment) {
        System.out.println("trimService");
        this.commentService.addComment(comment);
    }
}
