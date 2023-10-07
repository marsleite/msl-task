plugins {
  kotlin("jvm") version "1.8.22"
  id("java-test-fixtures")
}

apply(plugin = "project-report")

tasks {
  jar { enabled = true }
  bootJar { enabled = false }
}