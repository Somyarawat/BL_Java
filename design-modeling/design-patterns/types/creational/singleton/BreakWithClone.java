class BreakWithClone implements Cloneable {
    private static BreakWithClone obj;
    private BreakWithClone(){}

    public static BreakWithClone getObj(){
        if(obj == null){
            synchronized (BreakWithClone.class) {
                if(obj == null){
            obj = new BreakWithClone();
        }
            }
        }
        return obj;
    }

    // public Object readResolve(){
    //     return obj;
    // }

    @Override
    public Object clone() throws CloneNotSupportedException{
        //return super.clone();
        return obj;
    }
    public static void main(String[] args) throws Exception,CloneNotSupportedException {

        BreakWithClone obj1 = BreakWithClone.getObj();
        System.out.println(obj1.hashCode());
        // ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        // oos.writeObject(obj1);
        // System.out.println("Serialization Done");

        // ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        // BreakWithDeserialization obj2 = (BreakWithDeserialization)ois.readObject();
        // System.out.println(obj2.hashCode());
        BreakWithClone obj2 = (BreakWithClone)obj1.clone();
        System.out.println(obj2.hashCode());
    }
}


