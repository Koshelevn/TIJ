package access;

class Connection{
    private static int count = 0;
    private Connection(){}
    public static Connection NewConnection(){
        if (count<10) {
            count++;
            return new Connection();
        } else
            return null;
    }
}
public class ConnectionManager {

    public static void main(String[] args) {
        Connection[] connections = new Connection[15];
        for (int i=0; i<15; i++){
            connections[i]= Connection.NewConnection();
            System.out.println(connections[i]);
        }
    }
}
