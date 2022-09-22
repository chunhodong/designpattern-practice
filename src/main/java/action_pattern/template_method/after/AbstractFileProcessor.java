package action_pattern.template_method.after;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 읽은파일의 라인번호에 대한 연산이 달라지면 다른 클래스를 만들어야함
 */
public abstract class AbstractFileProcessor {

    private String path;
    public AbstractFileProcessor(String path) {
        this.path = path;
    }

    public int process() {
        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int result = 0;
            String line = null;
            while((line = reader.readLine()) != null) {
                result = process(result,Integer.parseInt(line));
            }
            return result;
        } catch (IOException e) {
            throw new IllegalArgumentException(path + "에 해당하는 파일이 없습니다.", e);
        }
    }

    abstract int process(int result,int line);
}
