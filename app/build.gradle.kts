plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("kotlin-android")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = ConfigData.compileSdkVersion
    buildToolsVersion = ConfigData.buildToolsVersion

    defaultConfig {
        applicationId = "bose.ankush.composenote"
        minSdk = ConfigData.minSdkVersion
        targetSdk = ConfigData.targetSdkVersion
        versionCode = ConfigData.versionCode
        versionName = ConfigData.versionName
        multiDexEnabled = ConfigData.multiDexEnabled
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.compose
    }

}

dependencies {

    // Unit Testing
    testImplementation(Deps.junit)
    testImplementation(Deps.truth)

    // UI Testing
    androidTestImplementation(Deps.extJunit)
    androidTestImplementation(Deps.espressoCore)
    androidTestImplementation(Deps.composeUiTest)
    debugImplementation(Deps.composeUiDebug)

    // Core
    implementation(Deps.androidCore)
    implementation(Deps.androidComposeUi)
    implementation(Deps.androidComposeMaterial)
    implementation(Deps.androidComposeMaterialIcon)
    implementation(Deps.androidComposeToolingPreview)
    implementation(Deps.lifecycleRuntime)
    implementation(Deps.activityCompose)

    // ViewModel
    implementation(Deps.viewModelCompose)

    // Navigation
    implementation(Deps.navigationCompose)
    implementation(Deps.hiltNavigationCompose)

    // Coroutines
    implementation(Deps.coroutinesCore)
    implementation(Deps.coroutinesAndroid)

    // Dependency Injection
    implementation(Deps.hilt)
    kapt(Deps.hiltAndroidxCompiler)
    kapt(Deps.hiltDaggerAndroidCompiler)

    // Room
    implementation(Deps.roomKtx)
    implementation(Deps.roomRuntime)
    kapt(Deps.roomCompiler)
}
kapt {
    correctErrorTypes = true
}