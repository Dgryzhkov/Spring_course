package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;


/**
 * @author Dgryzhkov
 */

public class MyPointcuts {
    @Pointcut("execution(* get*())")
    public void allGetMethods(){}
}
