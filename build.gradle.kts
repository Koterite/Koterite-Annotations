plugins {
    kotlin("multiplatform") version "1.3.71"
}

group = "br.com.gamemods.koterite"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm()
    mingwX64("windows")
    linuxX64("native")
    /* Targets configuration omitted. 
    *  To find out how to configure the targets, please follow the link:
    *  https://kotlinlang.org/docs/reference/building-mpp-with-gradle.html#setting-up-targets */

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(kotlin("stdlib"))
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
            }
        }

        val nativeMain by getting

        val windowsMain by getting {
            dependsOn(nativeMain)
        }

        all {
            languageSettings.apply {
                useExperimentalAnnotation("kotlin.ExperimentalMultiplatform")
                useExperimentalAnnotation("kotlin.RequiresOptIn")
            }
        }
    }
}
