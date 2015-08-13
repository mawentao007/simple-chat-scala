/**
 * Created by marvin on 15-8-13.
 */
import java.net._
import java.io._
import scala.io._

class SimpleChatClient {
  while(true) {
    val s = new Socket(InetAddress.getByName("localhost"), 9999)
    lazy val in = new BufferedSource(s.getInputStream()).getLines()
    val out = new PrintStream(s.getOutputStream())

    val ln = io.Source.stdin.getLines.next()

    out.println(ln)

    out.flush()
    println(in.next())

    s.close()
  }

}

object SimpleChatClient{
  def main(args:Array[String]): Unit ={
    val client = new SimpleChatClient
  }
}
