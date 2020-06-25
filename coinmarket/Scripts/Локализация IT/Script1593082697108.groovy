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

WebUI.click(findTestObject('test/Page_Capitalizzazioni di mercato di criptovaluta  CoinMarketCap/button_IT'))

WebUI.verifyElementText(findTestObject('test/Page_Capitalizzazioni di mercato di criptovaluta  CoinMarketCap/h1_Migliori 100 Criptovalute per Capitalizzazioni di mercato'), 
    Migliori 100 Criptovalute per Capitalizzazioni di mercato)

WebUI.verifyElementText(findTestObject('test/Page_Capitalizzazioni di mercato di criptovaluta  CoinMarketCap/span_Criptovalute'), 
    Criptovalute)

WebUI.verifyElementText(findTestObject('test/Page_Capitalizzazioni di mercato di criptovaluta  CoinMarketCap/th_Rifornimento circolante'), 
    Rifornimento circolante)

WebUI.verifyElementText(findTestObject('test/Page_Capitalizzazioni di mercato di criptovaluta  CoinMarketCap/a_Pubblicizzare'), 
    Pubblicizzare)

