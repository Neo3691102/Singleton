package PatronSingleton;

public class Singleton {
    private static volatile Singleton singleton; //volatile obligatorio para evitar
    //problemas de visibilidad de memoria

    private Singleton(){

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    @Override
    public String toString() {
        return "Singleton - " + this.hashCode();
    }
}

class Contexto {
    public static void main(String[] args) {
//        Singleton s1 = new Singleton();
//        Singleton s2 = new Singleton();
//        Singleton s3 = new Singleton();
//
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

        Singleton s4 = Singleton.getInstance();
        Singleton s5 = Singleton.getInstance();
        Singleton s6 = Singleton.getInstance();

        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }
}

//Para aprender: método sincronizado
//Para producción: Holder o enum
//Para entrevistas: Double-Checked Locking