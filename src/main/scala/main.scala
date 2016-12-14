import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

object main extends App
{
    println("== start ==")
    val logger:Logger = LogManager.getLogger
    logger.error("this is a log")
    println("== end ==")
}
