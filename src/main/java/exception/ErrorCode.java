package exception;

public enum ErrorCode {
    SERVER_IS_START("{\"error\" : \"Сервер уже запущен.\"}"),
    SERVER_NOT_START("{\"error\" : \"Сервер не запущен.\"}"),
    CAR_IS_PARKING("{\"error\" : \"Машина уже припаркована.\"}"),
    CAR_IS_NOT_PARKING("{\"error\" : \"Машина не была припаркована.\"}"),
    AREA_HAVE_NOT_PLACE("{\"error\" : \"Все места заняты.\"}");

    private String message;

    ErrorCode(String message){
        this.message = message;
    }

    public String getErrorString(){
        return message;
    }
}
