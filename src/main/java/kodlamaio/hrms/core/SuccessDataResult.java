package kodlamaio.hrms.core;

public
class SuccessDataResult<T> extends DataResult {


    public
    SuccessDataResult (  Object data ) {
        super ( true, data );
    }

    public
    SuccessDataResult (  String message, Object data ) {
        super (  true,message, data );
    }
}
