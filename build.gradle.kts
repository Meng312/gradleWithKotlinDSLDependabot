plugins {
    kotlin("jvm") version "1.5.10"
}

buildscript {
    apply(from="config.gradle.kts")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:${project.extra["jupiterVersion"]}")
}