package io.github.iamyours.transform;

import org.gradle.api.Plugin
import org.gradle.api.Project

class RouterPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println "=========自定义路由插件5555========="
//        project.android.registerTransform(new RouterTransform(project))
    }
}