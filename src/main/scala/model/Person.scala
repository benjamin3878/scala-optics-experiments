package main.scala.model


case class Application(persons: List[Person])

case class Person(first: String, last: String, age: Int, address: Address)

case class Address(street: String, city: String, state: State, zip: Int)