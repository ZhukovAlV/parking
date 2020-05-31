package serviceimpl;

import exception.ErrorCode;
import server.Server;
import server.ServerException;
import service.ServerService;

public class ServerServiceImpl implements ServerService {

    @Override
    public void startServer() throws ServerException {
        if (Server.isIsStarted()) throw new ServerException(ErrorCode.SERVER_IS_START);
    }
    @Override
    public void stopServer() throws ServerException {
        if (!Server.isIsStarted()) throw new ServerException(ErrorCode.SERVER_NOT_START);
    }
}
