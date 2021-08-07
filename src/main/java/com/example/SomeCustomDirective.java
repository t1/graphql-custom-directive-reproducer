package com.example;

import io.smallrye.graphql.api.Directive;
import org.eclipse.microprofile.graphql.Description;

import java.lang.annotation.Retention;

import static io.smallrye.graphql.api.DirectiveLocation.INTERFACE;
import static io.smallrye.graphql.api.DirectiveLocation.OBJECT;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Directive(on = {OBJECT, INTERFACE})
@Description("test-description")
@Retention(RUNTIME)
public @interface SomeCustomDirective {
    String value();
}
