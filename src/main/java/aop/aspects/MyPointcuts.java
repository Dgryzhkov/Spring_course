package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;


/**
 * @author Dgryzhkov
 */

public class MyPointcuts {
    @Pointcut("execution(* add*(..))")
    public void allAddMethods(){}
}
