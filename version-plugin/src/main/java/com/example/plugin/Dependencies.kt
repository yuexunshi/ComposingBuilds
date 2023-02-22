package com.example.plugin

/**
 * @ClassName Dependencies.java
 * @author usopp
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年11月07日 11:15:00
 */


object Versions {
    const val composeUi = "1.3.1"
    const val composeVersion = "1.2.0"
    const val kotlin = "1.8.0"
    const val lifecycle = "2.5.1"
    const val activityCompose = "1.5.1"
    const val composeMaterial3 = "1.0.0-alpha11"
    const val junit = "4.13.2"
    const val androidxJunit = "1.1.3"
    const val espresso = "3.4.0"
    const val kotlinCompilerExtensionVersion = "1.1.1"
}

object Libraries {
//    依赖库
    const val coreKtx = "androidx.core:core-ktx:${Versions.kotlin}"
    const val lifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    const val activityCompose = "androidx.activity:activity-compose:${Versions.activityCompose}"
    const val composeUi = "androidx.compose.ui:ui:${Versions.composeUi}"
    const val composePreview = "androidx.compose.ui:ui-tooling-preview:${Versions.composeVersion}"
    const val composeMaterial3 = "androidx.compose.material3:material3:${Versions.composeMaterial3}"
//    测试库
    const val junit = "junit:junit:${Versions.junit}"
    const val androidxJunit = "androidx.test.ext:junit:${Versions.androidxJunit}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4:${Versions.composeVersion}"
    const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.composeVersion}"
    const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:${Versions.composeVersion}"

}