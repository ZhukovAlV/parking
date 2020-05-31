package serviceimpl;

import exception.ErrorCode;
import server.ServerException;
import service.ServerService;

public class ServerServiceImpl implements ServerService {

    @Override
    public void startServer(boolean isStarted) throws ServerException{
        if (!isStarted) throw new ServerException(ErrorCode.SERVER_NOT_START);
    }
    @Override
    public void stopServer(boolean isStarted) throws ServerException{
        if (isStarted) throw new ServerException(ErrorCode.SERVER_IS_START);
    }
}
