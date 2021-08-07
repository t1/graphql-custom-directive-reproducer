package com.example;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;

@GraphQLApi
public class SomeGraphApi {
    @Query
    public SomeCustomType foo() {
        return new SomeCustomType();
    }
}
