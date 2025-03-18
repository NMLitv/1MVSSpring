package ru.alishev.springcourse.config;

import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvsDispatcherServletIntitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?> @Nullable [] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?> @Nullable [] getServletConfigClasses() {
        return new Class[] {SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
