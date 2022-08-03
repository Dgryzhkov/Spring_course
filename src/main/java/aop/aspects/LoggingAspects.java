package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author Dgryzhkov
 */
@Component
@Aspect
@Order(1)
public class LoggingAspects {

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {
//    }
//
//    @Pointcut("allMethodsFromUniLibrary() &&  !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary() {
//    }
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
//    }

//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodUniLibrary() {
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodUniLibrary() {
//    }
//
//
//    @Pointcut("allGetMethodUniLibrary() || allReturnMethodUniLibrary()")
//    private void allGetAndReturnMethodUniLibrary() {
//    }
//
//    @Before("allGetMethodUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("#beforeGetLogingAdvice: writing Log#1");
//    }
//
//
//    @Before("allReturnMethodUniLibrary()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("#beforeReturnLogingAdvice: writing Log#2");
//    }
//
//
//    @Before("allGetAndReturnMethodUniLibrary()")
//    public void beforeGetAndReturnMethodUniLibrary(){
//        System.out.println("allGetAndReturnMethodUniLibrary: writing log #3");
//    }



    @Before("aop.aspects.MyPointcuts.allGetMethods ()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetBookAdvice: логирование попытки получить книгу/журнал");
    }



}
