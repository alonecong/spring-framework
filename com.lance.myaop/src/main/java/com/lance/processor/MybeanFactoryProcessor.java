package com.lance.processor;

import com.lance.aop.TempService;
import com.lance.test.TestImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author lancecong
 * @version 1.0
 * @ClassName beanFactoryProcessor
 * @DESCRIPTION TODO
 * @create 2019-12-21 22:28
 **/
@Component
public class MybeanFactoryProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        GenericBeanDefinition  definition = (GenericBeanDefinition) beanFactory.getBeanDefinition("userService");
        System.out.println(definition.getBeanClassName());
        definition.setBeanClass(TempService.class);
        definition.setBeanClassName("tempService");
        definition.setAttribute("name", "zhengcong");
    }
}
