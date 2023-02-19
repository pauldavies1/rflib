package com.rflib

import scala.collection.Map

trait RFETDiagnostics {
  // Individual buckets or risk factors
  def GetByBucket(bucket: RiskFactorBucket, snap: MarketDataMilestone, LegalEntity: String): Map[RiskFactor, Seq[RealPriceObservation]] // Returns map of risk factors to RPOs
  def GetByRiskFactor(riskFactor: RiskFactor, snap: MarketDataMilestone, LegalEntity: String): Seq[RealPriceObservation]

  // Bulk return results
  def GetByBuckets(buckets: Seq[RiskFactorBucket], snap: MarketDataMilestone, LegalEntities: Seq[String]): Map[RiskFactor, Seq[RealPriceObservation]] // Returns map of risk factors to RPOs - ignore LE mapping for now, else expand to Map[String, Map[RiskFactor, Seq[RealPriceObservation]]]
  def GetByRiskFactors(riskFactors: Seq[RiskFactor], snap: MarketDataMilestone, LegalEntity: Seq[String]): Map[RiskFactor, Seq[RealPriceObservation]] // Returns a map of legal entities to their in scope risk factors/nmrf flags

  // Add RiskFactor.Properties filter
  // PR / branch test in 1-dummy-issue
}

