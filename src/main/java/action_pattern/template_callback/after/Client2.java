package action_pattern.template_callback.after;

public class Client2 {

    public static void main(String[] args) {
        FileProcessor2 fileProcessor = new FileProcessor2("number.txt");
        int result = fileProcessor.process((result1, line) -> result1 +=line);
        System.out.println(result);
    }
}
