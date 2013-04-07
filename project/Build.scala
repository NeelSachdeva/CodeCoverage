import sbt._
import Keys._
import PlayProject._
import de.johoop.jacoco4sbt.JacocoPlugin._

object ApplicationBuild extends Build {

  val appName = "CodeCoverage"
  val appVersion = "1.0-SNAPSHOT"
  lazy val jacoco_settings = Defaults.defaultSettings ++ Seq(jacoco.settings: _*)
  val appDependencies = Seq(
    "org.scalatest" %% "scalatest" % "1.9.1" % "test" // Add your project dependencies here,
    )

 
  val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA, settings = jacoco_settings).settings(
    parallelExecution in jacoco.Config := false)

}
