package com.example.dbjsonconverter.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SpringBeanUtils {

    public static Object getBean(final String beanName) {
        return ApplicationContextProvider.getCtx().getBean(beanName);
    }
}

