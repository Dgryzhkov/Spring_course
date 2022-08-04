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
    public String aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку " +
                "пытаются вернуть книгу");

        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку " +
                "возвращают книгу");
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturnBookLoggingAdvice: было поймано исключение " + e);
//            targetMethodResult = "Незвестное название книги";
            throw e;
        }

        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку " +
                "успешно вернули книгу");

        return (String) targetMethodResult;
    }
}
