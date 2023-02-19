package com.rflib

import scala.collection.Seq

trait RiskFactorBuckets extends usefulTypes {
  // Individual buckets or risk factors
  def getBucketDetails(riskFactorBucketIds: Seq[RiskFactorBucketId], snap: MarketDataMilestone, reg: Seq[String]): Seq[RiskFactorBucket]

  // Returns sequence of risk factors based on their ids


  def getRiskFactorMappings(riskFactorBucketIds: Seq[RiskFactorBucketId], snap: MarketDataMilestone, reg: Seq[String]): Seq[RiskFactorId]

  // Returns sequence of risk factor ids based on their linked bucket ids, Pr or FRTB or all ?

}
