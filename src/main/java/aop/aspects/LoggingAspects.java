package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author Dgryzhkov
 */
@Component
@Aspect
public class LoggingAspects  {
    @Before("execution(public void get*())")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
    }

    @Before("execution(public void return*())")
    public void beforeReturnBookAdvice(){
        System.out.println("beforeReturnBookAdvice: попытка  сдать книгу");
    }

    @Before("execution(* *Book())")
    public void beforeBookAdvice(){
        System.out.println("beforeBookAdvice: попытка ЧТО_ТО сделать с  книгой");
    }

}
