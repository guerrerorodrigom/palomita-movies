plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = AppConfig.compileSdk
    buildToolsVersion = AppConfig.buildTools

    defaultConfig {
        applicationId = "net.palomitademaiz.palomitamovies"
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = rootProject.extra["compose_version"] as String
        kotlinCompilerVersion = Dependencies.Versions.kotlin
    }
}

dependencies {

    implementation(Android.coreKtx)
    implementation(Android.appCompat)
    implementation(Android.materialDesign)
    implementation(Android.lifecycleRuntime)

    implementation(Android.Compose.ui)
    implementation(Android.Compose.material)
    implementation(Android.Compose.uiTooling)
    implementation(Android.Compose.foundation)
    implementation(Android.Compose.constraintLayout)
    implementation(Android.Compose.materialIcons)
    implementation(Android.Compose.runtime)
    implementation(Android.Compose.runtimeLiveData)
    implementation(Android.Compose.activity)

    implementation(Dependencies.Accompanist.coil)

    implementation(Dependencies.Hilt.android)
    kapt(Dependencies.Hilt.compiler)

    implementation(Dependencies.Retrofit.retrofit)
    implementation(Dependencies.Retrofit.converterGson)

    testImplementation(Dependencies.Testing.junit)
    androidTestImplementation(Dependencies.Testing.junitExt)
    androidTestImplementation(Dependencies.Testing.espressoCore)
    androidTestImplementation(Dependencies.Testing.composeJunit)
}