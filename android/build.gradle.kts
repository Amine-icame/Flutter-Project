buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // C'est cette ligne qui permet à l'application de comprendre Firebase
        classpath("com.google.gms:google-services:4.4.2")
        // On s'assure que le plugin Android est là aussi (version standard)
        classpath("com.android.tools.build:gradle:8.2.1")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

val newBuildDir: Directory =
    rootProject.layout.buildDirectory
        .dir("../../build")
        .get()
rootProject.layout.buildDirectory.value(newBuildDir)

subprojects {
    val newSubprojectBuildDir: Directory = newBuildDir.dir(project.name)
    project.layout.buildDirectory.value(newSubprojectBuildDir)
}
subprojects {
    project.evaluationDependsOn(":app")
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}