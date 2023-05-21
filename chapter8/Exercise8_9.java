package chapter8;


class UnsupportedFuctionException extends RuntimeException{
    private final int ERR_CODE;

    UnsupportedFuctionException(int errCode){
        ERR_CODE = errCode;
    }
    UnsupportedFuctionException(String message,int errCode){
        super(message);
        ERR_CODE = errCode;
    }

    public int getErrorCode() {
        return ERR_CODE;
    }
    public String getMessage(){
        return "["+ERR_CODE+"]"+super.getMessage();
    }
}

class Exercise8_9
{
    public static void main(String[] args) throws Exception
    {
        throw new UnsupportedFuctionException("지원하지 않는 기능입니다.",100);
    }
}

