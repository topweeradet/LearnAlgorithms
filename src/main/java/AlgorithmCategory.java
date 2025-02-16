package src.main.java;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AlgorithmCategory {
    AlgorithmType value();
}