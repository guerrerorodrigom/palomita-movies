
object Dependencies {
    object Versions {
        const val gradle = "7.0.0-alpha15"
        const val gradleKotlinPlugin = "1.4.32"
        const val hilt = "2.35"
        const val kotlin = "1.4.32"
        const val accompanist = "0.9.0"
        const val retrofit = "2.9.0"
        const val junit = "4.13.2"
        const val junitExt = "1.1.2"
        const val espresso = "3.3.0"
    }

    const val buildGradle = "com.android.tools.build:gradle:${Versions.gradle}"
    const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.gradleKotlinPlugin}"
    const val daggerHiltGradle = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"

    object Accompanist {
        const val coil = "com.google.accompanist:accompanist-coil:${Versions.accompanist}"
    }

    object Hilt {
        const val android = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val compiler = "com.google.dagger:hilt-compiler:${Versions.hilt}"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val converterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    }

    object Testing {
        const val junit = "junit:junit:${Versions.junit}"
        const val junitExt = "androidx.test.ext:junit:${Versions.junitExt}"
        const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
        const val composeJunit = "androidx.compose.ui:ui-test-junit4:${Android.Versions.compose}"
    }
}