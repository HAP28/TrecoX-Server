// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/meetparmar/Desktop/TrecoX-Server/conf/routes
// @DATE:Wed Jul 15 13:35:00 IST 2020


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
