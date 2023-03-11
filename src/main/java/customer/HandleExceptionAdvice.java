package customer;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandleExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(HandleException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String NotFoundExcepton(HandleException ex){
        return ex.getMessage();
    }
}
