plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "no.kraakeroy.tvkatalog"
    compileSdk = 34

    defaultConfig {
        applicationId = "no.kraakeroy.tvkatalog"
        minSdk = 23
        targetSdk = 34
        versionCode = 1
        versionName = "0.1-poc"
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}
