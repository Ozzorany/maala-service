package com.example.demo.resolver.demo;

import com.example.demo.Demo;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class DemoQueryResolver implements GraphQLQueryResolver {
    public Demo getRecentPosts(Long id) {
        return new Demo(1L);
    }
}
