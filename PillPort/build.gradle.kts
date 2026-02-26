// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
//    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    id("com.google.devtools.ksp") version "2.3.4" apply false
    id("com.google.dagger.hilt.android") version "2.59.2" apply false
//    id("com.google.gms.google-services") version "4.4.3" apply false
    id("org.jetbrains.kotlin.plugin.serialization") version "2.3.10" apply false

}
val defaultTargetSdkVersion by extra(35)
val buildToolsVersion by extra("35.0.0")
val buildToolsVersion1 by extra(buildToolsVersion)
val defaultTargetSdkVersion1 by extra(36)
