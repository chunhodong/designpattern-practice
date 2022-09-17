package create_pattern;

/**
 * 멀티스레드에 안전하지 않는 싱글톤객체 생성
 */
public class SingletonV1 {

    /**
     * 외부에서 객체생성을 방지
     */
    private SingletonV1(){
        
    }
    
    private static SingletonV1 instance = null;

    /**
     * 내부에서 하나의 객체만 생성
     * @return 싱글톤객체
     */
    public static SingletonV1 getInstance(){
        if(instance == null){
            instance = new SingletonV1();
        }

        return instance;
    }


}
