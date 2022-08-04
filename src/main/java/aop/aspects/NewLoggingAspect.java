package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author Dgryzhkov
 */
@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution( public String returnBook())")
    public  String aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку " +
                "пытаются вернуть книгу");
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку " +
                "возвращают книгу");
        long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
//        targetMethodResult = "Преступление и наказание";
        long end = System.currentTimeMillis();
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку " +
                "успешно вернули книгу");
        System.out.println("aroundReturnBookLoggingAdvice:  метод returnBook выполнил работы за " + (end-begin) + " миллисекунд");
        return (String) targetMethodResult;
    }
}
