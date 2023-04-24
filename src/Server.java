import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

public class Server implements ServerMonitor
{
    List<Philospher> philosphers;

    // -1 if no user has fork
    Map<Integer, Integer> forkMap;



    @Override
    public void returnFork(int philID) throws RemoteException
    {

    }

    @Override
    public void setLeftFork(int philID) throws RemoteException
    {

    }

    @Override
    public void setRightFork(int philID) throws RemoteException
    {

    }

    @Override
    public int sitDown() throws RemoteException
    {
        return 0;
    }
}
