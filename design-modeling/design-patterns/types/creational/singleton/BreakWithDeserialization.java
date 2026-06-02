
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class BreakWithDeserialization implements Serializable{
    private static BreakWithDeserialization obj;
    private BreakWithDeserialization(){
        // if(obj != null){
        //     throw new RuntimeException("You are trying to break singleton class");
        // }
    }

    public static BreakWithDeserialization getObj(){
        if(obj == null){
            synchronized (BreakWithDeserialization.class) {
                if(obj == null){
            obj = new BreakWithDeserialization();
        }
            }
        }
        return obj;
    }

    public Object readResolve(){
        return obj;
    }
    public static void main(String[] args) throws Exception {

        BreakWithDeserialization obj1 = BreakWithDeserialization.getObj();
        System.out.println(obj1.hashCode());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        oos.writeObject(obj1);
        System.out.println("Serialization Done");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        BreakWithDeserialization obj2 = (BreakWithDeserialization)ois.readObject();
        System.out.println(obj2.hashCode());
    }
}


