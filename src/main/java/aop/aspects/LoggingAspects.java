//package aop.aspects;
//
////import aop.Book;
////import org.aspectj.lang.JoinPoint;
////import org.aspectj.lang.annotation.Aspect;
////import org.aspectj.lang.annotation.Before;
////import org.aspectj.lang.reflect.MethodSignature;
////import org.springframework.core.annotation.Order;
////import org.springframework.stereotype.Component;
//
///**
// * @author Dgryzhkov
// */
////@Component
////@Aspect
////@Order(1)
////public class LoggingAspects {
//
////    @Pointcut("execution(* aop.UniLibrary.*(..))")
////    private void allMethodsFromUniLibrary() {
////    }
////
////    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
////    private void returnMagazineFromUniLibrary() {
////    }
////
////    @Pointcut("allMethodsFromUniLibrary() &&  !returnMagazineFromUniLibrary()")
////    private void allMethodsExceptReturnMagazineFromUniLibrary() {
////    }
////
////    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
////    public void beforeAllMethodsExceptReturnMagazineAdvice() {
////        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: Log #10");
////    }
//
////    @Pointcut("execution(* aop.UniLibrary.get*())")
////    private void allGetMethodUniLibrary() {
////    }
////
////    @Pointcut("execution(* aop.UniLibrary.return*())")
////    private void allReturnMethodUniLibrary() {
////    }
////
////
////    @Pointcut("allGetMethodUniLibrary() || allReturnMethodUniLibrary()")
////    private void allGetAndReturnMethodUniLibrary() {
////    }
////
////    @Before("allGetMethodUniLibrary()")
////    public void beforeGetLoggingAdvice() {
////        System.out.println("#beforeGetLogingAdvice: writing Log#1");
////    }
////
////
////    @Before("allReturnMethodUniLibrary()")
////    public void beforeReturnLoggingAdvice() {
////        System.out.println("#beforeReturnLogingAdvice: writing Log#2");
////    }
////
////
////    @Before("allGetAndReturnMethodUniLibrary()")
////    public void beforeGetAndReturnMethodUniLibrary(){
////        System.out.println("allGetAndReturnMethodUniLibrary: writing log #3");
////    }
//
//
//
////    @Before("aop.aspects.MyPointcuts.allAddMethods ()")
////    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
////
////        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
////        System.out.println("methodSignature" + methodSignature);
////        System.out.println("methodSignature.getMethod " + methodSignature.getMethod());
////        System.out.println("methodSignature.getReturnType " + methodSignature.getReturnType());
////        System.out.println("methodSignature.getName " + methodSignature.getName());
////
////        if (methodSignature.getName().equals("addBook")){
////            Object[] arguments = joinPoint.getArgs();
////
////            for (Object obj: arguments){
////                if (obj instanceof Book) {
////                    Book myBook = (Book) obj;
////                    System.out.println("Информация о книге: название - " +
////                            myBook.getName() + ", автор - " + myBook.getAuthor() +
////                            ", год издание -" + myBook.getYearsOfPublication());
////                } else if (obj instanceof String){
////                    System.out.println("Книгу в библиотеку добавляет " + obj);
////                }
////
////            }
////        }
////
////
////        System.out.println("beforeAddLoggingAdvice: логирование попытки получить книгу/журнал");
////        System.out.println("-------------------------------------");
////    }
////
////
////
////}
