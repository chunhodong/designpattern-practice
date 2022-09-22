package action_pattern.template_method.after;

public class PlusFileProcessor extends AbstractFileProcessor{

    public PlusFileProcessor(String path) {
        super(path);
    }

    @Override
    int process(int result, int line) {
        return result += line;
    }
}
