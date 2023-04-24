import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.RemoteServer;

public class Philospher
{
    boolean rightFork;
    boolean leftFork;

    private int id;

    public Philospher()
    {
        rightFork = false;
        leftFork = false;
    }


    public static void main(String[] args)
    {
        Philospher phil = new Philospher();

        try
        {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            ServerMonitor monitor = (ServerMonitor) registry.lookup("ServerMonitor");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

}
