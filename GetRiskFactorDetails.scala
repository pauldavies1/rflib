package com.rflib

import scala.collection.Seq

trait RiskFactorDetails {
  // Individual buckets or risk factors
  def getRiskFactors(riskFactorSet: RiskFactorSet, snap: MarketDataMilestone): Seq[RiskFactor]

  // Add RiskFactor.Properties filter
}
