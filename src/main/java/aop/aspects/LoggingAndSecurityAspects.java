package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Dgryzhkov
 */
@Component
@Aspect
public class LoggingAndSecurityAspects {

    @Pointcut("execution(* aop.UniLibrary.*(..))")
    private void allMethodsFromUniLibrary() {
    }

    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
    private void returnMagazineFromUniLibrary() {
    }

    @Pointcut("allMethodsFromUniLibrary() &&  !returnMagazineFromUniLibrary()")
    private void allMethodsExceptReturnMagazineFromUniLibrary() {
    }

    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
    public void beforeAllMethodsExceptReturnMagazineAdvice() {
        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
    }

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

//    @Pointcut("execution(* get*())")
//    private void allGetMethods(){}
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetBookAdvice: попытка получить книгу/журнал");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: проверка прав на получение книги/журнала");
//    }

}
