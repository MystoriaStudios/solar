import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import java.net.URI

plugins {
    id("maven-publish")
    id("io.sentry.jvm.gradle") version "3.12.0"
    id("com.github.johnrengelman.shadow") version "7.1.2"
    kotlin("kapt") version "1.9.10"
    kotlin("jvm") version "1.9.10"
}

val sentry_auth: String by project

sentry {
    // Generates a JVM (Java, Kotlin, etc.) source bundle and uploads your source code to Sentry.
    // This enables source context, allowing you to see your source
    // code as part of your stack traces in Sentry.
    includeSourceContext.set(true)
    org.set("mystoria-studios-196d3d453")
    projectName.set("java")
    authToken.set(sentry_auth)
}

allprojects {
    apply(plugin = "maven-publish")
    apply(plugin = "com.github.johnrengelman.shadow")
    apply(plugin = "kotlin")
    apply(plugin = "org.jetbrains.kotlin.kapt")

    group = "net.mystoria.solar"
    version = "1.0.01-SNAPSHOT"

    repositories {
        mavenCentral()
        maven("https://repo.aikar.co/content/groups/aikar/")

        maven {
            url = uri("https://repo.nopox.xyz/mystoria-prod")

            credentials {
                username = project.properties["MystoriaProdUsername"].toString()
                password = project.properties["MystoriaProdPassword"].toString()
            }
        }
    }

    dependencies {
        compileOnly(kotlin("stdlib"))

        //compileOnly("net.mystoria.framework:independent-api:1.0.11-SNAPSHOT")
    }

    tasks.withType<ShadowJar> {
        archiveClassifier.set("")
        archiveFileName.set("solar-${project.name}.jar")
    }

    publishing {
        publications {
            register(
                name = "mavenJava",
                type = MavenPublication::class,
                configurationAction = shadow::component
            )
        }
    }

    tasks["build"]
        .dependsOn(
            "shadowJar",
            "publishMavenJavaPublicationToMavenLocal"
        )
}

kotlin {
    jvmToolchain(18)
}