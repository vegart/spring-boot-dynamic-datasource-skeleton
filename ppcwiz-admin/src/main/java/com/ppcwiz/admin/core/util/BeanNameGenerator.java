package com.ppcwiz.admin.core.util;


import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;

public class BeanNameGenerator implements org.springframework.beans.factory.support.BeanNameGenerator {
    @Override
    public String generateBeanName(BeanDefinition definition, BeanDefinitionRegistry registry) {
    	String beanName = getFullName((AnnotatedBeanDefinition) definition);
        return beanName;
    }

    private String getFullName(final AnnotatedBeanDefinition definition) {
        return definition.getMetadata().getClassName();
    }

}