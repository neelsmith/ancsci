

scalaVersion := "2.12.3"
resolvers += Resolver.jcenterRepo
resolvers += Resolver.bintrayRepo("neelsmith","maven")
libraryDependencies ++=   Seq(
 "edu.holycross.shot"  %% "coursecal" % "2.0.0"
)
