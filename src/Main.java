class AA{
     void metodo() {
        System.out.println("Método de A");
    }
}
class BB extends AA {
     void metodo() {
        System.out.println("Método de B");
    }
}
public class Main {
    public static void main(String[] args) {
        AA obj = new BB();
        obj.metodo();

        A e = new B();
        e.metodo();
    }
    }
}