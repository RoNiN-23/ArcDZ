import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calc extends Remote {
    String equation(int a, int b, int c) throws RemoteException;
}
