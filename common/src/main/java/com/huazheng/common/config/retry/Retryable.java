package com.huazheng.common.config.retry;

import java.lang.annotation.*;

/**
 * @Classname Retryable
 * @Description 定义重试的注解
 * @Date 2020/7/14 9:30
 * @Created by zhanghuazheng
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Retryable {
    /**
     * Exception type that are retryable.
     * @return exception type to retry
     */
    Class<? extends Throwable> value() default RuntimeException.class;

    /**
     * 包含第一次失败
     * @return the maximum number of attempts (including the first failure), defaults to 3
     */
    int maxAttempts() default 3;
}
