import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('test/Page_Kapitalisasyon sa Market ng Cryptocurrency  CoinMarketCap/button_FIL'))

WebUI.verifyElementText(findTestObject('test/Page_Kapitalisasyon sa Market ng Cryptocurrency  CoinMarketCap/h1_Nangungunang 100 Mga Cryptocurrency ng Market Capitalization'), 
    Nangungunang 100 Mga Cryptocurrency ng Market Capitalization)

WebUI.verifyElementText(findTestObject('test/Page_Kapitalisasyon sa Market ng Cryptocurrency  CoinMarketCap/span_Mga Cryptocurrency'), 
    Mga Cryptocurrency)

WebUI.verifyElementText(findTestObject('test/Page_Kapitalisasyon sa Market ng Cryptocurrency  CoinMarketCap/a_Mag-advertise'), 
    Mag-advertise)

WebUI.verifyElementText(findTestObject('test/Page_Kapitalisasyon sa Market ng Cryptocurrency  CoinMarketCap/th_Umiikot na Supply'), 
    Umiikot na Supply)

