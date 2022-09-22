package action_pattern.template_method.after;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MultuplyFileProcessor extends AbstractFileProcessor{

    public MultuplyFileProcessor(String path) {
        super(path);
    }

    @Override
    int process(int result, int line) {
        return result *= line;
    }
}
