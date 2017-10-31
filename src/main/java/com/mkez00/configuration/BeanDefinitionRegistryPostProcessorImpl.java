package com.mkez00.configuration;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by michaelkezele on 2017-10-30.
 */
@Component
public class BeanDefinitionRegistryPostProcessorImpl implements BeanDefinitionRegistryPostProcessor, EnvironmentAware {

    private static final String PILL_SERVICE_ENVIRONMENT_VARIABLE = "pillService";

    Environment environment;

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        String implementation = environment.getProperty(PILL_SERVICE_ENVIRONMENT_VARIABLE);
        configurableListableBeanFactory.getBeanDefinition(implementation).setPrimary(true);
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
