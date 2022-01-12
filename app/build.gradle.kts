buildscript {
    apply(from="../dependencies.gradle")
}

plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


dependencies {
    val projectDependency = rootProject.ext["libraries"] as Map<String, String>

    testImplementation(projectDependency["junitJupiter"]!!)
    testRuntimeOnly(projectDependency["junitEngine"]!!)
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}