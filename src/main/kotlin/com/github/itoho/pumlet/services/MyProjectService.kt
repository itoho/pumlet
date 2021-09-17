package com.github.itoho.pumlet.services

import com.intellij.openapi.project.Project
import com.github.itoho.pumlet.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
