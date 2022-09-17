package create_pattern.singleton;


/**
 * 사용하는쪽에서 리플렉션을 사용했을시 싱글톤이꺠짐
 */
public enum SingletonV3 {


    /**
     * 리플렉션과 직렬화역직렬화에 안전
     * 사용시점에 로딩되는 lazy-loading은 지원X
     * 상속x
     */
    INSTANCE


}
