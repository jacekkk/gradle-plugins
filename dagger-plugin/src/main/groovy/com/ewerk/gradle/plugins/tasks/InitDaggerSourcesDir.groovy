package com.ewerk.gradle.plugins.tasks

import com.ewerk.gradle.plugins.DaggerPlugin
import org.gradle.api.DefaultTask
import org.gradle.api.logging.Logger
import org.gradle.api.logging.Logging
import org.gradle.api.tasks.TaskAction

/**
 * @author griffio
 */
class InitDaggerSourcesDir extends DefaultTask {

  private static final Logger LOG = Logging.getLogger(InitDaggerSourcesDir.class)

  InitDaggerSourcesDir() {
    this.group = DaggerPlugin.TASK_GROUP
    this.description = "Creates the Dagger sources dir"
  }

  @SuppressWarnings("GroovyUnusedDeclaration")
  @TaskAction
  createSourceFolders() {
    LOG.info("create source")
    def daggerSourcesDir = DaggerPlugin.verifyNotWithinMainBuildSrc(project)
    daggerSourcesDir.mkdirs()
  }
}
