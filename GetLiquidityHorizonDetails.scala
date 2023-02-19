package com.rflib

import scala.collection.Seq
trait GetLiquidityHorizonDetails extends usefulTypes {
  def Get(LiquidityHorizonIds: Seq[String], snap: MarketDataMilestone, LegalEntities: Seq[String]): Seq[LiquidityHorizon] // Returns sequence of risk factors based on their ids

    def getMappings(riskFactors: Seq[RiskFactorId], snap: MarketDataMilestone, reg: Seq[String]): Map[String, Map[java.util.Date, Seq[RiskFactorId]]]

    // Returns a map of reg regime qualified LHs (by date and their linked risk factors
}
