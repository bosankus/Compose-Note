
object BuildPlugins {
    val buildGradle by lazy { "com.android.tools.build:gradle:${Versions.buildGradle}" }
}


object Deps {

    // Unit Testing
    val junit by lazy { "junit:junit:${Versions.junit}" }
    val truth by lazy { "com.google.truth:truth:${Versions.truth}" }

    // UI Testing
    val extJunit by lazy { "androidx.test.ext:junit:${Versions.extJunit}" }
    val espressoCore by lazy { "androidx.test.espresso:espresso-core:${Versions.espresso}" }
    val composeUiTest by lazy { "androidx.compose.ui:ui-test-junit4:${Versions.compose}" }
    val composeUiDebug by lazy { "androidx.compose.ui:ui-tooling:${Versions.compose}" }

    val androidCore by lazy { "androidx.core:core-ktx:${Versions.androidCore}" }
    val androidComposeUi by lazy { "androidx.compose.ui:ui:${Versions.compose}" }
    val androidComposeMaterial by lazy { "androidx.compose.material:material:${Versions.compose}" }
    val androidComposeToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview:${Versions.compose}" }
    val lifecycleRuntime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleRuntime}" }
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }

}