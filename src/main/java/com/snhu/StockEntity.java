package snhu;

public class StockEntity {

	private String ticker;
	private float profitMargin;
	private float institutionalOwnership;
	private float epsGrowth;
	private float totalDebtEquity;
	private int currentRatio;
	private float returnOnAssets;
	private String sector;
	private float pS;
	private float ChangeFromOpen;
	private float performanceYTD;
	private float performanceWeek;
	private float quickRatio;
	private float insiderTransactions;
	private float pB;
	private float epsGrowthQuarterOverQuarter;
	private float payoutRatio;
	private float performanceQuarter;
	private float forwaredPE;
	private float pE;
	private float twoHundredDaySimpleMovingAverage;
	private int sharesOutstanding;
	private String earningsDate;
	private float fiftyTwoWeekHigh;
	private float pCash;
	private float change;
	private float analystRecom;
	private float volatilityWeek;
	private String country;
	private float returnOnEquity;
	private float fiftyDayLow;
	private float price;
	private float fiftyDayHigh;
	private float returnOnInvestment;
	private float sharesFloat;
	private float dividendYield;
	private float epsGrowthNextFiveYears;
	private String industry;
	private float beta;
	private float salesGrowthQuarterOverQuarter;
	private float operatingmargin;
	private float ePSTTM;
	private float pEG;
	private float floatShort;
	private float fiftyTwoWeekLow;
	private float averageTrueRange;
	private float ePSGrowthNextyear;
	private float salesGrowthPastFiveYears;
	private String company;
	private float gap;
	private float relativeVolume;
	private float volatilityMonth;
	private float marketCap;
	private float volume;
	private float grossMargin;
	private float shortRatio;
	private float performanceHalfYear;
	private float relativeStrengthIndexFourteen;
	private float insiderOwnership;
	private float twentyDaySimpleMovingAverage;
	private float performanceMonth;
	private float pFreeCashFlow;
	private float institutionalTransactions;
	private float performanceYear;
	private float lTDebtEquity;
	private float averageVolume;
	private float ePSGrowthThisYear;
	private float fiftyDaySimpleMovingAverage;
	
	
	
	public StockEntity(String ticker)
	{
		this.ticker = ticker;
	}
	
	public StockEntity() {}	
	
	/*
	 * Getters and Setters
	 * 
	 */
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	
	public String getTicker() {
		return this.ticker;
	}

	public float getProfitMargin() {
		return profitMargin;
	}

	public void setProfitMargin(float profitMargin) {
		this.profitMargin = profitMargin;
	}

	public float getInstitutionalOwnership() {
		return institutionalOwnership;
	}

	public void setInstitutionalOwnership(float institutionalOwnership) {
		this.institutionalOwnership = institutionalOwnership;
	}

	public float getEpsGrowth() {
		return epsGrowth;
	}

	public void setEpsGrowth(float epsGrowth) {
		this.epsGrowth = epsGrowth;
	}

	public float getTotalDebtEquity() {
		return totalDebtEquity;
	}

	public void setTotalDebtEquity(float totalDebtEquity) {
		this.totalDebtEquity = totalDebtEquity;
	}

	public int getCurrentRatio() {
		return currentRatio;
	}

	public void setCurrentRatio(int currentRatio) {
		this.currentRatio = currentRatio;
	}

	public float getReturnOnAssets() {
		return returnOnAssets;
	}

