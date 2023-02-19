package com.rflib

import java.util.Date

object RegRegime extends Enumeration {
  type  RegRegime = Value
  val PRA, ECB, FED = Value
}

object Region extends Enumeration {
  type Region = Value // type is a shortcut alias ie when refer to Region really means Value which is the actual enum
  val Global, EMEA, NAM, APAC = Value // Sets all 4 to a Value instance
}


class MarketDataMilestone {
  private val name = new Date() // VT
  private val cob = new Date() // VT
  private val systemTime = new Date() // TT
  private val modelContext = "Official" // or whatif, Think about link to xPVRM?
  private val author = "Fred"
  private val region = Region.Global
  // private var MilestoneType - check rice definition
}
