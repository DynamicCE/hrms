package kodlamaio.hrms.core;

public
class SuccessDataResult<T> extends DataResult {


    public
    SuccessDataResult (  T data ) {
        super ( true, data );
    }

    public
    SuccessDataResult (  T data,String message  ) {
        super (  true,message, data );
    }
}
