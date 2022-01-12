buildscript {
    apply(from="../dependencies")
    apply(from="../dependencies.gradle.kts")
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

//    dependencies from dependencies.gradle.kts
    implementation("org.apache.commons:commons-lang3:${rootProject.ext["commonsVersion"]}")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}