name := "bookingbug-sdk"

version := "1.0"

lazy val `bookingbug-sdk` = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq( javaJdbc , javaEbean , cache , javaWs )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  