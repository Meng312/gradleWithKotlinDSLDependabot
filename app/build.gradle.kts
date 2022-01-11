plugins {
    java
}
apply(from="../dependencies.gradle")

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
//
//    testImplementation(rootProject.ext.supportDependencies.junit_jupiter)
//    testRuntimeOnly(rootProject.ext.supportDependencies.junit_engine)
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}