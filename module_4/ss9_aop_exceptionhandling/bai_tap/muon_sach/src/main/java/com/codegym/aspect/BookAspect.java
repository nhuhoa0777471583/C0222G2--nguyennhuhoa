package com.codegym.aspect;

import com.codegym.model.Count;
import com.codegym.repository.ICountRepository;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BookAspect {
    @Autowired
    private ICountRepository iCountRepository;


    @AfterReturning(pointcut = " execution(public * com.codegym.controller.BookController.*(..))")
    public void logHistory(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.err.println("Method vừa thực hiện xong: " + name);
    }


    @AfterReturning(pointcut = " execution(public * com.codegym.controller.BookController.detail(..)) || " +
            " execution(public * com.codegym.controller.BookController.borrow(..)) || " +
            " execution(public * com.codegym.controller.BookController.borrowBook(..)) ")
    public void countViewDetail(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        iCountRepository.addCount();
        System.err.println("Method vừa thực hiện xong: " + name);
        System.err.println("co: " + iCountRepository.displayCount().getCountView() + " nguoi ghe tham" + " method: " + name + " này");
    }

}
