import java.util.*
import java.security.*

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

val rootExtra = rootProject.extra

val gCompileSdkVersion: Int by rootExtra
val gBuildToolsVersion: String by rootExtra

val gMinSdkVersion: Int by rootExtra
val gTargetSdkVersion: Int by rootExtra

val gVersionCode: Int by rootExtra
val gVersionName: String by rootExtra

val gKotlinVersion: String by rootExtra
val gKotlinCoroutineVersion: String by rootExtra
val gAndroidKtxVersion: String by rootExtra
val gKotlinSerializationVersion: String by rootExtra

android {
    compileSdkVersion(gCompileSdkVersion)
    buildToolsVersion(gBuildToolsVersion)

    defaultConfig {
        applicationId = "com.clash.design"

        minSdkVersion(gMinSdkVersion)
        targetSdkVersion(gTargetSdkVersion)

        versionCode = gVersionCode
        versionName = gVersionName
    }

    buildTypes {
        maybeCreate("release").apply {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

}

dependencies {
    implementation(project(":design"))
}
