/**
 * Created by marvin on 15-8-13.
 */
import java.net._
import java.io._
import scala.io._

class SimpleChatServer {

  val server = new ServerSocket(9999)
  while (true) {
    val s = server.accept()
    val in = new BufferedSource(s.getInputStream()).getLines()
    val out = new PrintStream(s.getOutputStream())

    println(in.next())

    out.println(io.Source.stdin.getLines().next())
    out.flush()
    s.close()
  }

}

object SimpleChatServer{
  def main(args:Array[String]) {
    val server = new SimpleChatServer
  }
}
