package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import signal.SignalHandler;

import java.lang.reflect.Method;

@Aspect
@Component
public class SignalHandlingAspect {

    @Autowired
    private SignalHandler signalHandler;

    @Pointcut("execution(* *(..)) && @annotation(GameSignal)")
    public void gameSignalPointcut() {}

    @Before("gameSignalPointcut()")
    public void before(JoinPoint call) {
        MethodSignature signature = (MethodSignature) call.getSignature();
        signalHandler.handleSignal(
                "BEFORE_" + getAnnotationValue(signature)
        );
    }

    @Around("gameSignalPointcut()")
    public Object around(ProceedingJoinPoint call) throws Throwable {
        Object o = call.proceed();
        signalHandler.handleSignal("AROUND_" + getAnnotationValue((MethodSignature) call.getSignature()));
        return o;
    }

    @AfterReturning("gameSignalPointcut()")
    public void after(JoinPoint call) {
        signalHandler.handleSignal("AFTER_" + getAnnotationValue((MethodSignature) call.getSignature()));
    }

    private String getAnnotationValue(MethodSignature signature) {
        Method method = signature.getMethod();
        GameSignal myAnnotation = method.getAnnotation(GameSignal.class);
        return myAnnotation.value();
    }

}
