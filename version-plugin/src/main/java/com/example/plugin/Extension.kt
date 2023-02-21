package com.example.plugin

import org.gradle.kotlin.dsl.DependencyHandlerScope

/**
 * @ClassName Extension.java
 * @author usopp
 * @version 1.0.0
 * @Description TODO
 * @createTime 2023年02月20日 17:05:00
 */


fun DependencyHandlerScope.kotlinProject() {
    "implementation"(Libraries.coreKtx)
}


fun DependencyHandlerScope.androidProject() {
    "implementation"(Libraries.lifecycle)
}

fun DependencyHandlerScope.composeProject() {
    "implementation"(Libraries.activityCompose)
    "implementation"(Libraries.composeUi)
    "implementation"(Libraries.composePreview)
    "implementation"(Libraries.composeMaterial3)
}

fun DependencyHandlerScope.androidTest() {
    "testImplementation"(Libraries.junit)
    "androidTestImplementation"(Libraries.androidxJunit)
    "androidTestImplementation"(Libraries.espresso)
    "androidTestImplementation"(Libraries.uiTestJunit4)
    "debugImplementation"(Libraries.uiTooling)
    "debugImplementation"(Libraries.uiTestManifest)
}