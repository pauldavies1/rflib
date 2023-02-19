package com.rflib

import com.rflib.RegRegime.RegRegime

import scala.collection.Map

// TODO change from RiskFactor to RiskFactor.Id

trait RFETResults extends usefulTypes {
    // Bulk return results by RF

    def getByRiskFactors(riskfactors: Seq[RiskFactorId], snap: MarketDataMilestone, reg: Seq[RegRegime]): Map[RiskFactorId, Map[RegRegime, ModelabilityResult]]

  // Individual buckets or risk factors
  def GetByBucket(bucket: RiskFactorBucketId, snap: MarketDataMilestone, LegalEntity: RegRegime): Map[RiskFactor, (Boolean, Boolean)] // Returns map of risk factors to pair of NMRF + FullOrReduced Flag
  def GetByRiskFactor(riskfactor: RiskFactor, snap: MarketDataMilestone, LegalEntity: RegRegime): (Boolean, Boolean)  // Returns pair of NMRF, FullOrReduced flag for a specific risk factor

  // Bulk return results
  def GetByBuckets(buckets: Seq[RiskFactorBucket], snap: MarketDataMilestone, LegalEntities: Seq[RegRegime]): Map[RegRegime, Map[RiskFactor, (Boolean, Boolean)]] // Returns a map of legal entities to their in scope risk factors/nmrf flags
  def GetByRiskFactors(riskfactor: Seq[RiskFactor], snap: MarketDataMilestone, LegalEntity: Seq[RegRegime]): Map[RiskFactor, (Boolean, Boolean)]  // Returns a map of legal entities to their in scope risk factors/nmrf flags

  // Add RiskFactor.Properties filter
}
