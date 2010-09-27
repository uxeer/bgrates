package net.vexelon.bgrates;

public class Defs {

	final static String LOG_TAG = "net.vexelon.bgrates";
	final static String PREFS_NAME = "BGratesPreferences";
	final static String PREFS_KEY_LASTUPDATE = "lastUpdate";
	final static String PREFS_KEY_LASTUPDATE_TIME = "lastUpdateTime";
	final static String PREFS_KEY_PREV_RATES_FILE = "previousExchgRatesFile";
	final static String CONV_PREFS_NAME = "BGratesPreferencesConvert";
	final static String CONV_PREFS_KEY_CONVITEMS_COUNT = "ConvertItemsCount";
	final static String CONV_PREFS_KEY_ITEM = "ConvertItem_";
	
	final static String URL_BNB_FORMAT = "http://www.bnb.bg/Statistics/StExternalSector/StExchangeRates/StERForeignCurrencies/?download=xml&lang=%s";
	final static String URL_BNB_SUFFIX_BG = "BG";
	final static String URL_BNB_SUFFIX_EN = "EN";
	
	final static String INT_EXCHANGERATES = "int-exch";
	
	final static int MAX_RATE_CHARS_SIZE = 8;
	final static int MAX_TOAST_INFO_TIME = 2050;
	
	final static String XML_TAG_ROW = "ROW";
	final static String XML_TAG_NAME = "NAME_";
	final static String XML_TAG_CODE = "CODE";
	final static String XML_TAG_RATIO = "RATIO";
	final static String XML_TAG_REVERSERATE = "REVERSERATE";
	final static String XML_TAG_RATE = "RATE";
	final static String XML_TAG_EXTRAINFO = "EXTRAINFO";
	final static String XML_TAG_CURR_DATE = "CURR_DATE";
	final static String XML_TAG_TITLE = "TITLE";
	
	final static int MENU_REFRESH = 10;
	final static int MENU_BG_RATES = 12;
	final static int MENU_EN_RATES = 14;
	final static int MENU_CONVERT = 15;
	final static int MENU_ABOUT = 20;
	
	final static int ACTIVITYRESULT_CLOSE = 100;
	
	final static int SCALE_SHOW_LONG = 5;
	final static int SCALE_SHOW_SHORT = 3;
	final static int SCALE_CALCULATIONS = 10;
	
	final static int MAX_CONVERT_ROWS = 4;

}
