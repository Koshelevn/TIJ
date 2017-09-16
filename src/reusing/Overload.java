package reusing;

class cl{
    void clas(int i){};
    void clas(boolean b){};
    void clas(char c){};
}
public class Overload extends  cl{
    void clas(cl c){};

    public static void main(String[] args) {
        Overload o = new Overload();
        o.clas(1);
        o.clas(new cl());
        o.clas('2');
        o.clas(true);
    }
}
