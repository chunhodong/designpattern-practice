package create_pattern;


/**
 * 사용하는쪽에서 리플렉션을 사용했을시 싱글톤이꺠짐
 */
public class SingletonV2 {


    private SingletonV2(){
        
    }

    /**
     * 사용하는 시점에 클래스가 초기화됨
     */
    private static class SingletonV2Holder{

        /**
         * 클래스초기화가 일어나는시점에 한번만 할당
         */
        private static final SingletonV2 INSTANCE = new SingletonV2();
    }

    /**
     * 메소드를 사용하는 시점에 클래스가 로딩되고 초기화가 됨 lazy-initialization을 보장하면서
     * 한번만 초기화하기떄문에 멀티스레드에 안전
     * @return 싱글톤객체
     */
    public static SingletonV2 getInstance(){
        return SingletonV2Holder.INSTANCE;
    }


}
