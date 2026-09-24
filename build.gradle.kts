plugins {
    java
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

sourceSets {
    // Throwaway code that exercises the ontology. Never shipped with it.
    create("playground") {
        compileClasspath += sourceSets["main"].output
        runtimeClasspath += output + compileClasspath
    }
}

tasks.register<JavaExec>("playground") {
    group = "application"
    description = "Runs ontomagic.Playground."
    mainClass = "ontomagic.Playground"
    classpath = sourceSets["playground"].runtimeClasspath
}
