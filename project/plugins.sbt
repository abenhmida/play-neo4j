// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers ++= Seq(
  "tinkerprop" at "http://tinkerpop.com/maven2",
  "Neo4j-contrib-release2" at "https://raw.github.com/neo4j-contrib/m2/master/releases/",
  "Neo4j Cypher DSL Repository2" at "http://m2.neo4j.org/content/repositories/releases",
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Spring-releases" at "https://repo.spring.io/libs-release/"
)

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.0")
