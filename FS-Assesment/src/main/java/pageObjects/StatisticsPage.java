package pageObjects;

public class StatisticsPage {
	public String statisticsRow = "//div[@class=\"statisticDetailRow\"]";
	public String statisticsTotalFundedHeading = "//div[@class=\"statisticDetailRow\"]//child::div[@class=\"detailNumber text-center\"][1]//child::div";
	public String statisticsTotalFundedValue = "//div[@class=\"statisticDetailRow\"]//child::div[@class=\"detailNumber text-center\"][1]//child::font";
	public String statisticsNoOfFinanceHeading = "//div[@class=\"statisticDetailRow\"]//child::div[@class=\"detailNumber text-center\"][2]//child::div";
	public String statisticsNoOfFinanceValue = "//div[@class=\"statisticDetailRow\"]//child::div[@class=\"detailNumber text-center\"][2]//child::font";
	public String statisticsDefaultRateHeading = "//div[@class=\"statisticDetailRow\"]//child::div[@class=\"detailNumber text-center\"][3]//child::div";
	public String statisticsDefaultRateValue = "//div[@class=\"statisticDetailRow\"]//child::div[@class=\"detailNumber text-center\"][3]//child::font";
	public String statisticsRateHeading = "//div[@class=\"statisticDetailRow\"]//child::div[@class=\"detailNumber text-center\"][4]//child::div";
	public String statisticsRateValue = "//div[@class=\"statisticDetailRow\"]//child::div[@class=\"detailNumber text-center\"][4]//child::font";
	
	public String tabGeneral = "//button[@class=\"tab-button -progress\" or @class=\"tab-button -progress white\"][contains(text(),'General')]";
	public String graphMarker = ".highcharts-root:nth-of-type(1)>g:nth-of-type(5)>g:nth-of-type(2)>path:last-of-type";
	public String Year = ".highcharts-root:nth-of-type(1)>g:nth-of-type(8)>text>tspan:nth-of-type(1)";
	public String amountPopup = ".highcharts-root:nth-of-type(1)>g:nth-of-type(8)>text>tspan:nth-of-type(4)";
	public String amountDisbursed = "//label[@for='toggle-disbursed']";
	public String defaultRate = "//label[@for='toggle-default']";
	public String totalApproved = "//label[@for='toggle-approved']";
	
	public String tabRepayment = "//button[@class=\"tab-button -progress\" or @class=\"tab-button -progress white\"][contains(text(),'Repayment')]";
	public String totalRepayment = ".highcharts-root:nth-of-type(1)>g:nth-of-type(5)>g:nth-of-type(1)>rect";
	public String princple = ".margin-top-15:nth-of-type(2)>div>div>svg>g:nth-of-type(5)>g:nth-of-type(3)>rect";
	public String interest = ".highcharts-root:nth-of-type(1)>g:nth-of-type(5)>g:nth-of-type(5)>rect";
	public String repaymentPopupValue = ".highcharts-root:nth-of-type(1)>g:nth-of-type(9)>text>tspan:nth-of-type(4)";
	public String repaymentPopupHeading = ".highcharts-root:nth-of-type(1)>g:nth-of-type(9)>text";
	
	public String tabDisbursement = "//button[@class=\"tab-button -progress\" or @class=\"tab-button -progress white\"][contains(text(),'Disbursement')]";
	public String industryType = ".highcharts-root:nth-of-type(1)>g:nth-of-type(1)>g>path";
	public String industryName = ".highcharts-root:nth-of-type(1)>g:last-of-type>text>tspan:nth-of-type(1)";
	public String industryPercentage = ".highcharts-root:nth-of-type(1)>g:last-of-type>text>tspan:nth-of-type(4)";
	
}
