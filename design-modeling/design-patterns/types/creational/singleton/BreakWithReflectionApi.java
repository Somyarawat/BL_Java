import java.lang.reflect.Constructor;

class BreakWithReflectionApi{
    private static BreakWithReflectionApi obj;
    private BreakWithReflectionApi(){
        if(obj != null){
            throw new RuntimeException("You are trying to break singleton class");
        }
    }

    public static BreakWithReflectionApi getObj(){
        if(obj == null){
            synchronized (BreakWithReflectionApi.class) {
                if(obj == null){
            obj = new BreakWithReflectionApi();
        }
            }
        }
        return obj;
    }
    public static void main(String[] args) throws Exception {

        BreakWithReflectionApi obj1 = BreakWithReflectionApi.getObj();
        System.out.println(obj1.hashCode());
        Constructor<BreakWithReflectionApi> constructor = BreakWithReflectionApi.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        BreakWithReflectionApi obj2 = constructor.newInstance();
        System.out.println(obj2.hashCode());
    }
}


