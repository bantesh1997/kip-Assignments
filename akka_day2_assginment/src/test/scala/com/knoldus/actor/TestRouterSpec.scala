package com.knoldus.actor

import akka.actor.{ActorSystem, Props, Terminated}
import akka.testkit.{ImplicitSender, TestKit}
import com.knoldus.app.Tweet
import org.scalatest.{BeforeAndAfterAll, WordSpecLike}

class TestRouterSpec extends TestKit(ActorSystem("WorkerActorSpec")) with ImplicitSender with WordSpecLike with BeforeAndAfterAll{

  override def afterAll(): Unit = {
    TestKit.shutdownActorSystem(system)
  }

  "A Test Router" must {

    val test = system.actorOf(Props[TestRouter])

    "Router testing for list of tweets." in {
      test ! List(Tweet("277c2a05-a9df-464d-bf81-68e813e5b62f", -543279, 8815, "ਸ਼䕧붝뚖校쎝黽⪀揵萑", "India", 1579))

      expectMsg("successfull")
    }

    "checks the Termination of any routee for router testing" in {
      val routee1 = system.actorOf(Props[Worker])
      routee1 ! Terminated(routee1)(false, true)
      expectNoMessage()
    }
  }

}