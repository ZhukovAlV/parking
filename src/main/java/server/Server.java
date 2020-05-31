package server;

import service.ServerService;
import serviceimpl.ServerServiceImpl;

public class Server {

    // Используем Singleton, чтобы объект сервера был один
    private static Server server = new Server();
    private static boolean isStarted;
    public static boolean isIsStarted() {
        return isStarted;
    }
    public static void setIsStarted(boolean isStarted) {
        Server.isStarted = isStarted;
    }

    private Server() {
    }

    public static Server getServer() {
        return server;
    }

    public static void startServer() throws ServerException {
        new ServerServiceImpl().startServer();
        setIsStarted(true);
    }
    public static void stopServer() throws ServerException {
        new ServerServiceImpl().stopServer();
        setIsStarted(false);
    }
}
