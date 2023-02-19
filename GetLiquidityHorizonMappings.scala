package com.rflib

import java.util.Date
import scala.collection.Map

trait GetLiquidityHorizonMappings {
  def GetMappings(riskFactors: Seq[RiskFactor], snap: MarketDataMilestone): Map[java.util.Date, Seq[RiskFactor]] // Returns a map of requested risk factors to their liquidity horizons, CHECK no LE qualifier?
}
