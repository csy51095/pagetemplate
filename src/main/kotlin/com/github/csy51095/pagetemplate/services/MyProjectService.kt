package com.github.csy51095.pagetemplate.services

import com.github.csy51095.pagetemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
