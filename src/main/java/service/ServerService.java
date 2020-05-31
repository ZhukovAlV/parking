package service;

import server.ServerException;

public interface ServerService {

    // Проверка сервера на Включен
    void startServer(boolean isStarted) throws ServerException;

    // Проверка сервера на Выключен
    void stopServer(boolean isStarted) throws ServerException;
}
