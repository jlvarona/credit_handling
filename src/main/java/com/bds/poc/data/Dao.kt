package com.bds.poc.data

import java.util.*

/**
 * Created by Jorge Varona on 5/24/2017.
 */
data class CreditCard(val number:String,
                      val exipirationDate: Date,
                      val nameOnCard: String)

data class Client(val id: Long,
                  val firstName:String,
                  val lastName: String,
                  val address1: String,
                  val address2: String,
                  val city:String,
                  val state: String,
                  val country: String,
                  val zipCode: String)

data class Transaction(val card:CreditCard,
                    val client: Client,
                    val transactionId: Long,
                    val amount: Long,
                    val date: Date)