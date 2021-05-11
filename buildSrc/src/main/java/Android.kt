
object Android {

    object Versions {
        const val ktx = "1.3.2"
        const val appCompat = "1.2.0"
        const val materialDesign = "1.3.0"
        const val lifecycle = "2.3.1"
        const val compose = "1.0.0-beta05"
        const val composeConstraintLayout = "1.0.0-alpha06"
        const val composeActivity = "1.3.0-alpha07"
    }

    const val coreKtx = "androidx.core:core-ktx:${Versions.ktx}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val materialDesign = "com.google.android.material:material:${Versions.materialDesign}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"

    object Compose {
        const val ui = "androidx.compose.ui:ui:${Versions.compose}"
        const val material = "androidx.compose.material:material:${Versions.compose}"
        const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
        const val foundation = "androidx.compose.foundation:foundation:${Versions.compose}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout-compose:${Versions.composeConstraintLayout}"
        const val materialIcons = "androidx.compose.material:material-icons-extended:${Versions.compose}"
        const val runtime = "androidx.compose.runtime:runtime:${Versions.compose}"
        const val runtimeLiveData = "androidx.compose.runtime:runtime-livedata:${Versions.compose}"
        const val activity = "androidx.activity:activity-compose:${Versions.composeActivity}"
    }
}