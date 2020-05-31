package server;

import serviceimpl.ServerServiceImpl;

public class Server {
    private static boolean isStarted;
    public static boolean isIsStarted() {
        return isStarted;
    }
    public static void setIsStarted(boolean isStarted) {
        Server.isStarted = isStarted;
    }

    public static void startServer(ServerServiceImpl server) throws ServerException {
        server.startServer(isIsStarted());
        setIsStarted(true);
    }
    public static void stopServer(ServerServiceImpl server) throws ServerException {
        server.stopServer(isIsStarted());
        setIsStarted(false);
    }
}
