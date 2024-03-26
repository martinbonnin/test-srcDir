plugins {
    id("com.apollographql.apollo3")
    id("org.jetbrains.kotlin.jvm")
}

dependencies {
    implementation("com.apollographql.apollo3:apollo-runtime")
}

apollo {
    service("reddit") {
        packageName.set("reddit")
        srcDir("src/main/graphql/com/reddit")
        generateApolloMetadata.set(true)
        // ...
        alwaysGenerateTypesMatching.set(listOf(".*"))
    }
    service("reddit-realtime") {
        packageName.set("reddit.realtime")
        srcDir("src/main/graphql/com/reddit-realtime")
        generateApolloMetadata.set(true)
        // ...
        alwaysGenerateTypesMatching.set(listOf(".*"))
    }
}