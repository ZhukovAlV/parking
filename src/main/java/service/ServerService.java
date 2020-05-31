package service;

import server.ServerException;

public interface ServerService {

    // Проверка сервера на Включен
    void startServer() throws ServerException;

    // Проверка сервера на Выключен
    void stopServer() throws ServerException;
}
