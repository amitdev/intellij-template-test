package com.github.amitdev.intellijtemplatetest.services

import com.github.amitdev.intellijtemplatetest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
