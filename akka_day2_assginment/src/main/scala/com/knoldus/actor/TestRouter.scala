
package com.knoldus.actor

import akka.actor.{Actor, Props, Terminated}
import akka.routing.{ActorRefRoutee, RoundRobinRoutingLogic, Router}
import com.knoldus.app.Tweet

class TestRouter extends Actor {
  var router = {
    val routees = Vector.fill(2) {
      val routee = context.actorOf(Props[Worker].withDispatcher("prio-dispatcher"))
      context watch routee
      ActorRefRoutee(routee)
    }
    Router(RoundRobinRoutingLogic(), routees)
  }

  def receive: Receive = {
    case buffer: List[Tweet]=> {
      for (i <- buffer)
        router.route(i, sender())
      sender ! "successfull"
    }

    case Terminated(a) =>
      router = router.removeRoutee(a)
      val routee = context.actorOf(Props[Worker])
      context watch routee
      router = router.addRoutee(routee)
  }

}

