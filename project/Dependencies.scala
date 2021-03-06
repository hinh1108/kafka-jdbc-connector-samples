import sbt._

object Dependencies {
  private val KafkaV     = "0.9.0.0"
  private val ScalaTestV = "3.0.1"

  private val Logback             = "ch.qos.logback"                  % "logback-classic"       % "1.2.1"
  private val ScalaLogging        = "com.typesafe.scala-logging"     %% "scala-logging"         % "3.5.0"
  private val KafkaJdbcConnector  = "com.agoda"                      %% "kafka-jdbc-connector"  % "1.2.0"
  private val AkkaActor           = "com.typesafe.akka"              %% "akka-actor"            % "2.4.17"
  private val KafkaConnectRuntime = "org.apache.kafka"                % "connect-runtime"       % KafkaV
  private val KafkaConnectJson    = "org.apache.kafka"                % "connect-json"          % KafkaV
  private val Scalatics           = "org.scalactic"                  %% "scalactic"             % ScalaTestV   % "test"
  private val ScalaTest           = "org.scalatest"                  %% "scalatest"             % ScalaTestV   % "test"
  private val ReactiveKafka       = "com.softwaremill.reactivekafka" %% "reactive-kafka-core"   % "0.10.0"     % "test"
  private val ScalaJHttp          = "org.scalaj"                     %% "scalaj-http"           % "2.3.0"      % "test"
  private val MysqlDriver         = "mysql"                           % "mysql-connector-java"  % "6.0.6"
  private val MssqlDriver         = "com.microsoft.sqlserver"         % "mssql-jdbc"            % "6.1.0.jre8"

  object Compile {
    def kafkaConnect = Seq(
      Logback, ScalaLogging, KafkaJdbcConnector, AkkaActor, KafkaConnectRuntime,
      KafkaConnectJson, MysqlDriver, MssqlDriver
    )
  }

  object Test {
    def functional = Seq(
      Logback, ScalaLogging, Scalatics, ScalaTest, MysqlDriver, MssqlDriver,
      ScalaJHttp, ReactiveKafka
    )
  }
}
