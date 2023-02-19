package com.rflib

import java.util.Date
import scala.collection.immutable.Vector

trait usefulTypes {
  type RiskFactorId = String
  type RiskFactorBucketId = String
}

object AssetClass extends Enumeration {
  type AssetClass = Value
  val FX, IR, Credit, Equities, Commodities = Value
}
object RiskFactorStatus extends Enumeration {
  type RiskFactorStatus = Value
  val Live, Cancelled, Deleted, Whatif = Value
}

object RiskType extends Enumeration {
  type RiskType = Value
  val Quote, ModelParameter = Value
}

object RiskFactorBucketDimension extends Enumeration {
  type RiskFactorBucketDimension = Value
  val Term, Strike = Value
}

object FullOnlyOrReducedOrNone extends Enumeration {
  type FullOnlyOrReducedOrNone = Value
  val FullOnly, Reduced, None = Value
}

// What is the list of enumerations?
// Add new comment as link to issue for a test
object MarketFactorType extends Enumeration {
  type MarketFactorType = Value
  val YieldCurve, VolSurface = Value
}

class RiskFactor extends usefulTypes {
    private val   id =  ""
    private val   displayeName = ""
    private val   assetClass = AssetClass.FX
    private val   description = ""
    // Use market factor type and not risk factor type
    private val   marketFactorType = MarketFactorType.YieldCurve // MRD say they don't want to see link to a market factor eg curve, just to a bucket
    private val   rType = RiskType.Quote
    private val   isProxy = false
    private val   isModelled = false
    private val   isPricingRiskFactor = true
    private val   status = RiskFactorStatus.Live
    private val   timeSeriesRef = "http://hdsjkhkjdkjahs" // MRD say this isn't part of the library but we do needs a governed map from Rf to its TS
    // Add more properties as qualified by market factor/risk factor type
}


class RiskFactorBucket extends usefulTypes {
    private val id = ""
    private val description = ""
    private val marketFactorType = MarketFactorType.YieldCurve // In effect links bucket to curve group. With this no need to have property bag
    private val startCoordinate =""
    private val endCoordinate = ""
    private val dimension = RiskFactorBucketDimension.Term
}

class RealPriceObservation {
  private val Id = ""
  private val Description = ""
  private val Type = "" // TODO needs to be enum eg quote, execution price etc
  private val ms = new MarketDataMilestone
  private val MarketValue = 0d
  private val Source = ""
}

// Is this name right if we combine RFET modelability flag with other flags? Note keep diagnostics separate to flags to keep concise
class ModelabilityResult {
    private val ModelContext = "Official" // or whatif, Think about link to xPVRM?
    private val Author = "Fred"
    private val isNMRF = true
    private val isFullOnlyOrReduced = FullOnlyOrReducedOrNone.None
    private val isFRTBRf = true // Better to define this flag as a result ie different Pr Rfs will over time be an FRBT Rf or not
}

class RiskFactorSet extends usefulTypes {
    private val Id = ""
    private val Description = ""
    private val riskFactorIds = Vector("656574","jjfjfj")
    private val Scenario = ""
}

class LiquidityHorizon {
  private val EndDate = new Date()
  private val regRegime = RegRegime.FED
}

