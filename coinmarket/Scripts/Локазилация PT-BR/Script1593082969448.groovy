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

WebUI.click(findTestObject('test/Page_Capitalizaes do Mercado de Criptomoeda  CoinMarketCap/button_PT-BR'))

WebUI.verifyElementText(findTestObject('test/Page_Capitalizaes do Mercado de Criptomoeda  CoinMarketCap/h1_Top 100 Criptomoedas por Capitalizao de Mercado'), 
    Top 100 Criptomoedas por Capitalização de Mercado)

WebUI.verifyElementText(findTestObject('test/Page_Capitalizaes do Mercado de Criptomoeda  CoinMarketCap/span_Criptomoedas'), 
    Criptomoedas)

WebUI.verifyElementText(findTestObject('test/Page_Capitalizaes do Mercado de Criptomoeda  CoinMarketCap/th_Fornecimento Circulante'), 
    Fornecimento Circulante)

WebUI.verifyElementText(findTestObject('test/Page_Capitalizaes do Mercado de Criptomoeda  CoinMarketCap/a_Anunciar'), Anunciar)

