import mill._, scalalib._


object app extends ScalaModule{
  def scalaVersion = "3.3.3"
  def ivyDeps = Agg(
    ivy"com.lihaoyi::cask:0.9.2",
    ivy"com.lihaoyi::scalatags:0.13.1",
  )
  object test extends ScalaTests{

    def testFramework = "utest.runner.Framework"

    def ivyDeps = Agg(
      ivy"com.lihaoyi::utest::0.7.4",
      ivy"com.lihaoyi::requests::0.6.5",
    )
  }
}