	public void setReturnOnAssets(float returnOnAssets) {
		this.returnOnAssets = returnOnAssets;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public float getpS() {
		return pS;
	}

	public void setpS(float pS) {
		this.pS = pS;
	}

	public float getChangeFromOpen() {
		return ChangeFromOpen;
	}

	public void setChangeFromOpen(float changeFromOpen) {
		ChangeFromOpen = changeFromOpen;
	}

	public float getPerformanceYTD() {
		return performanceYTD;
	}

	public void setPerformanceYTD(float performanceYTD) {
		this.performanceYTD = performanceYTD;
	}

	public float getPerformanceWeek() {
		return performanceWeek;
	}

	public void setPerformanceWeek(float performanceWeek) {
		this.performanceWeek = performanceWeek;
	}

	public float getQuickRatio() {
		return quickRatio;
	}

	public void setQuickRatio(float quickRatio) {
		this.quickRatio = quickRatio;
	}

	public float getInsiderTransactions() {
		return insiderTransactions;
	}

	public void setInsiderTransactions(float insiderTransactions) {
		this.insiderTransactions = insiderTransactions;
	}

	public float getpB() {
		return pB;
	}

	public void setpB(float pB) {
		this.pB = pB;
	}

	public float getEpsGrowthQuarterOverQuarter() {
		return epsGrowthQuarterOverQuarter;
	}

	public void setEpsGrowthQuarterOverQuarter(float epsGrowthQuarterOverQuarter) {
		this.epsGrowthQuarterOverQuarter = epsGrowthQuarterOverQuarter;
	}

	public float getPayoutRatio() {
		return payoutRatio;
	}

	public void setPayoutRatio(float payoutRatio) {
		this.payoutRatio = payoutRatio;
	}

	public float getPerformanceQuarter() {
		return performanceQuarter;
	}

	public void setPerformanceQuarter(float performanceQuarter) {
		this.performanceQuarter = performanceQuarter;
	}

	public float getForwaredPE() {
		return forwaredPE;
	}

	public void setForwaredPE(float forwaredPE) {
		this.forwaredPE = forwaredPE;
	}

	public float getpE() {
		return pE;
	}

	public void setpE(float pE) {
		this.pE = pE;
	}

	public float getTwoHundredDaySimpleMovingAverage() {
		return twoHundredDaySimpleMovingAverage;
	}

	public void setTwoHundredDaySimpleMovingAverage(float twoHundredDaySimpleMovingAverage) {
		this.twoHundredDaySimpleMovingAverage = twoHundredDaySimpleMovingAverage;
	}

	public int getSharesOutstanding() {
		return sharesOutstanding;
	}

	public void setSharesOutstanding(int sharesOutstanding) {
		this.sharesOutstanding = sharesOutstanding;
	}

	public String getEarningsDate() {
		return earningsDate;
	}

	public void setEarningsDate(String earningsDate) {
		this.earningsDate = earningsDate;
	}

	public float getFiftyTwoWeekHigh() {
		return fiftyTwoWeekHigh;
	}

	public void setFiftyTwoWeekHigh(float fiftyTwoWeekHigh) {
		this.fiftyTwoWeekHigh = fiftyTwoWeekHigh;
	}

	public float getpCash() {
		return pCash;
	}

	public void setpCash(float pCash) {
		this.pCash = pCash;
	}

	public float getChange() {
		return change;
	}

	public void setChange(float change) {
		this.change = change;
	}

	public float getAnalystRecom() {
		return analystRecom;
	}

	public void setAnalystRecom(float analystRecom) {
		this.analystRecom = analystRecom;
	}

	public float getVolatilityWeek() {
		return volatilityWeek;
	}

	public void setVolatilityWeek(float volatilityWeek) {
		this.volatilityWeek = volatilityWeek;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public float getReturnOnEquity() {
		return returnOnEquity;
	}

	public void setReturnOnEquity(float returnOnEquity) {
		this.returnOnEquity = returnOnEquity;
	}

	public float getFiftyDayLow() {
		return fiftyDayLow;
	}

	public void setFiftyDayLow(float fiftyDayLow) {
		this.fiftyDayLow = fiftyDayLow;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getFiftyDayHigh() {
		return fiftyDayHigh;
	}

	public void setFiftyDayHigh(float fiftyDayHigh) {
		this.fiftyDayHigh = fiftyDayHigh;
	}

	public float getReturnOnInvestment() {
		return returnOnInvestment;
	}

	public void setReturnOnInvestment(float returnOnInvestment) {
		this.returnOnInvestment = returnOnInvestment;
	}

	public float getSharesFloat() {
		return sharesFloat;
	}

	public void setSharesFloat(float sharesFloat) {
		this.sharesFloat = sharesFloat;
	}

	public float getDividendYield() {
		return dividendYield;
	}

	public void setDividendYield(float dividendYield) {
		this.dividendYield = dividendYield;
	}

	public float getEpsGrowthNextFiveYears() {
		return epsGrowthNextFiveYears;
	}

	public void setEpsGrowthNextFiveYears(float epsGrowthNextFiveYears) {
		this.epsGrowthNextFiveYears = epsGrowthNextFiveYears;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public float getBeta() {
		return beta;
	}

	public void setBeta(float beta) {
		this.beta = beta;
	}

	public float getSalesGrowthQuarterOverQuarter() {
		return salesGrowthQuarterOverQuarter;
	}

	public void setSalesGrowthQuarterOverQuarter(float salesGrowthQuarterOverQuarter) {
		this.salesGrowthQuarterOverQuarter = salesGrowthQuarterOverQuarter;
	}

	public float getOperatingmargin() {
		return operatingmargin;
	}

	public void setOperatingmargin(float operatingmargin) {
		this.operatingmargin = operatingmargin;
	}

	public float getePSTTM() {
		return ePSTTM;
	}

	public void setePSTTM(float ePSTTM) {
		this.ePSTTM = ePSTTM;
	}

	public float getpEG() {
		return pEG;
	}

	public void setpEG(float pEG) {
		this.pEG = pEG;
	}

	public float getFloatShort() {
		return floatShort;
	}

	public void setFloatShort(float floatShort) {
		this.floatShort = floatShort;
	}

	public float getFiftyTwoWeekLow() {
		return fiftyTwoWeekLow;
	}

	public void setFiftyTwoWeekLow(float fiftyTwoWeekLow) {
		this.fiftyTwoWeekLow = fiftyTwoWeekLow;
	}

	public float getAverageTrueRange() {
		return averageTrueRange;
	}

	public void setAverageTrueRange(float averageTrueRange) {
		this.averageTrueRange = averageTrueRange;
	}

	public float getePSGrowthNextyear() {
		return ePSGrowthNextyear;
	}

	public void setePSGrowthNextyear(float ePSGrowthNextyear) {
		this.ePSGrowthNextyear = ePSGrowthNextyear;
	}

	public float getSalesGrowthPastFiveYears() {
		return salesGrowthPastFiveYears;
	}

	public void setSalesGrowthPastFiveYears(float salesGrowthPastFiveYears) {
		this.salesGrowthPastFiveYears = salesGrowthPastFiveYears;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public float getGap() {
		return gap;
	}

	public void setGap(float gap) {
		this.gap = gap;
	}

	public float getRelativeVolume() {
		return relativeVolume;
	}

	public void setRelativeVolume(float relativeVolume) {
		this.relativeVolume = relativeVolume;
	}

	public float getVolatilityMonth() {
		return volatilityMonth;
	}

	public void setVolatilityMonth(float volatilityMonth) {
		this.volatilityMonth = volatilityMonth;
	}

	public float getMarketCap() {
		return marketCap;
	}

	public void setMarketCap(float marketCap) {
		this.marketCap = marketCap;
	}

	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

	public float getGrossMargin() {
		return grossMargin;
	}

	public void setGrossMargin(float grossMargin) {
		this.grossMargin = grossMargin;
	}

	public float getShortRatio() {
		return shortRatio;
	}

	public void setShortRatio(float shortRatio) {
		this.shortRatio = shortRatio;
	}

	public float getPerformanceHalfYear() {
		return performanceHalfYear;
	}

	public void setPerformanceHalfYear(float performanceHalfYear) {
		this.performanceHalfYear = performanceHalfYear;
	}

	public float getRelativeStrengthIndexFourteen() {
		return relativeStrengthIndexFourteen;
	}

	public void setRelativeStrengthIndexFourteen(float relativeStrengthIndexFourteen) {
		this.relativeStrengthIndexFourteen = relativeStrengthIndexFourteen;
	}

	public float getInsiderOwnership() {
		return insiderOwnership;
	}

	public void setInsiderOwnership(float insiderOwnership) {
		this.insiderOwnership = insiderOwnership;
	}

	public float getTwentyDaySimpleMovingAverage() {
		return twentyDaySimpleMovingAverage;
	}

	public void setTwentyDaySimpleMovingAverage(float twentyDaySimpleMovingAverage) {
		this.twentyDaySimpleMovingAverage = twentyDaySimpleMovingAverage;
	}

	public float getPerformanceMonth() {
		return performanceMonth;
	}

	public void setPerformanceMonth(float performanceMonth) {
		this.performanceMonth = performanceMonth;
	}

	public float getpFreeCashFlow() {
		return pFreeCashFlow;
	}

	public void setpFreeCashFlow(float pFreeCashFlow) {
		this.pFreeCashFlow = pFreeCashFlow;
	}

	public float getInstitutionalTransactions() {
		return institutionalTransactions;
	}

	public void setInstitutionalTransactions(float institutionalTransactions) {
		this.institutionalTransactions = institutionalTransactions;
	}

	public float getPerformanceYear() {
		return performanceYear;
	}

	public void setPerformanceYear(float performanceYear) {
		this.performanceYear = performanceYear;
	}

	public float getlTDebtEquity() {
		return lTDebtEquity;
	}

	public void setlTDebtEquity(float lTDebtEquity) {
		this.lTDebtEquity = lTDebtEquity;
	}

	public float getAverageVolume() {
		return averageVolume;
	}

	public void setAverageVolume(float averageVolume) {
		this.averageVolume = averageVolume;
	}

	public float getePSGrowthThisYear() {
		return ePSGrowthThisYear;
	}

	public void setePSGrowthThisYear(float ePSGrowthThisYear) {
		this.ePSGrowthThisYear = ePSGrowthThisYear;
	}

	public float getFiftyDaySimpleMovingAverage() {
		return fiftyDaySimpleMovingAverage;
	}

	public void setFiftyDaySimpleMovingAverage(float fiftyDaySimpleMovingAverage) {
		this.fiftyDaySimpleMovingAverage = fiftyDaySimpleMovingAverage;
	}
	
}
