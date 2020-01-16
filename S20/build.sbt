

scalaVersion := "2.12.3"
resolvers += Resolver.jcenterRepo
resolvers += Resolver.bintrayRepo("neelsmith","maven")
libraryDependencies ++=   Seq(
 "edu.holycross.shot"  %% "coursecal" % "1.2.6"
)
