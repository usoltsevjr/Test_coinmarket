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

WebUI.click(findTestObject('test/Page_Capitalizacin de Mercado de Criptomoneda  CoinMarketCap/button_ES'))

WebUI.verifyElementText(findTestObject('test/Page_Capitalizacin de Mercado de Criptomoneda  CoinMarketCap/h1_Principales 100 Criptomonedas por capitalizacin de mercado'), 
    Principales 100 Criptomonedas por capitalización de mercado)

WebUI.verifyElementText(findTestObject('test/Page_Capitalizacin de Mercado de Criptomoneda  CoinMarketCap/span_Criptomonedas'), 
    Criptomonedas)

WebUI.verifyElementText(findTestObject('test/Page_Capitalizacin de Mercado de Criptomoneda  CoinMarketCap/th_Acciones en circulacin'), 
    Acciones en circulación)

WebUI.verifyElementText(findTestObject('test/Page_Capitalizacin de Mercado de Criptomoneda  CoinMarketCap/a_Anunciar'), 
    Anunciar)

