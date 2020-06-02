import org.junit.Test;
import model.AreaPark;
import model.Place;
import server.Server;
import server.ServerException;

import java.util.HashSet;
import java.util.Set;

public class TestParking {

    Set<Place> places = new HashSet<>();

    /*    Реализуем следующий кейс
    1. приехала легковая машина
    2. запарковалась на место
    3. приехала еще одна, но мест нет
    4. приехала грузовая машина
    5. запарковалась на место
    6. парковка легковой машины закончилась
    7. легковая оплатила парковку и уехала*/

    public void startParking() throws ServerException {
        Server.startServer();
        AreaPark park = new AreaPark();
    }
}
