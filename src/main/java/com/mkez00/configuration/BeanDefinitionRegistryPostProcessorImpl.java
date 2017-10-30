package com.mkez00.configuration;

import com.mkez00.helper.ApplicationHelper;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by michaelkezele on 2017-10-30.
 */
@Component
public class BeanDefinitionRegistryPostProcessorImpl implements BeanDefinitionRegistryPostProcessor {

    private static String PILL_SERVICE_ENV_VARIABLE = "PILLSERVICE";
    private static String PILL_SERVICE_DEFAULT_IMPL = "BluePillServiceImpl";

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {

    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        String pillServiceImpl = ApplicationHelper.getEnvironmentVariable(PILL_SERVICE_ENV_VARIABLE, PILL_SERVICE_DEFAULT_IMPL);
        configurableListableBeanFactory.getBeanDefinition(pillServiceImpl).setPrimary(true);
    }
}
