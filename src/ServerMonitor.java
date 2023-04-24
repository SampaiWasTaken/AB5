import java.rmi.Remote;

public interface ServerMonitor extends Remote
{
    void returnFork(int philID) throws java.rmi.RemoteException;
    void setLeftFork(int philID) throws java.rmi.RemoteException;
    void setRightFork(int philID) throws java.rmi.RemoteException;
    int sitDown() throws java.rmi.RemoteException;

}
