import BuildProperties._

name := projectNameProperty

version := propertyOption("project.version").getOrElse("1.0")

scalaVersion := "2.10.3"
