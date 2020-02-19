// @GENERATOR:play-routes-compiler
// @SOURCE:/home/trevor/Desktop/playProjects/conf/routes
// @DATE:Sat Jan 18 13:12:23 EAT 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
