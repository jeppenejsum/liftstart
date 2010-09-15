import _root_.org.mortbay.jetty.{ Server, Connector }
import _root_.org.mortbay.jetty.webapp.WebAppContext
import org.mortbay.jetty.nio._

object RunWebApp {
  def main(args: Array[String]): Unit = {
    val server = new Server
    val scc = new SelectChannelConnector
    scc.setPort(8080)
    server.setConnectors(Array(scc))

    val context = new WebAppContext()
    context.setServer(server)
    context.setContextPath("/")
    context.setWar("src/main/webapp")

    server.addHandler(context)

    try {
      println(">>> STARTING EMBEDDED JETTY SERVER, PRESS ANY KEY TO STOP")
      server.start()
      while (System.in.available() == 0) {
        Thread.sleep(5000)
      }
      server.stop()
      server.join()
    } catch {
      case exc: Exception => {
        exc.printStackTrace()
        System.exit(100)
      }
    }
  }

}
