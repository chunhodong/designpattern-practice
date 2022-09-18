package structure_pattern.decorator.after;

public class SpamFilteringCommentService implements CommentService{
    private CommentService commentService;
    public SpamFilteringCommentService(CommentService commentService){
        this.commentService = commentService;
    }


    @Override
    public void addComment(String comment) {
        System.out.println("spamFilter");
        this.commentService.addComment(comment);
    }
}
