
package com.knoldus.actor

import akka.actor.Actor
import akka.event.Logging
import com.knoldus.app.Tweet

class Worker extends Actor {

  val log = Logging(context.system, this)
  var counter = 0

  def receive: Receive = {

    case buffer: Tweet => {
      counter += 1
      log.info(s"$counter ${buffer.tweetId}")
      sender ! counter
    }
    case _ => {
      log.info("Invalid Message Tweet")
      sender() ! "Invalid Message Tweet"
    }
  }
}
