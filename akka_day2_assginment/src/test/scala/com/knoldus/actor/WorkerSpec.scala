package com.knoldus.actor

import akka.actor.{ActorSystem, Props}
import akka.testkit.{ImplicitSender, TestKit}
import com.knoldus.app.Tweet
import org.scalatest.{BeforeAndAfterAll, WordSpecLike}

class WorkerActorSpec extends TestKit(ActorSystem("WorkerActorSpec")) with ImplicitSender with WordSpecLike with BeforeAndAfterAll{

  override def afterAll(): Unit ={
    TestKit.shutdownActorSystem(system)
  }

  "A Worker actor" must {

    val test = system.actorOf(Props[Worker])

    "prints message as a tweet for worker" in {
      test ! Tweet("277c2a05-a9df-464d-bf81-68e813e5b62f", -543279, 8815, "ਸ਼䕧붝뚖校쎝黽⪀揵萑", "India", 1579)

      expectMsg(1)
    }

    "return invalid message for worker ." in {
      test ! ""
      expectMsg("Invalid Message Tweet")
    }
  }
}