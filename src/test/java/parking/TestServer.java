package parking;

import org.junit.Test;
import server.Server;
import server.ServerException;

public class TestServer {

    // Пытаемся дважды запустить сервер и проверяем, что throws ServerException
    @Test(expected = ServerException.class)
    public void startServerException() throws ServerException {
        Server.startServer();
        Server.startServer();
    }

    // Пытаемся дважды остановить сервер и проверяем, что throws ServerException
    @Test(expected = ServerException.class)
    public void stopServerException() throws ServerException {
        Server.stopServer();
        Server.stopServer();
    }
}
