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

WebUI.click(findTestObject('test/Page_Tng Vn Ha Th Trng Tin in T  CoinMarketCap/button_VI'))

WebUI.verifyElementText(findTestObject('test/Page_Tng Vn Ha Th Trng Tin in T  CoinMarketCap/h1_Top 100 Cc loi tin in t theo vn ha th trng'), 
    'Top 100 Các loại tiền điện tử theo vốn hóa thị trường')

WebUI.verifyElementText(findTestObject('test/Page_Tng Vn Ha Th Trng Tin in T  CoinMarketCap/span_Cc loi tin in t'), 'Các loại tiền điện tử')

WebUI.verifyElementText(findTestObject('test/Page_Tng Vn Ha Th Trng Tin in T  CoinMarketCap/a_Qung Co'), 'Quảng Cáo')

WebUI.verifyElementText(findTestObject('test/Page_Tng Vn Ha Th Trng Tin in T  CoinMarketCap/th_Lng tin lu thng'), 'Lượng tiền lưu thông\t')

