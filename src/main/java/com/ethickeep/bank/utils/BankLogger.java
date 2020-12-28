package com.ethickeep.bank.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class BankLogger {



    @Around("execution(* com.ethickeep.bank.InternetBank.getTotalAmount())")
    private Object anyInternetBankMethods(ProceedingJoinPoint jp) throws Throwable {
        return jp.proceed();
    }

//    @Pointcut("execution(* *(*))")
//    private void anyOneParamMethod(){}
//
//    @Pointcut("execution(* get*(*))")
//    private void getMethod(){}
//
//    @Pointcut("execution(* set*(*))")
//    private void setMethod(){}
//
//    @Pointcut("getMethod()||setMethod()")
//    private void getAndSetMethod(){}
//
//    @Pointcut("execution(* com.ethickeep.bank.InternetBank.*(..))")
//    private void anyInternetBankMethods(){}
//
//    @Pointcut("execution(* com.ethickeep.bank.InternetBank.getTotalAmount(..))")
//    private void getTotalAmountAdvice(){}
//
//    @Pointcut("anyInternetBankMethods() && !getTotalAmountAdvice()")
//    private void anyInternetBankMethodsExceptGetTotalAmount(){}

//    @Before("execution(int get*())")// Все геттеры, возвращающие int
//    @Before("execution(int get*())")// Все геттеры, возвращающие int
//    @Before("anyOneParamMethod()")// Все методы
//    @AfterReturning(pointcut = "execution(* get*())",
//    returning = "list")
//    void beforeGetMoneyAdvice(List<Integer> list){
////        Object[] args = joinPoint.getArgs();
//    }
//    @AfterThrowing(pointcut = "execution(* get*())",
//            throwing = "exc")
//    void afterThrowingGetMoneyAdvice(Throwable exc){
////        Object[] args = joinPoint.getArgs();
//    }
}
